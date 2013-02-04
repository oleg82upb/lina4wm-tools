/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getComptype <em>Comptype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getCompvalue <em>Compvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getDefaulttype <em>Defaulttype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getJTable <em>JTable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Ret_Instr {
	/**
	 * Returns the value of the '<em><b>Comptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comptype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comptype</em>' containment reference.
	 * @see #setComptype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Comptype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getComptype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getComptype <em>Comptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comptype</em>' containment reference.
	 * @see #getComptype()
	 * @generated
	 */
	void setComptype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Compvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compvalue</em>' containment reference.
	 * @see #setCompvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Compvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getCompvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getCompvalue <em>Compvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compvalue</em>' containment reference.
	 * @see #getCompvalue()
	 * @generated
	 */
	void setCompvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Defaulttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaulttype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaulttype</em>' containment reference.
	 * @see #setDefaulttype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Defaulttype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getDefaulttype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getDefaulttype <em>Defaulttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaulttype</em>' containment reference.
	 * @see #getDefaulttype()
	 * @generated
	 */
	void setDefaulttype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaultvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #setDefaultvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Defaultvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getDefaultvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getDefaultvalue <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #getDefaultvalue()
	 * @generated
	 */
	void setDefaultvalue(Value value);

	/**
	 * Returns the value of the '<em><b>JTable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JTable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JTable</em>' containment reference.
	 * @see #setJTable(JumpTable)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_JTable()
	 * @model containment="true"
	 * @generated
	 */
	JumpTable getJTable();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getJTable <em>JTable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JTable</em>' containment reference.
	 * @see #getJTable()
	 * @generated
	 */
	void setJTable(JumpTable value);

} // Switch
