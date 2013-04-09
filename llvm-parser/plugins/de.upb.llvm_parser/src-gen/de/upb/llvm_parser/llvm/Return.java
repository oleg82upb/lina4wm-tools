/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Return#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Return#getReturnvalue <em>Returnvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends ReturnInstruction {
	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returntype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' containment reference.
	 * @see #setReturntype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getReturn_Returntype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getReturntype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Return#getReturntype <em>Returntype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' containment reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Returnvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returnvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnvalue</em>' containment reference.
	 * @see #setReturnvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getReturn_Returnvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getReturnvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Return#getReturnvalue <em>Returnvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnvalue</em>' containment reference.
	 * @see #getReturnvalue()
	 * @generated
	 */
	void setReturnvalue(Value value);

} // Return
