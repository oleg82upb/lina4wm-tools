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
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Branch#getElseDestination <em>Else Destination</em>}</li>
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
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Value)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_Condition()
   * @model containment="true"
   * @generated
   */
  Value getCondition();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Value value);

  /**
   * Returns the value of the '<em><b>Else Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Destination</em>' attribute.
   * @see #setElseDestination(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getBranch_ElseDestination()
   * @model
   * @generated
   */
  String getElseDestination();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Branch#getElseDestination <em>Else Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Destination</em>' attribute.
   * @see #getElseDestination()
   * @generated
   */
  void setElseDestination(String value);

} // Branch
