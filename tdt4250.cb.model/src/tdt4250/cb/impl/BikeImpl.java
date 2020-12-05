/**
 */
package tdt4250.cb.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.cb.Bike;
import tdt4250.cb.CbPackage;
import tdt4250.cb.ServiceReport;
import tdt4250.cb.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.impl.BikeImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.cb.impl.BikeImpl#getCurrentStation <em>Current Station</em>}</li>
 *   <li>{@link tdt4250.cb.impl.BikeImpl#getLastServiceTime <em>Last Service Time</em>}</li>
 *   <li>{@link tdt4250.cb.impl.BikeImpl#getServiceReports <em>Service Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BikeImpl extends MinimalEObjectImpl.Container implements Bike {
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
	 * The cached value of the '{@link #getCurrentStation() <em>Current Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStation()
	 * @generated
	 * @ordered
	 */
	protected Station currentStation;

	/**
	 * The default value of the '{@link #getLastServiceTime() <em>Last Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastServiceTime() <em>Last Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Date lastServiceTime = LAST_SERVICE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceReports() <em>Service Reports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceReports()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceReport> serviceReports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbPackage.Literals.BIKE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.BIKE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getCurrentStation() {
		if (currentStation != null && currentStation.eIsProxy()) {
			InternalEObject oldCurrentStation = (InternalEObject)currentStation;
			currentStation = (Station)eResolveProxy(oldCurrentStation);
			if (currentStation != oldCurrentStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbPackage.BIKE__CURRENT_STATION, oldCurrentStation, currentStation));
			}
		}
		return currentStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetCurrentStation() {
		return currentStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStation(Station newCurrentStation, NotificationChain msgs) {
		Station oldCurrentStation = currentStation;
		currentStation = newCurrentStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbPackage.BIKE__CURRENT_STATION, oldCurrentStation, newCurrentStation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStation(Station newCurrentStation) {
		if (newCurrentStation != currentStation) {
			NotificationChain msgs = null;
			if (currentStation != null)
				msgs = ((InternalEObject)currentStation).eInverseRemove(this, CbPackage.STATION__AVAILABLE_BIKES, Station.class, msgs);
			if (newCurrentStation != null)
				msgs = ((InternalEObject)newCurrentStation).eInverseAdd(this, CbPackage.STATION__AVAILABLE_BIKES, Station.class, msgs);
			msgs = basicSetCurrentStation(newCurrentStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.BIKE__CURRENT_STATION, newCurrentStation, newCurrentStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Date getLastServiceTime() {
		Date lastServiceTime = null;
		if (!serviceReports.isEmpty()) {
			lastServiceTime = serviceReports.get(0).getTimestamp();
			for (ServiceReport sr: serviceReports) {
				if(sr.getTimestamp().after(lastServiceTime)) {
					lastServiceTime = sr.getTimestamp();
				}
			}
		}
		return lastServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceReport> getServiceReports() {
		if (serviceReports == null) {
			serviceReports = new EObjectContainmentWithInverseEList<ServiceReport>(ServiceReport.class, this, CbPackage.BIKE__SERVICE_REPORTS, CbPackage.SERVICE_REPORT__BIKE);
		}
		return serviceReports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the bike has no lastServiceTime or if it is more than 180 days since last serviced
	 * <!-- end-user-doc -->
	 * @generated NOT
	 
	@Override
	public boolean isNeedService() {		
		boolean needService = false;
		int thresholdDays = 180;
		Date thresholdDate = new Date(System.currentTimeMillis() - thresholdDays * 24 * 60 * 60 * 1000);
		if(this.lastServiceTime == null) {
			needService = true;
		} else if(this.lastServiceTime.after(thresholdDate)) {
			needService = true;
		}
		return needService;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbPackage.BIKE__CURRENT_STATION:
				if (currentStation != null)
					msgs = ((InternalEObject)currentStation).eInverseRemove(this, CbPackage.STATION__AVAILABLE_BIKES, Station.class, msgs);
				return basicSetCurrentStation((Station)otherEnd, msgs);
			case CbPackage.BIKE__SERVICE_REPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceReports()).basicAdd(otherEnd, msgs);
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
			case CbPackage.BIKE__CURRENT_STATION:
				return basicSetCurrentStation(null, msgs);
			case CbPackage.BIKE__SERVICE_REPORTS:
				return ((InternalEList<?>)getServiceReports()).basicRemove(otherEnd, msgs);
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
			case CbPackage.BIKE__NAME:
				return getName();
			case CbPackage.BIKE__CURRENT_STATION:
				if (resolve) return getCurrentStation();
				return basicGetCurrentStation();
			case CbPackage.BIKE__LAST_SERVICE_TIME:
				return getLastServiceTime();
			case CbPackage.BIKE__SERVICE_REPORTS:
				return getServiceReports();
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
			case CbPackage.BIKE__NAME:
				setName((String)newValue);
				return;
			case CbPackage.BIKE__CURRENT_STATION:
				setCurrentStation((Station)newValue);
				return;
			case CbPackage.BIKE__SERVICE_REPORTS:
				getServiceReports().clear();
				getServiceReports().addAll((Collection<? extends ServiceReport>)newValue);
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
			case CbPackage.BIKE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CbPackage.BIKE__CURRENT_STATION:
				setCurrentStation((Station)null);
				return;
			case CbPackage.BIKE__SERVICE_REPORTS:
				getServiceReports().clear();
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
			case CbPackage.BIKE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CbPackage.BIKE__CURRENT_STATION:
				return currentStation != null;
			case CbPackage.BIKE__LAST_SERVICE_TIME:
				return LAST_SERVICE_TIME_EDEFAULT == null ? lastServiceTime != null : !LAST_SERVICE_TIME_EDEFAULT.equals(lastServiceTime);
			case CbPackage.BIKE__SERVICE_REPORTS:
				return serviceReports != null && !serviceReports.isEmpty();
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
		result.append(", lastServiceTime: ");
		result.append(lastServiceTime);
		result.append(')');
		return result.toString();
	}

} //BikeImpl
