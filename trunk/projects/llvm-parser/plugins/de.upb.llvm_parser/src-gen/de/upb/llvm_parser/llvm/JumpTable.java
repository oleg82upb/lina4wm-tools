/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.JumpTable#getJtypes <em>Jtypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.JumpTable#getJvalues <em>Jvalues</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.JumpTable#getDestinationtypes <em>Destinationtypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.JumpTable#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable()
 * @model
 * @generated
 */
public interface JumpTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Jtypes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jtypes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jtypes</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Jtypes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getJtypes();

	/**
	 * Returns the value of the '<em><b>Jvalues</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jvalues</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvalues</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Jvalues()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getJvalues();

	/**
	 * Returns the value of the '<em><b>Destinationtypes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinationtypes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinationtypes</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Destinationtypes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDestinationtypes();

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Destinations()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDestinations();

} // JumpTable
