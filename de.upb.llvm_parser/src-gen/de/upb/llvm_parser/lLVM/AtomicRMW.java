/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic RMW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.AtomicRMW#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.AtomicRMW#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.AtomicRMW#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAtomicRMW()
 * @model
 * @generated
 */
public interface AtomicRMW extends Instruction
{
  /**
   * Returns the value of the '<em><b>Adress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adress</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adress</em>' containment reference.
   * @see #setAdress(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAtomicRMW_Adress()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getAdress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.AtomicRMW#getAdress <em>Adress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adress</em>' containment reference.
   * @see #getAdress()
   * @generated
   */
  void setAdress(TypeAndValue value);

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
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAtomicRMW_Value()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.AtomicRMW#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' attribute.
   * @see #setOrdering(String)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAtomicRMW_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.AtomicRMW#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // AtomicRMW
