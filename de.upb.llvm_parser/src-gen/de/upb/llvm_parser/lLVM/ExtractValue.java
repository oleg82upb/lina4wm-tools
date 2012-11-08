/**
 */
package de.upb.llvm_parser.lLVM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extract Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.ExtractValue#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.ExtractValue#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getExtractValue()
 * @model
 * @generated
 */
public interface ExtractValue extends Instruction
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
   * @see #setAggregate(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getExtractValue_Aggregate()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getAggregate();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.ExtractValue#getAggregate <em>Aggregate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate</em>' containment reference.
   * @see #getAggregate()
   * @generated
   */
  void setAggregate(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute list.
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getExtractValue_Index()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIndex();

} // ExtractValue
