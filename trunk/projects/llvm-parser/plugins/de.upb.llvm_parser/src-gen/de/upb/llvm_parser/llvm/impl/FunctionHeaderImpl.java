/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionHeader;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl#getPl <em>Pl</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl#getTList <em>TList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionHeaderImpl extends MainLevelEntityImpl implements FunctionHeader {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPl() <em>Pl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPl()
	 * @generated
	 * @ordered
	 */
	protected static final String PL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPl() <em>Pl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPl()
	 * @generated
	 * @ordered
	 */
	protected String pl = PL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected FunctionBody body;

	/**
	 * The cached value of the '{@link #getTList() <em>TList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTList()
	 * @generated
	 * @ordered
	 */
	protected TypeList tList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.FUNCTION_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_HEADER__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPl() {
		return pl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPl(String newPl) {
		String oldPl = pl;
		pl = newPl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_HEADER__PL, oldPl, pl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(FunctionBody newBody, NotificationChain msgs) {
		FunctionBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_HEADER__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(FunctionBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_HEADER__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_HEADER__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_HEADER__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeList getTList() {
		return tList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTList(TypeList newTList, NotificationChain msgs) {
		TypeList oldTList = tList;
		tList = newTList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_HEADER__TLIST, oldTList, newTList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTList(TypeList newTList) {
		if (newTList != tList) {
			NotificationChain msgs = null;
			if (tList != null)
				msgs = ((InternalEObject)tList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_HEADER__TLIST, null, msgs);
			if (newTList != null)
				msgs = ((InternalEObject)newTList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_HEADER__TLIST, null, msgs);
			msgs = basicSetTList(newTList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_HEADER__TLIST, newTList, newTList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.FUNCTION_HEADER__BODY:
				return basicSetBody(null, msgs);
			case LlvmPackage.FUNCTION_HEADER__TLIST:
				return basicSetTList(null, msgs);
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
			case LlvmPackage.FUNCTION_HEADER__RETURN_TYPE:
				return getReturnType();
			case LlvmPackage.FUNCTION_HEADER__PL:
				return getPl();
			case LlvmPackage.FUNCTION_HEADER__BODY:
				return getBody();
			case LlvmPackage.FUNCTION_HEADER__TLIST:
				return getTList();
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
			case LlvmPackage.FUNCTION_HEADER__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case LlvmPackage.FUNCTION_HEADER__PL:
				setPl((String)newValue);
				return;
			case LlvmPackage.FUNCTION_HEADER__BODY:
				setBody((FunctionBody)newValue);
				return;
			case LlvmPackage.FUNCTION_HEADER__TLIST:
				setTList((TypeList)newValue);
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
			case LlvmPackage.FUNCTION_HEADER__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case LlvmPackage.FUNCTION_HEADER__PL:
				setPl(PL_EDEFAULT);
				return;
			case LlvmPackage.FUNCTION_HEADER__BODY:
				setBody((FunctionBody)null);
				return;
			case LlvmPackage.FUNCTION_HEADER__TLIST:
				setTList((TypeList)null);
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
			case LlvmPackage.FUNCTION_HEADER__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case LlvmPackage.FUNCTION_HEADER__PL:
				return PL_EDEFAULT == null ? pl != null : !PL_EDEFAULT.equals(pl);
			case LlvmPackage.FUNCTION_HEADER__BODY:
				return body != null;
			case LlvmPackage.FUNCTION_HEADER__TLIST:
				return tList != null;
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
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(", pl: ");
		result.append(pl);
		result.append(')');
		return result.toString();
	}

} //FunctionHeaderImpl
