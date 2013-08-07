/**
 */
package de.upb.llvm_parser.llvm;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends StandartInstruction
{
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Adresstype()
   * @model containment="true"
   * @generated
   */
  TypeUse getAdresstype();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getAdresstype <em>Adresstype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adresstype</em>' containment reference.
   * @see #getAdresstype()
   * @generated
   */
  void setAdresstype(TypeUse value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Types()
   * @model containment="true"
   * @generated
   */
  TypeList getTypes();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getTypes <em>Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Types</em>' containment reference.
   * @see #getTypes()
   * @generated
   */
  void setTypes(TypeList value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Adress()
   * @model containment="true"
   * @generated
   */
  Value getAdress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getAdress <em>Adress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adress</em>' containment reference.
   * @see #getAdress()
   * @generated
   */
  void setAdress(Value value);

  /**
   * Returns the value of the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' attribute.
   * @see #setOrdering(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(BigDecimal)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Index()
   * @model
   * @generated
   */
  BigDecimal getIndex();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(BigDecimal value);

} // Load
