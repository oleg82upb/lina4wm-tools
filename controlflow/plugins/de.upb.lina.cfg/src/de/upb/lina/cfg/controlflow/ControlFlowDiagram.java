/**
 */
package de.upb.lina.cfg.controlflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLocations <em>Locations</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getStart <em>Start</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram()
 * @model
 * @generated
 */
public interface ControlFlowDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.ControlFlowLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlFlowLocation> getLocations();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Transition}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.Transition#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_Transitions()
	 * @see de.upb.lina.cfg.controlflow.Transition#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(ControlFlowLocation)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlFlowLocation getStart();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ControlFlowLocation value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ControlFlowDiagram
