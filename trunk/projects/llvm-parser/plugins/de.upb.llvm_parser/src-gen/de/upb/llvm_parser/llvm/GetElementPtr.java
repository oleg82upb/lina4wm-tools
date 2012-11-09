/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getPointer <em>Pointer</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr()
 * @model
 * @generated
 */
public interface GetElementPtr extends Instruction {
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeAndValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Pointer()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAndValue> getPointer();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeAndValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAndValue> getParams();

} // GetElementPtr
