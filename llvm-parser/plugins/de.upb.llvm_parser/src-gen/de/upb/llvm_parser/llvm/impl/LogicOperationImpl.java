/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl#getOptype <em>Optype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicOperationImpl extends InstructionImpl implements LogicOperation
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
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
  protected static final String OPERATION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
  protected String operation = OPERATION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getOptype() <em>Optype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOptype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse optype;

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
  protected LogicOperationImpl()
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
		return LlvmPackage.Literals.LOGIC_OPERATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getOperation()
  {
		return operation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperation(String newOperation)
  {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__OPERATION, oldOperation, operation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getOptype()
  {
		return optype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOptype(TypeUse newOptype, NotificationChain msgs)
  {
		TypeUse oldOptype = optype;
		optype = newOptype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__OPTYPE, oldOptype, newOptype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOptype(TypeUse newOptype)
  {
		if (newOptype != optype)
		{
			NotificationChain msgs = null;
			if (optype != null)
				msgs = ((InternalEObject)optype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__OPTYPE, null, msgs);
			if (newOptype != null)
				msgs = ((InternalEObject)newOptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__OPTYPE, null, msgs);
			msgs = basicSetOptype(newOptype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__OPTYPE, newOptype, newOptype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getValue1()
  {
		return value1;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValue1(Value newValue1, NotificationChain msgs)
  {
		Value oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__VALUE1, oldValue1, newValue1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue1(Value newValue1)
  {
		if (newValue1 != value1)
		{
			NotificationChain msgs = null;
			if (value1 != null)
				msgs = ((InternalEObject)value1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__VALUE1, null, msgs);
			if (newValue1 != null)
				msgs = ((InternalEObject)newValue1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__VALUE1, null, msgs);
			msgs = basicSetValue1(newValue1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__VALUE1, newValue1, newValue1));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getValue2()
  {
		return value2;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValue2(Value newValue2, NotificationChain msgs)
  {
		Value oldValue2 = value2;
		value2 = newValue2;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__VALUE2, oldValue2, newValue2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue2(Value newValue2)
  {
		if (newValue2 != value2)
		{
			NotificationChain msgs = null;
			if (value2 != null)
				msgs = ((InternalEObject)value2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__VALUE2, null, msgs);
			if (newValue2 != null)
				msgs = ((InternalEObject)newValue2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOGIC_OPERATION__VALUE2, null, msgs);
			msgs = basicSetValue2(newValue2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOGIC_OPERATION__VALUE2, newValue2, newValue2));
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
			case LlvmPackage.LOGIC_OPERATION__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.LOGIC_OPERATION__OPTYPE:
				return basicSetOptype(null, msgs);
			case LlvmPackage.LOGIC_OPERATION__VALUE1:
				return basicSetValue1(null, msgs);
			case LlvmPackage.LOGIC_OPERATION__VALUE2:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID)
		{
			case LlvmPackage.LOGIC_OPERATION__RESULT:
				return getResult();
			case LlvmPackage.LOGIC_OPERATION__OPERATION:
				return getOperation();
			case LlvmPackage.LOGIC_OPERATION__OPTYPE:
				return getOptype();
			case LlvmPackage.LOGIC_OPERATION__VALUE1:
				return getValue1();
			case LlvmPackage.LOGIC_OPERATION__VALUE2:
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID)
		{
			case LlvmPackage.LOGIC_OPERATION__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.LOGIC_OPERATION__OPERATION:
				setOperation((String)newValue);
				return;
			case LlvmPackage.LOGIC_OPERATION__OPTYPE:
				setOptype((TypeUse)newValue);
				return;
			case LlvmPackage.LOGIC_OPERATION__VALUE1:
				setValue1((Value)newValue);
				return;
			case LlvmPackage.LOGIC_OPERATION__VALUE2:
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
  public void eUnset(int featureID)
  {
		switch (featureID)
		{
			case LlvmPackage.LOGIC_OPERATION__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.LOGIC_OPERATION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case LlvmPackage.LOGIC_OPERATION__OPTYPE:
				setOptype((TypeUse)null);
				return;
			case LlvmPackage.LOGIC_OPERATION__VALUE1:
				setValue1((Value)null);
				return;
			case LlvmPackage.LOGIC_OPERATION__VALUE2:
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID)
		{
			case LlvmPackage.LOGIC_OPERATION__RESULT:
				return result != null;
			case LlvmPackage.LOGIC_OPERATION__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case LlvmPackage.LOGIC_OPERATION__OPTYPE:
				return optype != null;
			case LlvmPackage.LOGIC_OPERATION__VALUE1:
				return value1 != null;
			case LlvmPackage.LOGIC_OPERATION__VALUE2:
				return value2 != null;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //LogicOperationImpl
