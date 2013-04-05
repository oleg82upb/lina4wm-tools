/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Instruction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.Transition#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.Transition#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference.
	 * @see #setInstruction(Instruction)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getTransition_Instruction()
	 * @model required="true"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.Transition#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ControlFlowLocation)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	ControlFlowLocation getSource();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ControlFlowLocation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ControlFlowLocation)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	ControlFlowLocation getTarget();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ControlFlowLocation value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(ControlFlowDiagram)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getTransition_Diagram()
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	ControlFlowDiagram getDiagram();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.Transition#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(ControlFlowDiagram value);

} // Transition
