/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowFactoryImpl extends EFactoryImpl implements ControlflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlflowFactory init() {
		try {
			ControlflowFactory theControlflowFactory = (ControlflowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upb.de/lina/cfg/controlflow"); 
			if (theControlflowFactory != null) {
				return theControlflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM: return createControlFlowDiagram();
			case ControlflowPackage.CONTROL_FLOW_LOCATION: return createControlFlowLocation();
			case ControlflowPackage.TRANSITION: return createTransition();
			case ControlflowPackage.GUARDED_TRANSITION: return createGuardedTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram createControlFlowDiagram() {
		ControlFlowDiagramImpl controlFlowDiagram = new ControlFlowDiagramImpl();
		return controlFlowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation createControlFlowLocation() {
		ControlFlowLocationImpl controlFlowLocation = new ControlFlowLocationImpl();
		return controlFlowLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedTransition createGuardedTransition() {
		GuardedTransitionImpl guardedTransition = new GuardedTransitionImpl();
		return guardedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowPackage getControlflowPackage() {
		return (ControlflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControlflowPackage getPackage() {
		return ControlflowPackage.eINSTANCE;
	}

} //ControlflowFactoryImpl
