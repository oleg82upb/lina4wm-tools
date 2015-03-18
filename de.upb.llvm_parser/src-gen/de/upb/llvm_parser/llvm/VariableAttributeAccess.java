/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Attribute Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getVaList <em>Va List</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getAType <em>AType</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess()
 * @model
 * @generated
 */
public interface VariableAttributeAccess extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Address value);

  /**
   * Returns the value of the '<em><b>Va List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Va List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Va List</em>' containment reference.
   * @see #setVaList(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_VaList()
   * @model containment="true"
   * @generated
   */
  Parameter getVaList();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getVaList <em>Va List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Va List</em>' containment reference.
   * @see #getVaList()
   * @generated
   */
  void setVaList(Parameter value);

  /**
   * Returns the value of the '<em><b>AType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AType</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AType</em>' containment reference.
   * @see #setAType(TypeUse)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_AType()
   * @model containment="true"
   * @generated
   */
  TypeUse getAType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getAType <em>AType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AType</em>' containment reference.
   * @see #getAType()
   * @generated
   */
  void setAType(TypeUse value);

} // VariableAttributeAccess
