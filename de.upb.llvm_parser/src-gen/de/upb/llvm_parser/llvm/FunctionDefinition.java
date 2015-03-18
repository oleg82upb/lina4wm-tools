/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionDefinition#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionDefinition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionDefinition#getAlign <em>Align</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.FunctionDefinition#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends MainLevelEntity
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionDefinition_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypeUse getReturnType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypeUse value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(Address)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionDefinition_Address()
   * @model containment="true"
   * @generated
   */
  Address getAddress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Address value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(FunctionParameterList)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionDefinition_Parameter()
   * @model containment="true"
   * @generated
   */
  FunctionParameterList getParameter();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(FunctionParameterList value);

  /**
   * Returns the value of the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align</em>' attribute.
   * @see #setAlign(BigDecimal)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionDefinition_Align()
   * @model
   * @generated
   */
  BigDecimal getAlign();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getAlign <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align</em>' attribute.
   * @see #getAlign()
   * @generated
   */
  void setAlign(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(FunctionBody)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getFunctionDefinition_Body()
   * @model containment="true"
   * @generated
   */
  FunctionBody getBody();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(FunctionBody value);

} // FunctionDefinition
