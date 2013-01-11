/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ParameterList#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ParameterList#getLists <em>Lists</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ParameterList#getAlignname <em>Alignname</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ParameterList#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ParameterList#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getParameterList_Types()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTypes();

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getParameterList_Lists()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeList> getLists();

	/**
	 * Returns the value of the '<em><b>Alignname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignname</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignname</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getParameterList_Alignname()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAlignname();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getParameterList_Variables()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVariables();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getParameterList_Op()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getOp();

} // ParameterList
