package tdt4250.cb.design;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import tdt4250.cb.Bike;
import tdt4250.cb.City;
import tdt4250.cb.ServiceReport;
import tdt4250.cb.Station;
import tdt4250.cb.Trip;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public String myService(EObject self) {
       // TODO Auto-generated code
      return self.getClass().toString();
    }
    
    public String getBikeName(Bike bike) {
    	return bike.getName();
    }
    
    public String getReports(Bike bike){
    	return bike.getServiceReports().toString();
    }
    
    public float getAvgDuration(Bike bike){
    	City city = (City) bike.eContainer();
    	int duration = 0;
    	int numberOfTrips = 0;
    	for (Trip trip : city.getTrips()) {
			if(trip.getBike().equals(bike)) {
				numberOfTrips ++;
				duration += trip.getDuration();
			}
		}
    	duration = duration / 60;
    	return duration/numberOfTrips;
    }
    
    public float getTotalDuration(Bike bike) {
    	City city = (City) bike.eContainer();
    	int duration = 0;
    	for (Trip trip : city.getTrips()) {
			if(trip.getBike().equals(bike)) {
				duration += trip.getDuration();
			}
		}
    	duration = duration / 60;
    	return duration;
    }
    
    public float getNumberOfTrips(Bike bike) {
    	City city = (City) bike.eContainer();
    	int numberOfTrips = 0;
    	for (Trip trip : city.getTrips()) {
			if(trip.getBike().equals(bike)) {
				numberOfTrips ++;
			}
		}
    	return numberOfTrips;
    }
    
    
    public String getMyName(Station station) {
    	System.out.println("Servies getMyName" + station.getName());

    	return station.getName();
    }
    
    public List<Station> getStations(City city){
    	System.out.println("getStations " + city.getName());
    	return city.getStations();
    	
    }
    
    public List<Bike> getBikes(City city){
    	System.out.println("getBikes " + city.getName());
    	return city.getBikes();
    	
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
     	//int thresholdDays = 180;
 		//TODO: add after testing
     	//Date thresholdDate = new Date(System.currentTimeMillis() - thresholdDays * 24 * 60 * 60 * 1000);
     	Date thresholdDate = new Date();
     	
     	return thresholdDate.after(bike.getLastServiceTime());
     }
    
    
}
