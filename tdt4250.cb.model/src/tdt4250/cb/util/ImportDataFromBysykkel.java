package tdt4250.cb.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import tdt4250.cb.Bike;
import tdt4250.cb.CbFactory;
import tdt4250.cb.CbPackage;
import tdt4250.cb.City;
import tdt4250.cb.Mechanic;
import tdt4250.cb.Station;
import tdt4250.cb.Trip;
import tdt4250.cb.util.CbResourceFactoryImpl;


public class ImportDataFromBysykkel {
	public static void main(String[] args) {		
		CbFactory factory = CbFactory.eINSTANCE;
		
		// Setup City
		City city = factory.createCity();
		city.setName("Trondheim");

		// Create elements of city instance
		ImportHelper.addStations(city);
		ImportHelper.addBikes(city);
		ImportHelper.addMechanics(city);
		ImportHelper.addServiceReports(city);
		ImportHelper.addTrips(city);

		
		
		//Save instance to ./src/generated/CityBikes.xmi
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("cb", new CbResourceFactoryImpl());
		Resource resource = resSet.createResource(URI.createURI("uri.cb"));		

		resource.getContents().add(city);
		
		try {
            File file = new File("./src/generated/CityBikes.xmi");
        	FileOutputStream outputStream = new FileOutputStream(file);
        	if(!file.exists()) {
        		file.createNewFile();
        	}
        	resource.save(outputStream, null);
        	outputStream.flush();
        	outputStream.close();
        	System.out.println("File saved!");
        } catch (Exception e){
        	System.out.println("Could not save file. Error: " + e );
        }
		
	}
}
