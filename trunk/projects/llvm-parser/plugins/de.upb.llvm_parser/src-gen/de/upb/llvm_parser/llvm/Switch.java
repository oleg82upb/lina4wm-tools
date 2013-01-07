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
	 * Returns the value of the '<em><b>Comptype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comptype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comptype</em>' attribute.
	 * @see #setComptype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Comptype()
	 * @model
	 * @generated
	 */
	String getComptype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getComptype <em>Comptype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comptype</em>' attribute.
	 * @see #getComptype()
	 * @generated
	 */
	void setComptype(String value);

	/**
	 * Returns the value of the '<em><b>Compvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compvalue</em>' attribute.
	 * @see #setCompvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Compvalue()
	 * @model
	 * @generated
	 */
	String getCompvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getCompvalue <em>Compvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compvalue</em>' attribute.
	 * @see #getCompvalue()
	 * @generated
	 */
	void setCompvalue(String value);

	/**
	 * Returns the value of the '<em><b>Defaulttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaulttype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaulttype</em>' attribute.
	 * @see #setDefaulttype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Defaulttype()
	 * @model
	 * @generated
	 */
	String getDefaulttype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getDefaulttype <em>Defaulttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaulttype</em>' attribute.
	 * @see #getDefaulttype()
	 * @generated
	 */
	void setDefaulttype(String value);

	/**
	 * Returns the value of the '<em><b>Defaultvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaultvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultvalue</em>' attribute.
	 * @see #setDefaultvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Defaultvalue()
	 * @model
	 * @generated
	 */
	String getDefaultvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getDefaultvalue <em>Defaultvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvalue</em>' attribute.
	 * @see #getDefaultvalue()
	 * @generated
	 */
	void setDefaultvalue(String value);

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
