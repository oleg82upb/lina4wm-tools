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
			ControlflowFactory theControlflowFactory = (ControlflowFactory)EPackage.Registry.INSTANCE.getEFactory(ControlflowPackage.eNS_URI);
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
			case ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION: return createWriteDefChainTransition();
			case ControlflowPackage.EARLY_READ_TRANSITION: return createEarlyReadTransition();
			case ControlflowPackage.GUARDED_TRANSITION: return createGuardedTransition();
			case ControlflowPackage.MULTI_TRANSITION: return createMultiTransition();
			case ControlflowPackage.FLUSH_TRANSITION: return createFlushTransition();
			case ControlflowPackage.ADDRESS_VALUE_PAIR: return createAddressValuePair();
			case ControlflowPackage.STORE_BUFFER: return createStoreBuffer();
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
	public WriteDefChainTransition createWriteDefChainTransition() {
		WriteDefChainTransitionImpl writeDefChainTransition = new WriteDefChainTransitionImpl();
		return writeDefChainTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyReadTransition createEarlyReadTransition() {
		EarlyReadTransitionImpl earlyReadTransition = new EarlyReadTransitionImpl();
		return earlyReadTransition;
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
	public MultiTransition createMultiTransition() {
		MultiTransitionImpl multiTransition = new MultiTransitionImpl();
		return multiTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlushTransition createFlushTransition() {
		FlushTransitionImpl flushTransition = new FlushTransitionImpl();
		return flushTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressValuePair createAddressValuePair() {
		AddressValuePairImpl addressValuePair = new AddressValuePairImpl();
		return addressValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreBuffer createStoreBuffer() {
		StoreBufferImpl storeBuffer = new StoreBufferImpl();
		return storeBuffer;
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
