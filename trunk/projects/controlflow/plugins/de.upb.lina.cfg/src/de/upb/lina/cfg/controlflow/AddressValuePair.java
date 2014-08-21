/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressValuePair#getMemAddress <em>Mem Address</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressValuePair#getMemValue <em>Mem Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair()
 * @model
 * @generated
 */
public interface AddressValuePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Mem Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Address</em>' reference.
	 * @see #setMemAddress(Parameter)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair_MemAddress()
	 * @model
	 * @generated
	 */
	Parameter getMemAddress();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getMemAddress <em>Mem Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Address</em>' reference.
	 * @see #getMemAddress()
	 * @generated
	 */
	void setMemAddress(Parameter value);

	/**
	 * Returns the value of the '<em><b>Mem Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Value</em>' reference.
	 * @see #setMemValue(Parameter)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair_MemValue()
	 * @model
	 * @generated
	 */
	Parameter getMemValue();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getMemValue <em>Mem Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Value</em>' reference.
	 * @see #getMemValue()
	 * @generated
	 */
	void setMemValue(Parameter value);

} // AddressValuePair
