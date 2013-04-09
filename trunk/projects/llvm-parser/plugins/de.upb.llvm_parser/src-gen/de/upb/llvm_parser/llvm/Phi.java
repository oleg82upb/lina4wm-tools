/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Phi#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Phi#getFirstclass <em>Firstclass</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Phi#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPhi()
 * @model
 * @generated
 */
public interface Phi extends StandartInstruction {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPhi_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Phi#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Firstclass</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstclass</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPhi_Firstclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getFirstclass();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPhi_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Phi
