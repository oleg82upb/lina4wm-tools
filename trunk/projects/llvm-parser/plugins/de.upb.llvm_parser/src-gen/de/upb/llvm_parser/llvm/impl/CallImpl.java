/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ParameterList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends InstructionImpl implements Call
{
  /**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
  protected Address result;

  /**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
  protected Parameter function;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CallImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return LlvmPackage.Literals.CALL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Address getResult()
  {
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetResult(Address newResult, NotificationChain msgs)
  {
		Address oldResult = result;
		result = newResult;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResult(Address newResult)
  {
		if (newResult != result)
		{
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getFunction()
  {
		return function;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFunction(Parameter newFunction, NotificationChain msgs)
  {
		Parameter oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFunction(Parameter newFunction)
  {
		if (newFunction != function)
		{
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__FUNCTION, newFunction, newFunction));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ParameterList getPList()
  {
		return pList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPList(ParameterList newPList, NotificationChain msgs)
  {
		ParameterList oldPList = pList;
		pList = newPList;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, oldPList, newPList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPList(ParameterList newPList)
  {
		if (newPList != pList)
		{
			NotificationChain msgs = null;
			if (pList != null)
				msgs = ((InternalEObject)pList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__PLIST, null, msgs);
			if (newPList != null)
				msgs = ((InternalEObject)newPList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__PLIST, null, msgs);
			msgs = basicSetPList(newPList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, newPList, newPList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID)
		{
			case LlvmPackage.CALL__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.CALL__FUNCTION:
				return basicSetFunction(null, msgs);
			case LlvmPackage.CALL__PLIST:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID)
		{
			case LlvmPackage.CALL__RESULT:
				return getResult();
			case LlvmPackage.CALL__FUNCTION:
				return getFunction();
			case LlvmPackage.CALL__PLIST:
				return getPList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID)
		{
			case LlvmPackage.CALL__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.CALL__FUNCTION:
				setFunction((Parameter)newValue);
				return;
			case LlvmPackage.CALL__PLIST:
				setPList((ParameterList)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID)
		{
			case LlvmPackage.CALL__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.CALL__FUNCTION:
				setFunction((Parameter)null);
				return;
			case LlvmPackage.CALL__PLIST:
				setPList((ParameterList)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID)
		{
			case LlvmPackage.CALL__RESULT:
				return result != null;
			case LlvmPackage.CALL__FUNCTION:
				return function != null;
			case LlvmPackage.CALL__PLIST:
				return pList != null;
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
