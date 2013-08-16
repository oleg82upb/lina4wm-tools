/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extract Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractValue#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractValue#getAggerate <em>Aggerate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractValue#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue()
 * @model
 * @generated
 */
public interface ExtractValue extends Instruction
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractValue#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue_Aggerate()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getAggerate();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractValue#getAggerate <em>Aggerate</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggerate</em>' containment reference.
	 * @see #getAggerate()
	 * @generated
	 */
  void setAggerate(Parameter value);

  /**
	 * Returns the value of the '<em><b>Index</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue_Index()
	 * @model unique="false"
	 * @generated
	 */
  EList<BigDecimal> getIndex();

} // ExtractValue
