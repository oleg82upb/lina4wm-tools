/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GlobalDefinition#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GlobalDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGlobalDefinition()
 * @model
 * @generated
 */
public interface GlobalDefinition extends MainLevelEntity
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
	 * @see #setAdress(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGlobalDefinition_Adress()
	 * @model containment="true"
	 * @generated
	 */
  Address getAdress();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAdress <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' containment reference.
	 * @see #getAdress()
	 * @generated
	 */
  void setAdress(Address value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(EObject)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGlobalDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
  EObject getType();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
  void setType(EObject value);

  /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(EObject)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGlobalDefinition_Value()
	 * @model containment="true"
	 * @generated
	 */
  EObject getValue();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(EObject value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGlobalDefinition_Align()
	 * @model
	 * @generated
	 */
  BigDecimal getAlign();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
  void setAlign(BigDecimal value);

} // GlobalDefinition
