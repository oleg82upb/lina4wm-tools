/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.JumpTable;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Switch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getComptype <em>Comptype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getCompvalue <em>Compvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDefaulttype <em>Defaulttype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getJTable <em>JTable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends Ret_InstrImpl implements Switch {
	/**
	 * The default value of the '{@link #getComptype() <em>Comptype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComptype()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComptype() <em>Comptype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComptype()
	 * @generated
	 * @ordered
	 */
	protected String comptype = COMPTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompvalue() <em>Compvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompvalue() <em>Compvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompvalue()
	 * @generated
	 * @ordered
	 */
	protected String compvalue = COMPVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaulttype() <em>Defaulttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaulttype()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaulttype() <em>Defaulttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaulttype()
	 * @generated
	 * @ordered
	 */
	protected String defaulttype = DEFAULTTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULTVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected String defaultvalue = DEFAULTVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJTable() <em>JTable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJTable()
	 * @generated
	 * @ordered
	 */
	protected JumpTable jTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComptype() {
		return comptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComptype(String newComptype) {
		String oldComptype = comptype;
		comptype = newComptype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPTYPE, oldComptype, comptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompvalue() {
		return compvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompvalue(String newCompvalue) {
		String oldCompvalue = compvalue;
		compvalue = newCompvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPVALUE, oldCompvalue, compvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaulttype() {
		return defaulttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaulttype(String newDefaulttype) {
		String oldDefaulttype = defaulttype;
		defaulttype = newDefaulttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTTYPE, oldDefaulttype, defaulttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultvalue() {
		return defaultvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultvalue(String newDefaultvalue) {
		String oldDefaultvalue = defaultvalue;
		defaultvalue = newDefaultvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTVALUE, oldDefaultvalue, defaultvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpTable getJTable() {
		return jTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJTable(JumpTable newJTable, NotificationChain msgs) {
		JumpTable oldJTable = jTable;
		jTable = newJTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__JTABLE, oldJTable, newJTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJTable(JumpTable newJTable) {
		if (newJTable != jTable) {
			NotificationChain msgs = null;
			if (jTable != null)
				msgs = ((InternalEObject)jTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__JTABLE, null, msgs);
			if (newJTable != null)
				msgs = ((InternalEObject)newJTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__JTABLE, null, msgs);
			msgs = basicSetJTable(newJTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__JTABLE, newJTable, newJTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.SWITCH__JTABLE:
				return basicSetJTable(null, msgs);
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
			case LlvmPackage.SWITCH__COMPTYPE:
				return getComptype();
			case LlvmPackage.SWITCH__COMPVALUE:
				return getCompvalue();
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				return getDefaulttype();
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				return getDefaultvalue();
			case LlvmPackage.SWITCH__JTABLE:
				return getJTable();
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
			case LlvmPackage.SWITCH__COMPTYPE:
				setComptype((String)newValue);
				return;
			case LlvmPackage.SWITCH__COMPVALUE:
				setCompvalue((String)newValue);
				return;
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				setDefaulttype((String)newValue);
				return;
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				setDefaultvalue((String)newValue);
				return;
			case LlvmPackage.SWITCH__JTABLE:
				setJTable((JumpTable)newValue);
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
			case LlvmPackage.SWITCH__COMPTYPE:
				setComptype(COMPTYPE_EDEFAULT);
				return;
			case LlvmPackage.SWITCH__COMPVALUE:
				setCompvalue(COMPVALUE_EDEFAULT);
				return;
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				setDefaulttype(DEFAULTTYPE_EDEFAULT);
				return;
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				setDefaultvalue(DEFAULTVALUE_EDEFAULT);
				return;
			case LlvmPackage.SWITCH__JTABLE:
				setJTable((JumpTable)null);
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
			case LlvmPackage.SWITCH__COMPTYPE:
				return COMPTYPE_EDEFAULT == null ? comptype != null : !COMPTYPE_EDEFAULT.equals(comptype);
			case LlvmPackage.SWITCH__COMPVALUE:
				return COMPVALUE_EDEFAULT == null ? compvalue != null : !COMPVALUE_EDEFAULT.equals(compvalue);
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				return DEFAULTTYPE_EDEFAULT == null ? defaulttype != null : !DEFAULTTYPE_EDEFAULT.equals(defaulttype);
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				return DEFAULTVALUE_EDEFAULT == null ? defaultvalue != null : !DEFAULTVALUE_EDEFAULT.equals(defaultvalue);
			case LlvmPackage.SWITCH__JTABLE:
				return jTable != null;
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
		result.append(" (comptype: ");
		result.append(comptype);
		result.append(", compvalue: ");
		result.append(compvalue);
		result.append(", defaulttype: ");
		result.append(defaulttype);
		result.append(", defaultvalue: ");
		result.append(defaultvalue);
		result.append(')');
		return result.toString();
	}

} //SwitchImpl
