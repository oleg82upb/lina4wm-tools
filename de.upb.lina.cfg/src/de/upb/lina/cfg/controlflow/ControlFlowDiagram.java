/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.FunctionDefinition;
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
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLabelPrefix <em>Label Prefix</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getReturnVariable <em>Return Variable</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getParameterVariables <em>Parameter Variables</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLocalVariables <em>Local Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram()
 * @model
 * @generated
 */
public interface ControlFlowDiagram extends AbstractLabeledElement {
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

	/**
	 * Returns the value of the '<em><b>Function Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Definition</em>' reference.
	 * @see #setFunctionDefinition(FunctionDefinition)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_FunctionDefinition()
	 * @model
	 * @generated
	 */
	FunctionDefinition getFunctionDefinition();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getFunctionDefinition <em>Function Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Definition</em>' reference.
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	void setFunctionDefinition(FunctionDefinition value);

	/**
	 * Returns the value of the '<em><b>Label Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Prefix</em>' attribute.
	 * @see #setLabelPrefix(String)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_LabelPrefix()
	 * @model
	 * @generated
	 */
	String getLabelPrefix();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLabelPrefix <em>Label Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Prefix</em>' attribute.
	 * @see #getLabelPrefix()
	 * @generated
	 */
	void setLabelPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Variable</em>' reference.
	 * @see #setReturnVariable(Variable)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_ReturnVariable()
	 * @model
	 * @generated
	 */
	Variable getReturnVariable();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getReturnVariable <em>Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Variable</em>' reference.
	 * @see #getReturnVariable()
	 * @generated
	 */
	void setReturnVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Parameter Variables</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Variables</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_ParameterVariables()
	 * @model
	 * @generated
	 */
	EList<Variable> getParameterVariables();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getControlFlowDiagram_LocalVariables()
	 * @model
	 * @generated
	 */
	EList<Variable> getLocalVariables();

} // ControlFlowDiagram
