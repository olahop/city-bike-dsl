package tdt4250.cb.util;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import tdt4250.cb.City;
import tdt4250.cb.Station;

public class TestServices {
	 /**
	    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
	    */
	    public String myService(EObject self) {
	       // TODO Auto-generated code
	      return self.getClass().toString();
	    }
	    
	    public String getMyName(Station station) {
	    	System.out.println("TestServices GetMYNAme" + station.getName());
	    	return "QUe? " + station.getName();
	    }
	    
	    public List<Station> getStations(City city){
	    	return city.getStations();
	    	
	    }
}
