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
 *   <li>{@link de.upb.llvm_parser.llvm.VA_Arg#getListtype <em>Listtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.VA_Arg#getListvalue <em>Listvalue</em>}</li>
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
	 * Returns the value of the '<em><b>Listtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listtype</em>' attribute.
	 * @see #setListtype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVA_Arg_Listtype()
	 * @model
	 * @generated
	 */
	String getListtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VA_Arg#getListtype <em>Listtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listtype</em>' attribute.
	 * @see #getListtype()
	 * @generated
	 */
	void setListtype(String value);

	/**
	 * Returns the value of the '<em><b>Listvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listvalue</em>' attribute.
	 * @see #setListvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getVA_Arg_Listvalue()
	 * @model
	 * @generated
	 */
	String getListvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.VA_Arg#getListvalue <em>Listvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listvalue</em>' attribute.
	 * @see #getListvalue()
	 * @generated
	 */
	void setListvalue(String value);

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
