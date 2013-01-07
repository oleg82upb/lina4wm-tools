/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementtype <em>Elementtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getElement <em>Element</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndicetypes <em>Indicetypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr()
 * @model
 * @generated
 */
public interface GetElementPtr extends Instruction {
	/**
	 * Returns the value of the '<em><b>Elementtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementtype</em>' attribute.
	 * @see #setElementtype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Elementtype()
	 * @model
	 * @generated
	 */
	String getElementtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementtype <em>Elementtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementtype</em>' attribute.
	 * @see #getElementtype()
	 * @generated
	 */
	void setElementtype(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Element()
	 * @model
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

	/**
	 * Returns the value of the '<em><b>Indicetypes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicetypes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicetypes</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Indicetypes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndicetypes();

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Indices()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndices();

} // GetElementPtr
