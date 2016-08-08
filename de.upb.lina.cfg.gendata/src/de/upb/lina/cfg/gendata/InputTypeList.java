/**
 */
package de.upb.lina.cfg.gendata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.InputTypeList#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getInputTypeList()
 * @model
 * @generated
 */
public interface InputTypeList extends EObject {
	/**
    * Returns the value of the '<em><b>Input Type</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Input Type</em>' attribute list.
    * @see de.upb.lina.cfg.gendata.GendataPackage#getInputTypeList_InputType()
    * @model unique="false"
    * @generated
    */
	EList<String> getInputType();

} // InputTypeList
