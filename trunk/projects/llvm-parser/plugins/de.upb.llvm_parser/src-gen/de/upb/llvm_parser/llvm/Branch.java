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
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getCondvalue <em>Condvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelTruetype <em>Label Truetype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelFalsetype <em>Label Falsetype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends ReturnInstruction {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Destination()
	 * @model containment="true"
	 * @generated
	 */
	Value getDestination();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Value value);

	/**
	 * Returns the value of the '<em><b>Condvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condvalue</em>' containment reference.
	 * @see #setCondvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Condvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getCondvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getCondvalue <em>Condvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condvalue</em>' containment reference.
	 * @see #getCondvalue()
	 * @generated
	 */
	void setCondvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Label Truetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Truetype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Truetype</em>' containment reference.
	 * @see #setLabelTruetype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelTruetype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getLabelTruetype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelTruetype <em>Label Truetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Truetype</em>' containment reference.
	 * @see #getLabelTruetype()
	 * @generated
	 */
	void setLabelTruetype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Label True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label True</em>' containment reference.
	 * @see #setLabelTrue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelTrue()
	 * @model containment="true"
	 * @generated
	 */
	Value getLabelTrue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label True</em>' containment reference.
	 * @see #getLabelTrue()
	 * @generated
	 */
	void setLabelTrue(Value value);

	/**
	 * Returns the value of the '<em><b>Label Falsetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Falsetype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Falsetype</em>' containment reference.
	 * @see #setLabelFalsetype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelFalsetype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getLabelFalsetype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalsetype <em>Label Falsetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Falsetype</em>' containment reference.
	 * @see #getLabelFalsetype()
	 * @generated
	 */
	void setLabelFalsetype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Label False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label False</em>' containment reference.
	 * @see #setLabelFalse(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelFalse()
	 * @model containment="true"
	 * @generated
	 */
	Value getLabelFalse();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label False</em>' containment reference.
	 * @see #getLabelFalse()
	 * @generated
	 */
	void setLabelFalse(Value value);

} // Branch
