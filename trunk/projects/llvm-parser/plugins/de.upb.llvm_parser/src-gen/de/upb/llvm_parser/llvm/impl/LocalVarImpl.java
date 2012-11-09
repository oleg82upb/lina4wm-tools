/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.LocalAlias;
import de.upb.llvm_parser.llvm.LocalInstruction;
import de.upb.llvm_parser.llvm.LocalType;
import de.upb.llvm_parser.llvm.LocalVar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LocalVarImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LocalVarImpl#getInstr <em>Instr</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LocalVarImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalVarImpl extends MainLevelEntityImpl implements LocalVar {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LocalType type;

	/**
	 * The cached value of the '{@link #getInstr() <em>Instr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstr()
	 * @generated
	 * @ordered
	 */
	protected LocalInstruction instr;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected LocalAlias alias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.LOCAL_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(LocalType newType, NotificationChain msgs) {
		LocalType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LocalType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalInstruction getInstr() {
		return instr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstr(LocalInstruction newInstr, NotificationChain msgs) {
		LocalInstruction oldInstr = instr;
		instr = newInstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR__INSTR, oldInstr, newInstr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstr(LocalInstruction newInstr) {
		if (newInstr != instr) {
			NotificationChain msgs = null;
			if (instr != null)
				msgs = ((InternalEObject)instr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR__INSTR, null, msgs);
			if (newInstr != null)
				msgs = ((InternalEObject)newInstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR__INSTR, null, msgs);
			msgs = basicSetInstr(newInstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR__INSTR, newInstr, newInstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAlias getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(LocalAlias newAlias, NotificationChain msgs) {
		LocalAlias oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR__ALIAS, oldAlias, newAlias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(LocalAlias newAlias) {
		if (newAlias != alias) {
			NotificationChain msgs = null;
			if (alias != null)
				msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR__ALIAS, null, msgs);
			if (newAlias != null)
				msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR__ALIAS, null, msgs);
			msgs = basicSetAlias(newAlias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR__ALIAS, newAlias, newAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.LOCAL_VAR__TYPE:
				return basicSetType(null, msgs);
			case LlvmPackage.LOCAL_VAR__INSTR:
				return basicSetInstr(null, msgs);
			case LlvmPackage.LOCAL_VAR__ALIAS:
				return basicSetAlias(null, msgs);
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
			case LlvmPackage.LOCAL_VAR__TYPE:
				return getType();
			case LlvmPackage.LOCAL_VAR__INSTR:
				return getInstr();
			case LlvmPackage.LOCAL_VAR__ALIAS:
				return getAlias();
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
			case LlvmPackage.LOCAL_VAR__TYPE:
				setType((LocalType)newValue);
				return;
			case LlvmPackage.LOCAL_VAR__INSTR:
				setInstr((LocalInstruction)newValue);
				return;
			case LlvmPackage.LOCAL_VAR__ALIAS:
				setAlias((LocalAlias)newValue);
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
			case LlvmPackage.LOCAL_VAR__TYPE:
				setType((LocalType)null);
				return;
			case LlvmPackage.LOCAL_VAR__INSTR:
				setInstr((LocalInstruction)null);
				return;
			case LlvmPackage.LOCAL_VAR__ALIAS:
				setAlias((LocalAlias)null);
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
			case LlvmPackage.LOCAL_VAR__TYPE:
				return type != null;
			case LlvmPackage.LOCAL_VAR__INSTR:
				return instr != null;
			case LlvmPackage.LOCAL_VAR__ALIAS:
				return alias != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalVarImpl
