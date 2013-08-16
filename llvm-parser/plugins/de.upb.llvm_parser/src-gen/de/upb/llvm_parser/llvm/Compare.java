/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getCond <em>Cond</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getOpType <em>Op Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare()
 * @model
 * @generated
 */
public interface Compare extends Instruction
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

  /**
	 * Returns the value of the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' attribute.
	 * @see #setCond(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Cond()
	 * @model
	 * @generated
	 */
  String getCond();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see #getCond()
	 * @generated
	 */
  void setCond(String value);

  /**
	 * Returns the value of the '<em><b>Op Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Type</em>' containment reference.
	 * @see #setOpType(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_OpType()
	 * @model containment="true"
	 * @generated
	 */
  TypeUse getOpType();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getOpType <em>Op Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' containment reference.
	 * @see #getOpType()
	 * @generated
	 */
  void setOpType(TypeUse value);

  /**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Operand1()
	 * @model containment="true"
	 * @generated
	 */
  Value getOperand1();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getOperand1 <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */
  void setOperand1(Value value);

  /**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Operand2()
	 * @model containment="true"
	 * @generated
	 */
  Value getOperand2();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getOperand2 <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */
  void setOperand2(Value value);

} // Compare
