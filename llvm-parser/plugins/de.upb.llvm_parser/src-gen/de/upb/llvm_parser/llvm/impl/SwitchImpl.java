/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.JumpTable;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

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
	 * The cached value of the '{@link #getComptype() <em>Comptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComptype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse comptype;

	/**
	 * The cached value of the '{@link #getCompvalue() <em>Compvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompvalue()
	 * @generated
	 * @ordered
	 */
	protected Value compvalue;

	/**
	 * The cached value of the '{@link #getDefaulttype() <em>Defaulttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaulttype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse defaulttype;

	/**
	 * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected Value defaultvalue;

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
	public TypeUse getComptype() {
		return comptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComptype(TypeUse newComptype, NotificationChain msgs) {
		TypeUse oldComptype = comptype;
		comptype = newComptype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPTYPE, oldComptype, newComptype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComptype(TypeUse newComptype) {
		if (newComptype != comptype) {
			NotificationChain msgs = null;
			if (comptype != null)
				msgs = ((InternalEObject)comptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPTYPE, null, msgs);
			if (newComptype != null)
				msgs = ((InternalEObject)newComptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPTYPE, null, msgs);
			msgs = basicSetComptype(newComptype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPTYPE, newComptype, newComptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getCompvalue() {
		return compvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompvalue(Value newCompvalue, NotificationChain msgs) {
		Value oldCompvalue = compvalue;
		compvalue = newCompvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPVALUE, oldCompvalue, newCompvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompvalue(Value newCompvalue) {
		if (newCompvalue != compvalue) {
			NotificationChain msgs = null;
			if (compvalue != null)
				msgs = ((InternalEObject)compvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPVALUE, null, msgs);
			if (newCompvalue != null)
				msgs = ((InternalEObject)newCompvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPVALUE, null, msgs);
			msgs = basicSetCompvalue(newCompvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPVALUE, newCompvalue, newCompvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getDefaulttype() {
		return defaulttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaulttype(TypeUse newDefaulttype, NotificationChain msgs) {
		TypeUse oldDefaulttype = defaulttype;
		defaulttype = newDefaulttype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTTYPE, oldDefaulttype, newDefaulttype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaulttype(TypeUse newDefaulttype) {
		if (newDefaulttype != defaulttype) {
			NotificationChain msgs = null;
			if (defaulttype != null)
				msgs = ((InternalEObject)defaulttype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTTYPE, null, msgs);
			if (newDefaulttype != null)
				msgs = ((InternalEObject)newDefaulttype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTTYPE, null, msgs);
			msgs = basicSetDefaulttype(newDefaulttype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTTYPE, newDefaulttype, newDefaulttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getDefaultvalue() {
		return defaultvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultvalue(Value newDefaultvalue, NotificationChain msgs) {
		Value oldDefaultvalue = defaultvalue;
		defaultvalue = newDefaultvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTVALUE, oldDefaultvalue, newDefaultvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultvalue(Value newDefaultvalue) {
		if (newDefaultvalue != defaultvalue) {
			NotificationChain msgs = null;
			if (defaultvalue != null)
				msgs = ((InternalEObject)defaultvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTVALUE, null, msgs);
			if (newDefaultvalue != null)
				msgs = ((InternalEObject)newDefaultvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTVALUE, null, msgs);
			msgs = basicSetDefaultvalue(newDefaultvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTVALUE, newDefaultvalue, newDefaultvalue));
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
			case LlvmPackage.SWITCH__COMPTYPE:
				return basicSetComptype(null, msgs);
			case LlvmPackage.SWITCH__COMPVALUE:
				return basicSetCompvalue(null, msgs);
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				return basicSetDefaulttype(null, msgs);
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				return basicSetDefaultvalue(null, msgs);
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
				setComptype((TypeUse)newValue);
				return;
			case LlvmPackage.SWITCH__COMPVALUE:
				setCompvalue((Value)newValue);
				return;
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				setDefaulttype((TypeUse)newValue);
				return;
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				setDefaultvalue((Value)newValue);
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
				setComptype((TypeUse)null);
				return;
			case LlvmPackage.SWITCH__COMPVALUE:
				setCompvalue((Value)null);
				return;
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				setDefaulttype((TypeUse)null);
				return;
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				setDefaultvalue((Value)null);
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
				return comptype != null;
			case LlvmPackage.SWITCH__COMPVALUE:
				return compvalue != null;
			case LlvmPackage.SWITCH__DEFAULTTYPE:
				return defaulttype != null;
			case LlvmPackage.SWITCH__DEFAULTVALUE:
				return defaultvalue != null;
			case LlvmPackage.SWITCH__JTABLE:
				return jTable != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchImpl
