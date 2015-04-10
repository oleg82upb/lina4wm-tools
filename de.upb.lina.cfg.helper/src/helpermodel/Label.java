/**
 */
package helpermodel;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link helpermodel.Label#getName <em>Name</em>}</li>
 *   <li>{@link helpermodel.Label#getControlFlowLocation <em>Control Flow Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see helpermodel.HelpermodelPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see helpermodel.HelpermodelPackage#getLabel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link helpermodel.Label#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Control Flow Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow Location</em>' reference.
	 * @see #setControlFlowLocation(ControlFlowLocation)
	 * @see helpermodel.HelpermodelPackage#getLabel_ControlFlowLocation()
	 * @model
	 * @generated
	 */
	ControlFlowLocation getControlFlowLocation();

	/**
	 * Sets the value of the '{@link helpermodel.Label#getControlFlowLocation <em>Control Flow Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Flow Location</em>' reference.
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	void setControlFlowLocation(ControlFlowLocation value);

} // Label
