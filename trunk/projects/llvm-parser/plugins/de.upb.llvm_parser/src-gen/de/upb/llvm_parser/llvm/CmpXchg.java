/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmp Xchg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg()
 * @model
 * @generated
 */
public interface CmpXchg extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getResult <em>Result</em>}' containment reference.
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Volatile()
   * @model
   * @generated
   */
  boolean isVolatile();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#isVolatile <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volatile</em>' attribute.
   * @see #isVolatile()
   * @generated
   */
  void setVolatile(boolean value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Address()
   * @model containment="true"
   * @generated
   */
  Parameter getAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Parameter value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Value()
   * @model containment="true"
   * @generated
   */
  Parameter getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Parameter value);

  /**
   * Returns the value of the '<em><b>New Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Value</em>' containment reference.
   * @see #setNewValue(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_NewValue()
   * @model containment="true"
   * @generated
   */
  Parameter getNewValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewValue <em>New Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Value</em>' containment reference.
   * @see #getNewValue()
   * @generated
   */
  void setNewValue(Parameter value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // CmpXchg
