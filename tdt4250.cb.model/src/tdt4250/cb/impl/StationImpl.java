/**
 */
package tdt4250.cb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.cb.Bike;
import tdt4250.cb.CbPackage;
import tdt4250.cb.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getCapacityNum <em>Capacity Num</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getAvailableDocksNum <em>Available Docks Num</em>}</li>
 *   <li>{@link tdt4250.cb.impl.StationImpl#getAvailableBikes <em>Available Bikes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationImpl extends MinimalEObjectImpl.Container implements Station {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final float XCOORDINATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected float xCoordinate = XCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final float YCOORDINATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected float yCoordinate = YCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityNum() <em>Capacity Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityNum()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacityNum() <em>Capacity Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityNum()
	 * @generated
	 * @ordered
	 */
	protected int capacityNum = CAPACITY_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableDocksNum() <em>Available Docks Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableDocksNum()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_DOCKS_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableDocksNum() <em>Available Docks Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableDocksNum()
	 * @generated
	 * @ordered
	 */
	protected int availableDocksNum = AVAILABLE_DOCKS_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableBikes() <em>Available Bikes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBikes()
	 * @generated
	 * @ordered
	 */
	protected EList<Bike> availableBikes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbPackage.Literals.STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXCoordinate(float newXCoordinate) {
		float oldXCoordinate = xCoordinate;
		xCoordinate = newXCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__XCOORDINATE, oldXCoordinate, xCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYCoordinate(float newYCoordinate) {
		float oldYCoordinate = yCoordinate;
		yCoordinate = newYCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__YCOORDINATE, oldYCoordinate, yCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacityNum() {
		return capacityNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityNum(int newCapacityNum) {
		int oldCapacityNum = capacityNum;
		capacityNum = newCapacityNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__CAPACITY_NUM, oldCapacityNum, capacityNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableDocksNum() {
		return availableDocksNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableDocksNum(int newAvailableDocksNum) {
		int oldAvailableDocksNum = availableDocksNum;
		availableDocksNum = newAvailableDocksNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.STATION__AVAILABLE_DOCKS_NUM, oldAvailableDocksNum, availableDocksNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bike> getAvailableBikes() {
		if (availableBikes == null) {
			availableBikes = new EObjectWithInverseResolvingEList<Bike>(Bike.class, this, CbPackage.STATION__AVAILABLE_BIKES, CbPackage.BIKE__CURRENT_STATION);
		}
		return availableBikes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbPackage.STATION__AVAILABLE_BIKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailableBikes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbPackage.STATION__AVAILABLE_BIKES:
				return ((InternalEList<?>)getAvailableBikes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbPackage.STATION__ID:
				return getId();
			case CbPackage.STATION__NAME:
				return getName();
			case CbPackage.STATION__ADDRESS:
				return getAddress();
			case CbPackage.STATION__XCOORDINATE:
				return getXCoordinate();
			case CbPackage.STATION__YCOORDINATE:
				return getYCoordinate();
			case CbPackage.STATION__CAPACITY_NUM:
				return getCapacityNum();
			case CbPackage.STATION__AVAILABLE_DOCKS_NUM:
				return getAvailableDocksNum();
			case CbPackage.STATION__AVAILABLE_BIKES:
				return getAvailableBikes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbPackage.STATION__ID:
				setId((Integer)newValue);
				return;
			case CbPackage.STATION__NAME:
				setName((String)newValue);
				return;
			case CbPackage.STATION__ADDRESS:
				setAddress((String)newValue);
				return;
			case CbPackage.STATION__XCOORDINATE:
				setXCoordinate((Float)newValue);
				return;
			case CbPackage.STATION__YCOORDINATE:
				setYCoordinate((Float)newValue);
				return;
			case CbPackage.STATION__CAPACITY_NUM:
				setCapacityNum((Integer)newValue);
				return;
			case CbPackage.STATION__AVAILABLE_DOCKS_NUM:
				setAvailableDocksNum((Integer)newValue);
				return;
			case CbPackage.STATION__AVAILABLE_BIKES:
				getAvailableBikes().clear();
				getAvailableBikes().addAll((Collection<? extends Bike>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CbPackage.STATION__ID:
				setId(ID_EDEFAULT);
				return;
			case CbPackage.STATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CbPackage.STATION__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CbPackage.STATION__XCOORDINATE:
				setXCoordinate(XCOORDINATE_EDEFAULT);
				return;
			case CbPackage.STATION__YCOORDINATE:
				setYCoordinate(YCOORDINATE_EDEFAULT);
				return;
			case CbPackage.STATION__CAPACITY_NUM:
				setCapacityNum(CAPACITY_NUM_EDEFAULT);
				return;
			case CbPackage.STATION__AVAILABLE_DOCKS_NUM:
				setAvailableDocksNum(AVAILABLE_DOCKS_NUM_EDEFAULT);
				return;
			case CbPackage.STATION__AVAILABLE_BIKES:
				getAvailableBikes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CbPackage.STATION__ID:
				return id != ID_EDEFAULT;
			case CbPackage.STATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CbPackage.STATION__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CbPackage.STATION__XCOORDINATE:
				return xCoordinate != XCOORDINATE_EDEFAULT;
			case CbPackage.STATION__YCOORDINATE:
				return yCoordinate != YCOORDINATE_EDEFAULT;
			case CbPackage.STATION__CAPACITY_NUM:
				return capacityNum != CAPACITY_NUM_EDEFAULT;
			case CbPackage.STATION__AVAILABLE_DOCKS_NUM:
				return availableDocksNum != AVAILABLE_DOCKS_NUM_EDEFAULT;
			case CbPackage.STATION__AVAILABLE_BIKES:
				return availableBikes != null && !availableBikes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", xCoordinate: ");
		result.append(xCoordinate);
		result.append(", yCoordinate: ");
		result.append(yCoordinate);
		result.append(", capacityNum: ");
		result.append(capacityNum);
		result.append(", availableDocksNum: ");
		result.append(availableDocksNum);
		result.append(')');
		return result.toString();
	}

} //StationImpl
