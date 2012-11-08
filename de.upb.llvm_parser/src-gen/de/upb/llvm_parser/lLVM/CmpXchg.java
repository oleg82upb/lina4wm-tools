/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmp Xchg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.CmpXchg#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.CmpXchg#getCompare_val <em>Compare val</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.CmpXchg#getNew_val <em>New val</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.CmpXchg#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCmpXchg()
 * @model
 * @generated
 */
public interface CmpXchg extends Instruction
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
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCmpXchg_Adress()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getAdress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.CmpXchg#getAdress <em>Adress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adress</em>' containment reference.
   * @see #getAdress()
   * @generated
   */
  void setAdress(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Compare val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare val</em>' containment reference.
   * @see #setCompare_val(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCmpXchg_Compare_val()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getCompare_val();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.CmpXchg#getCompare_val <em>Compare val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare val</em>' containment reference.
   * @see #getCompare_val()
   * @generated
   */
  void setCompare_val(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>New val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New val</em>' containment reference.
   * @see #setNew_val(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCmpXchg_New_val()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getNew_val();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.CmpXchg#getNew_val <em>New val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New val</em>' containment reference.
   * @see #getNew_val()
   * @generated
   */
  void setNew_val(TypeAndValue value);

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
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCmpXchg_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.CmpXchg#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // CmpXchg
