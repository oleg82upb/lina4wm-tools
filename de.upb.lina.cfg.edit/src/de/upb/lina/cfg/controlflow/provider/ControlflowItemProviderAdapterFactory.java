/**
 */
package de.upb.lina.cfg.controlflow.provider;

import de.upb.lina.cfg.controlflow.util.ControlflowAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowItemProviderAdapterFactory extends ControlflowAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.ControlFlowDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowDiagramItemProvider controlFlowDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.ControlFlowDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowDiagramAdapter() {
		if (controlFlowDiagramItemProvider == null) {
			controlFlowDiagramItemProvider = new ControlFlowDiagramItemProvider(this);
		}

		return controlFlowDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.ControlFlowLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowLocationItemProvider controlFlowLocationItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.ControlFlowLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowLocationAdapter() {
		if (controlFlowLocationItemProvider == null) {
			controlFlowLocationItemProvider = new ControlFlowLocationItemProvider(this);
		}

		return controlFlowLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.WriteDefChainTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteDefChainTransitionItemProvider writeDefChainTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.WriteDefChainTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWriteDefChainTransitionAdapter() {
		if (writeDefChainTransitionItemProvider == null) {
			writeDefChainTransitionItemProvider = new WriteDefChainTransitionItemProvider(this);
		}

		return writeDefChainTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.EarlyReadTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarlyReadTransitionItemProvider earlyReadTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.EarlyReadTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEarlyReadTransitionAdapter() {
		if (earlyReadTransitionItemProvider == null) {
			earlyReadTransitionItemProvider = new EarlyReadTransitionItemProvider(this);
		}

		return earlyReadTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.GuardedTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardedTransitionItemProvider guardedTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.GuardedTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuardedTransitionAdapter() {
		if (guardedTransitionItemProvider == null) {
			guardedTransitionItemProvider = new GuardedTransitionItemProvider(this);
		}

		return guardedTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.MultiTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiTransitionItemProvider multiTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.MultiTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiTransitionAdapter() {
		if (multiTransitionItemProvider == null) {
			multiTransitionItemProvider = new MultiTransitionItemProvider(this);
		}

		return multiTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.FlushTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlushTransitionItemProvider flushTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.FlushTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlushTransitionAdapter()
	{
		if (flushTransitionItemProvider == null) {
			flushTransitionItemProvider = new FlushTransitionItemProvider(this);
		}

		return flushTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.AddressValuePair} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressValuePairItemProvider addressValuePairItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.AddressValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressValuePairAdapter()
	{
		if (addressValuePairItemProvider == null) {
			addressValuePairItemProvider = new AddressValuePairItemProvider(this);
		}

		return addressValuePairItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.upb.lina.cfg.controlflow.StoreBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreBufferItemProvider storeBufferItemProvider;

	/**
	 * This creates an adapter for a {@link de.upb.lina.cfg.controlflow.StoreBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreBufferAdapter()
	{
		if (storeBufferItemProvider == null) {
			storeBufferItemProvider = new StoreBufferItemProvider(this);
		}

		return storeBufferItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (controlFlowDiagramItemProvider != null) controlFlowDiagramItemProvider.dispose();
		if (controlFlowLocationItemProvider != null) controlFlowLocationItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (writeDefChainTransitionItemProvider != null) writeDefChainTransitionItemProvider.dispose();
		if (earlyReadTransitionItemProvider != null) earlyReadTransitionItemProvider.dispose();
		if (guardedTransitionItemProvider != null) guardedTransitionItemProvider.dispose();
		if (multiTransitionItemProvider != null) multiTransitionItemProvider.dispose();
		if (flushTransitionItemProvider != null) flushTransitionItemProvider.dispose();
		if (addressValuePairItemProvider != null) addressValuePairItemProvider.dispose();
		if (storeBufferItemProvider != null) storeBufferItemProvider.dispose();
	}

}