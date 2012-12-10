/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Call#getPointer <em>Pointer</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Call#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Instruction {
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference.
	 * @see #setPointer(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall_Pointer()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getPointer();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Call#getPointer <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' containment reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>PList</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PList</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PList</em>' attribute.
	 * @see #setPList(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCall_PList()
	 * @model
	 * @generated
	 */
	String getPList();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Call#getPList <em>PList</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PList</em>' attribute.
	 * @see #getPList()
	 * @generated
	 */
	void setPList(String value);

} // Call
