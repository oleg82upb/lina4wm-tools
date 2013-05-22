/**
 */
package de.upb.lina.lll.impl;

import de.upb.lina.lll.Function;
import de.upb.lina.lll.LllPackage;
import de.upb.lina.lll.Program;
import de.upb.lina.lll.Variable;
import de.upb.lina.lll.VariableOrValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.lll.impl.ProgramImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.ProgramImpl#getGlobalVariablesOrValues <em>Global Variables Or Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends EObjectImpl implements Program {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getGlobalVariablesOrValues() <em>Global Variables Or Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariablesOrValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> globalVariablesOrValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LllPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentWithInverseEList<Function>(Function.class, this, LllPackage.PROGRAM__FUNCTIONS, LllPackage.FUNCTION__PROGRAM);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getGlobalVariablesOrValues() {
		if (globalVariablesOrValues == null) {
			globalVariablesOrValues = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES, LllPackage.VARIABLE__PROGRAM);
		}
		return globalVariablesOrValues;
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
			case LllPackage.PROGRAM__FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctions()).basicAdd(otherEnd, msgs);
			case LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGlobalVariablesOrValues()).basicAdd(otherEnd, msgs);
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
			case LllPackage.PROGRAM__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES:
				return ((InternalEList<?>)getGlobalVariablesOrValues()).basicRemove(otherEnd, msgs);
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
			case LllPackage.PROGRAM__FUNCTIONS:
				return getFunctions();
			case LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES:
				return getGlobalVariablesOrValues();
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
			case LllPackage.PROGRAM__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES:
				getGlobalVariablesOrValues().clear();
				getGlobalVariablesOrValues().addAll((Collection<? extends Variable>)newValue);
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
			case LllPackage.PROGRAM__FUNCTIONS:
				getFunctions().clear();
				return;
			case LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES:
				getGlobalVariablesOrValues().clear();
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
			case LllPackage.PROGRAM__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case LllPackage.PROGRAM__GLOBAL_VARIABLES_OR_VALUES:
				return globalVariablesOrValues != null && !globalVariablesOrValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
