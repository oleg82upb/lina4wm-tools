/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Array#getLength <em>Length</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Array#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Aggregate_Type
{
  /**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(BigDecimal)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getArray_Length()
	 * @model
	 * @generated
	 */
  BigDecimal getLength();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Array#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
  void setLength(BigDecimal value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(EObject)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getArray_Type()
	 * @model containment="true"
	 * @generated
	 */
  EObject getType();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Array#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
  void setType(EObject value);

} // Array
