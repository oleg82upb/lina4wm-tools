/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getTargetAddress <em>Target Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getAlign <em>Align</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Instruction
{
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Volatile()
   * @model
   * @generated
   */
  boolean isVolatile();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#isVolatile <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volatile</em>' attribute.
   * @see #isVolatile()
   * @generated
   */
  void setVolatile(boolean value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Value()
   * @model containment="true"
   * @generated
   */
  Parameter getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Parameter value);

  /**
   * Returns the value of the '<em><b>Target Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Address</em>' containment reference.
   * @see #setTargetAddress(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_TargetAddress()
   * @model containment="true"
   * @generated
   */
  Parameter getTargetAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getTargetAddress <em>Target Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Address</em>' containment reference.
   * @see #getTargetAddress()
   * @generated
   */
  void setTargetAddress(Parameter value);

  /**
   * Returns the value of the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align</em>' attribute.
   * @see #setAlign(BigDecimal)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Align()
   * @model
   * @generated
   */
  BigDecimal getAlign();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getAlign <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align</em>' attribute.
   * @see #getAlign()
   * @generated
   */
  void setAlign(BigDecimal value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Meta()
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Atomic()
   * @model
   * @generated
   */
  boolean isAtomic();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#isAtomic <em>Atomic</em>}' attribute.
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // Store
