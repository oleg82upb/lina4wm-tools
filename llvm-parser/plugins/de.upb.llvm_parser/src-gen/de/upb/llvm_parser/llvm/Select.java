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
public interface Select extends Instruction {
	/**
	 * Returns the value of the '<em><b>Conditiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditiontype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditiontype</em>' attribute.
	 * @see #setConditiontype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Conditiontype()
	 * @model
	 * @generated
	 */
	String getConditiontype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getConditiontype <em>Conditiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditiontype</em>' attribute.
	 * @see #getConditiontype()
	 * @generated
	 */
	void setConditiontype(String value);

	/**
	 * Returns the value of the '<em><b>Conditionvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionvalue</em>' attribute.
	 * @see #setConditionvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Conditionvalue()
	 * @model
	 * @generated
	 */
	String getConditionvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getConditionvalue <em>Conditionvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionvalue</em>' attribute.
	 * @see #getConditionvalue()
	 * @generated
	 */
	void setConditionvalue(String value);

	/**
	 * Returns the value of the '<em><b>Val1type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1type</em>' attribute.
	 * @see #setVal1type(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val1type()
	 * @model
	 * @generated
	 */
	String getVal1type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal1type <em>Val1type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1type</em>' attribute.
	 * @see #getVal1type()
	 * @generated
	 */
	void setVal1type(String value);

	/**
	 * Returns the value of the '<em><b>Val1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1value</em>' attribute.
	 * @see #setVal1value(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val1value()
	 * @model
	 * @generated
	 */
	String getVal1value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal1value <em>Val1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1value</em>' attribute.
	 * @see #getVal1value()
	 * @generated
	 */
	void setVal1value(String value);

	/**
	 * Returns the value of the '<em><b>Val2type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2type</em>' attribute.
	 * @see #setVal2type(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val2type()
	 * @model
	 * @generated
	 */
	String getVal2type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal2type <em>Val2type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2type</em>' attribute.
	 * @see #getVal2type()
	 * @generated
	 */
	void setVal2type(String value);

	/**
	 * Returns the value of the '<em><b>Val2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2value</em>' attribute.
	 * @see #setVal2value(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSelect_Val2value()
	 * @model
	 * @generated
	 */
	String getVal2value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Select#getVal2value <em>Val2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2value</em>' attribute.
	 * @see #getVal2value()
	 * @generated
	 */
	void setVal2value(String value);

} // Select
