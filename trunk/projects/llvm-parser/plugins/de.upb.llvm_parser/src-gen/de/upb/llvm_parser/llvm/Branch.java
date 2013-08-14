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
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Instruction
{
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
