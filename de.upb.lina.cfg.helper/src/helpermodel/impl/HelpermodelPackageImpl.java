/**
 */
package helpermodel.impl;

import de.upb.lina.cfg.controlflow.ControlflowPackage;

import de.upb.llvm_parser.llvm.LlvmPackage;

import helpermodel.Adress;
import helpermodel.AdressMapping;
import helpermodel.HelperModel;
import helpermodel.HelpermodelFactory;
import helpermodel.HelpermodelPackage;
import helpermodel.Label;
import helpermodel.LocalVariables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelpermodelPackageImpl extends EPackageImpl implements HelpermodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adressMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

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
	 * @see helpermodel.HelpermodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HelpermodelPackageImpl() {
		super(eNS_URI, HelpermodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HelpermodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HelpermodelPackage init() {
		if (isInited) return (HelpermodelPackage)EPackage.Registry.INSTANCE.getEPackage(HelpermodelPackage.eNS_URI);

		// Obtain or create and register package
		HelpermodelPackageImpl theHelpermodelPackage = (HelpermodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HelpermodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HelpermodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ControlflowPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHelpermodelPackage.createPackageContents();

		// Initialize created meta-data
		theHelpermodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHelpermodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HelpermodelPackage.eNS_URI, theHelpermodelPackage);
		return theHelpermodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariables() {
		return localVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariables_Variables() {
		return (EReference)localVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperModel() {
		return helperModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperModel_LocalVariables() {
		return (EReference)helperModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperModel_Labels() {
		return (EReference)helperModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdressMapping() {
		return adressMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdressMapping_Name() {
		return (EAttribute)adressMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdressMapping_Adresses() {
		return (EReference)adressMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdress() {
		return adressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdress_Ast() {
		return (EReference)adressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdress_Cfg() {
		return (EReference)adressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Name() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_ControlFlowLocation() {
		return (EReference)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpermodelFactory getHelpermodelFactory() {
		return (HelpermodelFactory)getEFactoryInstance();
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
		localVariablesEClass = createEClass(LOCAL_VARIABLES);
		createEReference(localVariablesEClass, LOCAL_VARIABLES__VARIABLES);

		helperModelEClass = createEClass(HELPER_MODEL);
		createEReference(helperModelEClass, HELPER_MODEL__LOCAL_VARIABLES);
		createEReference(helperModelEClass, HELPER_MODEL__LABELS);

		adressMappingEClass = createEClass(ADRESS_MAPPING);
		createEAttribute(adressMappingEClass, ADRESS_MAPPING__NAME);
		createEReference(adressMappingEClass, ADRESS_MAPPING__ADRESSES);

		adressEClass = createEClass(ADRESS);
		createEReference(adressEClass, ADRESS__AST);
		createEReference(adressEClass, ADRESS__CFG);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__NAME);
		createEReference(labelEClass, LABEL__CONTROL_FLOW_LOCATION);
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
		ControlflowPackage theControlflowPackage = (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(localVariablesEClass, LocalVariables.class, "LocalVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalVariables_Variables(), this.getAdressMapping(), null, "variables", null, 0, -1, LocalVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperModelEClass, HelperModel.class, "HelperModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelperModel_LocalVariables(), this.getLocalVariables(), null, "localVariables", null, 1, 1, HelperModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperModel_Labels(), this.getLabel(), null, "labels", null, 0, -1, HelperModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adressMappingEClass, AdressMapping.class, "AdressMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdressMapping_Name(), ecorePackage.getEString(), "name", "", 0, 1, AdressMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdressMapping_Adresses(), theLlvmPackage.getAddress(), null, "adresses", null, 0, -1, AdressMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adressEClass, Adress.class, "Adress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdress_Ast(), theLlvmPackage.getLLVM(), null, "ast", null, 1, 1, Adress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdress_Cfg(), theControlflowPackage.getControlFlowDiagram(), null, "cfg", null, 1, 1, Adress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_ControlFlowLocation(), theControlflowPackage.getControlFlowLocation(), null, "controlFlowLocation", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HelpermodelPackageImpl
