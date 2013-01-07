/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Alias#getAliastype <em>Aliastype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alias#getAliasvalue <em>Aliasvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alias#getAliasee <em>Aliasee</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlias()
 * @model
 * @generated
 */
public interface Alias extends EObject {
	/**
	 * Returns the value of the '<em><b>Aliastype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliastype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliastype</em>' attribute.
	 * @see #setAliastype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlias_Aliastype()
	 * @model
	 * @generated
	 */
	String getAliastype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alias#getAliastype <em>Aliastype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliastype</em>' attribute.
	 * @see #getAliastype()
	 * @generated
	 */
	void setAliastype(String value);

	/**
	 * Returns the value of the '<em><b>Aliasvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliasvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliasvalue</em>' attribute.
	 * @see #setAliasvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlias_Aliasvalue()
	 * @model
	 * @generated
	 */
	String getAliasvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alias#getAliasvalue <em>Aliasvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliasvalue</em>' attribute.
	 * @see #getAliasvalue()
	 * @generated
	 */
	void setAliasvalue(String value);

	/**
	 * Returns the value of the '<em><b>Aliasee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliasee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliasee</em>' attribute.
	 * @see #setAliasee(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlias_Aliasee()
	 * @model
	 * @generated
	 */
	String getAliasee();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alias#getAliasee <em>Aliasee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliasee</em>' attribute.
	 * @see #getAliasee()
	 * @generated
	 */
	void setAliasee(String value);

} // Alias
