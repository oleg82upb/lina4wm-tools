/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Alias;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.LocalVarInstruction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Var Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LocalVarInstructionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LocalVarInstructionImpl#getInstr <em>Instr</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LocalVarInstructionImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalVarInstructionImpl extends MainLevelEntityImpl implements LocalVarInstruction {
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
	 * The cached value of the '{@link #getInstr() <em>Instr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstr()
	 * @generated
	 * @ordered
	 */
	protected Instruction instr;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected Alias alias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalVarInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.LOCAL_VAR_INSTRUCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR_INSTRUCTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getInstr() {
		return instr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstr(Instruction newInstr, NotificationChain msgs) {
		Instruction oldInstr = instr;
		instr = newInstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR, oldInstr, newInstr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstr(Instruction newInstr) {
		if (newInstr != instr) {
			NotificationChain msgs = null;
			if (instr != null)
				msgs = ((InternalEObject)instr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR, null, msgs);
			if (newInstr != null)
				msgs = ((InternalEObject)newInstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR, null, msgs);
			msgs = basicSetInstr(newInstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR, newInstr, newInstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(Alias newAlias, NotificationChain msgs) {
		Alias oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS, oldAlias, newAlias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(Alias newAlias) {
		if (newAlias != alias) {
			NotificationChain msgs = null;
			if (alias != null)
				msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS, null, msgs);
			if (newAlias != null)
				msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS, null, msgs);
			msgs = basicSetAlias(newAlias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS, newAlias, newAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR:
				return basicSetInstr(null, msgs);
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS:
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
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__TYPE:
				return getType();
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR:
				return getInstr();
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS:
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
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__TYPE:
				setType((String)newValue);
				return;
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR:
				setInstr((Instruction)newValue);
				return;
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS:
				setAlias((Alias)newValue);
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
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR:
				setInstr((Instruction)null);
				return;
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS:
				setAlias((Alias)null);
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
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__INSTR:
				return instr != null;
			case LlvmPackage.LOCAL_VAR_INSTRUCTION__ALIAS:
				return alias != null;
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

} //LocalVarInstructionImpl
