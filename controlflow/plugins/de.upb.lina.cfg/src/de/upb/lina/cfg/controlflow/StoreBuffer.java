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
 *   <li>{@link de.upb.lina.cfg.controlflow.StoreBuffer#getBuffer <em>Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getStoreBuffer()
 * @model
 * @generated
 */
public interface StoreBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.AddressValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getStoreBuffer_Buffer()
	 * @model
	 * @generated
	 */
	EList<AddressValuePair> getBuffer();

} // StoreBuffer
