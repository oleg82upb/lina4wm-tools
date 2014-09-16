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
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressValuePair#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressValuePair#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressValuePair#getStoreBuffer <em>Store Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair()
 * @model
 * @generated
 */
public interface AddressValuePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Parameter)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair_Address()
	 * @model
	 * @generated
	 */
	Parameter getAddress();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Parameter)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair_Value()
	 * @model
	 * @generated
	 */
	Parameter getValue();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Parameter value);

	/**
	 * Returns the value of the '<em><b>Store Buffer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.StoreBuffer#getAddressValuePairs <em>Address Value Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Buffer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Buffer</em>' container reference.
	 * @see #setStoreBuffer(StoreBuffer)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressValuePair_StoreBuffer()
	 * @see de.upb.lina.cfg.controlflow.StoreBuffer#getAddressValuePairs
	 * @model opposite="addressValuePairs" transient="false"
	 * @generated
	 */
	StoreBuffer getStoreBuffer();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getStoreBuffer <em>Store Buffer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Buffer</em>' container reference.
	 * @see #getStoreBuffer()
	 * @generated
	 */
	void setStoreBuffer(StoreBuffer value);

} // AddressValuePair
