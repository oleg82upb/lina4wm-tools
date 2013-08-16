/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getAggerate <em>Aggerate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getIndTypes <em>Ind Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getIndizies <em>Indizies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr()
 * @model
 * @generated
 */
public interface NestedGetElementPtr extends Value
{
  /**
	 * Returns the value of the '<em><b>Aggerate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggerate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggerate</em>' containment reference.
	 * @see #setAggerate(Parameter)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr_Aggerate()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getAggerate();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getAggerate <em>Aggerate</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggerate</em>' containment reference.
	 * @see #getAggerate()
	 * @generated
	 */
  void setAggerate(Parameter value);

  /**
	 * Returns the value of the '<em><b>Ind Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ind Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ind Types</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr_IndTypes()
	 * @model containment="true"
	 * @generated
	 */
  EList<TypeUse> getIndTypes();

  /**
	 * Returns the value of the '<em><b>Indizies</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indizies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Indizies</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getNestedGetElementPtr_Indizies()
	 * @model containment="true"
	 * @generated
	 */
  EList<Value> getIndizies();

} // NestedGetElementPtr
