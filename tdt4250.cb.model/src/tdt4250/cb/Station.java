/**
 */
package tdt4250.cb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.Station#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.cb.Station#getAddress <em>Address</em>}</li>
 *   <li>{@link tdt4250.cb.Station#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link tdt4250.cb.Station#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link tdt4250.cb.Station#getCapacityNum <em>Capacity Num</em>}</li>
 *   <li>{@link tdt4250.cb.Station#getAvailableDocksNum <em>Available Docks Num</em>}</li>
 *   <li>{@link tdt4250.cb.Station#getAvailableBikes <em>Available Bikes</em>}</li>
 * </ul>
 *
 * @see tdt4250.cb.CbPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.cb.CbPackage#getStation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Station#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see tdt4250.cb.CbPackage#getStation_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Station#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoordinate</em>' attribute.
	 * @see #setXCoordinate(float)
	 * @see tdt4250.cb.CbPackage#getStation_XCoordinate()
	 * @model
	 * @generated
	 */
	float getXCoordinate();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Station#getXCoordinate <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoordinate</em>' attribute.
	 * @see #getXCoordinate()
	 * @generated
	 */
	void setXCoordinate(float value);

	/**
	 * Returns the value of the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoordinate</em>' attribute.
	 * @see #setYCoordinate(float)
	 * @see tdt4250.cb.CbPackage#getStation_YCoordinate()
	 * @model
	 * @generated
	 */
	float getYCoordinate();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Station#getYCoordinate <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoordinate</em>' attribute.
	 * @see #getYCoordinate()
	 * @generated
	 */
	void setYCoordinate(float value);

	/**
	 * Returns the value of the '<em><b>Capacity Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Num</em>' attribute.
	 * @see #setCapacityNum(int)
	 * @see tdt4250.cb.CbPackage#getStation_CapacityNum()
	 * @model unique="false"
	 * @generated
	 */
	int getCapacityNum();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Station#getCapacityNum <em>Capacity Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Num</em>' attribute.
	 * @see #getCapacityNum()
	 * @generated
	 */
	void setCapacityNum(int value);

	/**
	 * Returns the value of the '<em><b>Available Docks Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Docks Num</em>' attribute.
	 * @see #setAvailableDocksNum(int)
	 * @see tdt4250.cb.CbPackage#getStation_AvailableDocksNum()
	 * @model
	 * @generated
	 */
	int getAvailableDocksNum();

	/**
	 * Sets the value of the '{@link tdt4250.cb.Station#getAvailableDocksNum <em>Available Docks Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Docks Num</em>' attribute.
	 * @see #getAvailableDocksNum()
	 * @generated
	 */
	void setAvailableDocksNum(int value);

	/**
	 * Returns the value of the '<em><b>Available Bikes</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.cb.Bike}.
	 * It is bidirectional and its opposite is '{@link tdt4250.cb.Bike#getCurrentStation <em>Current Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Bikes</em>' reference list.
	 * @see tdt4250.cb.CbPackage#getStation_AvailableBikes()
	 * @see tdt4250.cb.Bike#getCurrentStation
	 * @model opposite="currentStation"
	 * @generated
	 */
	EList<Bike> getAvailableBikes();

} // Station
