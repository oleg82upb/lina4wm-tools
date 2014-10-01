/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.MultiTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.LlvmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowPackageImpl extends EPackageImpl implements ControlflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardedTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flushTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeBufferEClass = null;

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
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlflowPackageImpl() {
		super(eNS_URI, ControlflowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlflowPackage init() {
		if (isInited) return (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);

		// Obtain or create and register package
		ControlflowPackageImpl theControlflowPackage = (ControlflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlflowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LlvmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theControlflowPackage.createPackageContents();

		// Initialize created meta-data
		theControlflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlflowPackage.eNS_URI, theControlflowPackage);
		return theControlflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowDiagram() {
		return controlFlowDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowDiagram_Locations() {
		return (EReference)controlFlowDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowDiagram_Transitions() {
		return (EReference)controlFlowDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowDiagram_Start() {
		return (EReference)controlFlowDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlowDiagram_Name() {
		return (EAttribute)controlFlowDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowLocation() {
		return controlFlowLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlowLocation_Pc() {
		return (EAttribute)controlFlowLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowLocation_Diagram() {
		return (EReference)controlFlowLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowLocation_Incoming() {
		return (EReference)controlFlowLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowLocation_Outgoing() {
		return (EReference)controlFlowLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowLocation_Buffer() {
		return (EReference)controlFlowLocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlowLocation_BlockLabel() {
		return (EAttribute)controlFlowLocationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Instruction() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Diagram() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardedTransition() {
		return guardedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardedTransition_Condition() {
		return (EAttribute)guardedTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiTransition() {
		return multiTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiTransition_Instructions() {
		return (EReference)multiTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlushTransition() {
		return flushTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressValuePair() {
		return addressValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressValuePair_Address()
	{
		return (EReference)addressValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressValuePair_Value()
	{
		return (EReference)addressValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressValuePair_StoreBuffer()
	{
		return (EReference)addressValuePairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreBuffer() {
		return storeBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreBuffer_AddressValuePairs()
	{
		return (EReference)storeBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreBuffer_Location()
	{
		return (EReference)storeBufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowFactory getControlflowFactory() {
		return (ControlflowFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		controlFlowDiagramEClass = createEClass(CONTROL_FLOW_DIAGRAM);
		createEReference(controlFlowDiagramEClass, CONTROL_FLOW_DIAGRAM__LOCATIONS);
		createEReference(controlFlowDiagramEClass, CONTROL_FLOW_DIAGRAM__TRANSITIONS);
		createEReference(controlFlowDiagramEClass, CONTROL_FLOW_DIAGRAM__START);
		createEAttribute(controlFlowDiagramEClass, CONTROL_FLOW_DIAGRAM__NAME);

		controlFlowLocationEClass = createEClass(CONTROL_FLOW_LOCATION);
		createEAttribute(controlFlowLocationEClass, CONTROL_FLOW_LOCATION__PC);
		createEReference(controlFlowLocationEClass, CONTROL_FLOW_LOCATION__DIAGRAM);
		createEReference(controlFlowLocationEClass, CONTROL_FLOW_LOCATION__INCOMING);
		createEReference(controlFlowLocationEClass, CONTROL_FLOW_LOCATION__OUTGOING);
		createEReference(controlFlowLocationEClass, CONTROL_FLOW_LOCATION__BUFFER);
		createEAttribute(controlFlowLocationEClass, CONTROL_FLOW_LOCATION__BLOCK_LABEL);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__INSTRUCTION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__DIAGRAM);

		guardedTransitionEClass = createEClass(GUARDED_TRANSITION);
		createEAttribute(guardedTransitionEClass, GUARDED_TRANSITION__CONDITION);

		multiTransitionEClass = createEClass(MULTI_TRANSITION);
		createEReference(multiTransitionEClass, MULTI_TRANSITION__INSTRUCTIONS);

		flushTransitionEClass = createEClass(FLUSH_TRANSITION);

		addressValuePairEClass = createEClass(ADDRESS_VALUE_PAIR);
		createEReference(addressValuePairEClass, ADDRESS_VALUE_PAIR__ADDRESS);
		createEReference(addressValuePairEClass, ADDRESS_VALUE_PAIR__VALUE);
		createEReference(addressValuePairEClass, ADDRESS_VALUE_PAIR__STORE_BUFFER);

		storeBufferEClass = createEClass(STORE_BUFFER);
		createEReference(storeBufferEClass, STORE_BUFFER__ADDRESS_VALUE_PAIRS);
		createEReference(storeBufferEClass, STORE_BUFFER__LOCATION);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LlvmPackage theLlvmPackage = (LlvmPackage)EPackage.Registry.INSTANCE.getEPackage(LlvmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guardedTransitionEClass.getESuperTypes().add(this.getTransition());
		multiTransitionEClass.getESuperTypes().add(this.getTransition());
		flushTransitionEClass.getESuperTypes().add(this.getTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(controlFlowDiagramEClass, ControlFlowDiagram.class, "ControlFlowDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlowDiagram_Locations(), this.getControlFlowLocation(), this.getControlFlowLocation_Diagram(), "locations", null, 0, -1, ControlFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowDiagram_Transitions(), this.getTransition(), this.getTransition_Diagram(), "transitions", null, 0, -1, ControlFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowDiagram_Start(), this.getControlFlowLocation(), null, "start", null, 0, 1, ControlFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlFlowDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ControlFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowLocationEClass, ControlFlowLocation.class, "ControlFlowLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlowLocation_Pc(), ecorePackage.getEInt(), "pc", null, 0, 1, ControlFlowLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowLocation_Diagram(), this.getControlFlowDiagram(), this.getControlFlowDiagram_Locations(), "diagram", null, 0, 1, ControlFlowLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowLocation_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, ControlFlowLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowLocation_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, ControlFlowLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowLocation_Buffer(), this.getStoreBuffer(), this.getStoreBuffer_Location(), "buffer", null, 0, 1, ControlFlowLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlFlowLocation_BlockLabel(), ecorePackage.getEString(), "blockLabel", null, 0, 1, ControlFlowLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Instruction(), theLlvmPackage.getInstruction(), null, "instruction", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getControlFlowLocation(), this.getControlFlowLocation_Outgoing(), "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getControlFlowLocation(), this.getControlFlowLocation_Incoming(), "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Diagram(), this.getControlFlowDiagram(), this.getControlFlowDiagram_Transitions(), "diagram", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardedTransitionEClass, GuardedTransition.class, "GuardedTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuardedTransition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, GuardedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiTransitionEClass, MultiTransition.class, "MultiTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiTransition_Instructions(), theLlvmPackage.getInstruction(), null, "instructions", null, 0, -1, MultiTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flushTransitionEClass, FlushTransition.class, "FlushTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressValuePairEClass, AddressValuePair.class, "AddressValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressValuePair_Address(), theLlvmPackage.getParameter(), null, "address", null, 0, 1, AddressValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressValuePair_Value(), theLlvmPackage.getParameter(), null, "value", null, 0, 1, AddressValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressValuePair_StoreBuffer(), this.getStoreBuffer(), this.getStoreBuffer_AddressValuePairs(), "storeBuffer", null, 0, 1, AddressValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeBufferEClass, StoreBuffer.class, "StoreBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreBuffer_AddressValuePairs(), this.getAddressValuePair(), this.getAddressValuePair_StoreBuffer(), "addressValuePairs", null, 0, -1, StoreBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreBuffer_Location(), this.getControlFlowLocation(), this.getControlFlowLocation_Buffer(), "location", null, 0, 1, StoreBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ControlflowPackageImpl
