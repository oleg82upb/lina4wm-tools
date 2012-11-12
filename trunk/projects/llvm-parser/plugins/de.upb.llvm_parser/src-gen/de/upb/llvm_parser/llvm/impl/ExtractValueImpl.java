/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Aggregate;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.LlvmPackage;

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
 * An implementation of the model object '<em><b>Extract Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractValueImpl extends InstructionImpl implements ExtractValue
{
  /**
   * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregate()
   * @generated
   * @ordered
   */
  protected Aggregate aggregate;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected EList<Integer> index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtractValueImpl()
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
    return LlvmPackage.Literals.EXTRACT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate getAggregate()
  {
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs)
  {
    Aggregate oldAggregate = aggregate;
    aggregate = newAggregate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_VALUE__AGGREGATE, oldAggregate, newAggregate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregate(Aggregate newAggregate)
  {
    if (newAggregate != aggregate)
    {
      NotificationChain msgs = null;
      if (aggregate != null)
        msgs = ((InternalEObject)aggregate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_VALUE__AGGREGATE, null, msgs);
      if (newAggregate != null)
        msgs = ((InternalEObject)newAggregate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_VALUE__AGGREGATE, null, msgs);
      msgs = basicSetAggregate(newAggregate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_VALUE__AGGREGATE, newAggregate, newAggregate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_VALUE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIndex()
  {
    if (index == null)
    {
      index = new EDataTypeEList<Integer>(Integer.class, this, LlvmPackage.EXTRACT_VALUE__INDEX);
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
      case LlvmPackage.EXTRACT_VALUE__AGGREGATE:
        return basicSetAggregate(null, msgs);
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
      case LlvmPackage.EXTRACT_VALUE__AGGREGATE:
        return getAggregate();
      case LlvmPackage.EXTRACT_VALUE__TYPE:
        return getType();
      case LlvmPackage.EXTRACT_VALUE__INDEX:
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
      case LlvmPackage.EXTRACT_VALUE__AGGREGATE:
        setAggregate((Aggregate)newValue);
        return;
      case LlvmPackage.EXTRACT_VALUE__TYPE:
        setType((String)newValue);
        return;
      case LlvmPackage.EXTRACT_VALUE__INDEX:
        getIndex().clear();
        getIndex().addAll((Collection<? extends Integer>)newValue);
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
      case LlvmPackage.EXTRACT_VALUE__AGGREGATE:
        setAggregate((Aggregate)null);
        return;
      case LlvmPackage.EXTRACT_VALUE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LlvmPackage.EXTRACT_VALUE__INDEX:
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
      case LlvmPackage.EXTRACT_VALUE__AGGREGATE:
        return aggregate != null;
      case LlvmPackage.EXTRACT_VALUE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LlvmPackage.EXTRACT_VALUE__INDEX:
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
    result.append(" (type: ");
    result.append(type);
    result.append(", index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //ExtractValueImpl
