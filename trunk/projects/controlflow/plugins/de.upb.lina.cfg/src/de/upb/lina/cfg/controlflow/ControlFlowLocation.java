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
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getBuffer <em>Buffer</em>}</li>
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
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(ControlFlowDiagram)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Diagram()
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLocations
	 * @model opposite="locations" transient="false"
	 * @generated
	 */
	ControlFlowDiagram getDiagram();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(ControlFlowDiagram value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Transition}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Incoming()
	 * @see de.upb.lina.cfg.controlflow.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Transition}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Outgoing()
	 * @see de.upb.lina.cfg.controlflow.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.StoreBuffer#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' containment reference.
	 * @see #setBuffer(StoreBuffer)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowLocation_Buffer()
	 * @see de.upb.lina.cfg.controlflow.StoreBuffer#getLocation
	 * @model opposite="location" containment="true"
	 * @generated
	 */
	StoreBuffer getBuffer();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getBuffer <em>Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' containment reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(StoreBuffer value);

} // ControlFlowLocation
