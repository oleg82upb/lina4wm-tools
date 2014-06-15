/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Instruction;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.MultiTransition#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getMultiTransition()
 * @model
 * @generated
 */
public interface MultiTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getMultiTransition_Instructions()
	 * @model
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // MultiTransition
