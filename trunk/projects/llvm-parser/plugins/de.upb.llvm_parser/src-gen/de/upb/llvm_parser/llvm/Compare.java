/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getComptype <em>Comptype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare()
 * @model
 * @generated
 */
public interface Compare extends Instruction {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Comptype()
	 * @model
	 * @generated
	 */
	String getComptype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getComptype <em>Comptype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comptype</em>' attribute.
	 * @see #getComptype()
	 * @generated
	 */
	void setComptype(String value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Value1()
	 * @model
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getValue1 <em>Value1</em>}' attribute.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Value2()
	 * @model
	 * @generated
	 */
	String getValue2();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(String value);

} // Compare
