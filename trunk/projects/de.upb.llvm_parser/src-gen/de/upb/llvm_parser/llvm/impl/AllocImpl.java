/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getNumElements <em>Num Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocImpl extends InstructionImpl implements Alloc {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumElements() <em>Num Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumElements()
	 * @generated
	 * @ordered
	 */
	protected TypeAndValue numElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.ALLOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAndValue getNumElements() {
		return numElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumElements(TypeAndValue newNumElements, NotificationChain msgs) {
		TypeAndValue oldNumElements = numElements;
		numElements = newNumElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__NUM_ELEMENTS, oldNumElements, newNumElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumElements(TypeAndValue newNumElements) {
		if (newNumElements != numElements) {
			NotificationChain msgs = null;
			if (numElements != null)
				msgs = ((InternalEObject)numElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__NUM_ELEMENTS, null, msgs);
			if (newNumElements != null)
				msgs = ((InternalEObject)newNumElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__NUM_ELEMENTS, null, msgs);
			msgs = basicSetNumElements(newNumElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__NUM_ELEMENTS, newNumElements, newNumElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.ALLOC__NUM_ELEMENTS:
				return basicSetNumElements(null, msgs);
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
			case LlvmPackage.ALLOC__TYPE:
				return getType();
			case LlvmPackage.ALLOC__NUM_ELEMENTS:
				return getNumElements();
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
			case LlvmPackage.ALLOC__TYPE:
				setType((String)newValue);
				return;
			case LlvmPackage.ALLOC__NUM_ELEMENTS:
				setNumElements((TypeAndValue)newValue);
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
			case LlvmPackage.ALLOC__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LlvmPackage.ALLOC__NUM_ELEMENTS:
				setNumElements((TypeAndValue)null);
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
			case LlvmPackage.ALLOC__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case LlvmPackage.ALLOC__NUM_ELEMENTS:
				return numElements != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AllocImpl
