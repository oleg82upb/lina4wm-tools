/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.ConstraintMapping;
import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.LocationLabel;
import de.upb.lina.cfg.gendata.PhiMapping;
import de.upb.lina.cfg.gendata.TransitionLabel;
import de.upb.llvm_parser.llvm.LLVM;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getCfgs <em>Cfgs</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getLocationLabels <em>Location Labels</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getTransitionLabels <em>Transition Labels</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getTransformationSpecificKeys <em>Transformation Specific Keys</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getPhiMappings <em>Phi Mappings</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getFilteredAddresses <em>Filtered Addresses</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getAddressMappings <em>Address Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorDataImpl extends MinimalEObjectImpl.Container implements GeneratorData
{
	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected LLVM program;

	/**
	 * The cached value of the '{@link #getCfgs() <em>Cfgs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlowDiagram> cfgs;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintMapping> constraints;

	/**
	 * The cached value of the '{@link #getLocationLabels() <em>Location Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationLabel> locationLabels;

	/**
	 * The cached value of the '{@link #getTransitionLabels() <em>Transition Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionLabel> transitionLabels;

	/**
	 * The cached value of the '{@link #getTransformationSpecificKeys() <em>Transformation Specific Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationSpecificKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> transformationSpecificKeys;

	/**
	 * The cached value of the '{@link #getPhiMappings() <em>Phi Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PhiMapping> phiMappings;

	/**
	 * The cached value of the '{@link #getFilteredAddresses() <em>Filtered Addresses</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredAddresses()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<AddressMapping>> filteredAddresses;

	/**
	 * The cached value of the '{@link #getAddressMappings() <em>Address Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressMapping> addressMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorDataImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GendataPackage.Literals.GENERATOR_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM getProgram()
	{
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject)program;
			program = (LLVM)eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.GENERATOR_DATA__PROGRAM, oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM basicGetProgram()
	{
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(LLVM newProgram)
	{
		LLVM oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.GENERATOR_DATA__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlowDiagram> getCfgs() {
		if (cfgs == null) {
			cfgs = new EObjectResolvingEList<ControlFlowDiagram>(ControlFlowDiagram.class, this, GendataPackage.GENERATOR_DATA__CFGS);
		}
		return cfgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintMapping> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<ConstraintMapping>(ConstraintMapping.class, this, GendataPackage.GENERATOR_DATA__CONSTRAINTS, GendataPackage.CONSTRAINT_MAPPING__GENERATOR_DATA);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationLabel> getLocationLabels() {
		if (locationLabels == null) {
			locationLabels = new EObjectContainmentWithInverseEList<LocationLabel>(LocationLabel.class, this, GendataPackage.GENERATOR_DATA__LOCATION_LABELS, GendataPackage.LOCATION_LABEL__GENERATOR_DATA);
		}
		return locationLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionLabel> getTransitionLabels() {
		if (transitionLabels == null) {
			transitionLabels = new EObjectContainmentWithInverseEList<TransitionLabel>(TransitionLabel.class, this, GendataPackage.GENERATOR_DATA__TRANSITION_LABELS, GendataPackage.TRANSITION_LABEL__GENERATOR_DATA);
		}
		return transitionLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTransformationSpecificKeys() {
		if (transformationSpecificKeys == null) {
			transformationSpecificKeys = new EDataTypeUniqueEList<String>(String.class, this, GendataPackage.GENERATOR_DATA__TRANSFORMATION_SPECIFIC_KEYS);
		}
		return transformationSpecificKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhiMapping> getPhiMappings() {
		if (phiMappings == null) {
			phiMappings = new EObjectContainmentWithInverseEList<PhiMapping>(PhiMapping.class, this, GendataPackage.GENERATOR_DATA__PHI_MAPPINGS, GendataPackage.PHI_MAPPING__GENERATOR_DATA);
		}
		return phiMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<AddressMapping>> getFilteredAddresses() {
		if (filteredAddresses == null) {
			filteredAddresses = new EcoreEMap<String,EList<AddressMapping>>(GendataPackage.Literals.FILTER_TO_ADDRESS_MAPPING, FilterToAddressMappingImpl.class, this, GendataPackage.GENERATOR_DATA__FILTERED_ADDRESSES);
		}
		return filteredAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressMapping> getAddressMappings() {
		if (addressMappings == null) {
			addressMappings = new EObjectWithInverseResolvingEList<AddressMapping>(AddressMapping.class, this, GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS, GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA);
		}
		return addressMappings;
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
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__LOCATION_LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocationLabels()).basicAdd(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__TRANSITION_LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitionLabels()).basicAdd(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__PHI_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhiMappings()).basicAdd(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddressMappings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__LOCATION_LABELS:
				return ((InternalEList<?>)getLocationLabels()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__TRANSITION_LABELS:
				return ((InternalEList<?>)getTransitionLabels()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__PHI_MAPPINGS:
				return ((InternalEList<?>)getPhiMappings()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__FILTERED_ADDRESSES:
				return ((InternalEList<?>)getFilteredAddresses()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS:
				return ((InternalEList<?>)getAddressMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
			case GendataPackage.GENERATOR_DATA__CFGS:
				return getCfgs();
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return getConstraints();
			case GendataPackage.GENERATOR_DATA__LOCATION_LABELS:
				return getLocationLabels();
			case GendataPackage.GENERATOR_DATA__TRANSITION_LABELS:
				return getTransitionLabels();
			case GendataPackage.GENERATOR_DATA__TRANSFORMATION_SPECIFIC_KEYS:
				return getTransformationSpecificKeys();
			case GendataPackage.GENERATOR_DATA__PHI_MAPPINGS:
				return getPhiMappings();
			case GendataPackage.GENERATOR_DATA__FILTERED_ADDRESSES:
				if (coreType) return getFilteredAddresses();
				else return getFilteredAddresses().map();
			case GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS:
				return getAddressMappings();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				setProgram((LLVM)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__CFGS:
				getCfgs().clear();
				getCfgs().addAll((Collection<? extends ControlFlowDiagram>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintMapping>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__LOCATION_LABELS:
				getLocationLabels().clear();
				getLocationLabels().addAll((Collection<? extends LocationLabel>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__TRANSITION_LABELS:
				getTransitionLabels().clear();
				getTransitionLabels().addAll((Collection<? extends TransitionLabel>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__TRANSFORMATION_SPECIFIC_KEYS:
				getTransformationSpecificKeys().clear();
				getTransformationSpecificKeys().addAll((Collection<? extends String>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__PHI_MAPPINGS:
				getPhiMappings().clear();
				getPhiMappings().addAll((Collection<? extends PhiMapping>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__FILTERED_ADDRESSES:
				((EStructuralFeature.Setting)getFilteredAddresses()).set(newValue);
				return;
			case GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS:
				getAddressMappings().clear();
				getAddressMappings().addAll((Collection<? extends AddressMapping>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				setProgram((LLVM)null);
				return;
			case GendataPackage.GENERATOR_DATA__CFGS:
				getCfgs().clear();
				return;
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				getConstraints().clear();
				return;
			case GendataPackage.GENERATOR_DATA__LOCATION_LABELS:
				getLocationLabels().clear();
				return;
			case GendataPackage.GENERATOR_DATA__TRANSITION_LABELS:
				getTransitionLabels().clear();
				return;
			case GendataPackage.GENERATOR_DATA__TRANSFORMATION_SPECIFIC_KEYS:
				getTransformationSpecificKeys().clear();
				return;
			case GendataPackage.GENERATOR_DATA__PHI_MAPPINGS:
				getPhiMappings().clear();
				return;
			case GendataPackage.GENERATOR_DATA__FILTERED_ADDRESSES:
				getFilteredAddresses().clear();
				return;
			case GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS:
				getAddressMappings().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				return program != null;
			case GendataPackage.GENERATOR_DATA__CFGS:
				return cfgs != null && !cfgs.isEmpty();
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case GendataPackage.GENERATOR_DATA__LOCATION_LABELS:
				return locationLabels != null && !locationLabels.isEmpty();
			case GendataPackage.GENERATOR_DATA__TRANSITION_LABELS:
				return transitionLabels != null && !transitionLabels.isEmpty();
			case GendataPackage.GENERATOR_DATA__TRANSFORMATION_SPECIFIC_KEYS:
				return transformationSpecificKeys != null && !transformationSpecificKeys.isEmpty();
			case GendataPackage.GENERATOR_DATA__PHI_MAPPINGS:
				return phiMappings != null && !phiMappings.isEmpty();
			case GendataPackage.GENERATOR_DATA__FILTERED_ADDRESSES:
				return filteredAddresses != null && !filteredAddresses.isEmpty();
			case GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS:
				return addressMappings != null && !addressMappings.isEmpty();
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
		result.append(" (transformationSpecificKeys: ");
		result.append(transformationSpecificKeys);
		result.append(')');
		return result.toString();
	}

} //GeneratorDataImpl
