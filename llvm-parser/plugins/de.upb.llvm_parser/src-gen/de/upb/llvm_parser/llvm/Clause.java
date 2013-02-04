/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Clause#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Clause#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Clause#getFilterarray <em>Filterarray</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Clause#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getClause_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Clause#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getClause_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Clause#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Filterarray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filterarray</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filterarray</em>' containment reference.
	 * @see #setFilterarray(Array)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getClause_Filterarray()
	 * @model containment="true"
	 * @generated
	 */
	Array getFilterarray();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Clause#getFilterarray <em>Filterarray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filterarray</em>' containment reference.
	 * @see #getFilterarray()
	 * @generated
	 */
	void setFilterarray(Array value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getClause_Constant()
	 * @model containment="true"
	 * @generated
	 */
	Value getConstant();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Clause#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Value value);

} // Clause
