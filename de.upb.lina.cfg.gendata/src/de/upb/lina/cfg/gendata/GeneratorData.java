/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.llvm_parser.llvm.LLVM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.GeneratorData#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.GeneratorData#getProgram <em>Program</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.GeneratorData#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.GeneratorData#getCfgs <em>Cfgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getGeneratorData()
 * @model
 * @generated
 */
public interface GeneratorData extends EObject
{
	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference.
	 * @see #setLocalVariables(LocalVariables)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getGeneratorData_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	LocalVariables getLocalVariables();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.GeneratorData#getLocalVariables <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Variables</em>' containment reference.
	 * @see #getLocalVariables()
	 * @generated
	 */
	void setLocalVariables(LocalVariables value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(LLVM)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getGeneratorData_Program()
	 * @model
	 * @generated
	 */
	LLVM getProgram();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.GeneratorData#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(LLVM value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.gendata.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getGeneratorData_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Cfgs</b></em>' reference list.
	 * The list contents are of type {@link de.upb.lina.cfg.controlflow.ControlFlowDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfgs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfgs</em>' reference list.
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getGeneratorData_Cfgs()
	 * @model required="true"
	 * @generated
	 */
	EList<ControlFlowDiagram> getCfgs();

} // GeneratorData
