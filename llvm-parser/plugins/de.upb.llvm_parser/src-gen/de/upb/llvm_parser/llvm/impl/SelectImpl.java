/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Select;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getConditiontype <em>Conditiontype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getConditionvalue <em>Conditionvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getVal1type <em>Val1type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getVal1value <em>Val1value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getVal2type <em>Val2type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getVal2value <em>Val2value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends InstructionImpl implements Select {
	/**
	 * The default value of the '{@link #getConditiontype() <em>Conditiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditiontype()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditiontype() <em>Conditiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditiontype()
	 * @generated
	 * @ordered
	 */
	protected String conditiontype = CONDITIONTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionvalue() <em>Conditionvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionvalue() <em>Conditionvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionvalue()
	 * @generated
	 * @ordered
	 */
	protected String conditionvalue = CONDITIONVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVal1type() <em>Val1type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal1type()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL1TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVal1type() <em>Val1type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal1type()
	 * @generated
	 * @ordered
	 */
	protected String val1type = VAL1TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVal1value() <em>Val1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal1value()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL1VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVal1value() <em>Val1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal1value()
	 * @generated
	 * @ordered
	 */
	protected String val1value = VAL1VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVal2type() <em>Val2type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal2type()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL2TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVal2type() <em>Val2type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal2type()
	 * @generated
	 * @ordered
	 */
	protected String val2type = VAL2TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVal2value() <em>Val2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal2value()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL2VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVal2value() <em>Val2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal2value()
	 * @generated
	 * @ordered
	 */
	protected String val2value = VAL2VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditiontype() {
		return conditiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditiontype(String newConditiontype) {
		String oldConditiontype = conditiontype;
		conditiontype = newConditiontype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__CONDITIONTYPE, oldConditiontype, conditiontype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionvalue() {
		return conditionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionvalue(String newConditionvalue) {
		String oldConditionvalue = conditionvalue;
		conditionvalue = newConditionvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__CONDITIONVALUE, oldConditionvalue, conditionvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVal1type() {
		return val1type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal1type(String newVal1type) {
		String oldVal1type = val1type;
		val1type = newVal1type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL1TYPE, oldVal1type, val1type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVal1value() {
		return val1value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal1value(String newVal1value) {
		String oldVal1value = val1value;
		val1value = newVal1value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL1VALUE, oldVal1value, val1value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVal2type() {
		return val2type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal2type(String newVal2type) {
		String oldVal2type = val2type;
		val2type = newVal2type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL2TYPE, oldVal2type, val2type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVal2value() {
		return val2value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal2value(String newVal2value) {
		String oldVal2value = val2value;
		val2value = newVal2value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL2VALUE, oldVal2value, val2value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.SELECT__CONDITIONTYPE:
				return getConditiontype();
			case LlvmPackage.SELECT__CONDITIONVALUE:
				return getConditionvalue();
			case LlvmPackage.SELECT__VAL1TYPE:
				return getVal1type();
			case LlvmPackage.SELECT__VAL1VALUE:
				return getVal1value();
			case LlvmPackage.SELECT__VAL2TYPE:
				return getVal2type();
			case LlvmPackage.SELECT__VAL2VALUE:
				return getVal2value();
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
			case LlvmPackage.SELECT__CONDITIONTYPE:
				setConditiontype((String)newValue);
				return;
			case LlvmPackage.SELECT__CONDITIONVALUE:
				setConditionvalue((String)newValue);
				return;
			case LlvmPackage.SELECT__VAL1TYPE:
				setVal1type((String)newValue);
				return;
			case LlvmPackage.SELECT__VAL1VALUE:
				setVal1value((String)newValue);
				return;
			case LlvmPackage.SELECT__VAL2TYPE:
				setVal2type((String)newValue);
				return;
			case LlvmPackage.SELECT__VAL2VALUE:
				setVal2value((String)newValue);
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
			case LlvmPackage.SELECT__CONDITIONTYPE:
				setConditiontype(CONDITIONTYPE_EDEFAULT);
				return;
			case LlvmPackage.SELECT__CONDITIONVALUE:
				setConditionvalue(CONDITIONVALUE_EDEFAULT);
				return;
			case LlvmPackage.SELECT__VAL1TYPE:
				setVal1type(VAL1TYPE_EDEFAULT);
				return;
			case LlvmPackage.SELECT__VAL1VALUE:
				setVal1value(VAL1VALUE_EDEFAULT);
				return;
			case LlvmPackage.SELECT__VAL2TYPE:
				setVal2type(VAL2TYPE_EDEFAULT);
				return;
			case LlvmPackage.SELECT__VAL2VALUE:
				setVal2value(VAL2VALUE_EDEFAULT);
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
			case LlvmPackage.SELECT__CONDITIONTYPE:
				return CONDITIONTYPE_EDEFAULT == null ? conditiontype != null : !CONDITIONTYPE_EDEFAULT.equals(conditiontype);
			case LlvmPackage.SELECT__CONDITIONVALUE:
				return CONDITIONVALUE_EDEFAULT == null ? conditionvalue != null : !CONDITIONVALUE_EDEFAULT.equals(conditionvalue);
			case LlvmPackage.SELECT__VAL1TYPE:
				return VAL1TYPE_EDEFAULT == null ? val1type != null : !VAL1TYPE_EDEFAULT.equals(val1type);
			case LlvmPackage.SELECT__VAL1VALUE:
				return VAL1VALUE_EDEFAULT == null ? val1value != null : !VAL1VALUE_EDEFAULT.equals(val1value);
			case LlvmPackage.SELECT__VAL2TYPE:
				return VAL2TYPE_EDEFAULT == null ? val2type != null : !VAL2TYPE_EDEFAULT.equals(val2type);
			case LlvmPackage.SELECT__VAL2VALUE:
				return VAL2VALUE_EDEFAULT == null ? val2value != null : !VAL2VALUE_EDEFAULT.equals(val2value);
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
		result.append(" (conditiontype: ");
		result.append(conditiontype);
		result.append(", conditionvalue: ");
		result.append(conditionvalue);
		result.append(", val1type: ");
		result.append(val1type);
		result.append(", val1value: ");
		result.append(val1value);
		result.append(", val2type: ");
		result.append(val2type);
		result.append(", val2value: ");
		result.append(val2value);
		result.append(')');
		return result.toString();
	}

} //SelectImpl
