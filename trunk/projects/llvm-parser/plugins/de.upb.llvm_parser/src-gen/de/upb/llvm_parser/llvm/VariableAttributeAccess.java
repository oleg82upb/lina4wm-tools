/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Attribute Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getListtype <em>Listtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getListvalue <em>Listvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getArgType <em>Arg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess()
 * @model
 * @generated
 */
public interface VariableAttributeAccess extends Instruction
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

  /**
	 * Returns the value of the '<em><b>Listtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Listtype</em>' containment reference.
	 * @see #setListtype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_Listtype()
	 * @model containment="true"
	 * @generated
	 */
  TypeUse getListtype();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getListtype <em>Listtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listtype</em>' containment reference.
	 * @see #getListtype()
	 * @generated
	 */
  void setListtype(TypeUse value);

  /**
	 * Returns the value of the '<em><b>Listvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listvalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Listvalue</em>' containment reference.
	 * @see #setListvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_Listvalue()
	 * @model containment="true"
	 * @generated
	 */
  Value getListvalue();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getListvalue <em>Listvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listvalue</em>' containment reference.
	 * @see #getListvalue()
	 * @generated
	 */
  void setListvalue(Value value);

  /**
	 * Returns the value of the '<em><b>Arg Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Type</em>' containment reference.
	 * @see #setArgType(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVariableAttributeAccess_ArgType()
	 * @model containment="true"
	 * @generated
	 */
  TypeUse getArgType();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getArgType <em>Arg Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg Type</em>' containment reference.
	 * @see #getArgType()
	 * @generated
	 */
  void setArgType(TypeUse value);

} // VariableAttributeAccess
