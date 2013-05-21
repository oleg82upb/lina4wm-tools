/**
 */
package de.upb.lina.lll;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.Instruction#getInstructionResult <em>Instruction Result</em>}</li>
 *   <li>{@link de.upb.lina.lll.Instruction#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.lina.lll.Instruction#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.upb.lina.lll.Instruction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Result</em>' reference.
	 * @see #setInstructionResult(Variable)
	 * @see de.upb.lina.lll.LllPackage#getInstruction_InstructionResult()
	 * @model
	 * @generated
	 */
	Variable getInstructionResult();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Instruction#getInstructionResult <em>Instruction Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Result</em>' reference.
	 * @see #getInstructionResult()
	 * @generated
	 */
	void setInstructionResult(Variable value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Function#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' container reference.
	 * @see #setFunction(Function)
	 * @see de.upb.lina.lll.LllPackage#getInstruction_Function()
	 * @see de.upb.lina.lll.Function#getInstructions
	 * @model opposite="instructions" transient="false"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Instruction#getFunction <em>Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' container reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.upb.lina.lll.InstructionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see de.upb.lina.lll.InstructionEnum
	 * @see #setInstruction(InstructionEnum)
	 * @see de.upb.lina.lll.LllPackage#getInstruction_Instruction()
	 * @model
	 * @generated
	 */
	InstructionEnum getInstruction();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.Instruction#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see de.upb.lina.lll.InstructionEnum
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(InstructionEnum value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.Parameter}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Parameter#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getInstruction_Parameters()
	 * @see de.upb.lina.lll.Parameter#getInstruction
	 * @model opposite="instruction" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Instruction
