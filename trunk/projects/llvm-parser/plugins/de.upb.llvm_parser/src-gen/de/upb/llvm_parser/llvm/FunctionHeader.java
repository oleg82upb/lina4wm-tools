/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionHeader#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionHeader#getPl <em>Pl</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionHeader#getBody <em>Body</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionHeader#getTList <em>TList</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionHeader()
 * @model
 * @generated
 */
public interface FunctionHeader extends MainLevelEntity {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionHeader_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionHeader#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Pl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pl</em>' containment reference.
	 * @see #setPl(ParameterList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionHeader_Pl()
	 * @model containment="true"
	 * @generated
	 */
	ParameterList getPl();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionHeader#getPl <em>Pl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pl</em>' containment reference.
	 * @see #getPl()
	 * @generated
	 */
	void setPl(ParameterList value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(FunctionBody)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionHeader_Body()
	 * @model containment="true"
	 * @generated
	 */
	FunctionBody getBody();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionHeader#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(FunctionBody value);

	/**
	 * Returns the value of the '<em><b>TList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TList</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TList</em>' containment reference.
	 * @see #setTList(TypeList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionHeader_TList()
	 * @model containment="true"
	 * @generated
	 */
	TypeList getTList();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionHeader#getTList <em>TList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TList</em>' containment reference.
	 * @see #getTList()
	 * @generated
	 */
	void setTList(TypeList value);

} // FunctionHeader
