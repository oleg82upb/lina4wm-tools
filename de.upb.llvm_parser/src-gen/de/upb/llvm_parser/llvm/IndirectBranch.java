/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getTarget <em>Target</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getPotTargetLabels <em>Pot Target Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch()
 * @model
 * @generated
 */
public interface IndirectBranch extends Instruction
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Target()
   * @model containment="true"
   * @generated
   */
  Parameter getTarget();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.IndirectBranch#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Parameter value);

  /**
   * Returns the value of the '<em><b>Pot Target Labels</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pot Target Labels</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pot Target Labels</em>' attribute list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_PotTargetLabels()
   * @model unique="false"
   * @generated
   */
  EList<String> getPotTargetLabels();

} // IndirectBranch
