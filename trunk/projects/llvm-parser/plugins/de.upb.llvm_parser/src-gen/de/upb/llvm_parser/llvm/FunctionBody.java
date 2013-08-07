/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionBody#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionBody#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionBody()
 * @model
 * @generated
 */
public interface FunctionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' attribute list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionBody_Meta()
   * @model unique="false"
   * @generated
   */
  EList<String> getMeta();

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.BasicBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionBody_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<BasicBlock> getBlocks();

} // FunctionBody
