/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.JumpTable;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getJtypes() <em>Jtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUse> jtypes;

	/**
	 * The cached value of the '{@link #getJvalues() <em>Jvalues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvalues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> jvalues;

	/**
	 * The cached value of the '{@link #getDestinationtypes() <em>Destinationtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUse> destinationtypes;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> destinations;

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
	public EList<TypeUse> getJtypes() {
		if (jtypes == null) {
			jtypes = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.JUMP_TABLE__JTYPES);
		}
		return jtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getJvalues() {
		if (jvalues == null) {
			jvalues = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.JUMP_TABLE__JVALUES);
		}
		return jvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUse> getDestinationtypes() {
		if (destinationtypes == null) {
			destinationtypes = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.JUMP_TABLE__DESTINATIONTYPES);
		}
		return destinationtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.JUMP_TABLE__DESTINATIONS);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.JUMP_TABLE__JTYPES:
				return ((InternalEList<?>)getJtypes()).basicRemove(otherEnd, msgs);
			case LlvmPackage.JUMP_TABLE__JVALUES:
				return ((InternalEList<?>)getJvalues()).basicRemove(otherEnd, msgs);
			case LlvmPackage.JUMP_TABLE__DESTINATIONTYPES:
				return ((InternalEList<?>)getDestinationtypes()).basicRemove(otherEnd, msgs);
			case LlvmPackage.JUMP_TABLE__DESTINATIONS:
				return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
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
				getJtypes().addAll((Collection<? extends TypeUse>)newValue);
				return;
			case LlvmPackage.JUMP_TABLE__JVALUES:
				getJvalues().clear();
				getJvalues().addAll((Collection<? extends Value>)newValue);
				return;
			case LlvmPackage.JUMP_TABLE__DESTINATIONTYPES:
				getDestinationtypes().clear();
				getDestinationtypes().addAll((Collection<? extends TypeUse>)newValue);
				return;
			case LlvmPackage.JUMP_TABLE__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends Value>)newValue);
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

} //JumpTableImpl
