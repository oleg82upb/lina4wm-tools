/**
 */
package de.upb.llvm_parser.lLVM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.lLVM.LLVMPackage
 * @generated
 */
public interface LLVMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LLVMFactory eINSTANCE = de.upb.llvm_parser.lLVM.impl.LLVMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>LLVM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LLVM</em>'.
   * @generated
   */
  LLVM createLLVM();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LLVMPackage getLLVMPackage();

} //LLVMFactory
