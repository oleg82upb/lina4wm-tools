/**
 */
package de.upb.lina.cfg.controlflow;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Early Read Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.EarlyReadTransition#getAssignmentExpression <em>Assignment Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getEarlyReadTransition()
 * @model
 * @generated
 */
public interface EarlyReadTransition extends Transition {

	/**
	 * Returns the value of the '<em><b>Assignment Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Expression</em>' attribute.
	 * @see #setAssignmentExpression(String)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getEarlyReadTransition_AssignmentExpression()
	 * @model
	 * @generated
	 */
	String getAssignmentExpression();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.EarlyReadTransition#getAssignmentExpression <em>Assignment Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Expression</em>' attribute.
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	void setAssignmentExpression(String value);
} // EarlyReadTransition
