/**
 */
package de.upb.lina.cfg.controlflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.StoreBuffer#getAddressValuePairs <em>Address Value Pairs</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.StoreBuffer#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getStoreBuffer()
 * @model
 * @generated
 */
public interface StoreBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Value Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.AddressValuePair}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getStoreBuffer <em>Store Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Value Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Value Pairs</em>' containment reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getStoreBuffer_AddressValuePairs()
	 * @see de.upb.lina.cfg.controlflow.AddressValuePair#getStoreBuffer
	 * @model opposite="storeBuffer" containment="true"
	 * @generated
	 */
	EList<AddressValuePair> getAddressValuePairs();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(ControlFlowLocation)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getStoreBuffer_Location()
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getBuffer
	 * @model opposite="buffer" transient="false"
	 * @generated
	 */
	ControlFlowLocation getLocation();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.StoreBuffer#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ControlFlowLocation value);

} // StoreBuffer
