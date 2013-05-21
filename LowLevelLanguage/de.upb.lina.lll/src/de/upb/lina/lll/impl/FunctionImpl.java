/**
 */
package de.upb.lina.lll.impl;

import de.upb.lina.lll.Function;
import de.upb.lina.lll.Instruction;
import de.upb.lina.lll.Label;
import de.upb.lina.lll.LllPackage;
import de.upb.lina.lll.Parameter;
import de.upb.lina.lll.Program;
import de.upb.lina.lll.VariableOrValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.lll.impl.FunctionImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.FunctionImpl#getVariablesOrValues <em>Variables Or Values</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.FunctionImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.FunctionImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends ENamedElementImpl implements Function {
	/**
	 * The cached value of the '{@link #getVariablesOrValues() <em>Variables Or Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablesOrValues()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableOrValue> variablesOrValues;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

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
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LllPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (eContainerFeatureID() != LllPackage.FUNCTION__PROGRAM) return null;
		return (Program)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, LllPackage.FUNCTION__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != LllPackage.FUNCTION__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, LllPackage.PROGRAM__FUNCTIONS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.FUNCTION__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableOrValue> getVariablesOrValues() {
		if (variablesOrValues == null) {
			variablesOrValues = new EObjectContainmentEList<VariableOrValue>(VariableOrValue.class, this, LllPackage.FUNCTION__VARIABLES_OR_VALUES);
		}
		return variablesOrValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList<Label>(Label.class, this, LllPackage.FUNCTION__LABELS, LllPackage.LABEL__FUNCTION);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentWithInverseEList<Instruction>(Instruction.class, this, LllPackage.FUNCTION__INSTRUCTIONS, LllPackage.INSTRUCTION__FUNCTION);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, LllPackage.FUNCTION__PARAMETERS, LllPackage.PARAMETER__FUNCTION);
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
			case LllPackage.FUNCTION__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
			case LllPackage.FUNCTION__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
			case LllPackage.FUNCTION__INSTRUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructions()).basicAdd(otherEnd, msgs);
			case LllPackage.FUNCTION__PARAMETERS:
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
			case LllPackage.FUNCTION__PROGRAM:
				return basicSetProgram(null, msgs);
			case LllPackage.FUNCTION__VARIABLES_OR_VALUES:
				return ((InternalEList<?>)getVariablesOrValues()).basicRemove(otherEnd, msgs);
			case LllPackage.FUNCTION__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case LllPackage.FUNCTION__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case LllPackage.FUNCTION__PARAMETERS:
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
			case LllPackage.FUNCTION__PROGRAM:
				return eInternalContainer().eInverseRemove(this, LllPackage.PROGRAM__FUNCTIONS, Program.class, msgs);
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
			case LllPackage.FUNCTION__PROGRAM:
				return getProgram();
			case LllPackage.FUNCTION__VARIABLES_OR_VALUES:
				return getVariablesOrValues();
			case LllPackage.FUNCTION__LABELS:
				return getLabels();
			case LllPackage.FUNCTION__INSTRUCTIONS:
				return getInstructions();
			case LllPackage.FUNCTION__PARAMETERS:
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
			case LllPackage.FUNCTION__PROGRAM:
				setProgram((Program)newValue);
				return;
			case LllPackage.FUNCTION__VARIABLES_OR_VALUES:
				getVariablesOrValues().clear();
				getVariablesOrValues().addAll((Collection<? extends VariableOrValue>)newValue);
				return;
			case LllPackage.FUNCTION__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case LllPackage.FUNCTION__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case LllPackage.FUNCTION__PARAMETERS:
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
			case LllPackage.FUNCTION__PROGRAM:
				setProgram((Program)null);
				return;
			case LllPackage.FUNCTION__VARIABLES_OR_VALUES:
				getVariablesOrValues().clear();
				return;
			case LllPackage.FUNCTION__LABELS:
				getLabels().clear();
				return;
			case LllPackage.FUNCTION__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case LllPackage.FUNCTION__PARAMETERS:
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
			case LllPackage.FUNCTION__PROGRAM:
				return getProgram() != null;
			case LllPackage.FUNCTION__VARIABLES_OR_VALUES:
				return variablesOrValues != null && !variablesOrValues.isEmpty();
			case LllPackage.FUNCTION__LABELS:
				return labels != null && !labels.isEmpty();
			case LllPackage.FUNCTION__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case LllPackage.FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
