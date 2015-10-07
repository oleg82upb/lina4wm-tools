/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.InputTypeList;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.InputTypeListImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputTypeListImpl extends MinimalEObjectImpl.Container implements InputTypeList {
	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inputType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.INPUT_TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInputType() {
		if (inputType == null) {
			inputType = new EDataTypeUniqueEList<String>(String.class, this, GendataPackage.INPUT_TYPE_LIST__INPUT_TYPE);
		}
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GendataPackage.INPUT_TYPE_LIST__INPUT_TYPE:
				return getInputType();
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
			case GendataPackage.INPUT_TYPE_LIST__INPUT_TYPE:
				getInputType().clear();
				getInputType().addAll((Collection<? extends String>)newValue);
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
			case GendataPackage.INPUT_TYPE_LIST__INPUT_TYPE:
				getInputType().clear();
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
			case GendataPackage.INPUT_TYPE_LIST__INPUT_TYPE:
				return inputType != null && !inputType.isEmpty();
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
		result.append(" (inputType: ");
		result.append(inputType);
		result.append(')');
		return result.toString();
	}

} //InputTypeListImpl
