/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.JumpTable#getValues <em>Values</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.JumpTable#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable()
 * @model
 * @generated
 */
public interface JumpTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeAndValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Values()
   * @model containment="true"
   * @generated
   */
  EList<TypeAndValue> getValues();

  /**
   * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeAndValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinations</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<TypeAndValue> getDestinations();

} // JumpTable
