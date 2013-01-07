/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.JumpTable;
import de.upb.llvm_parser.llvm.LlvmPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl#getJtypes <em>Jtypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl#getJvalues <em>Jvalues</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl#getDestinationtypes <em>Destinationtypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpTableImpl extends MinimalEObjectImpl.Container implements JumpTable {
	/**
	 * The cached value of the '{@link #getJtypes() <em>Jtypes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> jtypes;

	/**
	 * The cached value of the '{@link #getJvalues() <em>Jvalues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvalues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> jvalues;

	/**
	 * The cached value of the '{@link #getDestinationtypes() <em>Destinationtypes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> destinationtypes;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> destinations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.JUMP_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getJtypes() {
		if (jtypes == null) {
			jtypes = new EDataTypeEList<String>(String.class, this, LlvmPackage.JUMP_TABLE__JTYPES);
		}
		return jtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getJvalues() {
		if (jvalues == null) {
			jvalues = new EDataTypeEList<String>(String.class, this, LlvmPackage.JUMP_TABLE__JVALUES);
		}
		return jvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDestinationtypes() {
		if (destinationtypes == null) {
			destinationtypes = new EDataTypeEList<String>(String.class, this, LlvmPackage.JUMP_TABLE__DESTINATIONTYPES);
		}
		return destinationtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDestinations() {
		if (destinations == null) {
			destinations = new EDataTypeEList<String>(String.class, this, LlvmPackage.JUMP_TABLE__DESTINATIONS);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.JUMP_TABLE__JTYPES:
				return getJtypes();
			case LlvmPackage.JUMP_TABLE__JVALUES:
				return getJvalues();
			case LlvmPackage.JUMP_TABLE__DESTINATIONTYPES:
				return getDestinationtypes();
			case LlvmPackage.JUMP_TABLE__DESTINATIONS:
				return getDestinations();
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
			case LlvmPackage.JUMP_TABLE__JTYPES:
				getJtypes().clear();
				getJtypes().addAll((Collection<? extends String>)newValue);
				return;
			case LlvmPackage.JUMP_TABLE__JVALUES:
				getJvalues().clear();
				getJvalues().addAll((Collection<? extends String>)newValue);
				return;
			case LlvmPackage.JUMP_TABLE__DESTINATIONTYPES:
				getDestinationtypes().clear();
				getDestinationtypes().addAll((Collection<? extends String>)newValue);
				return;
			case LlvmPackage.JUMP_TABLE__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends String>)newValue);
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
			case LlvmPackage.JUMP_TABLE__JTYPES:
				getJtypes().clear();
				return;
			case LlvmPackage.JUMP_TABLE__JVALUES:
				getJvalues().clear();
				return;
			case LlvmPackage.JUMP_TABLE__DESTINATIONTYPES:
				getDestinationtypes().clear();
				return;
			case LlvmPackage.JUMP_TABLE__DESTINATIONS:
				getDestinations().clear();
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
			case LlvmPackage.JUMP_TABLE__JTYPES:
				return jtypes != null && !jtypes.isEmpty();
			case LlvmPackage.JUMP_TABLE__JVALUES:
				return jvalues != null && !jvalues.isEmpty();
			case LlvmPackage.JUMP_TABLE__DESTINATIONTYPES:
				return destinationtypes != null && !destinationtypes.isEmpty();
			case LlvmPackage.JUMP_TABLE__DESTINATIONS:
				return destinations != null && !destinations.isEmpty();
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
		result.append(" (jtypes: ");
		result.append(jtypes);
		result.append(", jvalues: ");
		result.append(jvalues);
		result.append(", destinationtypes: ");
		result.append(destinationtypes);
		result.append(", destinations: ");
		result.append(destinations);
		result.append(')');
		return result.toString();
	}

} //JumpTableImpl
