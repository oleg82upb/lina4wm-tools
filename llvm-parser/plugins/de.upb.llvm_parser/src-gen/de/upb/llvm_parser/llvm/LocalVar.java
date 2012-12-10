/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.LocalVar#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LocalVar#getInstr <em>Instr</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LocalVar#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLocalVar()
 * @model
 * @generated
 */
public interface LocalVar extends MainLevelEntity, Instruction {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLocalVar_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LocalVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Instr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instr</em>' containment reference.
	 * @see #setInstr(Instruction)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLocalVar_Instr()
	 * @model containment="true"
	 * @generated
	 */
	Instruction getInstr();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LocalVar#getInstr <em>Instr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instr</em>' containment reference.
	 * @see #getInstr()
	 * @generated
	 */
	void setInstr(Instruction value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(Alias)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLocalVar_Alias()
	 * @model containment="true"
	 * @generated
	 */
	Alias getAlias();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LocalVar#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(Alias value);

} // LocalVar
