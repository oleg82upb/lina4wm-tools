/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.Invoke#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Invoke#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Invoke#getTo <em>To</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Invoke#getUnwind <em>Unwind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Instruction
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getInvoke_Function()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getFunction();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Invoke#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PList</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PList</em>' containment reference.
   * @see #setPList(ParameterList)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getInvoke_PList()
   * @model containment="true"
   * @generated
   */
  ParameterList getPList();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Invoke#getPList <em>PList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PList</em>' containment reference.
   * @see #getPList()
   * @generated
   */
  void setPList(ParameterList value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getInvoke_To()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getTo();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Invoke#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Unwind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unwind</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unwind</em>' containment reference.
   * @see #setUnwind(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getInvoke_Unwind()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getUnwind();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Invoke#getUnwind <em>Unwind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unwind</em>' containment reference.
   * @see #getUnwind()
   * @generated
   */
  void setUnwind(TypeAndValue value);

} // Invoke
