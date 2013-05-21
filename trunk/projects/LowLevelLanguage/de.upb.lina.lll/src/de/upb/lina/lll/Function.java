/**
 */
package de.upb.lina.lll;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.Function#getProgram <em>Program</em>}</li>
 *   <li>{@link de.upb.lina.lll.Function#getVariablesOrValues <em>Variables Or Values</em>}</li>
 *   <li>{@link de.upb.lina.lll.Function#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.upb.lina.lll.Function#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.upb.lina.lll.Function#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Program#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see de.upb.lina.lll.LllPackage#getFunction_Program()
	 * @see de.upb.lina.lll.Program#getFunctions
	 * @model opposite="functions" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Function#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Variables Or Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.VariableOrValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables Or Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Or Values</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getFunction_VariablesOrValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableOrValue> getVariablesOrValues();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.Label}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Label#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getFunction_Labels()
	 * @see de.upb.lina.lll.Label#getFunction
	 * @model opposite="function" containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.Instruction}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Instruction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getFunction_Instructions()
	 * @see de.upb.lina.lll.Instruction#getFunction
	 * @model opposite="function" containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.Parameter}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Parameter#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getFunction_Parameters()
	 * @see de.upb.lina.lll.Parameter#getFunction
	 * @model opposite="function" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Function
