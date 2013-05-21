/**
 */
package de.upb.lina.lll.impl;

import de.upb.lina.lll.Function;
import de.upb.lina.lll.Instruction;
import de.upb.lina.lll.InstructionEnum;
import de.upb.lina.lll.LllPackage;
import de.upb.lina.lll.Parameter;
import de.upb.lina.lll.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.lll.impl.InstructionImpl#getInstructionResult <em>Instruction Result</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.InstructionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.InstructionImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.InstructionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends EObjectImpl implements Instruction {
	/**
	 * The cached value of the '{@link #getInstructionResult() <em>Instruction Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionResult()
	 * @generated
	 * @ordered
	 */
	protected Variable instructionResult;

	/**
	 * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final InstructionEnum INSTRUCTION_EDEFAULT = InstructionEnum.ALLOCA;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected InstructionEnum instruction = INSTRUCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LllPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getInstructionResult() {
		if (instructionResult != null && instructionResult.eIsProxy()) {
			InternalEObject oldInstructionResult = (InternalEObject)instructionResult;
			instructionResult = (Variable)eResolveProxy(oldInstructionResult);
			if (instructionResult != oldInstructionResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LllPackage.INSTRUCTION__INSTRUCTION_RESULT, oldInstructionResult, instructionResult));
			}
		}
		return instructionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetInstructionResult() {
		return instructionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionResult(Variable newInstructionResult) {
		Variable oldInstructionResult = instructionResult;
		instructionResult = newInstructionResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.INSTRUCTION__INSTRUCTION_RESULT, oldInstructionResult, instructionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		if (eContainerFeatureID() != LllPackage.INSTRUCTION__FUNCTION) return null;
		return (Function)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFunction, LllPackage.INSTRUCTION__FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != eInternalContainer() || (eContainerFeatureID() != LllPackage.INSTRUCTION__FUNCTION && newFunction != null)) {
			if (EcoreUtil.isAncestor(this, newFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, LllPackage.FUNCTION__INSTRUCTIONS, Function.class, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.INSTRUCTION__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionEnum getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(InstructionEnum newInstruction) {
		InstructionEnum oldInstruction = instruction;
		instruction = newInstruction == null ? INSTRUCTION_EDEFAULT : newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.INSTRUCTION__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, LllPackage.INSTRUCTION__PARAMETERS, LllPackage.PARAMETER__INSTRUCTION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LllPackage.INSTRUCTION__FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFunction((Function)otherEnd, msgs);
			case LllPackage.INSTRUCTION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LllPackage.INSTRUCTION__FUNCTION:
				return basicSetFunction(null, msgs);
			case LllPackage.INSTRUCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LllPackage.INSTRUCTION__FUNCTION:
				return eInternalContainer().eInverseRemove(this, LllPackage.FUNCTION__INSTRUCTIONS, Function.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LllPackage.INSTRUCTION__INSTRUCTION_RESULT:
				if (resolve) return getInstructionResult();
				return basicGetInstructionResult();
			case LllPackage.INSTRUCTION__FUNCTION:
				return getFunction();
			case LllPackage.INSTRUCTION__INSTRUCTION:
				return getInstruction();
			case LllPackage.INSTRUCTION__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LllPackage.INSTRUCTION__INSTRUCTION_RESULT:
				setInstructionResult((Variable)newValue);
				return;
			case LllPackage.INSTRUCTION__FUNCTION:
				setFunction((Function)newValue);
				return;
			case LllPackage.INSTRUCTION__INSTRUCTION:
				setInstruction((InstructionEnum)newValue);
				return;
			case LllPackage.INSTRUCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case LllPackage.INSTRUCTION__INSTRUCTION_RESULT:
				setInstructionResult((Variable)null);
				return;
			case LllPackage.INSTRUCTION__FUNCTION:
				setFunction((Function)null);
				return;
			case LllPackage.INSTRUCTION__INSTRUCTION:
				setInstruction(INSTRUCTION_EDEFAULT);
				return;
			case LllPackage.INSTRUCTION__PARAMETERS:
				getParameters().clear();
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
			case LllPackage.INSTRUCTION__INSTRUCTION_RESULT:
				return instructionResult != null;
			case LllPackage.INSTRUCTION__FUNCTION:
				return getFunction() != null;
			case LllPackage.INSTRUCTION__INSTRUCTION:
				return instruction != INSTRUCTION_EDEFAULT;
			case LllPackage.INSTRUCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (instruction: ");
		result.append(instruction);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
