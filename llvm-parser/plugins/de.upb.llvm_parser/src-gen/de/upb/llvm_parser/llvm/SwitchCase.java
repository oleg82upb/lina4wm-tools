/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.SwitchCase#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.SwitchCase#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitchCase()
 * @model
 * @generated
 */
public interface SwitchCase extends EObject
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitchCase_CaseValue()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getCaseValue();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.SwitchCase#getCaseValue <em>Case Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Value</em>' containment reference.
	 * @see #getCaseValue()
	 * @generated
	 */
  void setCaseValue(Parameter value);

  /**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getSwitchCase_Destination()
	 * @model
	 * @generated
	 */
  String getDestination();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.SwitchCase#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
  void setDestination(String value);

} // SwitchCase
