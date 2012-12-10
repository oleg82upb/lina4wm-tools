/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.BasicBlock#getLabel <em>Label</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.BasicBlock#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.BasicBlock#getTerminator <em>Terminator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBasicBlock()
 * @model
 * @generated
 */
public interface BasicBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBasicBlock_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.BasicBlock#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBasicBlock_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Terminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminator</em>' containment reference.
	 * @see #setTerminator(Ret_Instr)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBasicBlock_Terminator()
	 * @model containment="true"
	 * @generated
	 */
	Ret_Instr getTerminator();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.BasicBlock#getTerminator <em>Terminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminator</em>' containment reference.
	 * @see #getTerminator()
	 * @generated
	 */
	void setTerminator(Ret_Instr value);

} // BasicBlock
