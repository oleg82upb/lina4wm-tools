/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getCastfrom <em>Castfrom</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getCaststruct <em>Caststruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getDual <em>Dual</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getOp <em>Op</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getGlobal <em>Global</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getCastto <em>Castto</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast()
 * @model
 * @generated
 */
public interface Cast extends Instruction {
	/**
	 * Returns the value of the '<em><b>Castfrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castfrom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castfrom</em>' attribute.
	 * @see #setCastfrom(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Castfrom()
	 * @model
	 * @generated
	 */
	String getCastfrom();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getCastfrom <em>Castfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castfrom</em>' attribute.
	 * @see #getCastfrom()
	 * @generated
	 */
	void setCastfrom(String value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeList> getTypes();

	/**
	 * Returns the value of the '<em><b>Caststruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caststruct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caststruct</em>' containment reference.
	 * @see #setCaststruct(Structure)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Caststruct()
	 * @model containment="true"
	 * @generated
	 */
	Structure getCaststruct();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getCaststruct <em>Caststruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caststruct</em>' containment reference.
	 * @see #getCaststruct()
	 * @generated
	 */
	void setCaststruct(Structure value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Dual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dual</em>' attribute.
	 * @see #setDual(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Dual()
	 * @model
	 * @generated
	 */
	String getDual();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getDual <em>Dual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dual</em>' attribute.
	 * @see #getDual()
	 * @generated
	 */
	void setDual(String value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(GetElementPtr)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Op()
	 * @model containment="true"
	 * @generated
	 */
	GetElementPtr getOp();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(GetElementPtr value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Global()
	 * @model
	 * @generated
	 */
	String getGlobal();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(String value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Castto()
	 * @model
	 * @generated
	 */
	String getCastto();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getCastto <em>Castto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castto</em>' attribute.
	 * @see #getCastto()
	 * @generated
	 */
	void setCastto(String value);

} // Cast
