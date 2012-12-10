/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extract Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractValue#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractValue#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractValue#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue()
 * @model
 * @generated
 */
public interface ExtractValue extends Instruction {
	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference.
	 * @see #setAggregate(Aggregate)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue_Aggregate()
	 * @model containment="true"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractValue#getAggregate <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' containment reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractValue_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
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
	EList<Integer> getIndex();

} // ExtractValue
