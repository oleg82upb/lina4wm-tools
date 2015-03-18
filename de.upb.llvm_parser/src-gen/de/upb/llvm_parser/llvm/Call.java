/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Call#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Call#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Call#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Call#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Address value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall_Function()
   * @model containment="true"
   * @generated
   */
  Parameter getFunction();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Call#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Parameter value);

  /**
   * Returns the value of the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PList</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PList</em>' containment reference.
   * @see #setPList(ParameterList)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall_PList()
   * @model containment="true"
   * @generated
   */
  ParameterList getPList();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Call#getPList <em>PList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PList</em>' containment reference.
   * @see #getPList()
   * @generated
   */
  void setPList(ParameterList value);

} // Call
