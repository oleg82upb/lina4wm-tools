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
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwindTargetLabel <em>Unwind Target Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends InstructionImpl implements Invoke
{
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
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
  protected static final String TARGET_LABEL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
  protected String targetLabel = TARGET_LABEL_EDEFAULT;

  /**
	 * The default value of the '{@link #getUnwindTargetLabel() <em>Unwind Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnwindTargetLabel()
	 * @generated
	 * @ordered
	 */
  protected static final String UNWIND_TARGET_LABEL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getUnwindTargetLabel() <em>Unwind Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnwindTargetLabel()
	 * @generated
	 * @ordered
	 */
  protected String unwindTargetLabel = UNWIND_TARGET_LABEL_EDEFAULT;

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
  public TypeUse getReturnType()
  {
		return returnType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReturnType(TypeUse newReturnType, NotificationChain msgs)
  {
		TypeUse oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReturnType(TypeUse newReturnType)
  {
		if (newReturnType != returnType)
		{
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__RETURN_TYPE, newReturnType, newReturnType));
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
  public String getTargetLabel()
  {
		return targetLabel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTargetLabel(String newTargetLabel)
  {
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUnwindTargetLabel()
  {
		return unwindTargetLabel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUnwindTargetLabel(String newUnwindTargetLabel)
  {
		String oldUnwindTargetLabel = unwindTargetLabel;
		unwindTargetLabel = newUnwindTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWIND_TARGET_LABEL, oldUnwindTargetLabel, unwindTargetLabel));
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
			case LlvmPackage.INVOKE__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
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
			case LlvmPackage.INVOKE__RETURN_TYPE:
				return getReturnType();
			case LlvmPackage.INVOKE__NAME:
				return getName();
			case LlvmPackage.INVOKE__PLIST:
				return getPList();
			case LlvmPackage.INVOKE__TARGET_LABEL:
				return getTargetLabel();
			case LlvmPackage.INVOKE__UNWIND_TARGET_LABEL:
				return getUnwindTargetLabel();
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
			case LlvmPackage.INVOKE__RETURN_TYPE:
				setReturnType((TypeUse)newValue);
				return;
			case LlvmPackage.INVOKE__NAME:
				setName((Address)newValue);
				return;
			case LlvmPackage.INVOKE__PLIST:
				setPList((ParameterList)newValue);
				return;
			case LlvmPackage.INVOKE__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case LlvmPackage.INVOKE__UNWIND_TARGET_LABEL:
				setUnwindTargetLabel((String)newValue);
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
			case LlvmPackage.INVOKE__RETURN_TYPE:
				setReturnType((TypeUse)null);
				return;
			case LlvmPackage.INVOKE__NAME:
				setName((Address)null);
				return;
			case LlvmPackage.INVOKE__PLIST:
				setPList((ParameterList)null);
				return;
			case LlvmPackage.INVOKE__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case LlvmPackage.INVOKE__UNWIND_TARGET_LABEL:
				setUnwindTargetLabel(UNWIND_TARGET_LABEL_EDEFAULT);
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
			case LlvmPackage.INVOKE__RETURN_TYPE:
				return returnType != null;
			case LlvmPackage.INVOKE__NAME:
				return name != null;
			case LlvmPackage.INVOKE__PLIST:
				return pList != null;
			case LlvmPackage.INVOKE__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case LlvmPackage.INVOKE__UNWIND_TARGET_LABEL:
				return UNWIND_TARGET_LABEL_EDEFAULT == null ? unwindTargetLabel != null : !UNWIND_TARGET_LABEL_EDEFAULT.equals(unwindTargetLabel);
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
		result.append(" (targetLabel: ");
		result.append(targetLabel);
		result.append(", unwindTargetLabel: ");
		result.append(unwindTargetLabel);
		result.append(')');
		return result.toString();
	}

} //InvokeImpl
