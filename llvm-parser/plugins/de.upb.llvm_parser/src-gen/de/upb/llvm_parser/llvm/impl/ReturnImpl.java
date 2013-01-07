/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Return;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ReturnImpl#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ReturnImpl#getReturnvalue <em>Returnvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnImpl extends Ret_InstrImpl implements Return {
	/**
	 * The default value of the '{@link #getReturntype() <em>Returntype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURNTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected String returntype = RETURNTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnvalue() <em>Returnvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURNVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnvalue() <em>Returnvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnvalue()
	 * @generated
	 * @ordered
	 */
	protected String returnvalue = RETURNVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturntype(String newReturntype) {
		String oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.RETURN__RETURNTYPE, oldReturntype, returntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnvalue() {
		return returnvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnvalue(String newReturnvalue) {
		String oldReturnvalue = returnvalue;
		returnvalue = newReturnvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.RETURN__RETURNVALUE, oldReturnvalue, returnvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.RETURN__RETURNTYPE:
				return getReturntype();
			case LlvmPackage.RETURN__RETURNVALUE:
				return getReturnvalue();
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
			case LlvmPackage.RETURN__RETURNTYPE:
				setReturntype((String)newValue);
				return;
			case LlvmPackage.RETURN__RETURNVALUE:
				setReturnvalue((String)newValue);
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
			case LlvmPackage.RETURN__RETURNTYPE:
				setReturntype(RETURNTYPE_EDEFAULT);
				return;
			case LlvmPackage.RETURN__RETURNVALUE:
				setReturnvalue(RETURNVALUE_EDEFAULT);
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
			case LlvmPackage.RETURN__RETURNTYPE:
				return RETURNTYPE_EDEFAULT == null ? returntype != null : !RETURNTYPE_EDEFAULT.equals(returntype);
			case LlvmPackage.RETURN__RETURNVALUE:
				return RETURNVALUE_EDEFAULT == null ? returnvalue != null : !RETURNVALUE_EDEFAULT.equals(returnvalue);
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
		result.append(" (returntype: ");
		result.append(returntype);
		result.append(", returnvalue: ");
		result.append(returnvalue);
		result.append(')');
		return result.toString();
	}

} //ReturnImpl
