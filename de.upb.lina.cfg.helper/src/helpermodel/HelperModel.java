/**
 */
package helpermodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link helpermodel.HelperModel#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link helpermodel.HelperModel#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see helpermodel.HelpermodelPackage#getHelperModel()
 * @model
 * @generated
 */
public interface HelperModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference.
	 * @see #setLocalVariables(LocalVariables)
	 * @see helpermodel.HelpermodelPackage#getHelperModel_LocalVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocalVariables getLocalVariables();

	/**
	 * Sets the value of the '{@link helpermodel.HelperModel#getLocalVariables <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Variables</em>' containment reference.
	 * @see #getLocalVariables()
	 * @generated
	 */
	void setLocalVariables(LocalVariables value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link helpermodel.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see helpermodel.HelpermodelPackage#getHelperModel_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

} // HelperModel
