/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.lina.cfg.controlflow.Transition;

import de.upb.llvm_parser.llvm.Phi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phi Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.PhiMapping#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.PhiMapping#getPhi <em>Phi</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.PhiMapping#getBlockLabelToUse <em>Block Label To Use</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.PhiMapping#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getPhiMapping()
 * @model
 * @generated
 */
public interface PhiMapping extends EObject {
	/**
    * Returns the value of the '<em><b>Transition</b></em>' reference.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Transition</em>' reference.
    * @see #setTransition(Transition)
    * @see de.upb.lina.cfg.gendata.GendataPackage#getPhiMapping_Transition()
    * @model
    * @generated
    */
	Transition getTransition();

	/**
    * Sets the value of the '{@link de.upb.lina.cfg.gendata.PhiMapping#getTransition <em>Transition</em>}' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Transition</em>' reference.
    * @see #getTransition()
    * @generated
    */
	void setTransition(Transition value);

	/**
    * Returns the value of the '<em><b>Phi</b></em>' reference list.
    * The list contents are of type {@link de.upb.llvm_parser.llvm.Phi}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Phi</em>' reference list.
    * @see de.upb.lina.cfg.gendata.GendataPackage#getPhiMapping_Phi()
    * @model
    * @generated
    */
	EList<Phi> getPhi();

	/**
    * Returns the value of the '<em><b>Block Label To Use</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Label To Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Block Label To Use</em>' attribute.
    * @see #setBlockLabelToUse(String)
    * @see de.upb.lina.cfg.gendata.GendataPackage#getPhiMapping_BlockLabelToUse()
    * @model
    * @generated
    */
	String getBlockLabelToUse();

	/**
    * Sets the value of the '{@link de.upb.lina.cfg.gendata.PhiMapping#getBlockLabelToUse <em>Block Label To Use</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Block Label To Use</em>' attribute.
    * @see #getBlockLabelToUse()
    * @generated
    */
	void setBlockLabelToUse(String value);

	/**
    * Returns the value of the '<em><b>Generator Data</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.gendata.GeneratorData#getPhiMappings <em>Phi Mappings</em>}'.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Generator Data</em>' container reference.
    * @see #setGeneratorData(GeneratorData)
    * @see de.upb.lina.cfg.gendata.GendataPackage#getPhiMapping_GeneratorData()
    * @see de.upb.lina.cfg.gendata.GeneratorData#getPhiMappings
    * @model opposite="phiMappings" transient="false"
    * @generated
    */
	GeneratorData getGeneratorData();

	/**
    * Sets the value of the '{@link de.upb.lina.cfg.gendata.PhiMapping#getGeneratorData <em>Generator Data</em>}' container reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Generator Data</em>' container reference.
    * @see #getGeneratorData()
    * @generated
    */
	void setGeneratorData(GeneratorData value);

} // PhiMapping
