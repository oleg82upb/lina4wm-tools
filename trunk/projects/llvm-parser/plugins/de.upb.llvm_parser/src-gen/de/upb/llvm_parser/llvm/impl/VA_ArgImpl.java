/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.VA_Arg;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VA Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl#getListtype <em>Listtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl#getListvalue <em>Listvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl#getArgType <em>Arg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VA_ArgImpl extends InstructionImpl implements VA_Arg {
	/**
	 * The cached value of the '{@link #getListtype() <em>Listtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListtype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse listtype;

	/**
	 * The cached value of the '{@link #getListvalue() <em>Listvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListvalue()
	 * @generated
	 * @ordered
	 */
	protected Value listvalue;

	/**
	 * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgType()
	 * @generated
	 * @ordered
	 */
	protected TypeUse argType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VA_ArgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.VA_ARG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getListtype() {
		return listtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListtype(TypeUse newListtype, NotificationChain msgs) {
		TypeUse oldListtype = listtype;
		listtype = newListtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__LISTTYPE, oldListtype, newListtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListtype(TypeUse newListtype) {
		if (newListtype != listtype) {
			NotificationChain msgs = null;
			if (listtype != null)
				msgs = ((InternalEObject)listtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VA_ARG__LISTTYPE, null, msgs);
			if (newListtype != null)
				msgs = ((InternalEObject)newListtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VA_ARG__LISTTYPE, null, msgs);
			msgs = basicSetListtype(newListtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__LISTTYPE, newListtype, newListtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getListvalue() {
		return listvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListvalue(Value newListvalue, NotificationChain msgs) {
		Value oldListvalue = listvalue;
		listvalue = newListvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__LISTVALUE, oldListvalue, newListvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListvalue(Value newListvalue) {
		if (newListvalue != listvalue) {
			NotificationChain msgs = null;
			if (listvalue != null)
				msgs = ((InternalEObject)listvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VA_ARG__LISTVALUE, null, msgs);
			if (newListvalue != null)
				msgs = ((InternalEObject)newListvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VA_ARG__LISTVALUE, null, msgs);
			msgs = basicSetListvalue(newListvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__LISTVALUE, newListvalue, newListvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getArgType() {
		return argType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgType(TypeUse newArgType, NotificationChain msgs) {
		TypeUse oldArgType = argType;
		argType = newArgType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__ARG_TYPE, oldArgType, newArgType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgType(TypeUse newArgType) {
		if (newArgType != argType) {
			NotificationChain msgs = null;
			if (argType != null)
				msgs = ((InternalEObject)argType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VA_ARG__ARG_TYPE, null, msgs);
			if (newArgType != null)
				msgs = ((InternalEObject)newArgType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VA_ARG__ARG_TYPE, null, msgs);
			msgs = basicSetArgType(newArgType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VA_ARG__ARG_TYPE, newArgType, newArgType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.VA_ARG__LISTTYPE:
				return basicSetListtype(null, msgs);
			case LlvmPackage.VA_ARG__LISTVALUE:
				return basicSetListvalue(null, msgs);
			case LlvmPackage.VA_ARG__ARG_TYPE:
				return basicSetArgType(null, msgs);
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				return getListtype();
			case LlvmPackage.VA_ARG__LISTVALUE:
				return getListvalue();
			case LlvmPackage.VA_ARG__ARG_TYPE:
				return getArgType();
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				setListtype((TypeUse)newValue);
				return;
			case LlvmPackage.VA_ARG__LISTVALUE:
				setListvalue((Value)newValue);
				return;
			case LlvmPackage.VA_ARG__ARG_TYPE:
				setArgType((TypeUse)newValue);
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				setListtype((TypeUse)null);
				return;
			case LlvmPackage.VA_ARG__LISTVALUE:
				setListvalue((Value)null);
				return;
			case LlvmPackage.VA_ARG__ARG_TYPE:
				setArgType((TypeUse)null);
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
			case LlvmPackage.VA_ARG__LISTTYPE:
				return listtype != null;
			case LlvmPackage.VA_ARG__LISTVALUE:
				return listvalue != null;
			case LlvmPackage.VA_ARG__ARG_TYPE:
				return argType != null;
		}
		return super.eIsSet(featureID);
	}

} //VA_ArgImpl
