/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.InstructionUse#getReg_or_var <em>Reg or var</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InstructionUse#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInstructionUse()
 * @model
 * @generated
 */
public interface InstructionUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Reg or var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg or var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg or var</em>' attribute.
	 * @see #setReg_or_var(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInstructionUse_Reg_or_var()
	 * @model
	 * @generated
	 */
	String getReg_or_var();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InstructionUse#getReg_or_var <em>Reg or var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg or var</em>' attribute.
	 * @see #getReg_or_var()
	 * @generated
	 */
	void setReg_or_var(String value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(Instruction)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInstructionUse_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InstructionUse#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

} // InstructionUse
