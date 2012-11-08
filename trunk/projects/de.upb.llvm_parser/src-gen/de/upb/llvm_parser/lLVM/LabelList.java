/**
 */
package de.upb.llvm_parser.lLVM;

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
 *   <li>{@link de.upb.llvm_parser.lLVM.LabelList#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getLabelList()
 * @model
 * @generated
 */
public interface LabelList extends EObject
{
  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.lLVM.TypeAndValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getLabelList_Labels()
   * @model containment="true"
   * @generated
   */
  EList<TypeAndValue> getLabels();

} // LabelList
