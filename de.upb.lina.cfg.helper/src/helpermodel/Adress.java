/**
 */
package helpermodel;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

import de.upb.llvm_parser.llvm.LLVM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link helpermodel.Adress#getAst <em>Ast</em>}</li>
 *   <li>{@link helpermodel.Adress#getCfg <em>Cfg</em>}</li>
 * </ul>
 * </p>
 *
 * @see helpermodel.HelpermodelPackage#getAdress()
 * @model
 * @generated
 */
public interface Adress extends EObject {
	/**
	 * Returns the value of the '<em><b>Ast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ast</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ast</em>' containment reference.
	 * @see #setAst(LLVM)
	 * @see helpermodel.HelpermodelPackage#getAdress_Ast()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LLVM getAst();

	/**
	 * Sets the value of the '{@link helpermodel.Adress#getAst <em>Ast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ast</em>' containment reference.
	 * @see #getAst()
	 * @generated
	 */
	void setAst(LLVM value);

	/**
	 * Returns the value of the '<em><b>Cfg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfg</em>' containment reference.
	 * @see #setCfg(ControlFlowDiagram)
	 * @see helpermodel.HelpermodelPackage#getAdress_Cfg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlFlowDiagram getCfg();

	/**
	 * Sets the value of the '{@link helpermodel.Adress#getCfg <em>Cfg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfg</em>' containment reference.
	 * @see #getCfg()
	 * @generated
	 */
	void setCfg(ControlFlowDiagram value);

} // Adress
