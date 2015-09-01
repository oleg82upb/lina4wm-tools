/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getAlign <em>Align</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getResult <em>Result</em>}' containment reference.
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Volatile()
   * @model
   * @generated
   */
  boolean isVolatile();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#isVolatile <em>Volatile</em>}' attribute.
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Address()
   * @model containment="true"
   * @generated
   */
  Parameter getAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Parameter value);

  /**
   * Returns the value of the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align</em>' attribute.
   * @see #setAlign(int)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Align()
   * @model
   * @generated
   */
  int getAlign();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getAlign <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align</em>' attribute.
   * @see #getAlign()
   * @generated
   */
  void setAlign(int value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.MetaArgValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Meta()
   * @model containment="true"
   * @generated
   */
  EList<MetaArgValue> getMeta();

  /**
   * Returns the value of the '<em><b>Atomic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic</em>' attribute.
   * @see #setAtomic(boolean)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Atomic()
   * @model
   * @generated
   */
  boolean isAtomic();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#isAtomic <em>Atomic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomic</em>' attribute.
   * @see #isAtomic()
   * @generated
   */
  void setAtomic(boolean value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // Load
