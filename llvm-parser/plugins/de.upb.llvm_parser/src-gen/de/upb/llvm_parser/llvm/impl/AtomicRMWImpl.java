/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AtomicRMW;
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
 * An implementation of the model object '<em><b>Atomic RMW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getOptype <em>Optype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getOpvalue <em>Opvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicRMWImpl extends InstructionImpl implements AtomicRMW
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
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
  protected static final boolean VOLATILE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
  protected boolean volatile_ = VOLATILE_EDEFAULT;

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
	 * The cached value of the '{@link #getAdresstype() <em>Adresstype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdresstype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse adresstype;

  /**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
  protected Value adress;

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
	 * The cached value of the '{@link #getOpvalue() <em>Opvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOpvalue()
	 * @generated
	 * @ordered
	 */
  protected Value opvalue;

  /**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
  protected static final String ORDERING_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
  protected String ordering = ORDERING_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AtomicRMWImpl()
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
		return LlvmPackage.Literals.ATOMIC_RMW;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isVolatile()
  {
		return volatile_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVolatile(boolean newVolatile)
  {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__VOLATILE, oldVolatile, volatile_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__OPERATION, oldOperation, operation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getAdresstype()
  {
		return adresstype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAdresstype(TypeUse newAdresstype, NotificationChain msgs)
  {
		TypeUse oldAdresstype = adresstype;
		adresstype = newAdresstype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ADRESSTYPE, oldAdresstype, newAdresstype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAdresstype(TypeUse newAdresstype)
  {
		if (newAdresstype != adresstype)
		{
			NotificationChain msgs = null;
			if (adresstype != null)
				msgs = ((InternalEObject)adresstype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__ADRESSTYPE, null, msgs);
			if (newAdresstype != null)
				msgs = ((InternalEObject)newAdresstype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__ADRESSTYPE, null, msgs);
			msgs = basicSetAdresstype(newAdresstype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ADRESSTYPE, newAdresstype, newAdresstype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getAdress()
  {
		return adress;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAdress(Value newAdress, NotificationChain msgs)
  {
		Value oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ADRESS, oldAdress, newAdress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAdress(Value newAdress)
  {
		if (newAdress != adress)
		{
			NotificationChain msgs = null;
			if (adress != null)
				msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__ADRESS, null, msgs);
			if (newAdress != null)
				msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__ADRESS, null, msgs);
			msgs = basicSetAdress(newAdress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ADRESS, newAdress, newAdress));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__OPTYPE, oldOptype, newOptype);
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
				msgs = ((InternalEObject)optype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__OPTYPE, null, msgs);
			if (newOptype != null)
				msgs = ((InternalEObject)newOptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__OPTYPE, null, msgs);
			msgs = basicSetOptype(newOptype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__OPTYPE, newOptype, newOptype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getOpvalue()
  {
		return opvalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOpvalue(Value newOpvalue, NotificationChain msgs)
  {
		Value oldOpvalue = opvalue;
		opvalue = newOpvalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__OPVALUE, oldOpvalue, newOpvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOpvalue(Value newOpvalue)
  {
		if (newOpvalue != opvalue)
		{
			NotificationChain msgs = null;
			if (opvalue != null)
				msgs = ((InternalEObject)opvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__OPVALUE, null, msgs);
			if (newOpvalue != null)
				msgs = ((InternalEObject)newOpvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__OPVALUE, null, msgs);
			msgs = basicSetOpvalue(newOpvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__OPVALUE, newOpvalue, newOpvalue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getOrdering()
  {
		return ordering;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrdering(String newOrdering)
  {
		String oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ORDERING, oldOrdering, ordering));
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
			case LlvmPackage.ATOMIC_RMW__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.ATOMIC_RMW__ADRESSTYPE:
				return basicSetAdresstype(null, msgs);
			case LlvmPackage.ATOMIC_RMW__ADRESS:
				return basicSetAdress(null, msgs);
			case LlvmPackage.ATOMIC_RMW__OPTYPE:
				return basicSetOptype(null, msgs);
			case LlvmPackage.ATOMIC_RMW__OPVALUE:
				return basicSetOpvalue(null, msgs);
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
			case LlvmPackage.ATOMIC_RMW__RESULT:
				return getResult();
			case LlvmPackage.ATOMIC_RMW__VOLATILE:
				return isVolatile();
			case LlvmPackage.ATOMIC_RMW__OPERATION:
				return getOperation();
			case LlvmPackage.ATOMIC_RMW__ADRESSTYPE:
				return getAdresstype();
			case LlvmPackage.ATOMIC_RMW__ADRESS:
				return getAdress();
			case LlvmPackage.ATOMIC_RMW__OPTYPE:
				return getOptype();
			case LlvmPackage.ATOMIC_RMW__OPVALUE:
				return getOpvalue();
			case LlvmPackage.ATOMIC_RMW__ORDERING:
				return getOrdering();
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
			case LlvmPackage.ATOMIC_RMW__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__OPERATION:
				setOperation((String)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__ADRESSTYPE:
				setAdresstype((TypeUse)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__ADRESS:
				setAdress((Value)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__OPTYPE:
				setOptype((TypeUse)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__OPVALUE:
				setOpvalue((Value)newValue);
				return;
			case LlvmPackage.ATOMIC_RMW__ORDERING:
				setOrdering((String)newValue);
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
			case LlvmPackage.ATOMIC_RMW__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.ATOMIC_RMW__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case LlvmPackage.ATOMIC_RMW__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case LlvmPackage.ATOMIC_RMW__ADRESSTYPE:
				setAdresstype((TypeUse)null);
				return;
			case LlvmPackage.ATOMIC_RMW__ADRESS:
				setAdress((Value)null);
				return;
			case LlvmPackage.ATOMIC_RMW__OPTYPE:
				setOptype((TypeUse)null);
				return;
			case LlvmPackage.ATOMIC_RMW__OPVALUE:
				setOpvalue((Value)null);
				return;
			case LlvmPackage.ATOMIC_RMW__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
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
			case LlvmPackage.ATOMIC_RMW__RESULT:
				return result != null;
			case LlvmPackage.ATOMIC_RMW__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case LlvmPackage.ATOMIC_RMW__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case LlvmPackage.ATOMIC_RMW__ADRESSTYPE:
				return adresstype != null;
			case LlvmPackage.ATOMIC_RMW__ADRESS:
				return adress != null;
			case LlvmPackage.ATOMIC_RMW__OPTYPE:
				return optype != null;
			case LlvmPackage.ATOMIC_RMW__OPVALUE:
				return opvalue != null;
			case LlvmPackage.ATOMIC_RMW__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
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
		result.append(" (volatile: ");
		result.append(volatile_);
		result.append(", operation: ");
		result.append(operation);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //AtomicRMWImpl
