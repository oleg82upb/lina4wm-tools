/**
 */
package de.upb.lina.cfg.controlflow.util;

import de.upb.lina.cfg.controlflow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage
 * @generated
 */
public class ControlflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ControlflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlflowSwitch<Adapter> modelSwitch =
		new ControlflowSwitch<Adapter>() {
			@Override
			public Adapter caseControlFlowDiagram(ControlFlowDiagram object) {
				return createControlFlowDiagramAdapter();
			}
			@Override
			public Adapter caseControlFlowLocation(ControlFlowLocation object) {
				return createControlFlowLocationAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseWriteDefChainTransition(WriteDefChainTransition object) {
				return createWriteDefChainTransitionAdapter();
			}
			@Override
			public Adapter caseEarlyReadTransition(EarlyReadTransition object) {
				return createEarlyReadTransitionAdapter();
			}
			@Override
			public Adapter caseGuardedTransition(GuardedTransition object) {
				return createGuardedTransitionAdapter();
			}
			@Override
			public Adapter caseMultiTransition(MultiTransition object) {
				return createMultiTransitionAdapter();
			}
			@Override
			public Adapter caseFlushTransition(FlushTransition object) {
				return createFlushTransitionAdapter();
			}
			@Override
			public Adapter caseAddressValuePair(AddressValuePair object) {
				return createAddressValuePairAdapter();
			}
			@Override
			public Adapter caseStoreBuffer(StoreBuffer object) {
				return createStoreBufferAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram <em>Control Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram
	 * @generated
	 */
	public Adapter createControlFlowDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation <em>Control Flow Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation
	 * @generated
	 */
	public Adapter createControlFlowLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.WriteDefChainTransition <em>Write Def Chain Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.WriteDefChainTransition
	 * @generated
	 */
	public Adapter createWriteDefChainTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.EarlyReadTransition <em>Early Read Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.EarlyReadTransition
	 * @generated
	 */
	public Adapter createEarlyReadTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.GuardedTransition <em>Guarded Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.GuardedTransition
	 * @generated
	 */
	public Adapter createGuardedTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.MultiTransition <em>Multi Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.MultiTransition
	 * @generated
	 */
	public Adapter createMultiTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.FlushTransition <em>Flush Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.FlushTransition
	 * @generated
	 */
	public Adapter createFlushTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.AddressValuePair <em>Address Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.AddressValuePair
	 * @generated
	 */
	public Adapter createAddressValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.controlflow.StoreBuffer <em>Store Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.controlflow.StoreBuffer
	 * @generated
	 */
	public Adapter createStoreBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ControlflowAdapterFactory
