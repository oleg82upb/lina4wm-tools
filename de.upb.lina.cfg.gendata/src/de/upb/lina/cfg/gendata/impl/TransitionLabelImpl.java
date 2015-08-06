/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.Transition;

import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.TransitionLabel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.TransitionLabelImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.TransitionLabelImpl#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionLabelImpl extends NamedElementImpl implements TransitionLabel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.TRANSITION_LABEL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.TRANSITION_LABEL__TRANSITION, oldTransition, transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.TRANSITION_LABEL__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorData getGeneratorData() {
		if (eContainerFeatureID() != GendataPackage.TRANSITION_LABEL__GENERATOR_DATA) return null;
		return (GeneratorData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorData(GeneratorData newGeneratorData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGeneratorData, GendataPackage.TRANSITION_LABEL__GENERATOR_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorData(GeneratorData newGeneratorData) {
		if (newGeneratorData != eInternalContainer() || (eContainerFeatureID() != GendataPackage.TRANSITION_LABEL__GENERATOR_DATA && newGeneratorData != null))
		{
			if (EcoreUtil.isAncestor(this, newGeneratorData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGeneratorData != null)
				msgs = ((InternalEObject)newGeneratorData).eInverseAdd(this, GendataPackage.GENERATOR_DATA__TRANSITION_LABELS, GeneratorData.class, msgs);
			msgs = basicSetGeneratorData(newGeneratorData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.TRANSITION_LABEL__GENERATOR_DATA, newGeneratorData, newGeneratorData));
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
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
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
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
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
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
				return eInternalContainer().eInverseRemove(this, GendataPackage.GENERATOR_DATA__TRANSITION_LABELS, GeneratorData.class, msgs);
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
			case GendataPackage.TRANSITION_LABEL__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
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
			case GendataPackage.TRANSITION_LABEL__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
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
			case GendataPackage.TRANSITION_LABEL__TRANSITION:
				setTransition((Transition)null);
				return;
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
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
			case GendataPackage.TRANSITION_LABEL__TRANSITION:
				return transition != null;
			case GendataPackage.TRANSITION_LABEL__GENERATOR_DATA:
				return getGeneratorData() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionLabelImpl
