/**
 */
package de.upb.lina.cfg.controlflow;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Guarded Transition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.GuardedTransition#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getGuardedTransition()
 * @model
 * @generated
 */
public interface GuardedTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getGuardedTransition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '
	 * {@link de.upb.lina.cfg.controlflow.GuardedTransition#getCondition
	 * <em>Condition</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // GuardedTransition
