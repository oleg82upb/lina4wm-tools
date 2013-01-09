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
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityfunction <em>Personalityfunction</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getCastto <em>Castto</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad()
 * @model
 * @generated
 */
public interface LandingPad extends Instruction {
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
	 * Returns the value of the '<em><b>Personalitytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personalitytype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personalitytype</em>' attribute.
	 * @see #setPersonalitytype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Personalitytype()
	 * @model
	 * @generated
	 */
	String getPersonalitytype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype <em>Personalitytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personalitytype</em>' attribute.
	 * @see #getPersonalitytype()
	 * @generated
	 */
	void setPersonalitytype(String value);

	/**
	 * Returns the value of the '<em><b>Personalityvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personalityvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personalityvalue</em>' attribute.
	 * @see #setPersonalityvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Personalityvalue()
	 * @model
	 * @generated
	 */
	String getPersonalityvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue <em>Personalityvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personalityvalue</em>' attribute.
	 * @see #getPersonalityvalue()
	 * @generated
	 */
	void setPersonalityvalue(String value);

	/**
	 * Returns the value of the '<em><b>Personalityfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personalityfunction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personalityfunction</em>' attribute.
	 * @see #setPersonalityfunction(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Personalityfunction()
	 * @model
	 * @generated
	 */
	String getPersonalityfunction();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityfunction <em>Personalityfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personalityfunction</em>' attribute.
	 * @see #getPersonalityfunction()
	 * @generated
	 */
	void setPersonalityfunction(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Castto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castto</em>' attribute.
	 * @see #setCastto(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Castto()
	 * @model
	 * @generated
	 */
	String getCastto();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getCastto <em>Castto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castto</em>' attribute.
	 * @see #getCastto()
	 * @generated
	 */
	void setCastto(String value);

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
