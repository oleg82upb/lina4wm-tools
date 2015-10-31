/**
 */
package de.upb.lina.cfg.gendata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>old To New Cfg Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.oldToNewCfgNameMapping#getKey <em>Key</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.oldToNewCfgNameMapping#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getoldToNewCfgNameMapping()
 * @model
 * @generated
 */
public interface oldToNewCfgNameMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getoldToNewCfgNameMapping_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.oldToNewCfgNameMapping#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

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
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getoldToNewCfgNameMapping_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.oldToNewCfgNameMapping#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // oldToNewCfgNameMapping
