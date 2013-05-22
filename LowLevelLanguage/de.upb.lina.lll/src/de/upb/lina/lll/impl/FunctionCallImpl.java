/**
 */
package de.upb.lina.lll.impl;

import de.upb.lina.lll.Function;
import de.upb.lina.lll.FunctionCall;
import de.upb.lina.lll.LllPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.lll.impl.FunctionCallImpl#getInvokedFunction <em>Invoked Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends InstructionImpl implements FunctionCall {
	/**
	 * The cached value of the '{@link #getInvokedFunction() <em>Invoked Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedFunction()
	 * @generated
	 * @ordered
	 */
	protected Function invokedFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LllPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getInvokedFunction() {
		if (invokedFunction != null && invokedFunction.eIsProxy()) {
			InternalEObject oldInvokedFunction = (InternalEObject)invokedFunction;
			invokedFunction = (Function)eResolveProxy(oldInvokedFunction);
			if (invokedFunction != oldInvokedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LllPackage.FUNCTION_CALL__INVOKED_FUNCTION, oldInvokedFunction, invokedFunction));
			}
		}
		return invokedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetInvokedFunction() {
		return invokedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokedFunction(Function newInvokedFunction) {
		Function oldInvokedFunction = invokedFunction;
		invokedFunction = newInvokedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.FUNCTION_CALL__INVOKED_FUNCTION, oldInvokedFunction, invokedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LllPackage.FUNCTION_CALL__INVOKED_FUNCTION:
				if (resolve) return getInvokedFunction();
				return basicGetInvokedFunction();
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
			case LllPackage.FUNCTION_CALL__INVOKED_FUNCTION:
				setInvokedFunction((Function)newValue);
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
			case LllPackage.FUNCTION_CALL__INVOKED_FUNCTION:
				setInvokedFunction((Function)null);
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
			case LllPackage.FUNCTION_CALL__INVOKED_FUNCTION:
				return invokedFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallImpl
