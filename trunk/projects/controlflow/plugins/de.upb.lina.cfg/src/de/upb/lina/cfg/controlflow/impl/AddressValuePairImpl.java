/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlflowPackage;

import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.llvm_parser.llvm.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl#getStoreBuffer <em>Store Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressValuePairImpl extends EObjectImpl implements AddressValuePair {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Parameter address;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Parameter value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.ADDRESS_VALUE_PAIR;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAddress()
	{
		if (address != null && address.eIsProxy())
		{
			InternalEObject oldAddress = (InternalEObject)address;
			address = (Parameter)eResolveProxy(oldAddress);
			if (address != oldAddress)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.ADDRESS_VALUE_PAIR__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetAddress()
	{
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Parameter newAddress)
	{
		Parameter oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.ADDRESS_VALUE_PAIR__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getValue()
	{
		if (value != null && value.eIsProxy())
		{
			InternalEObject oldValue = (InternalEObject)value;
			value = (Parameter)eResolveProxy(oldValue);
			if (value != oldValue)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.ADDRESS_VALUE_PAIR__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Parameter newValue)
	{
		Parameter oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.ADDRESS_VALUE_PAIR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreBuffer getStoreBuffer()
	{
		if (eContainerFeatureID() != ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER) return null;
		return (StoreBuffer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoreBuffer(StoreBuffer newStoreBuffer, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newStoreBuffer, ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreBuffer(StoreBuffer newStoreBuffer)
	{
		if (newStoreBuffer != eInternalContainer() || (eContainerFeatureID() != ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER && newStoreBuffer != null))
		{
			if (EcoreUtil.isAncestor(this, newStoreBuffer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStoreBuffer != null)
				msgs = ((InternalEObject)newStoreBuffer).eInverseAdd(this, ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS, StoreBuffer.class, msgs);
			msgs = basicSetStoreBuffer(newStoreBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER, newStoreBuffer, newStoreBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStoreBuffer((StoreBuffer)otherEnd, msgs);
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				return basicSetStoreBuffer(null, msgs);
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				return eInternalContainer().eInverseRemove(this, ControlflowPackage.STORE_BUFFER__ADDRESS_VALUE_PAIRS, StoreBuffer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AddressValuePair){
			AddressValuePair otherPair = (AddressValuePair)obj;
			return otherPair.getAddress().equals(address) && otherPair.getValue().equals(value);
		}
		return false;
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case ControlflowPackage.ADDRESS_VALUE_PAIR__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				return getStoreBuffer();
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
		switch (featureID)
		{
			case ControlflowPackage.ADDRESS_VALUE_PAIR__ADDRESS:
				setAddress((Parameter)newValue);
				return;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__VALUE:
				setValue((Parameter)newValue);
				return;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				setStoreBuffer((StoreBuffer)newValue);
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__ADDRESS:
				setAddress((Parameter)null);
				return;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__VALUE:
				setValue((Parameter)null);
				return;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				setStoreBuffer((StoreBuffer)null);
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__ADDRESS:
				return address != null;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__VALUE:
				return value != null;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__STORE_BUFFER:
				return getStoreBuffer() != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressValuePairImpl
