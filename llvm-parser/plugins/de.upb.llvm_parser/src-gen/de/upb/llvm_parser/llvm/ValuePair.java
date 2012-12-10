/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ValuePair#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ValuePair#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getValuePair()
 * @model
 * @generated
 */
public interface ValuePair extends Compare, ARITHMETIC_OP, LOGICAL_OP {
	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getValuePair_Value1()
	 * @model
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ValuePair#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(String value);

	/**
	 * Returns the value of the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' attribute.
	 * @see #setValue2(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getValuePair_Value2()
	 * @model
	 * @generated
	 */
	String getValue2();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ValuePair#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(String value);

} // ValuePair
