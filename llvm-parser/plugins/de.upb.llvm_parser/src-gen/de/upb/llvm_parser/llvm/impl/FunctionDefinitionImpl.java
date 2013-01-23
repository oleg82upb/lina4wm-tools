/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.TypeUse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getPl <em>Pl</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getTList <em>TList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends MainLevelEntityImpl implements FunctionDefinition {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TypeUse returnType;

	/**
	 * The cached value of the '{@link #getPl() <em>Pl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPl()
	 * @generated
	 * @ordered
	 */
	protected ParameterList pl;

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
	protected FunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.FUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeUse newReturnType, NotificationChain msgs) {
		TypeUse oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeUse newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList getPl() {
		return pl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPl(ParameterList newPl, NotificationChain msgs) {
		ParameterList oldPl = pl;
		pl = newPl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__PL, oldPl, newPl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPl(ParameterList newPl) {
		if (newPl != pl) {
			NotificationChain msgs = null;
			if (pl != null)
				msgs = ((InternalEObject)pl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__PL, null, msgs);
			if (newPl != null)
				msgs = ((InternalEObject)newPl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__PL, null, msgs);
			msgs = basicSetPl(newPl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__PL, newPl, newPl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__BODY, newBody, newBody));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__TLIST, oldTList, newTList);
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
				msgs = ((InternalEObject)tList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__TLIST, null, msgs);
			if (newTList != null)
				msgs = ((InternalEObject)newTList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__TLIST, null, msgs);
			msgs = basicSetTList(newTList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__TLIST, newTList, newTList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case LlvmPackage.FUNCTION_DEFINITION__PL:
				return basicSetPl(null, msgs);
			case LlvmPackage.FUNCTION_DEFINITION__BODY:
				return basicSetBody(null, msgs);
			case LlvmPackage.FUNCTION_DEFINITION__TLIST:
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
			case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return getReturnType();
			case LlvmPackage.FUNCTION_DEFINITION__PL:
				return getPl();
			case LlvmPackage.FUNCTION_DEFINITION__BODY:
				return getBody();
			case LlvmPackage.FUNCTION_DEFINITION__TLIST:
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
			case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				setReturnType((TypeUse)newValue);
				return;
			case LlvmPackage.FUNCTION_DEFINITION__PL:
				setPl((ParameterList)newValue);
				return;
			case LlvmPackage.FUNCTION_DEFINITION__BODY:
				setBody((FunctionBody)newValue);
				return;
			case LlvmPackage.FUNCTION_DEFINITION__TLIST:
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
			case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				setReturnType((TypeUse)null);
				return;
			case LlvmPackage.FUNCTION_DEFINITION__PL:
				setPl((ParameterList)null);
				return;
			case LlvmPackage.FUNCTION_DEFINITION__BODY:
				setBody((FunctionBody)null);
				return;
			case LlvmPackage.FUNCTION_DEFINITION__TLIST:
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
			case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return returnType != null;
			case LlvmPackage.FUNCTION_DEFINITION__PL:
				return pl != null;
			case LlvmPackage.FUNCTION_DEFINITION__BODY:
				return body != null;
			case LlvmPackage.FUNCTION_DEFINITION__TLIST:
				return tList != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionDefinitionImpl
