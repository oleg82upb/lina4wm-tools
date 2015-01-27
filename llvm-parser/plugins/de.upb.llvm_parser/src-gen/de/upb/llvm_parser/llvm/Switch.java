/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getDefaultCase <em>Default Case</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Switch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Instruction
{
  /**
   * Returns the value of the '<em><b>Case Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Value</em>' containment reference.
   * @see #setCaseValue(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_CaseValue()
   * @model containment="true"
   * @generated
   */
  Parameter getCaseValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getCaseValue <em>Case Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Value</em>' containment reference.
   * @see #getCaseValue()
   * @generated
   */
  void setCaseValue(Parameter value);

  /**
   * Returns the value of the '<em><b>Default Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Case</em>' attribute.
   * @see #setDefaultCase(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_DefaultCase()
   * @model
   * @generated
   */
  String getDefaultCase();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Switch#getDefaultCase <em>Default Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Case</em>' attribute.
   * @see #getDefaultCase()
   * @generated
   */
  void setDefaultCase(String value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.SwitchCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitch_Cases()
   * @model containment="true"
   * @generated
   */
  EList<SwitchCase> getCases();

} // Switch
