/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getInserttype <em>Inserttype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getInsertvalue <em>Insertvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertValueImpl extends InstructionImpl implements InsertValue
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
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
  protected Structure struct;

  /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
  protected Value value;

  /**
	 * The cached value of the '{@link #getInserttype() <em>Inserttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInserttype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse inserttype;

  /**
	 * The cached value of the '{@link #getInsertvalue() <em>Insertvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInsertvalue()
	 * @generated
	 * @ordered
	 */
  protected Value insertvalue;

  /**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
  protected EList<BigDecimal> index;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InsertValueImpl()
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
		return LlvmPackage.Literals.INSERT_VALUE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Structure getStruct()
  {
		return struct;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetStruct(Structure newStruct, NotificationChain msgs)
  {
		Structure oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStruct(Structure newStruct)
  {
		if (newStruct != struct)
		{
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__STRUCT, newStruct, newStruct));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getValue()
  {
		return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue(Value newValue)
  {
		if (newValue != value)
		{
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__VALUE, newValue, newValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getInserttype()
  {
		return inserttype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInserttype(TypeUse newInserttype, NotificationChain msgs)
  {
		TypeUse oldInserttype = inserttype;
		inserttype = newInserttype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__INSERTTYPE, oldInserttype, newInserttype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInserttype(TypeUse newInserttype)
  {
		if (newInserttype != inserttype)
		{
			NotificationChain msgs = null;
			if (inserttype != null)
				msgs = ((InternalEObject)inserttype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__INSERTTYPE, null, msgs);
			if (newInserttype != null)
				msgs = ((InternalEObject)newInserttype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__INSERTTYPE, null, msgs);
			msgs = basicSetInserttype(newInserttype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__INSERTTYPE, newInserttype, newInserttype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getInsertvalue()
  {
		return insertvalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInsertvalue(Value newInsertvalue, NotificationChain msgs)
  {
		Value oldInsertvalue = insertvalue;
		insertvalue = newInsertvalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__INSERTVALUE, oldInsertvalue, newInsertvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInsertvalue(Value newInsertvalue)
  {
		if (newInsertvalue != insertvalue)
		{
			NotificationChain msgs = null;
			if (insertvalue != null)
				msgs = ((InternalEObject)insertvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__INSERTVALUE, null, msgs);
			if (newInsertvalue != null)
				msgs = ((InternalEObject)newInsertvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__INSERTVALUE, null, msgs);
			msgs = basicSetInsertvalue(newInsertvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__INSERTVALUE, newInsertvalue, newInsertvalue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<BigDecimal> getIndex()
  {
		if (index == null)
		{
			index = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, LlvmPackage.INSERT_VALUE__INDEX);
		}
		return index;
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
			case LlvmPackage.INSERT_VALUE__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.INSERT_VALUE__STRUCT:
				return basicSetStruct(null, msgs);
			case LlvmPackage.INSERT_VALUE__VALUE:
				return basicSetValue(null, msgs);
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				return basicSetInserttype(null, msgs);
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				return basicSetInsertvalue(null, msgs);
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
			case LlvmPackage.INSERT_VALUE__RESULT:
				return getResult();
			case LlvmPackage.INSERT_VALUE__STRUCT:
				return getStruct();
			case LlvmPackage.INSERT_VALUE__VALUE:
				return getValue();
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				return getInserttype();
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				return getInsertvalue();
			case LlvmPackage.INSERT_VALUE__INDEX:
				return getIndex();
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
			case LlvmPackage.INSERT_VALUE__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__STRUCT:
				setStruct((Structure)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__VALUE:
				setValue((Value)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				setInserttype((TypeUse)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				setInsertvalue((Value)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends BigDecimal>)newValue);
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
			case LlvmPackage.INSERT_VALUE__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.INSERT_VALUE__STRUCT:
				setStruct((Structure)null);
				return;
			case LlvmPackage.INSERT_VALUE__VALUE:
				setValue((Value)null);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				setInserttype((TypeUse)null);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				setInsertvalue((Value)null);
				return;
			case LlvmPackage.INSERT_VALUE__INDEX:
				getIndex().clear();
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
			case LlvmPackage.INSERT_VALUE__RESULT:
				return result != null;
			case LlvmPackage.INSERT_VALUE__STRUCT:
				return struct != null;
			case LlvmPackage.INSERT_VALUE__VALUE:
				return value != null;
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				return inserttype != null;
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				return insertvalue != null;
			case LlvmPackage.INSERT_VALUE__INDEX:
				return index != null && !index.isEmpty();
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //InsertValueImpl
