/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Address;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Def Chain Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.WriteDefChainTransition#getCopyAddress <em>Copy Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getWriteDefChainTransition()
 * @model
 * @generated
 */
public interface WriteDefChainTransition extends Transition {

	/**
	 * Returns the value of the '<em><b>Copy Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Address</em>' reference.
	 * @see #setCopyAddress(Address)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getWriteDefChainTransition_CopyAddress()
	 * @model
	 * @generated
	 */
	Address getCopyAddress();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.WriteDefChainTransition#getCopyAddress <em>Copy Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Address</em>' reference.
	 * @see #getCopyAddress()
	 * @generated
	 */
	void setCopyAddress(Address value);
} // WriteDefChainTransition
