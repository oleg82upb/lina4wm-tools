/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.Label#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.Label#getControlFlowLocation <em>Control Flow Location</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.Label#getControlFlowDiagram <em>Control Flow Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject
{
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
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getLabel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.Label#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Control Flow Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow Location</em>' reference.
	 * @see #setControlFlowLocation(ControlFlowLocation)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getLabel_ControlFlowLocation()
	 * @model
	 * @generated
	 */
	ControlFlowLocation getControlFlowLocation();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.Label#getControlFlowLocation <em>Control Flow Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Flow Location</em>' reference.
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	void setControlFlowLocation(ControlFlowLocation value);

	/**
	 * Returns the value of the '<em><b>Control Flow Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow Diagram</em>' reference.
	 * @see #setControlFlowDiagram(ControlFlowDiagram)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getLabel_ControlFlowDiagram()
	 * @model
	 * @generated
	 */
	ControlFlowDiagram getControlFlowDiagram();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.Label#getControlFlowDiagram <em>Control Flow Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Flow Diagram</em>' reference.
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	void setControlFlowDiagram(ControlFlowDiagram value);

} // Label
