/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ReturnImpl#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ReturnImpl#getReturnvalue <em>Returnvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnImpl extends InstructionImpl implements Return
{
  /**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse returntype;

  /**
	 * The cached value of the '{@link #getReturnvalue() <em>Returnvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReturnvalue()
	 * @generated
	 * @ordered
	 */
  protected Value returnvalue;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ReturnImpl()
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
		return LlvmPackage.Literals.RETURN;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getReturntype()
  {
		return returntype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReturntype(TypeUse newReturntype, NotificationChain msgs)
  {
		TypeUse oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.RETURN__RETURNTYPE, oldReturntype, newReturntype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReturntype(TypeUse newReturntype)
  {
		if (newReturntype != returntype)
		{
			NotificationChain msgs = null;
			if (returntype != null)
				msgs = ((InternalEObject)returntype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RETURN__RETURNTYPE, null, msgs);
			if (newReturntype != null)
				msgs = ((InternalEObject)newReturntype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RETURN__RETURNTYPE, null, msgs);
			msgs = basicSetReturntype(newReturntype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.RETURN__RETURNTYPE, newReturntype, newReturntype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getReturnvalue()
  {
		return returnvalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReturnvalue(Value newReturnvalue, NotificationChain msgs)
  {
		Value oldReturnvalue = returnvalue;
		returnvalue = newReturnvalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.RETURN__RETURNVALUE, oldReturnvalue, newReturnvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReturnvalue(Value newReturnvalue)
  {
		if (newReturnvalue != returnvalue)
		{
			NotificationChain msgs = null;
			if (returnvalue != null)
				msgs = ((InternalEObject)returnvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RETURN__RETURNVALUE, null, msgs);
			if (newReturnvalue != null)
				msgs = ((InternalEObject)newReturnvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RETURN__RETURNVALUE, null, msgs);
			msgs = basicSetReturnvalue(newReturnvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.RETURN__RETURNVALUE, newReturnvalue, newReturnvalue));
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
			case LlvmPackage.RETURN__RETURNTYPE:
				return basicSetReturntype(null, msgs);
			case LlvmPackage.RETURN__RETURNVALUE:
				return basicSetReturnvalue(null, msgs);
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
			case LlvmPackage.RETURN__RETURNTYPE:
				return getReturntype();
			case LlvmPackage.RETURN__RETURNVALUE:
				return getReturnvalue();
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
			case LlvmPackage.RETURN__RETURNTYPE:
				setReturntype((TypeUse)newValue);
				return;
			case LlvmPackage.RETURN__RETURNVALUE:
				setReturnvalue((Value)newValue);
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
			case LlvmPackage.RETURN__RETURNTYPE:
				setReturntype((TypeUse)null);
				return;
			case LlvmPackage.RETURN__RETURNVALUE:
				setReturnvalue((Value)null);
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
			case LlvmPackage.RETURN__RETURNTYPE:
				return returntype != null;
			case LlvmPackage.RETURN__RETURNVALUE:
				return returnvalue != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnImpl
