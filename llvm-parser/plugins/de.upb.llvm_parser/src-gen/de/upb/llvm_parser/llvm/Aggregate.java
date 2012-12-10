/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Aggregate#getAgg <em>Agg</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAggregate()
 * @model
 * @generated
 */
public interface Aggregate extends EObject {
	/**
	 * Returns the value of the '<em><b>Agg</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agg</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agg</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAggregate_Agg()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAgg();

} // Aggregate
