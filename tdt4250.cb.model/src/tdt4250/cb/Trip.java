/**
 */
package tdt4250.cb;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.Trip#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.cb.Trip#getStartStation <em>Start Station</em>}</li>
 *   <li>{@link tdt4250.cb.Trip#getEndStation <em>End Station</em>}</li>
 *   <li>{@link tdt4250.cb.Trip#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link tdt4250.cb.Trip#getEndTime <em>End Time</em>}</li>
 *   <li>{@link tdt4250.cb.Trip#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see tdt4250.cb.CbPackage#getTrip()
 * @model
 * @generated
 */
public interface Trip extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tdt4250.cb.CbPackage#getTrip_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Trip#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Start Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Station</em>' reference.
	 * @see #setStartStation(Station)
	 * @see tdt4250.cb.CbPackage#getTrip_StartStation()
	 * @model
	 * @generated
	 */
	Station getStartStation();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Trip#getStartStation <em>Start Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Station</em>' reference.
	 * @see #getStartStation()
	 * @generated
	 */
	void setStartStation(Station value);

	/**
	 * Returns the value of the '<em><b>End Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Station</em>' reference.
	 * @see #setEndStation(Station)
	 * @see tdt4250.cb.CbPackage#getTrip_EndStation()
	 * @model
	 * @generated
	 */
	Station getEndStation();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Trip#getEndStation <em>End Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Station</em>' reference.
	 * @see #getEndStation()
	 * @generated
	 */
	void setEndStation(Station value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see tdt4250.cb.CbPackage#getTrip_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Trip#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see tdt4250.cb.CbPackage#getTrip_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Trip#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see tdt4250.cb.CbPackage#getTrip_Duration()
	 * @model derived="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Trip#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Trip
