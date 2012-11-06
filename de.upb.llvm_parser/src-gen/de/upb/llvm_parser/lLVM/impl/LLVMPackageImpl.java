/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.LLVMFactory;
import de.upb.llvm_parser.lLVM.LLVMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LLVMPackageImpl extends EPackageImpl implements LLVMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass llvmEClass = null;

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
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LLVMPackageImpl()
  {
    super(eNS_URI, LLVMFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link LLVMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LLVMPackage init()
  {
    if (isInited) return (LLVMPackage)EPackage.Registry.INSTANCE.getEPackage(LLVMPackage.eNS_URI);

    // Obtain or create and register package
    LLVMPackageImpl theLLVMPackage = (LLVMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LLVMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LLVMPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLLVMPackage.createPackageContents();

    // Initialize created meta-data
    theLLVMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLLVMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LLVMPackage.eNS_URI, theLLVMPackage);
    return theLLVMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLLVM()
  {
    return llvmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLLVM_Elements()
  {
    return (EAttribute)llvmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVMFactory getLLVMFactory()
  {
    return (LLVMFactory)getEFactoryInstance();
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
    llvmEClass = createEClass(LLVM);
    createEAttribute(llvmEClass, LLVM__ELEMENTS);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(llvmEClass, de.upb.llvm_parser.lLVM.LLVM.class, "LLVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLLVM_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, de.upb.llvm_parser.lLVM.LLVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LLVMPackageImpl
