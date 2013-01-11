/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getTypelist <em>Typelist</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getNumelementstype <em>Numelementstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getNumelementsvalue <em>Numelementsvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocImpl extends InstructionImpl implements Alloc {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypelist() <em>Typelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypelist()
	 * @generated
	 * @ordered
	 */
	protected TypeList typelist;

	/**
	 * The default value of the '{@link #getNumelementstype() <em>Numelementstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumelementstype()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMELEMENTSTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumelementstype() <em>Numelementstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumelementstype()
	 * @generated
	 * @ordered
	 */
	protected String numelementstype = NUMELEMENTSTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumelementsvalue() <em>Numelementsvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumelementsvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMELEMENTSVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumelementsvalue() <em>Numelementsvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumelementsvalue()
	 * @generated
	 * @ordered
	 */
	protected String numelementsvalue = NUMELEMENTSVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.ALLOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeList getTypelist() {
		return typelist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypelist(TypeList newTypelist, NotificationChain msgs) {
		TypeList oldTypelist = typelist;
		typelist = newTypelist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__TYPELIST, oldTypelist, newTypelist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypelist(TypeList newTypelist) {
		if (newTypelist != typelist) {
			NotificationChain msgs = null;
			if (typelist != null)
				msgs = ((InternalEObject)typelist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__TYPELIST, null, msgs);
			if (newTypelist != null)
				msgs = ((InternalEObject)newTypelist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__TYPELIST, null, msgs);
			msgs = basicSetTypelist(newTypelist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__TYPELIST, newTypelist, newTypelist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumelementstype() {
		return numelementstype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumelementstype(String newNumelementstype) {
		String oldNumelementstype = numelementstype;
		numelementstype = newNumelementstype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__NUMELEMENTSTYPE, oldNumelementstype, numelementstype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumelementsvalue() {
		return numelementsvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumelementsvalue(String newNumelementsvalue) {
		String oldNumelementsvalue = numelementsvalue;
		numelementsvalue = newNumelementsvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__NUMELEMENTSVALUE, oldNumelementsvalue, numelementsvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.ALLOC__TYPELIST:
				return basicSetTypelist(null, msgs);
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
			case LlvmPackage.ALLOC__TYPE:
				return getType();
			case LlvmPackage.ALLOC__TYPELIST:
				return getTypelist();
			case LlvmPackage.ALLOC__NUMELEMENTSTYPE:
				return getNumelementstype();
			case LlvmPackage.ALLOC__NUMELEMENTSVALUE:
				return getNumelementsvalue();
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
			case LlvmPackage.ALLOC__TYPE:
				setType((String)newValue);
				return;
			case LlvmPackage.ALLOC__TYPELIST:
				setTypelist((TypeList)newValue);
				return;
			case LlvmPackage.ALLOC__NUMELEMENTSTYPE:
				setNumelementstype((String)newValue);
				return;
			case LlvmPackage.ALLOC__NUMELEMENTSVALUE:
				setNumelementsvalue((String)newValue);
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
			case LlvmPackage.ALLOC__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LlvmPackage.ALLOC__TYPELIST:
				setTypelist((TypeList)null);
				return;
			case LlvmPackage.ALLOC__NUMELEMENTSTYPE:
				setNumelementstype(NUMELEMENTSTYPE_EDEFAULT);
				return;
			case LlvmPackage.ALLOC__NUMELEMENTSVALUE:
				setNumelementsvalue(NUMELEMENTSVALUE_EDEFAULT);
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
			case LlvmPackage.ALLOC__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case LlvmPackage.ALLOC__TYPELIST:
				return typelist != null;
			case LlvmPackage.ALLOC__NUMELEMENTSTYPE:
				return NUMELEMENTSTYPE_EDEFAULT == null ? numelementstype != null : !NUMELEMENTSTYPE_EDEFAULT.equals(numelementstype);
			case LlvmPackage.ALLOC__NUMELEMENTSVALUE:
				return NUMELEMENTSVALUE_EDEFAULT == null ? numelementsvalue != null : !NUMELEMENTSVALUE_EDEFAULT.equals(numelementsvalue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", numelementstype: ");
		result.append(numelementstype);
		result.append(", numelementsvalue: ");
		result.append(numelementsvalue);
		result.append(')');
		return result.toString();
	}

} //AllocImpl
