/**
 */
package tdt4250.cb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.City#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.cb.City#getBikes <em>Bikes</em>}</li>
 *   <li>{@link tdt4250.cb.City#getStations <em>Stations</em>}</li>
 *   <li>{@link tdt4250.cb.City#getMechanics <em>Mechanics</em>}</li>
 *   <li>{@link tdt4250.cb.City#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @see tdt4250.cb.CbPackage#getCity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueId'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 uniqueTripIds='self.trips-&gt;isUnique( trip | trip.id)'"
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.cb.CbPackage#getCity_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.cb.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bikes</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.cb.Bike}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bikes</em>' containment reference list.
	 * @see tdt4250.cb.CbPackage#getCity_Bikes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bike> getBikes();

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.cb.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see tdt4250.cb.CbPackage#getCity_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Mechanics</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.cb.Mechanic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanics</em>' containment reference list.
	 * @see tdt4250.cb.CbPackage#getCity_Mechanics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mechanic> getMechanics();

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.cb.Trip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' containment reference list.
	 * @see tdt4250.cb.CbPackage#getCity_Trips()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trip> getTrips();

} // City
