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
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getPersonality <em>Personality</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getClause <em>Clause</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype <em>Personalitytype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityfunction <em>Personalityfunction</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.LandingPad#getCastto <em>Castto</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad()
 * @model
 * @generated
 */
public interface LandingPad extends Instruction
{
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Personality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Personality</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Personality</em>' containment reference.
   * @see #setPersonality(TypeAndValue)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLandingPad_Personality()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getPersonality();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonality <em>Personality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Personality</em>' containment reference.
   * @see #getPersonality()
   * @generated
   */
  void setPersonality(TypeAndValue value);

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

} // LandingPad
