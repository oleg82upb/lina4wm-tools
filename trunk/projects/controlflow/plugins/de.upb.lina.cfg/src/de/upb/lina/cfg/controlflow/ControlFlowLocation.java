/**
 */
package de.upb.lina.cfg.controlflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getPc <em>Pc</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation()
 * @model
 * @generated
 */
public interface ControlFlowLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Pc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pc</em>' attribute.
	 * @see #setPc(int)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Pc()
	 * @model
	 * @generated
	 */
	int getPc();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getPc <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pc</em>' attribute.
	 * @see #getPc()
	 * @generated
	 */
	void setPc(int value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference.
	 * @see #setDiagram(ControlFlowDiagram)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Diagram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlFlowDiagram getDiagram();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' containment reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(ControlFlowDiagram value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Incoming()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // ControlFlowLocation
