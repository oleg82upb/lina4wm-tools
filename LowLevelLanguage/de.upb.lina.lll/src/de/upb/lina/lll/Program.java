/**
 */
package de.upb.lina.lll;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.Program#getFunctions <em>Functions</em>}</li>
 *   <li>{@link de.upb.lina.lll.Program#getGlobalVariablesOrValues <em>Global Variables Or Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.Function}.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.lll.Function#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getProgram_Functions()
	 * @see de.upb.lina.lll.Function#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Global Variables Or Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.lll.VariableOrValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variables Or Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables Or Values</em>' containment reference list.
	 * @see de.upb.lina.lll.LllPackage#getProgram_GlobalVariablesOrValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableOrValue> getGlobalVariablesOrValues();

} // Program
