/**
 */
package tdt4250.cb.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.cb.Bike;
import tdt4250.cb.CbPackage;
import tdt4250.cb.Station;
import tdt4250.cb.Trip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getStartStation <em>Start Station</em>}</li>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getEndStation <em>End Station</em>}</li>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link tdt4250.cb.impl.TripImpl#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripImpl extends MinimalEObjectImpl.Container implements Trip {
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
	 * The cached value of the '{@link #getStartStation() <em>Start Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStation()
	 * @generated
	 * @ordered
	 */
	protected Station startStation;

	/**
	 * The cached value of the '{@link #getEndStation() <em>End Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStation()
	 * @generated
	 * @ordered
	 */
	protected Station endStation;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBike() <em>Bike</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBike()
	 * @generated
	 * @ordered
	 */
	protected Bike bike;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbPackage.Literals.TRIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStartStation() {
		if (startStation != null && startStation.eIsProxy()) {
			InternalEObject oldStartStation = (InternalEObject)startStation;
			startStation = (Station)eResolveProxy(oldStartStation);
			if (startStation != oldStartStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbPackage.TRIP__START_STATION, oldStartStation, startStation));
			}
		}
		return startStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStartStation() {
		return startStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartStation(Station newStartStation) {
		Station oldStartStation = startStation;
		startStation = newStartStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__START_STATION, oldStartStation, startStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getEndStation() {
		if (endStation != null && endStation.eIsProxy()) {
			InternalEObject oldEndStation = (InternalEObject)endStation;
			endStation = (Station)eResolveProxy(oldEndStation);
			if (endStation != oldEndStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbPackage.TRIP__END_STATION, oldEndStation, endStation));
			}
		}
		return endStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetEndStation() {
		return endStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndStation(Station newEndStation) {
		Station oldEndStation = endStation;
		endStation = newEndStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__END_STATION, oldEndStation, endStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bike getBike() {
		if (bike != null && bike.eIsProxy()) {
			InternalEObject oldBike = (InternalEObject)bike;
			bike = (Bike)eResolveProxy(oldBike);
			if (bike != oldBike) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbPackage.TRIP__BIKE, oldBike, bike));
			}
		}
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike basicGetBike() {
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBike(Bike newBike) {
		Bike oldBike = bike;
		bike = newBike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.TRIP__BIKE, oldBike, bike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbPackage.TRIP__ID:
				return getId();
			case CbPackage.TRIP__START_STATION:
				if (resolve) return getStartStation();
				return basicGetStartStation();
			case CbPackage.TRIP__END_STATION:
				if (resolve) return getEndStation();
				return basicGetEndStation();
			case CbPackage.TRIP__START_TIME:
				return getStartTime();
			case CbPackage.TRIP__END_TIME:
				return getEndTime();
			case CbPackage.TRIP__DURATION:
				return getDuration();
			case CbPackage.TRIP__BIKE:
				if (resolve) return getBike();
				return basicGetBike();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbPackage.TRIP__ID:
				setId((Integer)newValue);
				return;
			case CbPackage.TRIP__START_STATION:
				setStartStation((Station)newValue);
				return;
			case CbPackage.TRIP__END_STATION:
				setEndStation((Station)newValue);
				return;
			case CbPackage.TRIP__START_TIME:
				setStartTime((Date)newValue);
				return;
			case CbPackage.TRIP__END_TIME:
				setEndTime((Date)newValue);
				return;
			case CbPackage.TRIP__DURATION:
				setDuration((Integer)newValue);
				return;
			case CbPackage.TRIP__BIKE:
				setBike((Bike)newValue);
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
			case CbPackage.TRIP__ID:
				setId(ID_EDEFAULT);
				return;
			case CbPackage.TRIP__START_STATION:
				setStartStation((Station)null);
				return;
			case CbPackage.TRIP__END_STATION:
				setEndStation((Station)null);
				return;
			case CbPackage.TRIP__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CbPackage.TRIP__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case CbPackage.TRIP__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CbPackage.TRIP__BIKE:
				setBike((Bike)null);
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
			case CbPackage.TRIP__ID:
				return id != ID_EDEFAULT;
			case CbPackage.TRIP__START_STATION:
				return startStation != null;
			case CbPackage.TRIP__END_STATION:
				return endStation != null;
			case CbPackage.TRIP__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CbPackage.TRIP__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case CbPackage.TRIP__DURATION:
				return duration != DURATION_EDEFAULT;
			case CbPackage.TRIP__BIKE:
				return bike != null;
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
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //TripImpl
