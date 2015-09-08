/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.ConstraintMapping;
import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.LocationLabel;
import de.upb.lina.cfg.gendata.MemorySizeMapping;
import de.upb.lina.cfg.gendata.NamedElement;
import de.upb.lina.cfg.gendata.PhiMapping;
import de.upb.lina.cfg.gendata.TransitionLabel;
import de.upb.llvm_parser.llvm.LlvmPackage;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GendataPackageImpl extends EPackageImpl implements GendataPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phiMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterToAddressMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memorySizeMappingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.upb.lina.cfg.gendata.GendataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GendataPackageImpl()
	{
		super(eNS_URI, GendataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GendataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GendataPackage init()
	{
		if (isInited) return (GendataPackage)EPackage.Registry.INSTANCE.getEPackage(GendataPackage.eNS_URI);

		// Obtain or create and register package
		GendataPackageImpl theGendataPackage = (GendataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GendataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GendataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ControlflowPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGendataPackage.createPackageContents();

		// Initialize created meta-data
		theGendataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGendataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GendataPackage.eNS_URI, theGendataPackage);
		return theGendataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorData()
	{
		return generatorDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_Program()
	{
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_Cfgs() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_Constraints() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_LocationLabels() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_TransitionLabels() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorData_TransformationSpecificKeys() {
		return (EAttribute)generatorDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_PhiMappings() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_FilteredAddresses() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_AddressMappings() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorData_MemorySizeMappings() {
		return (EReference)generatorDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorData__GetFilteredAddresses__String()
	{
		return generatorDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressMapping()
	{
		return addressMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressMapping_Adresses()
	{
		return (EReference)addressMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressMapping_OldNames() {
		return (EAttribute)addressMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressMapping_GeneratorData() {
		return (EReference)addressMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressMapping_Type() {
		return (EAttribute)addressMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintMapping() {
		return constraintMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintMapping_Transition() {
		return (EReference)constraintMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintMapping_Condition() {
		return (EAttribute)constraintMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintMapping_GeneratorData() {
		return (EReference)constraintMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationLabel() {
		return locationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationLabel_ControlFlowLocation() {
		return (EReference)locationLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationLabel_GeneratorData() {
		return (EReference)locationLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionLabel() {
		return transitionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionLabel_Transition() {
		return (EReference)transitionLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionLabel_GeneratorData() {
		return (EReference)transitionLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhiMapping() {
		return phiMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhiMapping_Transition() {
		return (EReference)phiMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhiMapping_Phi() {
		return (EReference)phiMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhiMapping_BlockLabelToUse() {
		return (EAttribute)phiMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhiMapping_GeneratorData() {
		return (EReference)phiMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterToAddressMapping() {
		return filterToAddressMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterToAddressMapping_Key() {
		return (EAttribute)filterToAddressMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterToAddressMapping_Value() {
		return (EReference)filterToAddressMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemorySizeMapping() {
		return memorySizeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorySizeMapping_Instruction() {
		return (EReference)memorySizeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemorySizeMapping_Size() {
		return (EAttribute)memorySizeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorySizeMapping_GeneratorData() {
		return (EReference)memorySizeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataFactory getGendataFactory()
	{
		return (GendataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		generatorDataEClass = createEClass(GENERATOR_DATA);
		createEReference(generatorDataEClass, GENERATOR_DATA__PROGRAM);
		createEReference(generatorDataEClass, GENERATOR_DATA__CFGS);
		createEReference(generatorDataEClass, GENERATOR_DATA__CONSTRAINTS);
		createEReference(generatorDataEClass, GENERATOR_DATA__LOCATION_LABELS);
		createEReference(generatorDataEClass, GENERATOR_DATA__TRANSITION_LABELS);
		createEAttribute(generatorDataEClass, GENERATOR_DATA__TRANSFORMATION_SPECIFIC_KEYS);
		createEReference(generatorDataEClass, GENERATOR_DATA__PHI_MAPPINGS);
		createEReference(generatorDataEClass, GENERATOR_DATA__FILTERED_ADDRESSES);
		createEReference(generatorDataEClass, GENERATOR_DATA__ADDRESS_MAPPINGS);
		createEReference(generatorDataEClass, GENERATOR_DATA__MEMORY_SIZE_MAPPINGS);
		createEOperation(generatorDataEClass, GENERATOR_DATA___GET_FILTERED_ADDRESSES__STRING);

		addressMappingEClass = createEClass(ADDRESS_MAPPING);
		createEReference(addressMappingEClass, ADDRESS_MAPPING__ADRESSES);
		createEAttribute(addressMappingEClass, ADDRESS_MAPPING__OLD_NAMES);
		createEReference(addressMappingEClass, ADDRESS_MAPPING__GENERATOR_DATA);
		createEAttribute(addressMappingEClass, ADDRESS_MAPPING__TYPE);

		constraintMappingEClass = createEClass(CONSTRAINT_MAPPING);
		createEReference(constraintMappingEClass, CONSTRAINT_MAPPING__TRANSITION);
		createEAttribute(constraintMappingEClass, CONSTRAINT_MAPPING__CONDITION);
		createEReference(constraintMappingEClass, CONSTRAINT_MAPPING__GENERATOR_DATA);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		locationLabelEClass = createEClass(LOCATION_LABEL);
		createEReference(locationLabelEClass, LOCATION_LABEL__CONTROL_FLOW_LOCATION);
		createEReference(locationLabelEClass, LOCATION_LABEL__GENERATOR_DATA);

		transitionLabelEClass = createEClass(TRANSITION_LABEL);
		createEReference(transitionLabelEClass, TRANSITION_LABEL__TRANSITION);
		createEReference(transitionLabelEClass, TRANSITION_LABEL__GENERATOR_DATA);

		phiMappingEClass = createEClass(PHI_MAPPING);
		createEReference(phiMappingEClass, PHI_MAPPING__TRANSITION);
		createEReference(phiMappingEClass, PHI_MAPPING__PHI);
		createEAttribute(phiMappingEClass, PHI_MAPPING__BLOCK_LABEL_TO_USE);
		createEReference(phiMappingEClass, PHI_MAPPING__GENERATOR_DATA);

		filterToAddressMappingEClass = createEClass(FILTER_TO_ADDRESS_MAPPING);
		createEAttribute(filterToAddressMappingEClass, FILTER_TO_ADDRESS_MAPPING__KEY);
		createEReference(filterToAddressMappingEClass, FILTER_TO_ADDRESS_MAPPING__VALUE);

		memorySizeMappingEClass = createEClass(MEMORY_SIZE_MAPPING);
		createEReference(memorySizeMappingEClass, MEMORY_SIZE_MAPPING__INSTRUCTION);
		createEAttribute(memorySizeMappingEClass, MEMORY_SIZE_MAPPING__SIZE);
		createEReference(memorySizeMappingEClass, MEMORY_SIZE_MAPPING__GENERATOR_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LlvmPackage theLlvmPackage = (LlvmPackage)EPackage.Registry.INSTANCE.getEPackage(LlvmPackage.eNS_URI);
		ControlflowPackage theControlflowPackage = (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addressMappingEClass.getESuperTypes().add(this.getNamedElement());
		locationLabelEClass.getESuperTypes().add(this.getNamedElement());
		transitionLabelEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(generatorDataEClass, GeneratorData.class, "GeneratorData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorData_Program(), theLlvmPackage.getLLVM(), null, "program", null, 0, 1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_Cfgs(), theControlflowPackage.getControlFlowDiagram(), null, "cfgs", null, 1, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_Constraints(), this.getConstraintMapping(), this.getConstraintMapping_GeneratorData(), "constraints", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_LocationLabels(), this.getLocationLabel(), this.getLocationLabel_GeneratorData(), "locationLabels", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_TransitionLabels(), this.getTransitionLabel(), this.getTransitionLabel_GeneratorData(), "transitionLabels", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorData_TransformationSpecificKeys(), ecorePackage.getEString(), "transformationSpecificKeys", "", 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_PhiMappings(), this.getPhiMapping(), this.getPhiMapping_GeneratorData(), "phiMappings", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_FilteredAddresses(), this.getFilterToAddressMapping(), null, "filteredAddresses", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_AddressMappings(), this.getAddressMapping(), this.getAddressMapping_GeneratorData(), "addressMappings", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorData_MemorySizeMappings(), this.getMemorySizeMapping(), this.getMemorySizeMapping_GeneratorData(), "memorySizeMappings", null, 0, -1, GeneratorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGeneratorData__GetFilteredAddresses__String(), this.getAddressMapping(), "getFilteredAddresses", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(addressMappingEClass, AddressMapping.class, "AddressMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressMapping_Adresses(), theLlvmPackage.getAddress(), null, "adresses", null, 0, -1, AddressMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressMapping_OldNames(), ecorePackage.getEString(), "oldNames", "", 0, -1, AddressMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressMapping_GeneratorData(), this.getGeneratorData(), this.getGeneratorData_AddressMappings(), "generatorData", null, 0, 1, AddressMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressMapping_Type(), ecorePackage.getEString(), "type", null, 0, 1, AddressMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintMappingEClass, ConstraintMapping.class, "ConstraintMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintMapping_Transition(), theControlflowPackage.getTransition(), null, "transition", null, 0, 1, ConstraintMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintMapping_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, ConstraintMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintMapping_GeneratorData(), this.getGeneratorData(), this.getGeneratorData_Constraints(), "generatorData", null, 0, 1, ConstraintMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationLabelEClass, LocationLabel.class, "LocationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationLabel_ControlFlowLocation(), theControlflowPackage.getControlFlowLocation(), null, "controlFlowLocation", null, 0, 1, LocationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationLabel_GeneratorData(), this.getGeneratorData(), this.getGeneratorData_LocationLabels(), "generatorData", null, 0, 1, LocationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionLabelEClass, TransitionLabel.class, "TransitionLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionLabel_Transition(), theControlflowPackage.getTransition(), null, "transition", null, 0, 1, TransitionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionLabel_GeneratorData(), this.getGeneratorData(), this.getGeneratorData_TransitionLabels(), "generatorData", null, 0, 1, TransitionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phiMappingEClass, PhiMapping.class, "PhiMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhiMapping_Transition(), theControlflowPackage.getTransition(), null, "transition", null, 0, 1, PhiMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhiMapping_Phi(), theLlvmPackage.getPhi(), null, "phi", null, 0, -1, PhiMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhiMapping_BlockLabelToUse(), ecorePackage.getEString(), "blockLabelToUse", null, 0, 1, PhiMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhiMapping_GeneratorData(), this.getGeneratorData(), this.getGeneratorData_PhiMappings(), "generatorData", null, 0, 1, PhiMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterToAddressMappingEClass, Map.Entry.class, "FilterToAddressMapping", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterToAddressMapping_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterToAddressMapping_Value(), this.getAddressMapping(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memorySizeMappingEClass, MemorySizeMapping.class, "MemorySizeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemorySizeMapping_Instruction(), theLlvmPackage.getInstruction(), null, "instruction", null, 0, 1, MemorySizeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemorySizeMapping_Size(), ecorePackage.getEString(), "size", null, 0, 1, MemorySizeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemorySizeMapping_GeneratorData(), this.getGeneratorData(), this.getGeneratorData_MemorySizeMappings(), "generatorData", null, 0, 1, MemorySizeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GendataPackageImpl
