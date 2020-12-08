/**
 */
package tdt4250.cb;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.ServiceReport#getContent <em>Content</em>}</li>
 *   <li>{@link tdt4250.cb.ServiceReport#getBike <em>Bike</em>}</li>
 *   <li>{@link tdt4250.cb.ServiceReport#getMechanic <em>Mechanic</em>}</li>
 *   <li>{@link tdt4250.cb.ServiceReport#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see tdt4250.cb.CbPackage#getServiceReport()
 * @model
 * @generated
 */
public interface ServiceReport extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see tdt4250.cb.CbPackage#getServiceReport_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link tdt4250.cb.ServiceReport#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Bike</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.cb.Bike#getServiceReports <em>Service Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike</em>' container reference.
	 * @see #setBike(Bike)
	 * @see tdt4250.cb.CbPackage#getServiceReport_Bike()
	 * @see tdt4250.cb.Bike#getServiceReports
	 * @model opposite="serviceReports" required="true" transient="false"
	 * @generated
	 */
	Bike getBike();

	/**
	 * Sets the value of the '{@link tdt4250.cb.ServiceReport#getBike <em>Bike</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike</em>' container reference.
	 * @see #getBike()
	 * @generated
	 */
	void setBike(Bike value);

	/**
	 * Returns the value of the '<em><b>Mechanic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanic</em>' reference.
	 * @see #setMechanic(Mechanic)
	 * @see tdt4250.cb.CbPackage#getServiceReport_Mechanic()
	 * @model
	 * @generated
	 */
	Mechanic getMechanic();

	/**
	 * Sets the value of the '{@link tdt4250.cb.ServiceReport#getMechanic <em>Mechanic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanic</em>' reference.
	 * @see #getMechanic()
	 * @generated
	 */
	void setMechanic(Mechanic value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see tdt4250.cb.CbPackage#getServiceReport_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link tdt4250.cb.ServiceReport#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // ServiceReport
