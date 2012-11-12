/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getType <em>Type</em>}</li>
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
   * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate</em>' containment reference.
   * @see #setAggregate(Aggregate)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Aggregate()
   * @model containment="true"
   * @generated
   */
  Aggregate getAggregate();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getAggregate <em>Aggregate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate</em>' containment reference.
   * @see #getAggregate()
   * @generated
   */
  void setAggregate(Aggregate value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(TypeAndValue)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Value()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypeAndValue value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Index()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIndex();

} // InsertValue
