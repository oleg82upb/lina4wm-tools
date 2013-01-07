/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ShuffleVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shuffle Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal1type <em>Val1type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal1value <em>Val1value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal2type <em>Val2type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal2value <em>Val2value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getMasktype <em>Masktype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getMaskvalue <em>Maskvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuffleVectorImpl extends InstructionImpl implements ShuffleVector {
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
	 * The default value of the '{@link #getMasktype() <em>Masktype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasktype()
	 * @generated
	 * @ordered
	 */
	protected static final String MASKTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasktype() <em>Masktype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasktype()
	 * @generated
	 * @ordered
	 */
	protected String masktype = MASKTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskvalue() <em>Maskvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String MASKVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskvalue() <em>Maskvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskvalue()
	 * @generated
	 * @ordered
	 */
	protected String maskvalue = MASKVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuffleVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.SHUFFLE_VECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE, oldVal1type, val1type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE, oldVal1value, val1value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE, oldVal2type, val2type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE, oldVal2value, val2value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasktype() {
		return masktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasktype(String newMasktype) {
		String oldMasktype = masktype;
		masktype = newMasktype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASKTYPE, oldMasktype, masktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaskvalue() {
		return maskvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskvalue(String newMaskvalue) {
		String oldMaskvalue = maskvalue;
		maskvalue = newMaskvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASKVALUE, oldMaskvalue, maskvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
				return getVal1type();
			case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
				return getVal1value();
			case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
				return getVal2type();
			case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
				return getVal2value();
			case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
				return getMasktype();
			case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
				return getMaskvalue();
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
			case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
				setVal1type((String)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
				setVal1value((String)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
				setVal2type((String)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
				setVal2value((String)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
				setMasktype((String)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
				setMaskvalue((String)newValue);
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
			case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
				setVal1type(VAL1TYPE_EDEFAULT);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
				setVal1value(VAL1VALUE_EDEFAULT);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
				setVal2type(VAL2TYPE_EDEFAULT);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
				setVal2value(VAL2VALUE_EDEFAULT);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
				setMasktype(MASKTYPE_EDEFAULT);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
				setMaskvalue(MASKVALUE_EDEFAULT);
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
			case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
				return VAL1TYPE_EDEFAULT == null ? val1type != null : !VAL1TYPE_EDEFAULT.equals(val1type);
			case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
				return VAL1VALUE_EDEFAULT == null ? val1value != null : !VAL1VALUE_EDEFAULT.equals(val1value);
			case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
				return VAL2TYPE_EDEFAULT == null ? val2type != null : !VAL2TYPE_EDEFAULT.equals(val2type);
			case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
				return VAL2VALUE_EDEFAULT == null ? val2value != null : !VAL2VALUE_EDEFAULT.equals(val2value);
			case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
				return MASKTYPE_EDEFAULT == null ? masktype != null : !MASKTYPE_EDEFAULT.equals(masktype);
			case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
				return MASKVALUE_EDEFAULT == null ? maskvalue != null : !MASKVALUE_EDEFAULT.equals(maskvalue);
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
		result.append(" (val1type: ");
		result.append(val1type);
		result.append(", val1value: ");
		result.append(val1value);
		result.append(", val2type: ");
		result.append(val2type);
		result.append(", val2value: ");
		result.append(val2value);
		result.append(", masktype: ");
		result.append(masktype);
		result.append(", maskvalue: ");
		result.append(maskvalue);
		result.append(')');
		return result.toString();
	}

} //ShuffleVectorImpl
