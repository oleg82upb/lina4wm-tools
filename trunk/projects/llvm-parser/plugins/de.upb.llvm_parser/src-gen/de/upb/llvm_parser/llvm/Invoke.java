/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getUnwindTargetLabel <em>Unwind Target Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Instruction
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypeUse)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypeUse getReturnType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypeUse value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Address)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Name()
   * @model containment="true"
   * @generated
   */
  Address getName();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Address value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_PList()
   * @model containment="true"
   * @generated
   */
  ParameterList getPList();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PList</em>' containment reference.
   * @see #getPList()
   * @generated
   */
  void setPList(ParameterList value);

  /**
   * Returns the value of the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Label</em>' attribute.
   * @see #setTargetLabel(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_TargetLabel()
   * @model
   * @generated
   */
  String getTargetLabel();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getTargetLabel <em>Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Label</em>' attribute.
   * @see #getTargetLabel()
   * @generated
   */
  void setTargetLabel(String value);

  /**
   * Returns the value of the '<em><b>Unwind Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unwind Target Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unwind Target Label</em>' attribute.
   * @see #setUnwindTargetLabel(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_UnwindTargetLabel()
   * @model
   * @generated
   */
  String getUnwindTargetLabel();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindTargetLabel <em>Unwind Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unwind Target Label</em>' attribute.
   * @see #getUnwindTargetLabel()
   * @generated
   */
  void setUnwindTargetLabel(String value);

} // Invoke
