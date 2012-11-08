/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.Switch#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Switch#getDefault <em>Default</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Switch#getJTable <em>JTable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Instruction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getSwitch_Value()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Switch#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getSwitch_Default()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getDefault();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Switch#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>JTable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>JTable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>JTable</em>' containment reference.
   * @see #setJTable(JumpTable)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getSwitch_JTable()
   * @model containment="true"
   * @generated
   */
  JumpTable getJTable();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Switch#getJTable <em>JTable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>JTable</em>' containment reference.
   * @see #getJTable()
   * @generated
   */
  void setJTable(JumpTable value);

} // Switch
