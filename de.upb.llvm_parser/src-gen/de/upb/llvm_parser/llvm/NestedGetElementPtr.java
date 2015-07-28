/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr()
 * @model
 * @generated
 */
public interface NestedGetElementPtr extends Value
{
  /**
   * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate</em>' containment reference.
   * @see #setAggregate(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr_Aggregate()
   * @model containment="true"
   * @generated
   */
  Parameter getAggregate();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getAggregate <em>Aggregate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate</em>' containment reference.
   * @see #getAggregate()
   * @generated
   */
  void setAggregate(Parameter value);

  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr_Indices()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getIndices();

} // NestedGetElementPtr
