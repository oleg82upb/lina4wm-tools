/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Constant Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.NonConstantValue#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NonConstantValue#getPointer <em>Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNonConstantValue()
 * @model
 * @generated
 */
public interface NonConstantValue extends Value
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getNonConstantValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.NonConstantValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pointer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' attribute.
   * @see #setPointer(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getNonConstantValue_Pointer()
   * @model
   * @generated
   */
  String getPointer();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.NonConstantValue#getPointer <em>Pointer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' attribute.
   * @see #getPointer()
   * @generated
   */
  void setPointer(String value);

} // NonConstantValue
