/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Instruction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFL Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.CFLBuffer#getBufferedInstructions <em>Buffered Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getCFLBuffer()
 * @model
 * @generated
 */
public interface CFLBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffered Instructions</b></em>' reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffered Instructions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffered Instructions</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getCFLBuffer_BufferedInstructions()
	 * @model
	 * @generated
	 */
	EList<Instruction> getBufferedInstructions();

} // CFLBuffer
