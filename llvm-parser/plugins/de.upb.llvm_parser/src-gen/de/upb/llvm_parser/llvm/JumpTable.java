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
	 * Returns the value of the '<em><b>Jtypes</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jtypes</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Jtypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeUse> getJtypes();

	/**
	 * Returns the value of the '<em><b>Jvalues</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jvalues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvalues</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Jvalues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getJvalues();

	/**
	 * Returns the value of the '<em><b>Destinationtypes</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinationtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinationtypes</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Destinationtypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeUse> getDestinationtypes();

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getJumpTable_Destinations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getDestinations();

} // JumpTable
