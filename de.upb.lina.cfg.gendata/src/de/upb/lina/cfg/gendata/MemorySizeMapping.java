/**
 */
package de.upb.lina.cfg.gendata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Size Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getOffset <em>Offset</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getGeneratorData <em>Generator Data</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getCompleteTypeSize <em>Complete Type Size</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getWarning <em>Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping()
 * @model
 * @generated
 */
public interface MemorySizeMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference.
	 * @see #setInstruction(EObject)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_Instruction()
	 * @model
	 * @generated
	 */
	EObject getInstruction();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(EObject value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Generator Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.gendata.GeneratorData#getMemorySizeMappings <em>Memory Size Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Data</em>' container reference.
	 * @see #setGeneratorData(GeneratorData)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_GeneratorData()
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getMemorySizeMappings
	 * @model opposite="memorySizeMappings" transient="false"
	 * @generated
	 */
	GeneratorData getGeneratorData();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getGeneratorData <em>Generator Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Data</em>' container reference.
	 * @see #getGeneratorData()
	 * @generated
	 */
	void setGeneratorData(GeneratorData value);

	/**
	 * Returns the value of the '<em><b>Complete Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Type Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Type Size</em>' attribute.
	 * @see #setCompleteTypeSize(int)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_CompleteTypeSize()
	 * @model
	 * @generated
	 */
	int getCompleteTypeSize();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getCompleteTypeSize <em>Complete Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Type Size</em>' attribute.
	 * @see #getCompleteTypeSize()
	 * @generated
	 */
	void setCompleteTypeSize(int value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' attribute.
	 * @see #setWarning(String)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_Warning()
	 * @model default=""
	 * @generated
	 */
	String getWarning();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getWarning <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' attribute.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(String value);

} // MemorySizeMapping
