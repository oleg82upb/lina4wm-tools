/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getCond <em>Cond</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Instruction {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Destination()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getDestination();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Cond()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getCond();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Label True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label True</em>' containment reference.
	 * @see #setLabelTrue(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelTrue()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getLabelTrue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label True</em>' containment reference.
	 * @see #getLabelTrue()
	 * @generated
	 */
	void setLabelTrue(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Label False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label False</em>' containment reference.
	 * @see #setLabelFalse(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelFalse()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getLabelFalse();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label False</em>' containment reference.
	 * @see #getLabelFalse()
	 * @generated
	 */
	void setLabelFalse(TypeAndValue value);

} // Branch
