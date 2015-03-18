/**
 */
package de.upb.lina.lll;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.MemoryInstruction#getInstructionType <em>Instruction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getMemoryInstruction()
 * @model
 * @generated
 */
public interface MemoryInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Instruction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.upb.lina.lll.MemoryInstructionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Type</em>' attribute.
	 * @see de.upb.lina.lll.MemoryInstructionType
	 * @see #setInstructionType(MemoryInstructionType)
	 * @see de.upb.lina.lll.LllPackage#getMemoryInstruction_InstructionType()
	 * @model
	 * @generated
	 */
	MemoryInstructionType getInstructionType();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.MemoryInstruction#getInstructionType <em>Instruction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Type</em>' attribute.
	 * @see de.upb.lina.lll.MemoryInstructionType
	 * @see #getInstructionType()
	 * @generated
	 */
	void setInstructionType(MemoryInstructionType value);

} // MemoryInstruction
