/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype <em>Personalitytype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue <em>Personalityvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad()
 * @model
 * @generated
 */
public interface LandingPad extends Std_Instr {
	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(Structure)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Struct()
	 * @model containment="true"
	 * @generated
	 */
	Structure getStruct();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Structure value);

	/**
	 * Returns the value of the '<em><b>Personalitytype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personalitytype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personalitytype</em>' containment reference.
	 * @see #setPersonalitytype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Personalitytype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getPersonalitytype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype <em>Personalitytype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personalitytype</em>' containment reference.
	 * @see #getPersonalitytype()
	 * @generated
	 */
	void setPersonalitytype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Personalityvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personalityvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personalityvalue</em>' containment reference.
	 * @see #setPersonalityvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Personalityvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getPersonalityvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue <em>Personalityvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personalityvalue</em>' containment reference.
	 * @see #getPersonalityvalue()
	 * @generated
	 */
	void setPersonalityvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Clause()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getClause();

} // LandingPad
