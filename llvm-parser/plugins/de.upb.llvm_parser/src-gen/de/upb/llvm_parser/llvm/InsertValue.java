/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getAggerate <em>Aggerate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue()
 * @model
 * @generated
 */
public interface InsertValue extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Address value);

  /**
   * Returns the value of the '<em><b>Aggerate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggerate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggerate</em>' containment reference.
   * @see #setAggerate(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Aggerate()
   * @model containment="true"
   * @generated
   */
  Parameter getAggerate();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getAggerate <em>Aggerate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggerate</em>' containment reference.
   * @see #getAggerate()
   * @generated
   */
  void setAggerate(Parameter value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Value()
   * @model containment="true"
   * @generated
   */
  Parameter getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Parameter value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute list.
   * The list contents are of type {@link java.math.BigDecimal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Index()
   * @model unique="false"
   * @generated
   */
  EList<BigDecimal> getIndex();

} // InsertValue
