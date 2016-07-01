/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.FlushTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flush Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.FlushTransitionImpl#getFlushedEntry <em>Flushed Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlushTransitionImpl extends TransitionImpl implements FlushTransition {
	/**
	 * The cached value of the '{@link #getFlushedEntry() <em>Flushed Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushedEntry()
	 * @generated
	 * @ordered
	 */
	protected AddressValuePair flushedEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlushTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.FLUSH_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressValuePair getFlushedEntry()
	{
		return flushedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlushedEntry(AddressValuePair newFlushedEntry, NotificationChain msgs)
	{
		AddressValuePair oldFlushedEntry = flushedEntry;
		flushedEntry = newFlushedEntry;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY, oldFlushedEntry, newFlushedEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlushedEntry(AddressValuePair newFlushedEntry)
	{
		if (newFlushedEntry != flushedEntry)
		{
			NotificationChain msgs = null;
			if (flushedEntry != null)
				msgs = ((InternalEObject)flushedEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY, null, msgs);
			if (newFlushedEntry != null)
				msgs = ((InternalEObject)newFlushedEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY, null, msgs);
			msgs = basicSetFlushedEntry(newFlushedEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY, newFlushedEntry, newFlushedEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY:
				return basicSetFlushedEntry(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY:
				return getFlushedEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY:
				setFlushedEntry((AddressValuePair)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY:
				setFlushedEntry((AddressValuePair)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ControlflowPackage.FLUSH_TRANSITION__FLUSHED_ENTRY:
				return flushedEntry != null;
		}
		return super.eIsSet(featureID);
	}

} //FlushTransitionImpl
