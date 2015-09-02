/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.AliasDefinition#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliastype <em>Aliastype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliasvalue <em>Aliasvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAliasDefinition()
 * @model
 * @generated
 */
public interface AliasDefinition extends MainLevelEntity
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAliasDefinition_Address()
   * @model containment="true"
   * @generated
   */
  Address getAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Address value);

  /**
   * Returns the value of the '<em><b>Aliastype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliastype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliastype</em>' containment reference.
   * @see #setAliastype(TypeUse)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAliasDefinition_Aliastype()
   * @model containment="true"
   * @generated
   */
  TypeUse getAliastype();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliastype <em>Aliastype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliastype</em>' containment reference.
   * @see #getAliastype()
   * @generated
   */
  void setAliastype(TypeUse value);

  /**
   * Returns the value of the '<em><b>Aliasvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliasvalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliasvalue</em>' containment reference.
   * @see #setAliasvalue(Value)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAliasDefinition_Aliasvalue()
   * @model containment="true"
   * @generated
   */
  Value getAliasvalue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliasvalue <em>Aliasvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliasvalue</em>' containment reference.
   * @see #getAliasvalue()
   * @generated
   */
  void setAliasvalue(Value value);

} // AliasDefinition
