/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;

import de.upb.llvm_parser.llvm.Address;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Def Chain Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.WriteDefChainTransitionImpl#getCopyAddress <em>Copy Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriteDefChainTransitionImpl extends TransitionImpl implements WriteDefChainTransition {
	/**
	 * The cached value of the '{@link #getCopyAddress() <em>Copy Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyAddress()
	 * @generated
	 * @ordered
	 */
	protected Address copyAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteDefChainTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.WRITE_DEF_CHAIN_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getCopyAddress() {
		if (copyAddress != null && copyAddress.eIsProxy()) {
			InternalEObject oldCopyAddress = (InternalEObject)copyAddress;
			copyAddress = (Address)eResolveProxy(oldCopyAddress);
			if (copyAddress != oldCopyAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS, oldCopyAddress, copyAddress));
			}
		}
		return copyAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetCopyAddress() {
		return copyAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyAddress(Address newCopyAddress) {
		Address oldCopyAddress = copyAddress;
		copyAddress = newCopyAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS, oldCopyAddress, copyAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS:
				if (resolve) return getCopyAddress();
				return basicGetCopyAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS:
				setCopyAddress((Address)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS:
				setCopyAddress((Address)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ControlflowPackage.WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS:
				return copyAddress != null;
		}
		return super.eIsSet(featureID);
	}

} //WriteDefChainTransitionImpl
