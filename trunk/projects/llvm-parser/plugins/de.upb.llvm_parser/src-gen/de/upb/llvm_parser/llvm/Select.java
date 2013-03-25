/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getConditiontype <em>Conditiontype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getConditionvalue <em>Conditionvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getVal1type <em>Val1type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getVal1value <em>Val1value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getVal2type <em>Val2type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getVal2value <em>Val2value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Std_Instr {
	/**
	 * Returns the value of the '<em><b>Conditiontype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditiontype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditiontype</em>' containment reference.
	 * @see #setConditiontype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Conditiontype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getConditiontype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getConditiontype <em>Conditiontype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditiontype</em>' containment reference.
	 * @see #getConditiontype()
	 * @generated
	 */
	void setConditiontype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Conditionvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionvalue</em>' containment reference.
	 * @see #setConditionvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Conditionvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getConditionvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getConditionvalue <em>Conditionvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionvalue</em>' containment reference.
	 * @see #getConditionvalue()
	 * @generated
	 */
	void setConditionvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Val1type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1type</em>' containment reference.
	 * @see #setVal1type(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val1type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getVal1type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal1type <em>Val1type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1type</em>' containment reference.
	 * @see #getVal1type()
	 * @generated
	 */
	void setVal1type(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Val1value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1value</em>' containment reference.
	 * @see #setVal1value(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val1value()
	 * @model containment="true"
	 * @generated
	 */
	Value getVal1value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal1value <em>Val1value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1value</em>' containment reference.
	 * @see #getVal1value()
	 * @generated
	 */
	void setVal1value(Value value);

	/**
	 * Returns the value of the '<em><b>Val2type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2type</em>' containment reference.
	 * @see #setVal2type(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val2type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getVal2type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal2type <em>Val2type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2type</em>' containment reference.
	 * @see #getVal2type()
	 * @generated
	 */
	void setVal2type(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Val2value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2value</em>' containment reference.
	 * @see #setVal2value(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val2value()
	 * @model containment="true"
	 * @generated
	 */
	Value getVal2value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal2value <em>Val2value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2value</em>' containment reference.
	 * @see #getVal2value()
	 * @generated
	 */
	void setVal2value(Value value);

} // Select
