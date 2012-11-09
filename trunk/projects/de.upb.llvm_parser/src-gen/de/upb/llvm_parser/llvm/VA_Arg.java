/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VA Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.VA_Arg#getList <em>List</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VA_Arg#getArgType <em>Arg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVA_Arg()
 * @model
 * @generated
 */
public interface VA_Arg extends Instruction {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVA_Arg_List()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getList();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VA_Arg#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Arg Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Type</em>' attribute.
	 * @see #setArgType(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVA_Arg_ArgType()
	 * @model
	 * @generated
	 */
	String getArgType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VA_Arg#getArgType <em>Arg Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg Type</em>' attribute.
	 * @see #getArgType()
	 * @generated
	 */
	void setArgType(String value);

} // VA_Arg
