/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.Transition;

import de.upb.lina.cfg.gendata.ConstraintMapping;
import de.upb.lina.cfg.gendata.GendataPackage;

import de.upb.lina.cfg.gendata.GeneratorData;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintMappingImpl extends MinimalEObjectImpl.Container implements ConstraintMapping {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.CONSTRAINT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy())
		{
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.CONSTRAINT_MAPPING__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.CONSTRAINT_MAPPING__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.CONSTRAINT_MAPPING__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorData getGeneratorData() {
		if (eContainerFeatureID() != GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA) return null;
		return (GeneratorData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorData(GeneratorData newGeneratorData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGeneratorData, GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorData(GeneratorData newGeneratorData) {
		if (newGeneratorData != eInternalContainer() || (eContainerFeatureID() != GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA && newGeneratorData != null))
		{
			if (EcoreUtil.isAncestor(this, newGeneratorData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGeneratorData != null)
				msgs = ((InternalEObject)newGeneratorData).eInverseAdd(this, GendataPackage.GENERATOR_DATA__CONSTRAINTS, GeneratorData.class, msgs);
			msgs = basicSetGeneratorData(newGeneratorData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA, newGeneratorData, newGeneratorData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGeneratorData((GeneratorData)otherEnd, msgs);
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
		switch (featureID)
		{
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				return basicSetGeneratorData(null, msgs);
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
		switch (eContainerFeatureID())
		{
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				return eInternalContainer().eInverseRemove(this, GendataPackage.GENERATOR_DATA__CONSTRAINTS, GeneratorData.class, msgs);
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
		switch (featureID)
		{
			case GendataPackage.CONSTRAINT_MAPPING__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case GendataPackage.CONSTRAINT_MAPPING__CONDITION:
				return getCondition();
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				return getGeneratorData();
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
		switch (featureID)
		{
			case GendataPackage.CONSTRAINT_MAPPING__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case GendataPackage.CONSTRAINT_MAPPING__CONDITION:
				setCondition((String)newValue);
				return;
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				setGeneratorData((GeneratorData)newValue);
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
		switch (featureID)
		{
			case GendataPackage.CONSTRAINT_MAPPING__TRANSITION:
				setTransition((Transition)null);
				return;
			case GendataPackage.CONSTRAINT_MAPPING__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				setGeneratorData((GeneratorData)null);
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
		switch (featureID)
		{
			case GendataPackage.CONSTRAINT_MAPPING__TRANSITION:
				return transition != null;
			case GendataPackage.CONSTRAINT_MAPPING__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA:
				return getGeneratorData() != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ConstraintMappingImpl
