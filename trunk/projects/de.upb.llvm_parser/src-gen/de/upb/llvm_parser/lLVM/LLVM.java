/**
 */
package de.upb.llvm_parser.lLVM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LLVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.LLVM#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getLLVM()
 * @model
 * @generated
 */
public interface LLVM extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getLLVM_Elements()
   * @model unique="false"
   * @generated
   */
  EList<String> getElements();

} // LLVM
