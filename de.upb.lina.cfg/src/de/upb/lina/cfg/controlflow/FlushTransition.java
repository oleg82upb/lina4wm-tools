/**
 */
package de.upb.lina.cfg.controlflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flush Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.FlushTransition#getFlushedEntry <em>Flushed Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getFlushTransition()
 * @model
 * @generated
 */
public interface FlushTransition extends Transition {

	/**
	 * Returns the value of the '<em><b>Flushed Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flushed Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flushed Entry</em>' containment reference.
	 * @see #setFlushedEntry(AddressValuePair)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getFlushTransition_FlushedEntry()
	 * @model containment="true"
	 * @generated
	 */
	AddressValuePair getFlushedEntry();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.FlushTransition#getFlushedEntry <em>Flushed Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flushed Entry</em>' containment reference.
	 * @see #getFlushedEntry()
	 * @generated
	 */
	void setFlushedEntry(AddressValuePair value);
} // FlushTransition
