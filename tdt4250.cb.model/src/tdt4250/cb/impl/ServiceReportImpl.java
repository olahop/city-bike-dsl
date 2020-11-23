/**
 */
package tdt4250.cb.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tdt4250.cb.Bike;
import tdt4250.cb.CbPackage;
import tdt4250.cb.Mechanic;
import tdt4250.cb.ServiceReport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.cb.impl.ServiceReportImpl#getContent <em>Content</em>}</li>
 *   <li>{@link tdt4250.cb.impl.ServiceReportImpl#getBike <em>Bike</em>}</li>
 *   <li>{@link tdt4250.cb.impl.ServiceReportImpl#getMechanic <em>Mechanic</em>}</li>
 *   <li>{@link tdt4250.cb.impl.ServiceReportImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceReportImpl extends MinimalEObjectImpl.Container implements ServiceReport {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMechanic() <em>Mechanic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanic()
	 * @generated
	 * @ordered
	 */
	protected Mechanic mechanic;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbPackage.Literals.SERVICE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.SERVICE_REPORT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bike getBike() {
		if (eContainerFeatureID() != CbPackage.SERVICE_REPORT__BIKE) return null;
		return (Bike)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBike(Bike newBike, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBike, CbPackage.SERVICE_REPORT__BIKE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBike(Bike newBike) {
		if (newBike != eInternalContainer() || (eContainerFeatureID() != CbPackage.SERVICE_REPORT__BIKE && newBike != null)) {
			if (EcoreUtil.isAncestor(this, newBike))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBike != null)
				msgs = ((InternalEObject)newBike).eInverseAdd(this, CbPackage.BIKE__SERVICE_REPORTS, Bike.class, msgs);
			msgs = basicSetBike(newBike, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.SERVICE_REPORT__BIKE, newBike, newBike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mechanic getMechanic() {
		if (mechanic != null && mechanic.eIsProxy()) {
			InternalEObject oldMechanic = (InternalEObject)mechanic;
			mechanic = (Mechanic)eResolveProxy(oldMechanic);
			if (mechanic != oldMechanic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbPackage.SERVICE_REPORT__MECHANIC, oldMechanic, mechanic));
			}
		}
		return mechanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mechanic basicGetMechanic() {
		return mechanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanic(Mechanic newMechanic) {
		Mechanic oldMechanic = mechanic;
		mechanic = newMechanic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.SERVICE_REPORT__MECHANIC, oldMechanic, mechanic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbPackage.SERVICE_REPORT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbPackage.SERVICE_REPORT__BIKE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBike((Bike)otherEnd, msgs);
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
			case CbPackage.SERVICE_REPORT__BIKE:
				return basicSetBike(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CbPackage.SERVICE_REPORT__BIKE:
				return eInternalContainer().eInverseRemove(this, CbPackage.BIKE__SERVICE_REPORTS, Bike.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbPackage.SERVICE_REPORT__CONTENT:
				return getContent();
			case CbPackage.SERVICE_REPORT__BIKE:
				return getBike();
			case CbPackage.SERVICE_REPORT__MECHANIC:
				if (resolve) return getMechanic();
				return basicGetMechanic();
			case CbPackage.SERVICE_REPORT__TIMESTAMP:
				return getTimestamp();
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
			case CbPackage.SERVICE_REPORT__CONTENT:
				setContent((String)newValue);
				return;
			case CbPackage.SERVICE_REPORT__BIKE:
				setBike((Bike)newValue);
				return;
			case CbPackage.SERVICE_REPORT__MECHANIC:
				setMechanic((Mechanic)newValue);
				return;
			case CbPackage.SERVICE_REPORT__TIMESTAMP:
				setTimestamp((Date)newValue);
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
			case CbPackage.SERVICE_REPORT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CbPackage.SERVICE_REPORT__BIKE:
				setBike((Bike)null);
				return;
			case CbPackage.SERVICE_REPORT__MECHANIC:
				setMechanic((Mechanic)null);
				return;
			case CbPackage.SERVICE_REPORT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case CbPackage.SERVICE_REPORT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CbPackage.SERVICE_REPORT__BIKE:
				return getBike() != null;
			case CbPackage.SERVICE_REPORT__MECHANIC:
				return mechanic != null;
			case CbPackage.SERVICE_REPORT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //ServiceReportImpl
