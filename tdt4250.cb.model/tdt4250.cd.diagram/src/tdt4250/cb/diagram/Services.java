package tdt4250.cb.diagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

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
}
