/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionParameterList#getParams <em>Params</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionParameterList#isIsNumberOfParametersUnknown <em>Is Number Of Parameters Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionParameterList()
 * @model
 * @generated
 */
public interface FunctionParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.FunctionParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionParameterList_Params()
   * @model containment="true"
   * @generated
   */
  EList<FunctionParameter> getParams();

  /**
   * Returns the value of the '<em><b>Is Number Of Parameters Unknown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Number Of Parameters Unknown</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Number Of Parameters Unknown</em>' attribute.
   * @see #setIsNumberOfParametersUnknown(boolean)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionParameterList_IsNumberOfParametersUnknown()
   * @model
   * @generated
   */
  boolean isIsNumberOfParametersUnknown();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionParameterList#isIsNumberOfParametersUnknown <em>Is Number Of Parameters Unknown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Number Of Parameters Unknown</em>' attribute.
   * @see #isIsNumberOfParametersUnknown()
   * @generated
   */
  void setIsNumberOfParametersUnknown(boolean value);

} // FunctionParameterList
