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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.cb.Bike;
import tdt4250.cb.CbPackage;
import tdt4250.cb.City;
import tdt4250.cb.Mechanic;
import tdt4250.cb.Station;
import tdt4250.cb.Trip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.cb.impl.CityImpl#getBikes <em>Bikes</em>}</li>
 *   <li>{@link tdt4250.cb.impl.CityImpl#getStations <em>Stations</em>}</li>
 *   <li>{@link tdt4250.cb.impl.CityImpl#getMechanics <em>Mechanics</em>}</li>
 *   <li>{@link tdt4250.cb.impl.CityImpl#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
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
	 * The cached value of the '{@link #getBikes() <em>Bikes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikes()
	 * @generated
	 * @ordered
	 */
	protected EList<Bike> bikes;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * The cached value of the '{@link #getMechanics() <em>Mechanics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanics()
	 * @generated
	 * @ordered
	 */
	protected EList<Mechanic> mechanics;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> trips;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbPackage.Literals.CITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bike> getBikes() {
		if (bikes == null) {
			bikes = new EObjectContainmentEList<Bike>(Bike.class, this, CbPackage.CITY__BIKES);
		}
		return bikes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectContainmentEList<Station>(Station.class, this, CbPackage.CITY__STATIONS);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mechanic> getMechanics() {
		if (mechanics == null) {
			mechanics = new EObjectContainmentEList<Mechanic>(Mechanic.class, this, CbPackage.CITY__MECHANICS);
		}
		return mechanics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trip> getTrips() {
		if (trips == null) {
			trips = new EObjectContainmentEList<Trip>(Trip.class, this, CbPackage.CITY__TRIPS);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbPackage.CITY__BIKES:
				return ((InternalEList<?>)getBikes()).basicRemove(otherEnd, msgs);
			case CbPackage.CITY__STATIONS:
				return ((InternalEList<?>)getStations()).basicRemove(otherEnd, msgs);
			case CbPackage.CITY__MECHANICS:
				return ((InternalEList<?>)getMechanics()).basicRemove(otherEnd, msgs);
			case CbPackage.CITY__TRIPS:
				return ((InternalEList<?>)getTrips()).basicRemove(otherEnd, msgs);
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
			case CbPackage.CITY__NAME:
				return getName();
			case CbPackage.CITY__BIKES:
				return getBikes();
			case CbPackage.CITY__STATIONS:
				return getStations();
			case CbPackage.CITY__MECHANICS:
				return getMechanics();
			case CbPackage.CITY__TRIPS:
				return getTrips();
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
			case CbPackage.CITY__NAME:
				setName((String)newValue);
				return;
			case CbPackage.CITY__BIKES:
				getBikes().clear();
				getBikes().addAll((Collection<? extends Bike>)newValue);
				return;
			case CbPackage.CITY__STATIONS:
				getStations().clear();
				getStations().addAll((Collection<? extends Station>)newValue);
				return;
			case CbPackage.CITY__MECHANICS:
				getMechanics().clear();
				getMechanics().addAll((Collection<? extends Mechanic>)newValue);
				return;
			case CbPackage.CITY__TRIPS:
				getTrips().clear();
				getTrips().addAll((Collection<? extends Trip>)newValue);
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
			case CbPackage.CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CbPackage.CITY__BIKES:
				getBikes().clear();
				return;
			case CbPackage.CITY__STATIONS:
				getStations().clear();
				return;
			case CbPackage.CITY__MECHANICS:
				getMechanics().clear();
				return;
			case CbPackage.CITY__TRIPS:
				getTrips().clear();
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
			case CbPackage.CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CbPackage.CITY__BIKES:
				return bikes != null && !bikes.isEmpty();
			case CbPackage.CITY__STATIONS:
				return stations != null && !stations.isEmpty();
			case CbPackage.CITY__MECHANICS:
				return mechanics != null && !mechanics.isEmpty();
			case CbPackage.CITY__TRIPS:
				return trips != null && !trips.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CityImpl
