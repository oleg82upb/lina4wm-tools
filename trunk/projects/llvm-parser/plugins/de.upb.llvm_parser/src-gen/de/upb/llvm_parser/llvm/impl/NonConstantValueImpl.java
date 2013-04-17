/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.NonConstantValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Constant Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NonConstantValueImpl#getPointer <em>Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonConstantValueImpl extends ValueImpl implements NonConstantValue {
	/**
	 * The default value of the '{@link #getPointer() <em>Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointer() <em>Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected String pointer = POINTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConstantValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.NON_CONSTANT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointer() {
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointer(String newPointer) {
		String oldPointer = pointer;
		pointer = newPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NON_CONSTANT_VALUE__POINTER, oldPointer, pointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.NON_CONSTANT_VALUE__POINTER:
				return getPointer();
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
			case LlvmPackage.NON_CONSTANT_VALUE__POINTER:
				setPointer((String)newValue);
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
			case LlvmPackage.NON_CONSTANT_VALUE__POINTER:
				setPointer(POINTER_EDEFAULT);
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
			case LlvmPackage.NON_CONSTANT_VALUE__POINTER:
				return POINTER_EDEFAULT == null ? pointer != null : !POINTER_EDEFAULT.equals(pointer);
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
		result.append(" (pointer: ");
		result.append(pointer);
		result.append(')');
		return result.toString();
	}

} //NonConstantValueImpl
