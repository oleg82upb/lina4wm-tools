/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getNewvalue <em>Newvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Store#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Std_Instr {
	/**
	 * Returns the value of the '<em><b>Newtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newtype</em>' containment reference.
	 * @see #setNewtype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Newtype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getNewtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getNewtype <em>Newtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newtype</em>' containment reference.
	 * @see #getNewtype()
	 * @generated
	 */
	void setNewtype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.TypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeList> getTypes();

	/**
	 * Returns the value of the '<em><b>Newvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newvalue</em>' containment reference.
	 * @see #setNewvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Newvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getNewvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getNewvalue <em>Newvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newvalue</em>' containment reference.
	 * @see #getNewvalue()
	 * @generated
	 */
	void setNewvalue(Value value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Adresstype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getAdresstype <em>Adresstype</em>}' containment reference.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Adress()
	 * @model containment="true"
	 * @generated
	 */
	Value getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getAdress <em>Adress</em>}' containment reference.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Ordering()
	 * @model
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getOrdering <em>Ordering</em>}' attribute.
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
	 * @see #setIndex(int)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStore_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Store#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // Store
