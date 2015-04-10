/**
 */
package helpermodel.impl;

import helpermodel.HelperModel;
import helpermodel.HelpermodelPackage;
import helpermodel.Label;
import helpermodel.LocalVariables;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link helpermodel.impl.HelperModelImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link helpermodel.impl.HelperModelImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelperModelImpl extends MinimalEObjectImpl.Container implements HelperModel {
	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected LocalVariables localVariables;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelpermodelPackage.Literals.HELPER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariables getLocalVariables() {
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalVariables(LocalVariables newLocalVariables, NotificationChain msgs) {
		LocalVariables oldLocalVariables = localVariables;
		localVariables = newLocalVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES, oldLocalVariables, newLocalVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalVariables(LocalVariables newLocalVariables) {
		if (newLocalVariables != localVariables) {
			NotificationChain msgs = null;
			if (localVariables != null)
				msgs = ((InternalEObject)localVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES, null, msgs);
			if (newLocalVariables != null)
				msgs = ((InternalEObject)newLocalVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES, null, msgs);
			msgs = basicSetLocalVariables(newLocalVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES, newLocalVariables, newLocalVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<Label>(Label.class, this, HelpermodelPackage.HELPER_MODEL__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES:
				return basicSetLocalVariables(null, msgs);
			case HelpermodelPackage.HELPER_MODEL__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES:
				return getLocalVariables();
			case HelpermodelPackage.HELPER_MODEL__LABELS:
				return getLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)newValue);
				return;
			case HelpermodelPackage.HELPER_MODEL__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
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
			case HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)null);
				return;
			case HelpermodelPackage.HELPER_MODEL__LABELS:
				getLabels().clear();
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
			case HelpermodelPackage.HELPER_MODEL__LOCAL_VARIABLES:
				return localVariables != null;
			case HelpermodelPackage.HELPER_MODEL__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HelperModelImpl
