/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.TypeDefinition#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.TypeDefinition#getStruct <em>Struct</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends MainLevelEntity
{
  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(Address)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeDefinition_Address()
   * @model containment="true"
   * @generated
   */
  Address getAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.TypeDefinition#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Address value);

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(Structure)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeDefinition_Struct()
   * @model containment="true"
   * @generated
   */
  Structure getStruct();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.TypeDefinition#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(Structure value);

} // TypeDefinition
