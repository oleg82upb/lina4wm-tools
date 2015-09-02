/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.StoreBuffer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.StoreBufferImpl#getAddressValuePairs <em>Address Value Pairs</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.StoreBufferImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreBufferImpl extends EObjectImpl implements StoreBuffer {
	/**
	 * The cached value of the '{@link #getAddressValuePairs() <em>Address Value Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressValuePairs()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressValuePair> addressValuePairs;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.STORE_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressValuePair> getAddressValuePairs()
	{
		if (addressValuePairs == null)
		{
			addressValuePairs = new EObjectContainmentWithInverseEList<AddressValuePair>(AddressValuePair.class, this, ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS, ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER);
		}
		return addressValuePairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation getLocation()
	{
		if (eContainerFeatureID() != ControlflowPackage.STORE_BUFFER__LOCATION) return null;
		return (ControlFlowLocation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(ControlFlowLocation newLocation, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newLocation, ControlflowPackage.STORE_BUFFER__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ControlFlowLocation newLocation)
	{
		if (newLocation != eInternalContainer() || (eContainerFeatureID() != ControlflowPackage.STORE_BUFFER__LOCATION && newLocation != null))
		{
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, ControlflowPackage.CONTROL_FLOW_LOCATION__BUFFER, ControlFlowLocation.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.STORE_BUFFER__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddressValuePairs()).basicAdd(otherEnd, msgs);
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((ControlFlowLocation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS:
				return ((InternalEList<?>)getAddressValuePairs()).basicRemove(otherEnd, msgs);
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				return basicSetLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				return eInternalContainer().eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_LOCATION__BUFFER, ControlFlowLocation.class, msgs);
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
		switch (featureID)
		{
			case ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS:
				return getAddressValuePairs();
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				return getLocation();
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
		switch (featureID)
		{
			case ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS:
				getAddressValuePairs().clear();
				getAddressValuePairs().addAll((Collection<? extends AddressValuePair>)newValue);
				return;
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				setLocation((ControlFlowLocation)newValue);
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
		switch (featureID)
		{
			case ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS:
				getAddressValuePairs().clear();
				return;
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				setLocation((ControlFlowLocation)null);
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
		switch (featureID)
		{
			case ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS:
				return addressValuePairs != null && !addressValuePairs.isEmpty();
			case ControlflowPackage.STORE_BUFFER__LOCATION:
				return getLocation() != null;
		}
		return super.eIsSet(featureID);
	}

} //StoreBufferImpl
