/**
 */
package de.upb.lina.cfg.controlflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage
 * @generated
 */
public interface ControlflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlflowFactory eINSTANCE = de.upb.lina.cfg.controlflow.impl.ControlflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control Flow Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Diagram</em>'.
	 * @generated
	 */
	ControlFlowDiagram createControlFlowDiagram();

	/**
	 * Returns a new object of class '<em>Control Flow Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Location</em>'.
	 * @generated
	 */
	ControlFlowLocation createControlFlowLocation();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Guarded Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded Transition</em>'.
	 * @generated
	 */
	GuardedTransition createGuardedTransition();

	/**
	 * Returns a new object of class '<em>Multi Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Transition</em>'.
	 * @generated
	 */
	MultiTransition createMultiTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControlflowPackage getControlflowPackage();

} //ControlflowFactory
