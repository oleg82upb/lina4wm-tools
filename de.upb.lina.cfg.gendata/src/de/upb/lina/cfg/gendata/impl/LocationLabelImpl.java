/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;

import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.LocationLabel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.LocationLabelImpl#getControlFlowLocation <em>Control Flow Location</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.LocationLabelImpl#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationLabelImpl extends NamedElementImpl implements LocationLabel {
	/**
    * The cached value of the '{@link #getControlFlowLocation() <em>Control Flow Location</em>}' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getControlFlowLocation()
    * @generated
    * @ordered
    */
	protected ControlFlowLocation controlFlowLocation;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected LocationLabelImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return GendataPackage.Literals.LOCATION_LABEL;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public ControlFlowLocation getControlFlowLocation() {
      if (controlFlowLocation != null && controlFlowLocation.eIsProxy()) {
         InternalEObject oldControlFlowLocation = (InternalEObject)controlFlowLocation;
         controlFlowLocation = (ControlFlowLocation)eResolveProxy(oldControlFlowLocation);
         if (controlFlowLocation != oldControlFlowLocation) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.LOCATION_LABEL__CONTROL_FLOW_LOCATION, oldControlFlowLocation, controlFlowLocation));
         }
      }
      return controlFlowLocation;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public ControlFlowLocation basicGetControlFlowLocation() {
      return controlFlowLocation;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setControlFlowLocation(ControlFlowLocation newControlFlowLocation) {
      ControlFlowLocation oldControlFlowLocation = controlFlowLocation;
      controlFlowLocation = newControlFlowLocation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.LOCATION_LABEL__CONTROL_FLOW_LOCATION, oldControlFlowLocation, controlFlowLocation));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public GeneratorData getGeneratorData() {
      if (eContainerFeatureID() != GendataPackage.LOCATION_LABEL__GENERATOR_DATA) return null;
      return (GeneratorData)eInternalContainer();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public NotificationChain basicSetGeneratorData(GeneratorData newGeneratorData, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newGeneratorData, GendataPackage.LOCATION_LABEL__GENERATOR_DATA, msgs);
      return msgs;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setGeneratorData(GeneratorData newGeneratorData) {
      if (newGeneratorData != eInternalContainer() || (eContainerFeatureID() != GendataPackage.LOCATION_LABEL__GENERATOR_DATA && newGeneratorData != null)) {
         if (EcoreUtil.isAncestor(this, newGeneratorData))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newGeneratorData != null)
            msgs = ((InternalEObject)newGeneratorData).eInverseAdd(this, GendataPackage.GENERATOR_DATA__LOCATION_LABELS, GeneratorData.class, msgs);
         msgs = basicSetGeneratorData(newGeneratorData, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.LOCATION_LABEL__GENERATOR_DATA, newGeneratorData, newGeneratorData));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
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
      switch (featureID) {
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
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
      switch (eContainerFeatureID()) {
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
            return eInternalContainer().eInverseRemove(this, GendataPackage.GENERATOR_DATA__LOCATION_LABELS, GeneratorData.class, msgs);
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
         case GendataPackage.LOCATION_LABEL__CONTROL_FLOW_LOCATION:
            if (resolve) return getControlFlowLocation();
            return basicGetControlFlowLocation();
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
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
      switch (featureID) {
         case GendataPackage.LOCATION_LABEL__CONTROL_FLOW_LOCATION:
            setControlFlowLocation((ControlFlowLocation)newValue);
            return;
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
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
      switch (featureID) {
         case GendataPackage.LOCATION_LABEL__CONTROL_FLOW_LOCATION:
            setControlFlowLocation((ControlFlowLocation)null);
            return;
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
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
      switch (featureID) {
         case GendataPackage.LOCATION_LABEL__CONTROL_FLOW_LOCATION:
            return controlFlowLocation != null;
         case GendataPackage.LOCATION_LABEL__GENERATOR_DATA:
            return getGeneratorData() != null;
      }
      return super.eIsSet(featureID);
   }

} //LocationLabelImpl
