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
	 * Returns the value of the '<em><b>Labeltype</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labeltype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeltype</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLabelList_Labeltype()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeUse> getLabeltype();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLabelList_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getLabels();

} // LabelList
