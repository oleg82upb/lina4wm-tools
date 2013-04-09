/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.LogicOperation#getOptype <em>Optype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LogicOperation#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LogicOperation#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLogicOperation()
 * @model
 * @generated
 */
public interface LogicOperation extends StandartInstruction {
	/**
	 * Returns the value of the '<em><b>Optype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optype</em>' containment reference.
	 * @see #setOptype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLogicOperation_Optype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getOptype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LogicOperation#getOptype <em>Optype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optype</em>' containment reference.
	 * @see #getOptype()
	 * @generated
	 */
	void setOptype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' containment reference.
	 * @see #setValue1(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLogicOperation_Value1()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue1();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LogicOperation#getValue1 <em>Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' containment reference.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(Value value);

	/**
	 * Returns the value of the '<em><b>Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' containment reference.
	 * @see #setValue2(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLogicOperation_Value2()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue2();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LogicOperation#getValue2 <em>Value2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' containment reference.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(Value value);

} // LogicOperation
