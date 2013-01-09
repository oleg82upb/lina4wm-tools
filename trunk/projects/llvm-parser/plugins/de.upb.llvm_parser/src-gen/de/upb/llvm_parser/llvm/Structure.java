/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Structure#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Structure#getArrays <em>Arrays</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Structure#getLists <em>Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure_Types()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTypes();

	/**
	 * Returns the value of the '<em><b>Arrays</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.ARRAY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrays</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure_Arrays()
	 * @model containment="true"
	 * @generated
	 */
	EList<ARRAY> getArrays();

	/**
	 * Returns the value of the '<em><b>Lists</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lists</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure_Lists()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeList> getLists();

} // Structure
