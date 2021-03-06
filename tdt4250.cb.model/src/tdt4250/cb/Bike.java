/**
 */
package tdt4250.cb;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.Bike#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.cb.Bike#getCurrentStation <em>Current Station</em>}</li>
 *   <li>{@link tdt4250.cb.Bike#getLastServiceTime <em>Last Service Time</em>}</li>
 *   <li>{@link tdt4250.cb.Bike#getServiceReports <em>Service Reports</em>}</li>
 * </ul>
 *
 * @see tdt4250.cb.CbPackage#getBike()
 * @model
 * @generated
 */
public interface Bike extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.cb.CbPackage#getBike_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Bike#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Station</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.cb.Station#getAvailableBikes <em>Available Bikes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Station</em>' reference.
	 * @see #setCurrentStation(Station)
	 * @see tdt4250.cb.CbPackage#getBike_CurrentStation()
	 * @see tdt4250.cb.Station#getAvailableBikes
	 * @model opposite="availableBikes"
	 * @generated
	 */
	Station getCurrentStation();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Bike#getCurrentStation <em>Current Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Station</em>' reference.
	 * @see #getCurrentStation()
	 * @generated
	 */
	void setCurrentStation(Station value);

	/**
	 * Returns the value of the '<em><b>Last Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Service Time</em>' attribute.
	 * @see tdt4250.cb.CbPackage#getBike_LastServiceTime()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	Date getLastServiceTime();

	/**
	 * Returns the value of the '<em><b>Service Reports</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.cb.ServiceReport}.
	 * It is bidirectional and its opposite is '{@link tdt4250.cb.ServiceReport#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Reports</em>' containment reference list.
	 * @see tdt4250.cb.CbPackage#getBike_ServiceReports()
	 * @see tdt4250.cb.ServiceReport#getBike
	 * @model opposite="bike" containment="true"
	 * @generated
	 */
	EList<ServiceReport> getServiceReports();

} // Bike
