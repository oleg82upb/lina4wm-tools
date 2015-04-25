/**
 */
package de.upb.lina.cfg.gendata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.LocalVariables#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getLocalVariables()
 * @model
 * @generated
 */
public interface LocalVariables extends EObject
{
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.gendata.AddressMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getLocalVariables_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AddressMapping> getVariables();

} // LocalVariables
