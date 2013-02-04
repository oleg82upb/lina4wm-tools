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
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementarray <em>Elementarray</em>}</li>
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
	 * Returns the value of the '<em><b>Elementtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementtype</em>' containment reference.
	 * @see #setElementtype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Elementtype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getElementtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementtype <em>Elementtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementtype</em>' containment reference.
	 * @see #getElementtype()
	 * @generated
	 */
	void setElementtype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(TypeList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Types()
	 * @model containment="true"
	 * @generated
	 */
	TypeList getTypes();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(TypeList value);

	/**
	 * Returns the value of the '<em><b>Elementarray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementarray</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementarray</em>' containment reference.
	 * @see #setElementarray(Array)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Elementarray()
	 * @model containment="true"
	 * @generated
	 */
	Array getElementarray();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementarray <em>Elementarray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementarray</em>' containment reference.
	 * @see #getElementarray()
	 * @generated
	 */
	void setElementarray(Array value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Element()
	 * @model containment="true"
	 * @generated
	 */
	Value getElement();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Value value);

	/**
	 * Returns the value of the '<em><b>Indicetypes</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicetypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicetypes</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Indicetypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeUse> getIndicetypes();

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getGetElementPtr_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getIndices();

} // GetElementPtr
