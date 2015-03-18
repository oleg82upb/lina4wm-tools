/**
 */
package de.upb.lina.lll.impl;

import de.upb.lina.lll.LllPackage;
import de.upb.lina.lll.MemoryInstruction;
import de.upb.lina.lll.MemoryInstructionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.lll.impl.MemoryInstructionImpl#getInstructionType <em>Instruction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryInstructionImpl extends InstructionImpl implements MemoryInstruction {
	/**
	 * The default value of the '{@link #getInstructionType() <em>Instruction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryInstructionType INSTRUCTION_TYPE_EDEFAULT = MemoryInstructionType.ALLOCA;

	/**
	 * The cached value of the '{@link #getInstructionType() <em>Instruction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionType()
	 * @generated
	 * @ordered
	 */
	protected MemoryInstructionType instructionType = INSTRUCTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LllPackage.Literals.MEMORY_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryInstructionType getInstructionType() {
		return instructionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionType(MemoryInstructionType newInstructionType) {
		MemoryInstructionType oldInstructionType = instructionType;
		instructionType = newInstructionType == null ? INSTRUCTION_TYPE_EDEFAULT : newInstructionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.MEMORY_INSTRUCTION__INSTRUCTION_TYPE, oldInstructionType, instructionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LllPackage.MEMORY_INSTRUCTION__INSTRUCTION_TYPE:
				return getInstructionType();
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
			case LllPackage.MEMORY_INSTRUCTION__INSTRUCTION_TYPE:
				setInstructionType((MemoryInstructionType)newValue);
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
			case LllPackage.MEMORY_INSTRUCTION__INSTRUCTION_TYPE:
				setInstructionType(INSTRUCTION_TYPE_EDEFAULT);
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
			case LllPackage.MEMORY_INSTRUCTION__INSTRUCTION_TYPE:
				return instructionType != INSTRUCTION_TYPE_EDEFAULT;
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
		result.append(" (instructionType: ");
		result.append(instructionType);
		result.append(')');
		return result.toString();
	}

} //MemoryInstructionImpl
