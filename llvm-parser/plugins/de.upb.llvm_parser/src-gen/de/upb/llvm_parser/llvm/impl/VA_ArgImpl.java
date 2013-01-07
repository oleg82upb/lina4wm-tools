/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.VA_Arg;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VA Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl#getListtype <em>Listtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl#getListvalue <em>Listvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl#getArgType <em>Arg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VA_ArgImpl extends InstructionImpl implements VA_Arg {
	/**
	 * The default value of the '{@link #getListtype() <em>Listtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListtype()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListtype() <em>Listtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListtype()
	 * @generated
	 * @ordered
	 */
	protected String listtype = LISTTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getListvalue() <em>Listvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListvalue() <em>Listvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListvalue()
	 * @generated
	 * @ordered
	 */
	protected String listvalue = LISTVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgType() <em>Arg Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgType()
	 * @generated
	 * @ordered
	 */
	protected static final String ARG_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgType()
	 * @generated
	 * @ordered
	 */
	protected String argType = ARG_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VA_ArgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.VA_ARG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListtype() {
		return listtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListtype(String newListtype) {
		String oldListtype = listtype;
		listtype = newListtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__LISTTYPE, oldListtype, listtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListvalue() {
		return listvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListvalue(String newListvalue) {
		String oldListvalue = listvalue;
		listvalue = newListvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__LISTVALUE, oldListvalue, listvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgType() {
		return argType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgType(String newArgType) {
		String oldArgType = argType;
		argType = newArgType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__ARG_TYPE, oldArgType, argType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.VA_ARG__LISTTYPE:
				return getListtype();
			case LlvmPackage.VA_ARG__LISTVALUE:
				return getListvalue();
			case LlvmPackage.VA_ARG__ARG_TYPE:
				return getArgType();
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				setListtype((String)newValue);
				return;
			case LlvmPackage.VA_ARG__LISTVALUE:
				setListvalue((String)newValue);
				return;
			case LlvmPackage.VA_ARG__ARG_TYPE:
				setArgType((String)newValue);
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				setListtype(LISTTYPE_EDEFAULT);
				return;
			case LlvmPackage.VA_ARG__LISTVALUE:
				setListvalue(LISTVALUE_EDEFAULT);
				return;
			case LlvmPackage.VA_ARG__ARG_TYPE:
				setArgType(ARG_TYPE_EDEFAULT);
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				return LISTTYPE_EDEFAULT == null ? listtype != null : !LISTTYPE_EDEFAULT.equals(listtype);
			case LlvmPackage.VA_ARG__LISTVALUE:
				return LISTVALUE_EDEFAULT == null ? listvalue != null : !LISTVALUE_EDEFAULT.equals(listvalue);
			case LlvmPackage.VA_ARG__ARG_TYPE:
				return ARG_TYPE_EDEFAULT == null ? argType != null : !ARG_TYPE_EDEFAULT.equals(argType);
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
		result.append(" (listtype: ");
		result.append(listtype);
		result.append(", listvalue: ");
		result.append(listvalue);
		result.append(", argType: ");
		result.append(argType);
		result.append(')');
		return result.toString();
	}

} //VA_ArgImpl
