/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getAggregatename <em>Aggregatename</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndTypes <em>Ind Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndizies <em>Indizies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr()
 * @model
 * @generated
 */
public interface GetElementPtr extends Instruction
{
  /**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

  /**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference.
	 * @see #setAggregate(EObject)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Aggregate()
	 * @model containment="true"
	 * @generated
	 */
  EObject getAggregate();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getAggregate <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' containment reference.
	 * @see #getAggregate()
	 * @generated
	 */
  void setAggregate(EObject value);

  /**
	 * Returns the value of the '<em><b>Aggregatename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregatename</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregatename</em>' containment reference.
	 * @see #setAggregatename(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Aggregatename()
	 * @model containment="true"
	 * @generated
	 */
  Value getAggregatename();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getAggregatename <em>Aggregatename</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregatename</em>' containment reference.
	 * @see #getAggregatename()
	 * @generated
	 */
  void setAggregatename(Value value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_IndTypes()
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Indizies()
	 * @model containment="true"
	 * @generated
	 */
  EList<Value> getIndizies();

} // GetElementPtr
