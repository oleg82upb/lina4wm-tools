/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.TypeUse;

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
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getToTarget <em>To Target</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwindCase <em>Unwind Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends InstructionImpl implements Invoke
{
  /**
	 * The cached value of the '{@link #getFunctiontype() <em>Functiontype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctiontype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse functiontype;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected Address name;

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
	 * The default value of the '{@link #getToTarget() <em>To Target</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToTarget()
	 * @generated
	 * @ordered
	 */
  protected static final String TO_TARGET_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getToTarget() <em>To Target</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToTarget()
	 * @generated
	 * @ordered
	 */
  protected String toTarget = TO_TARGET_EDEFAULT;

  /**
	 * The default value of the '{@link #getUnwindCase() <em>Unwind Case</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnwindCase()
	 * @generated
	 * @ordered
	 */
  protected static final String UNWIND_CASE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getUnwindCase() <em>Unwind Case</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnwindCase()
	 * @generated
	 * @ordered
	 */
  protected String unwindCase = UNWIND_CASE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InvokeImpl()
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
		return LlvmPackage.Literals.INVOKE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getFunctiontype()
  {
		return functiontype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFunctiontype(TypeUse newFunctiontype, NotificationChain msgs)
  {
		TypeUse oldFunctiontype = functiontype;
		functiontype = newFunctiontype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTIONTYPE, oldFunctiontype, newFunctiontype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFunctiontype(TypeUse newFunctiontype)
  {
		if (newFunctiontype != functiontype)
		{
			NotificationChain msgs = null;
			if (functiontype != null)
				msgs = ((InternalEObject)functiontype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__FUNCTIONTYPE, null, msgs);
			if (newFunctiontype != null)
				msgs = ((InternalEObject)newFunctiontype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__FUNCTIONTYPE, null, msgs);
			msgs = basicSetFunctiontype(newFunctiontype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTIONTYPE, newFunctiontype, newFunctiontype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Address getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetName(Address newName, NotificationChain msgs)
  {
		Address oldName = name;
		name = newName;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(Address newName)
  {
		if (newName != name)
		{
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__NAME, newName, newName));
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
  public void setPList(ParameterList newPList)
  {
		if (newPList != pList)
		{
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
  public String getToTarget()
  {
		return toTarget;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToTarget(String newToTarget)
  {
		String oldToTarget = toTarget;
		toTarget = newToTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TO_TARGET, oldToTarget, toTarget));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUnwindCase()
  {
		return unwindCase;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUnwindCase(String newUnwindCase)
  {
		String oldUnwindCase = unwindCase;
		unwindCase = newUnwindCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWIND_CASE, oldUnwindCase, unwindCase));
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				return basicSetFunctiontype(null, msgs);
			case LlvmPackage.INVOKE__NAME:
				return basicSetName(null, msgs);
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID)
		{
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				return getFunctiontype();
			case LlvmPackage.INVOKE__NAME:
				return getName();
			case LlvmPackage.INVOKE__PLIST:
				return getPList();
			case LlvmPackage.INVOKE__TO_TARGET:
				return getToTarget();
			case LlvmPackage.INVOKE__UNWIND_CASE:
				return getUnwindCase();
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				setFunctiontype((TypeUse)newValue);
				return;
			case LlvmPackage.INVOKE__NAME:
				setName((Address)newValue);
				return;
			case LlvmPackage.INVOKE__PLIST:
				setPList((ParameterList)newValue);
				return;
			case LlvmPackage.INVOKE__TO_TARGET:
				setToTarget((String)newValue);
				return;
			case LlvmPackage.INVOKE__UNWIND_CASE:
				setUnwindCase((String)newValue);
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				setFunctiontype((TypeUse)null);
				return;
			case LlvmPackage.INVOKE__NAME:
				setName((Address)null);
				return;
			case LlvmPackage.INVOKE__PLIST:
				setPList((ParameterList)null);
				return;
			case LlvmPackage.INVOKE__TO_TARGET:
				setToTarget(TO_TARGET_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__UNWIND_CASE:
				setUnwindCase(UNWIND_CASE_EDEFAULT);
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
			case LlvmPackage.INVOKE__FUNCTIONTYPE:
				return functiontype != null;
			case LlvmPackage.INVOKE__NAME:
				return name != null;
			case LlvmPackage.INVOKE__PLIST:
				return pList != null;
			case LlvmPackage.INVOKE__TO_TARGET:
				return TO_TARGET_EDEFAULT == null ? toTarget != null : !TO_TARGET_EDEFAULT.equals(toTarget);
			case LlvmPackage.INVOKE__UNWIND_CASE:
				return UNWIND_CASE_EDEFAULT == null ? unwindCase != null : !UNWIND_CASE_EDEFAULT.equals(unwindCase);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (toTarget: ");
		result.append(toTarget);
		result.append(", unwindCase: ");
		result.append(unwindCase);
		result.append(')');
		return result.toString();
	}

} //InvokeImpl
