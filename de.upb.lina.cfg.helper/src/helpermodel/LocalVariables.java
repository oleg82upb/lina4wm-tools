/**
 */
package helpermodel;

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
 *   <li>{@link helpermodel.LocalVariables#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see helpermodel.HelpermodelPackage#getLocalVariables()
 * @model
 * @generated
 */
public interface LocalVariables extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link helpermodel.AdressMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see helpermodel.HelpermodelPackage#getLocalVariables_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdressMapping> getVariables();

} // LocalVariables
