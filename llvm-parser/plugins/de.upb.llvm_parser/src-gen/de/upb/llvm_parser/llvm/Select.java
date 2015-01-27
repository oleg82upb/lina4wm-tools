/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getTrueValue <em>True Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getElseValue <em>Else Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Instruction
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(Address)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Address value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Condition()
   * @model containment="true"
   * @generated
   */
  Parameter getCondition();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Parameter value);

  /**
   * Returns the value of the '<em><b>True Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Value</em>' containment reference.
   * @see #setTrueValue(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_TrueValue()
   * @model containment="true"
   * @generated
   */
  Parameter getTrueValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getTrueValue <em>True Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True Value</em>' containment reference.
   * @see #getTrueValue()
   * @generated
   */
  void setTrueValue(Parameter value);

  /**
   * Returns the value of the '<em><b>Else Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Value</em>' containment reference.
   * @see #setElseValue(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_ElseValue()
   * @model containment="true"
   * @generated
   */
  Parameter getElseValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getElseValue <em>Else Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Value</em>' containment reference.
   * @see #getElseValue()
   * @generated
   */
  void setElseValue(Parameter value);

} // Select
