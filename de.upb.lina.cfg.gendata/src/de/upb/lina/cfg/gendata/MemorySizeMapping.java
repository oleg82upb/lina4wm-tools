/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.llvm_parser.llvm.Instruction;
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
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getSize <em>Size</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getGeneratorData <em>Generator Data</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getCompleteTypeSize <em>Complete Type Size</em>}</li>
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
	 * @see #setInstruction(Instruction)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_Instruction()
	 * @model
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getMemorySizeMapping_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

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

} // MemorySizeMapping
