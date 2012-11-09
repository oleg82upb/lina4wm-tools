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
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getVal1 <em>Val1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Select#getVal2 <em>Val2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Instruction {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Condition()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getCondition();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Val1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1</em>' containment reference.
	 * @see #setVal1(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val1()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getVal1();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal1 <em>Val1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1</em>' containment reference.
	 * @see #getVal1()
	 * @generated
	 */
	void setVal1(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Val2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2</em>' containment reference.
	 * @see #setVal2(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val2()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getVal2();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal2 <em>Val2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2</em>' containment reference.
	 * @see #getVal2()
	 * @generated
	 */
	void setVal2(TypeAndValue value);

} // Select
