/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CompareImpl#getComptype <em>Comptype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CompareImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CompareImpl#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareImpl extends Std_InstrImpl implements Compare {
	/**
	 * The cached value of the '{@link #getComptype() <em>Comptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComptype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse comptype;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected Value value1;

	/**
	 * The cached value of the '{@link #getValue2() <em>Value2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected Value value2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.COMPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getComptype() {
		return comptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComptype(TypeUse newComptype, NotificationChain msgs) {
		TypeUse oldComptype = comptype;
		comptype = newComptype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.COMPARE__COMPTYPE, oldComptype, newComptype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComptype(TypeUse newComptype) {
		if (newComptype != comptype) {
			NotificationChain msgs = null;
			if (comptype != null)
				msgs = ((InternalEObject)comptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.COMPARE__COMPTYPE, null, msgs);
			if (newComptype != null)
				msgs = ((InternalEObject)newComptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.COMPARE__COMPTYPE, null, msgs);
			msgs = basicSetComptype(newComptype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.COMPARE__COMPTYPE, newComptype, newComptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue1(Value newValue1, NotificationChain msgs) {
		Value oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.COMPARE__VALUE1, oldValue1, newValue1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1(Value newValue1) {
		if (newValue1 != value1) {
			NotificationChain msgs = null;
			if (value1 != null)
				msgs = ((InternalEObject)value1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.COMPARE__VALUE1, null, msgs);
			if (newValue1 != null)
				msgs = ((InternalEObject)newValue1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.COMPARE__VALUE1, null, msgs);
			msgs = basicSetValue1(newValue1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.COMPARE__VALUE1, newValue1, newValue1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue2() {
		return value2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue2(Value newValue2, NotificationChain msgs) {
		Value oldValue2 = value2;
		value2 = newValue2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.COMPARE__VALUE2, oldValue2, newValue2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue2(Value newValue2) {
		if (newValue2 != value2) {
			NotificationChain msgs = null;
			if (value2 != null)
				msgs = ((InternalEObject)value2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.COMPARE__VALUE2, null, msgs);
			if (newValue2 != null)
				msgs = ((InternalEObject)newValue2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.COMPARE__VALUE2, null, msgs);
			msgs = basicSetValue2(newValue2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.COMPARE__VALUE2, newValue2, newValue2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.COMPARE__COMPTYPE:
				return basicSetComptype(null, msgs);
			case LlvmPackage.COMPARE__VALUE1:
				return basicSetValue1(null, msgs);
			case LlvmPackage.COMPARE__VALUE2:
				return basicSetValue2(null, msgs);
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
			case LlvmPackage.COMPARE__COMPTYPE:
				return getComptype();
			case LlvmPackage.COMPARE__VALUE1:
				return getValue1();
			case LlvmPackage.COMPARE__VALUE2:
				return getValue2();
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
			case LlvmPackage.COMPARE__COMPTYPE:
				setComptype((TypeUse)newValue);
				return;
			case LlvmPackage.COMPARE__VALUE1:
				setValue1((Value)newValue);
				return;
			case LlvmPackage.COMPARE__VALUE2:
				setValue2((Value)newValue);
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
			case LlvmPackage.COMPARE__COMPTYPE:
				setComptype((TypeUse)null);
				return;
			case LlvmPackage.COMPARE__VALUE1:
				setValue1((Value)null);
				return;
			case LlvmPackage.COMPARE__VALUE2:
				setValue2((Value)null);
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
			case LlvmPackage.COMPARE__COMPTYPE:
				return comptype != null;
			case LlvmPackage.COMPARE__VALUE1:
				return value1 != null;
			case LlvmPackage.COMPARE__VALUE2:
				return value2 != null;
		}
		return super.eIsSet(featureID);
	}

} //CompareImpl
