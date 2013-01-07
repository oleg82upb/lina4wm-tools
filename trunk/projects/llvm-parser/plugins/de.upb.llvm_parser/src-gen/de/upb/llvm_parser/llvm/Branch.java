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
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getDestinationtype <em>Destinationtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getCondtype <em>Condtype</em>}</li>
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
public interface Branch extends Ret_Instr {
	/**
	 * Returns the value of the '<em><b>Destinationtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinationtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinationtype</em>' attribute.
	 * @see #setDestinationtype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Destinationtype()
	 * @model
	 * @generated
	 */
	String getDestinationtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getDestinationtype <em>Destinationtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destinationtype</em>' attribute.
	 * @see #getDestinationtype()
	 * @generated
	 */
	void setDestinationtype(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Destination()
	 * @model
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Condtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condtype</em>' attribute.
	 * @see #setCondtype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Condtype()
	 * @model
	 * @generated
	 */
	String getCondtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getCondtype <em>Condtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condtype</em>' attribute.
	 * @see #getCondtype()
	 * @generated
	 */
	void setCondtype(String value);

	/**
	 * Returns the value of the '<em><b>Condvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condvalue</em>' attribute.
	 * @see #setCondvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Condvalue()
	 * @model
	 * @generated
	 */
	String getCondvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getCondvalue <em>Condvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condvalue</em>' attribute.
	 * @see #getCondvalue()
	 * @generated
	 */
	void setCondvalue(String value);

	/**
	 * Returns the value of the '<em><b>Label Truetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Truetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Truetype</em>' attribute.
	 * @see #setLabelTruetype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelTruetype()
	 * @model
	 * @generated
	 */
	String getLabelTruetype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelTruetype <em>Label Truetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Truetype</em>' attribute.
	 * @see #getLabelTruetype()
	 * @generated
	 */
	void setLabelTruetype(String value);

	/**
	 * Returns the value of the '<em><b>Label True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label True</em>' attribute.
	 * @see #setLabelTrue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelTrue()
	 * @model
	 * @generated
	 */
	String getLabelTrue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label True</em>' attribute.
	 * @see #getLabelTrue()
	 * @generated
	 */
	void setLabelTrue(String value);

	/**
	 * Returns the value of the '<em><b>Label Falsetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Falsetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Falsetype</em>' attribute.
	 * @see #setLabelFalsetype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelFalsetype()
	 * @model
	 * @generated
	 */
	String getLabelFalsetype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalsetype <em>Label Falsetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Falsetype</em>' attribute.
	 * @see #getLabelFalsetype()
	 * @generated
	 */
	void setLabelFalsetype(String value);

	/**
	 * Returns the value of the '<em><b>Label False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label False</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label False</em>' attribute.
	 * @see #setLabelFalse(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_LabelFalse()
	 * @model
	 * @generated
	 */
	String getLabelFalse();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label False</em>' attribute.
	 * @see #getLabelFalse()
	 * @generated
	 */
	void setLabelFalse(String value);

} // Branch
