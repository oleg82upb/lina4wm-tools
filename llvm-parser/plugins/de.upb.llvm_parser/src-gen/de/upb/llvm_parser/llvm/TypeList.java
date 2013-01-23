/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.TypeList#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.TypeList#getTypelists <em>Typelists</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeList()
 * @model
 * @generated
 */
public interface TypeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeList_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeUse> getTypes();

	/**
	 * Returns the value of the '<em><b>Typelists</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typelists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typelists</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeList_Typelists()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeList> getTypelists();

} // TypeList
