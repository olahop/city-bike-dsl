package tdt4250.cb.diagram;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import tdt4250.cb.Bike;
import tdt4250.cb.City;
import tdt4250.cb.ServiceReport;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public Date getCurrentTime(ServiceReport serviceReport) {
       return new Date();
    }
        
    public List<Bike> getBikesWithNoService(City city) {
    	return city.getBikes().stream().filter(a -> a.getServiceReports().isEmpty()).collect(Collectors.toList());
    }
    
    public List<Bike> getBikesForService(City city) {
    	List<Bike> bikes = city.getBikes().stream().filter(a -> !a.getServiceReports().isEmpty() && bikeNeedsNewService(a)).collect(Collectors.toList());
    	bikes.sort(Comparator.comparing(Bike::getLastServiceTime));
    	return bikes;
    }
    
    public List<Bike> getServicedBikes(City city) {
    	List<Bike> bikes = city.getBikes().stream().filter(a -> !a.getServiceReports().isEmpty() && !bikeNeedsNewService(a)).collect(Collectors.toList());
    	bikes.sort(Comparator.comparing(Bike::getLastServiceTime));
    	return bikes;
    }
    
    private boolean bikeNeedsNewService(Bike bike) {
    	int thresholdDays = 180;
		//TODO: add after testing
    	//Date thresholdDate = new Date(System.currentTimeMillis() - thresholdDays * 24 * 60 * 60 * 1000);
    	Date thresholdDate = new Date();
    	
    	return thresholdDate.after(bike.getLastServiceTime());
    }
}
