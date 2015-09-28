/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Parameter;
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
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getVariableCopies <em>Variable Copies</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getVariableCopyParams <em>Variable Copy Params</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getMemoryModel <em>Memory Model</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_Locations()
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram
	 * @model opposite="diagram" containment="true"
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
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ControlFlowLocation)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_Start()
	 * @model
	 * @generated
	 */
	ControlFlowLocation getStart();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
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

	/**
	 * Returns the value of the '<em><b>Variable Copies</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Copies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Copies</em>' containment reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_VariableCopies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getVariableCopies();

	/**
	 * Returns the value of the '<em><b>Variable Copy Params</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Copy Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Copy Params</em>' containment reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_VariableCopyParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getVariableCopyParams();

	/**
	 * Returns the value of the '<em><b>Memory Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Model</em>' attribute.
	 * @see #setMemoryModel(int)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_MemoryModel()
	 * @model
	 * @generated
	 */
	int getMemoryModel();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getMemoryModel <em>Memory Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Model</em>' attribute.
	 * @see #getMemoryModel()
	 * @generated
	 */
	void setMemoryModel(int value);

} // ControlFlowDiagram
