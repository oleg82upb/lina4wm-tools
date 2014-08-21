/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlflowPackage;

import de.upb.llvm_parser.llvm.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl#getMemAddress <em>Mem Address</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl#getMemValue <em>Mem Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressValuePairImpl extends EObjectImpl implements AddressValuePair {
	/**
	 * The cached value of the '{@link #getMemAddress() <em>Mem Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemAddress()
	 * @generated
	 * @ordered
	 */
	protected Parameter memAddress;

	/**
	 * The cached value of the '{@link #getMemValue() <em>Mem Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemValue()
	 * @generated
	 * @ordered
	 */
	protected Parameter memValue;

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
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AddressValuePair){
			AddressValuePair otherPair = (AddressValuePair)obj;
			return otherPair.getMemAddress().equals(memAddress) && otherPair.getMemValue().equals(memValue);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getMemAddress() {
		if (memAddress != null && memAddress.eIsProxy()) {
			InternalEObject oldMemAddress = (InternalEObject)memAddress;
			memAddress = (Parameter)eResolveProxy(oldMemAddress);
			if (memAddress != oldMemAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_ADDRESS, oldMemAddress, memAddress));
			}
		}
		return memAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetMemAddress() {
		return memAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemAddress(Parameter newMemAddress) {
		Parameter oldMemAddress = memAddress;
		memAddress = newMemAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_ADDRESS, oldMemAddress, memAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getMemValue() {
		if (memValue != null && memValue.eIsProxy()) {
			InternalEObject oldMemValue = (InternalEObject)memValue;
			memValue = (Parameter)eResolveProxy(oldMemValue);
			if (memValue != oldMemValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_VALUE, oldMemValue, memValue));
			}
		}
		return memValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetMemValue() {
		return memValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemValue(Parameter newMemValue) {
		Parameter oldMemValue = memValue;
		memValue = newMemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_VALUE, oldMemValue, memValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_ADDRESS:
				if (resolve) return getMemAddress();
				return basicGetMemAddress();
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_VALUE:
				if (resolve) return getMemValue();
				return basicGetMemValue();
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_ADDRESS:
				setMemAddress((Parameter)newValue);
				return;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_VALUE:
				setMemValue((Parameter)newValue);
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_ADDRESS:
				setMemAddress((Parameter)null);
				return;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_VALUE:
				setMemValue((Parameter)null);
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
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_ADDRESS:
				return memAddress != null;
			case ControlflowPackage.ADDRESS_VALUE_PAIR__MEM_VALUE:
				return memValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressValuePairImpl
