/**
 */
package de.upb.lina.lll;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.lina.lll.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.lina.lll.Parameter#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.lina.lll.Parameter#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see de.upb.lina.lll.LllPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(VariableOrValue)
	 * @see de.upb.lina.lll.LllPackage#getParameter_Value()
	 * @model
	 * @generated
	 */
	VariableOrValue getValue();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Parameter#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VariableOrValue value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' container reference.
	 * @see #setFunction(Function)
	 * @see de.upb.lina.lll.LllPackage#getParameter_Function()
	 * @see de.upb.lina.lll.Function#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Parameter#getFunction <em>Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' container reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Instruction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' container reference.
	 * @see #setInstruction(Instruction)
	 * @see de.upb.lina.lll.LllPackage#getParameter_Instruction()
	 * @see de.upb.lina.lll.Instruction#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Parameter#getInstruction <em>Instruction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' container reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

} // Parameter
