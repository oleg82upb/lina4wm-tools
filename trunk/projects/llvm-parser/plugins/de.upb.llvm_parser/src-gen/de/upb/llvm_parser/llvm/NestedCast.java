/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedCast#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedCast#getFrom <em>From</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedCast#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedCast#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedCast()
 * @model
 * @generated
 */
public interface NestedCast extends Value
{
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedCast_Operation()
	 * @model
	 * @generated
	 */
  String getOperation();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.NestedCast#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
  void setOperation(String value);

  /**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(EObject)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedCast_From()
	 * @model containment="true"
	 * @generated
	 */
  EObject getFrom();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.NestedCast#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
  void setFrom(EObject value);

  /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedCast_Value()
	 * @model containment="true"
	 * @generated
	 */
  Value getValue();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.NestedCast#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(Value value);

  /**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedCast_To()
	 * @model containment="true"
	 * @generated
	 */
  TypeUse getTo();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.NestedCast#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
  void setTo(TypeUse value);

} // NestedCast
