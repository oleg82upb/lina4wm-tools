/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.FunctionHeader#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.FunctionHeader#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.FunctionHeader#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getFunctionHeader()
 * @model
 * @generated
 */
public interface FunctionHeader extends MainLevelEntity
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getFunctionHeader_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.FunctionHeader#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(GlobalName)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getFunctionHeader_Name()
   * @model containment="true"
   * @generated
   */
  GlobalName getName();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.FunctionHeader#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(GlobalName value);

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
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getFunctionHeader_PList()
   * @model containment="true"
   * @generated
   */
  ParameterList getPList();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.FunctionHeader#getPList <em>PList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PList</em>' containment reference.
   * @see #getPList()
   * @generated
   */
  void setPList(ParameterList value);

} // FunctionHeader
