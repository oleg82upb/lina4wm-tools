/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.ARRAY;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.ValueStruct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARRAY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ARRAYImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ARRAYImpl#getLstruct <em>Lstruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ARRAYImpl#getRstruct <em>Rstruct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ARRAYImpl extends MinimalEObjectImpl.Container implements ARRAY {
	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected Structure struct;

	/**
	 * The cached value of the '{@link #getLstruct() <em>Lstruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstruct()
	 * @generated
	 * @ordered
	 */
	protected Structure lstruct;

	/**
	 * The cached value of the '{@link #getRstruct() <em>Rstruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRstruct()
	 * @generated
	 * @ordered
	 */
	protected ValueStruct rstruct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARRAYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Structure newStruct, NotificationChain msgs) {
		Structure oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ARRAY__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Structure newStruct) {
		if (newStruct != struct) {
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ARRAY__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ARRAY__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ARRAY__STRUCT, newStruct, newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getLstruct() {
		return lstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstruct(Structure newLstruct, NotificationChain msgs) {
		Structure oldLstruct = lstruct;
		lstruct = newLstruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ARRAY__LSTRUCT, oldLstruct, newLstruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstruct(Structure newLstruct) {
		if (newLstruct != lstruct) {
			NotificationChain msgs = null;
			if (lstruct != null)
				msgs = ((InternalEObject)lstruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ARRAY__LSTRUCT, null, msgs);
			if (newLstruct != null)
				msgs = ((InternalEObject)newLstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ARRAY__LSTRUCT, null, msgs);
			msgs = basicSetLstruct(newLstruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ARRAY__LSTRUCT, newLstruct, newLstruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueStruct getRstruct() {
		return rstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRstruct(ValueStruct newRstruct, NotificationChain msgs) {
		ValueStruct oldRstruct = rstruct;
		rstruct = newRstruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ARRAY__RSTRUCT, oldRstruct, newRstruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRstruct(ValueStruct newRstruct) {
		if (newRstruct != rstruct) {
			NotificationChain msgs = null;
			if (rstruct != null)
				msgs = ((InternalEObject)rstruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ARRAY__RSTRUCT, null, msgs);
			if (newRstruct != null)
				msgs = ((InternalEObject)newRstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ARRAY__RSTRUCT, null, msgs);
			msgs = basicSetRstruct(newRstruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ARRAY__RSTRUCT, newRstruct, newRstruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.ARRAY__STRUCT:
				return basicSetStruct(null, msgs);
			case LlvmPackage.ARRAY__LSTRUCT:
				return basicSetLstruct(null, msgs);
			case LlvmPackage.ARRAY__RSTRUCT:
				return basicSetRstruct(null, msgs);
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
			case LlvmPackage.ARRAY__STRUCT:
				return getStruct();
			case LlvmPackage.ARRAY__LSTRUCT:
				return getLstruct();
			case LlvmPackage.ARRAY__RSTRUCT:
				return getRstruct();
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
			case LlvmPackage.ARRAY__STRUCT:
				setStruct((Structure)newValue);
				return;
			case LlvmPackage.ARRAY__LSTRUCT:
				setLstruct((Structure)newValue);
				return;
			case LlvmPackage.ARRAY__RSTRUCT:
				setRstruct((ValueStruct)newValue);
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
			case LlvmPackage.ARRAY__STRUCT:
				setStruct((Structure)null);
				return;
			case LlvmPackage.ARRAY__LSTRUCT:
				setLstruct((Structure)null);
				return;
			case LlvmPackage.ARRAY__RSTRUCT:
				setRstruct((ValueStruct)null);
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
			case LlvmPackage.ARRAY__STRUCT:
				return struct != null;
			case LlvmPackage.ARRAY__LSTRUCT:
				return lstruct != null;
			case LlvmPackage.ARRAY__RSTRUCT:
				return rstruct != null;
		}
		return super.eIsSet(featureID);
	}

} //ARRAYImpl
