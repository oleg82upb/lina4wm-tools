/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.PHI#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.PHI#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPHI()
 * @model
 * @generated
 */
public interface PHI extends Instruction {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPHI_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.PHI#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.ValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getPHI_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValuePair> getValues();

} // PHI
