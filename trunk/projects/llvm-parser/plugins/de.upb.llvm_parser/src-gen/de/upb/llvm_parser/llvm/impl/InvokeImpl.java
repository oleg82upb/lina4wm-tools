/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getFunctiontype <em>Functiontype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getFunctionvalue <em>Functionvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getTotype <em>Totype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getTovalue <em>Tovalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwindtype <em>Unwindtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwindvalue <em>Unwindvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends Ret_InstrImpl implements Invoke {
	/**
	 * The default value of the '{@link #getFunctiontype() <em>Functiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctiontype()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctiontype() <em>Functiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctiontype()
	 * @generated
	 * @ordered
	 */
	protected String functiontype = FUNCTIONTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionvalue() <em>Functionvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionvalue() <em>Functionvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionvalue()
	 * @generated
	 * @ordered
	 */
	protected String functionvalue = FUNCTIONVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPList() <em>PList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList pList;

	/**
	 * The default value of the '{@link #getTotype() <em>Totype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotype()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotype() <em>Totype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotype()
	 * @generated
	 * @ordered
	 */
	protected String totype = TOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTovalue() <em>Tovalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTovalue()
	 * @generated
	 * @ordered
	 */
	protected static final String TOVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTovalue() <em>Tovalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTovalue()
	 * @generated
	 * @ordered
	 */
	protected String tovalue = TOVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnwindtype() <em>Unwindtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwindtype()
	 * @generated
	 * @ordered
	 */
	protected static final String UNWINDTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnwindtype() <em>Unwindtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwindtype()
	 * @generated
	 * @ordered
	 */
	protected String unwindtype = UNWINDTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnwindvalue() <em>Unwindvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwindvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String UNWINDVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnwindvalue() <em>Unwindvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwindvalue()
	 * @generated
	 * @ordered
	 */
	protected String unwindvalue = UNWINDVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.INVOKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctiontype() {
		return functiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctiontype(String newFunctiontype) {
		String oldFunctiontype = functiontype;
		functiontype = newFunctiontype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTIONTYPE, oldFunctiontype, functiontype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionvalue() {
		return functionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionvalue(String newFunctionvalue) {
		String oldFunctionvalue = functionvalue;
		functionvalue = newFunctionvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTIONVALUE, oldFunctionvalue, functionvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList getPList() {
		return pList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPList(ParameterList newPList, NotificationChain msgs) {
		ParameterList oldPList = pList;
		pList = newPList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__PLIST, oldPList, newPList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPList(ParameterList newPList) {
		if (newPList != pList) {
			NotificationChain msgs = null;
			if (pList != null)
				msgs = ((InternalEObject)pList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__PLIST, null, msgs);
			if (newPList != null)
				msgs = ((InternalEObject)newPList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__PLIST, null, msgs);
			msgs = basicSetPList(newPList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__PLIST, newPList, newPList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotype() {
		return totype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotype(String newTotype) {
		String oldTotype = totype;
		totype = newTotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TOTYPE, oldTotype, totype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTovalue() {
		return tovalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTovalue(String newTovalue) {
		String oldTovalue = tovalue;
		tovalue = newTovalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TOVALUE, oldTovalue, tovalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnwindtype() {
		return unwindtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnwindtype(String newUnwindtype) {
		String oldUnwindtype = unwindtype;
		unwindtype = newUnwindtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWINDTYPE, oldUnwindtype, unwindtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnwindvalue() {
		return unwindvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnwindvalue(String newUnwindvalue) {
		String oldUnwindvalue = unwindvalue;
		unwindvalue = newUnwindvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWINDVALUE, oldUnwindvalue, unwindvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.INVOKE__PLIST:
				return basicSetPList(null, msgs);
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				return getFunctiontype();
			case LlvmPackage.INVOKE__FUNCTIONVALUE:
				return getFunctionvalue();
			case LlvmPackage.INVOKE__PLIST:
				return getPList();
			case LlvmPackage.INVOKE__TOTYPE:
				return getTotype();
			case LlvmPackage.INVOKE__TOVALUE:
				return getTovalue();
			case LlvmPackage.INVOKE__UNWINDTYPE:
				return getUnwindtype();
			case LlvmPackage.INVOKE__UNWINDVALUE:
				return getUnwindvalue();
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				setFunctiontype((String)newValue);
				return;
			case LlvmPackage.INVOKE__FUNCTIONVALUE:
				setFunctionvalue((String)newValue);
				return;
			case LlvmPackage.INVOKE__PLIST:
				setPList((ParameterList)newValue);
				return;
			case LlvmPackage.INVOKE__TOTYPE:
				setTotype((String)newValue);
				return;
			case LlvmPackage.INVOKE__TOVALUE:
				setTovalue((String)newValue);
				return;
			case LlvmPackage.INVOKE__UNWINDTYPE:
				setUnwindtype((String)newValue);
				return;
			case LlvmPackage.INVOKE__UNWINDVALUE:
				setUnwindvalue((String)newValue);
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				setFunctiontype(FUNCTIONTYPE_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__FUNCTIONVALUE:
				setFunctionvalue(FUNCTIONVALUE_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__PLIST:
				setPList((ParameterList)null);
				return;
			case LlvmPackage.INVOKE__TOTYPE:
				setTotype(TOTYPE_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__TOVALUE:
				setTovalue(TOVALUE_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__UNWINDTYPE:
				setUnwindtype(UNWINDTYPE_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__UNWINDVALUE:
				setUnwindvalue(UNWINDVALUE_EDEFAULT);
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				return FUNCTIONTYPE_EDEFAULT == null ? functiontype != null : !FUNCTIONTYPE_EDEFAULT.equals(functiontype);
			case LlvmPackage.INVOKE__FUNCTIONVALUE:
				return FUNCTIONVALUE_EDEFAULT == null ? functionvalue != null : !FUNCTIONVALUE_EDEFAULT.equals(functionvalue);
			case LlvmPackage.INVOKE__PLIST:
				return pList != null;
			case LlvmPackage.INVOKE__TOTYPE:
				return TOTYPE_EDEFAULT == null ? totype != null : !TOTYPE_EDEFAULT.equals(totype);
			case LlvmPackage.INVOKE__TOVALUE:
				return TOVALUE_EDEFAULT == null ? tovalue != null : !TOVALUE_EDEFAULT.equals(tovalue);
			case LlvmPackage.INVOKE__UNWINDTYPE:
				return UNWINDTYPE_EDEFAULT == null ? unwindtype != null : !UNWINDTYPE_EDEFAULT.equals(unwindtype);
			case LlvmPackage.INVOKE__UNWINDVALUE:
				return UNWINDVALUE_EDEFAULT == null ? unwindvalue != null : !UNWINDVALUE_EDEFAULT.equals(unwindvalue);
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
		result.append(" (functiontype: ");
		result.append(functiontype);
		result.append(", functionvalue: ");
		result.append(functionvalue);
		result.append(", totype: ");
		result.append(totype);
		result.append(", tovalue: ");
		result.append(tovalue);
		result.append(", unwindtype: ");
		result.append(unwindtype);
		result.append(", unwindvalue: ");
		result.append(unwindvalue);
		result.append(')');
		return result.toString();
	}

} //InvokeImpl
