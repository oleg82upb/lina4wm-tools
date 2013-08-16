/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.MetaArgValue;
import de.upb.llvm_parser.llvm.Parameter;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LoadImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadImpl extends InstructionImpl implements Load
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
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
  protected Parameter address;

  /**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
  protected static final BigDecimal ALIGN_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
  protected BigDecimal align = ALIGN_EDEFAULT;

  /**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
  protected EList<MetaArgValue> meta;

  /**
	 * The default value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ATOMIC_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
  protected boolean atomic = ATOMIC_EDEFAULT;

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
  protected LoadImpl()
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
		return LlvmPackage.Literals.LOAD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOAD__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOAD__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__RESULT, newResult, newResult));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__VOLATILE, oldVolatile, volatile_));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getAddress()
  {
		return address;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAddress(Parameter newAddress, NotificationChain msgs)
  {
		Parameter oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAddress(Parameter newAddress)
  {
		if (newAddress != address)
		{
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOAD__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LOAD__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__ADDRESS, newAddress, newAddress));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BigDecimal getAlign()
  {
		return align;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAlign(BigDecimal newAlign)
  {
		BigDecimal oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__ALIGN, oldAlign, align));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MetaArgValue> getMeta()
  {
		if (meta == null)
		{
			meta = new EObjectContainmentEList<MetaArgValue>(MetaArgValue.class, this, LlvmPackage.LOAD__META);
		}
		return meta;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isAtomic()
  {
		return atomic;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAtomic(boolean newAtomic)
  {
		boolean oldAtomic = atomic;
		atomic = newAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__ATOMIC, oldAtomic, atomic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LOAD__ORDERING, oldOrdering, ordering));
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
			case LlvmPackage.LOAD__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.LOAD__ADDRESS:
				return basicSetAddress(null, msgs);
			case LlvmPackage.LOAD__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
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
			case LlvmPackage.LOAD__RESULT:
				return getResult();
			case LlvmPackage.LOAD__VOLATILE:
				return isVolatile();
			case LlvmPackage.LOAD__ADDRESS:
				return getAddress();
			case LlvmPackage.LOAD__ALIGN:
				return getAlign();
			case LlvmPackage.LOAD__META:
				return getMeta();
			case LlvmPackage.LOAD__ATOMIC:
				return isAtomic();
			case LlvmPackage.LOAD__ORDERING:
				return getOrdering();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID)
		{
			case LlvmPackage.LOAD__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.LOAD__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case LlvmPackage.LOAD__ADDRESS:
				setAddress((Parameter)newValue);
				return;
			case LlvmPackage.LOAD__ALIGN:
				setAlign((BigDecimal)newValue);
				return;
			case LlvmPackage.LOAD__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends MetaArgValue>)newValue);
				return;
			case LlvmPackage.LOAD__ATOMIC:
				setAtomic((Boolean)newValue);
				return;
			case LlvmPackage.LOAD__ORDERING:
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
			case LlvmPackage.LOAD__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.LOAD__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case LlvmPackage.LOAD__ADDRESS:
				setAddress((Parameter)null);
				return;
			case LlvmPackage.LOAD__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case LlvmPackage.LOAD__META:
				getMeta().clear();
				return;
			case LlvmPackage.LOAD__ATOMIC:
				setAtomic(ATOMIC_EDEFAULT);
				return;
			case LlvmPackage.LOAD__ORDERING:
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
			case LlvmPackage.LOAD__RESULT:
				return result != null;
			case LlvmPackage.LOAD__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case LlvmPackage.LOAD__ADDRESS:
				return address != null;
			case LlvmPackage.LOAD__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case LlvmPackage.LOAD__META:
				return meta != null && !meta.isEmpty();
			case LlvmPackage.LOAD__ATOMIC:
				return atomic != ATOMIC_EDEFAULT;
			case LlvmPackage.LOAD__ORDERING:
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
		result.append(", align: ");
		result.append(align);
		result.append(", atomic: ");
		result.append(atomic);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //LoadImpl
