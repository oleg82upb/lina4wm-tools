/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Attribute Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getListtype <em>Listtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getListvalue <em>Listvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getArgType <em>Arg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableAttributeAccessImpl extends InstructionImpl implements VariableAttributeAccess
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
	 * The cached value of the '{@link #getListtype() <em>Listtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getListtype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse listtype;

  /**
	 * The cached value of the '{@link #getListvalue() <em>Listvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getListvalue()
	 * @generated
	 * @ordered
	 */
  protected Value listvalue;

  /**
	 * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArgType()
	 * @generated
	 * @ordered
	 */
  protected TypeUse argType;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableAttributeAccessImpl()
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
		return LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getListtype()
  {
		return listtype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetListtype(TypeUse newListtype, NotificationChain msgs)
  {
		TypeUse oldListtype = listtype;
		listtype = newListtype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE, oldListtype, newListtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setListtype(TypeUse newListtype)
  {
		if (newListtype != listtype)
		{
			NotificationChain msgs = null;
			if (listtype != null)
				msgs = ((InternalEObject)listtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE, null, msgs);
			if (newListtype != null)
				msgs = ((InternalEObject)newListtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE, null, msgs);
			msgs = basicSetListtype(newListtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE, newListtype, newListtype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getListvalue()
  {
		return listvalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetListvalue(Value newListvalue, NotificationChain msgs)
  {
		Value oldListvalue = listvalue;
		listvalue = newListvalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE, oldListvalue, newListvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setListvalue(Value newListvalue)
  {
		if (newListvalue != listvalue)
		{
			NotificationChain msgs = null;
			if (listvalue != null)
				msgs = ((InternalEObject)listvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE, null, msgs);
			if (newListvalue != null)
				msgs = ((InternalEObject)newListvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE, null, msgs);
			msgs = basicSetListvalue(newListvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE, newListvalue, newListvalue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getArgType()
  {
		return argType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetArgType(TypeUse newArgType, NotificationChain msgs)
  {
		TypeUse oldArgType = argType;
		argType = newArgType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE, oldArgType, newArgType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setArgType(TypeUse newArgType)
  {
		if (newArgType != argType)
		{
			NotificationChain msgs = null;
			if (argType != null)
				msgs = ((InternalEObject)argType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE, null, msgs);
			if (newArgType != null)
				msgs = ((InternalEObject)newArgType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE, null, msgs);
			msgs = basicSetArgType(newArgType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE, newArgType, newArgType));
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
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE:
				return basicSetListtype(null, msgs);
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE:
				return basicSetListvalue(null, msgs);
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE:
				return basicSetArgType(null, msgs);
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
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
				return getResult();
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE:
				return getListtype();
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE:
				return getListvalue();
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE:
				return getArgType();
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
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE:
				setListtype((TypeUse)newValue);
				return;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE:
				setListvalue((Value)newValue);
				return;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE:
				setArgType((TypeUse)newValue);
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
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE:
				setListtype((TypeUse)null);
				return;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE:
				setListvalue((Value)null);
				return;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE:
				setArgType((TypeUse)null);
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
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
				return result != null;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE:
				return listtype != null;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE:
				return listvalue != null;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE:
				return argType != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableAttributeAccessImpl
