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
public interface Return extends Ret_Instr {
	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returntype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' attribute.
	 * @see #setReturntype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getReturn_Returntype()
	 * @model
	 * @generated
	 */
	String getReturntype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Return#getReturntype <em>Returntype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' attribute.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(String value);

	/**
	 * Returns the value of the '<em><b>Returnvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returnvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnvalue</em>' attribute.
	 * @see #setReturnvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getReturn_Returnvalue()
	 * @model
	 * @generated
	 */
	String getReturnvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Return#getReturnvalue <em>Returnvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnvalue</em>' attribute.
	 * @see #getReturnvalue()
	 * @generated
	 */
	void setReturnvalue(String value);

} // Return
