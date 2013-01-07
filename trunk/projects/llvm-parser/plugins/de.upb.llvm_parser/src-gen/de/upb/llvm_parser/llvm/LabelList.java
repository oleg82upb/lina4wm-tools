/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.LabelList#getLabeltype <em>Labeltype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LabelList#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLabelList()
 * @model
 * @generated
 */
public interface LabelList extends EObject {
	/**
	 * Returns the value of the '<em><b>Labeltype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labeltype</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeltype</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLabelList_Labeltype()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLabeltype();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLabelList_Labels()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLabels();

} // LabelList
