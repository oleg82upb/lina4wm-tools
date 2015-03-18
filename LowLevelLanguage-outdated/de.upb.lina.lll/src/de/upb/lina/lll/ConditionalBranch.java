/**
 */
package de.upb.lina.lll;

import de.upb.lina.lll.expressions.LExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.ConditionalBranch#getElseTarget <em>Else Target</em>}</li>
 *   <li>{@link de.upb.lina.lll.ConditionalBranch#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getConditionalBranch()
 * @model
 * @generated
 */
public interface ConditionalBranch extends Goto {
	/**
	 * Returns the value of the '<em><b>Else Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Target</em>' reference.
	 * @see #setElseTarget(Label)
	 * @see de.upb.lina.lll.LllPackage#getConditionalBranch_ElseTarget()
	 * @model
	 * @generated
	 */
	Label getElseTarget();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.ConditionalBranch#getElseTarget <em>Else Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Target</em>' reference.
	 * @see #getElseTarget()
	 * @generated
	 */
	void setElseTarget(Label value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(LExpression)
	 * @see de.upb.lina.lll.LllPackage#getConditionalBranch_Condition()
	 * @model containment="true"
	 * @generated
	 */
	LExpression getCondition();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.ConditionalBranch#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(LExpression value);

} // ConditionalBranch
