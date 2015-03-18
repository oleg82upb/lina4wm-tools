/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Meta#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Meta#getArg <em>Arg</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Meta#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' attribute.
   * @see #setMeta(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getMeta_Meta()
   * @model
   * @generated
   */
  String getMeta();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Meta#getMeta <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' attribute.
   * @see #getMeta()
   * @generated
   */
  void setMeta(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Predefined)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getMeta_Arg()
   * @model containment="true"
   * @generated
   */
  Predefined getArg();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Meta#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Predefined value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getMeta_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Meta#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Meta
