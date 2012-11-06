/**
 */
package de.upb.llvm_parser.lLVM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.lLVM.LLVMFactory
 * @model kind="package"
 * @generated
 */
public interface LLVMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lLVM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upb.de/llvm_parser/LLVM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lLVM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LLVMPackage eINSTANCE = de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl.init();

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LLVMImpl <em>LLVM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LLVMImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLLVM()
   * @generated
   */
  int LLVM = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LLVM__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>LLVM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LLVM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.LLVM <em>LLVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LLVM</em>'.
   * @see de.upb.llvm_parser.lLVM.LLVM
   * @generated
   */
  EClass getLLVM();

  /**
   * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.lLVM.LLVM#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see de.upb.llvm_parser.lLVM.LLVM#getElements()
   * @see #getLLVM()
   * @generated
   */
  EAttribute getLLVM_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LLVMFactory getLLVMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LLVMImpl <em>LLVM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LLVMImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLLVM()
     * @generated
     */
    EClass LLVM = eINSTANCE.getLLVM();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LLVM__ELEMENTS = eINSTANCE.getLLVM_Elements();

  }

} //LLVMPackage
