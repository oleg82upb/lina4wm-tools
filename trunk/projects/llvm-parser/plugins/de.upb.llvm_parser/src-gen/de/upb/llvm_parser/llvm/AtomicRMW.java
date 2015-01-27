/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic RMW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getArgument <em>Argument</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW()
 * @model
 * @generated
 */
public interface AtomicRMW extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Address value);

  /**
   * Returns the value of the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volatile</em>' attribute.
   * @see #setVolatile(boolean)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Volatile()
   * @model
   * @generated
   */
  boolean isVolatile();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#isVolatile <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volatile</em>' attribute.
   * @see #isVolatile()
   * @generated
   */
  void setVolatile(boolean value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Address()
   * @model containment="true"
   * @generated
   */
  Parameter getAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Parameter value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Argument()
   * @model containment="true"
   * @generated
   */
  Parameter getArgument();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Parameter value);

  /**
   * Returns the value of the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' attribute.
   * @see #setOrdering(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // AtomicRMW
