/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getLabeltype <em>Labeltype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch()
 * @model
 * @generated
 */
public interface IndirectBranch extends Ret_Instr {
	/**
	 * Returns the value of the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresstype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresstype</em>' containment reference.
	 * @see #setAdresstype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Adresstype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype <em>Adresstype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresstype</em>' containment reference.
	 * @see #getAdresstype()
	 * @generated
	 */
	void setAdresstype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' containment reference.
	 * @see #setAdress(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Adress()
	 * @model containment="true"
	 * @generated
	 */
	Value getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdress <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' containment reference.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(Value value);

	/**
	 * Returns the value of the '<em><b>Labeltype</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labeltype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeltype</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Labeltype()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeUse> getLabeltype();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getLabels();

} // IndirectBranch
