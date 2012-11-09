/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.LocalInstruction#getInstr <em>Instr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLocalInstruction()
 * @model
 * @generated
 */
public interface LocalInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Instr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instr</em>' containment reference.
	 * @see #setInstr(Instruction)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLocalInstruction_Instr()
	 * @model containment="true"
	 * @generated
	 */
	Instruction getInstr();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LocalInstruction#getInstr <em>Instr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instr</em>' containment reference.
	 * @see #getInstr()
	 * @generated
	 */
	void setInstr(Instruction value);

} // LocalInstruction
