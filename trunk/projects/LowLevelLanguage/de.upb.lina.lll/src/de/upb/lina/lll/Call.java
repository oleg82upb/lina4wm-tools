/**
 */
package de.upb.lina.lll;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.Call#getInvokedFunction <em>Invoked Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Instruction {
	/**
	 * Returns the value of the '<em><b>Invoked Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Function</em>' reference.
	 * @see #setInvokedFunction(Function)
	 * @see de.upb.lina.lll.LllPackage#getCall_InvokedFunction()
	 * @model
	 * @generated
	 */
	Function getInvokedFunction();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Call#getInvokedFunction <em>Invoked Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Function</em>' reference.
	 * @see #getInvokedFunction()
	 * @generated
	 */
	void setInvokedFunction(Function value);

} // Call
