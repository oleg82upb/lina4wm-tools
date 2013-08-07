/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.ExtractElement;
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
 * An implementation of the model object '<em><b>Extract Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl#getVectortype <em>Vectortype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl#getVectorvalue <em>Vectorvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl#getIndextype <em>Indextype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractElementImpl extends StandartInstructionImpl implements ExtractElement
{
  /**
   * The cached value of the '{@link #getVectortype() <em>Vectortype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVectortype()
   * @generated
   * @ordered
   */
  protected TypeUse vectortype;

  /**
   * The cached value of the '{@link #getVectorvalue() <em>Vectorvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVectorvalue()
   * @generated
   * @ordered
   */
  protected Value vectorvalue;

  /**
   * The cached value of the '{@link #getIndextype() <em>Indextype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndextype()
   * @generated
   * @ordered
   */
  protected TypeUse indextype;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Value index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtractElementImpl()
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
    return LlvmPackage.Literals.EXTRACT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getVectortype()
  {
    return vectortype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVectortype(TypeUse newVectortype, NotificationChain msgs)
  {
    TypeUse oldVectortype = vectortype;
    vectortype = newVectortype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE, oldVectortype, newVectortype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVectortype(TypeUse newVectortype)
  {
    if (newVectortype != vectortype)
    {
      NotificationChain msgs = null;
      if (vectortype != null)
        msgs = ((InternalEObject)vectortype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE, null, msgs);
      if (newVectortype != null)
        msgs = ((InternalEObject)newVectortype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE, null, msgs);
      msgs = basicSetVectortype(newVectortype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE, newVectortype, newVectortype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVectorvalue()
  {
    return vectorvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVectorvalue(Value newVectorvalue, NotificationChain msgs)
  {
    Value oldVectorvalue = vectorvalue;
    vectorvalue = newVectorvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE, oldVectorvalue, newVectorvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVectorvalue(Value newVectorvalue)
  {
    if (newVectorvalue != vectorvalue)
    {
      NotificationChain msgs = null;
      if (vectorvalue != null)
        msgs = ((InternalEObject)vectorvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE, null, msgs);
      if (newVectorvalue != null)
        msgs = ((InternalEObject)newVectorvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE, null, msgs);
      msgs = basicSetVectorvalue(newVectorvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE, newVectorvalue, newVectorvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getIndextype()
  {
    return indextype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndextype(TypeUse newIndextype, NotificationChain msgs)
  {
    TypeUse oldIndextype = indextype;
    indextype = newIndextype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE, oldIndextype, newIndextype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndextype(TypeUse newIndextype)
  {
    if (newIndextype != indextype)
    {
      NotificationChain msgs = null;
      if (indextype != null)
        msgs = ((InternalEObject)indextype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE, null, msgs);
      if (newIndextype != null)
        msgs = ((InternalEObject)newIndextype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE, null, msgs);
      msgs = basicSetIndextype(newIndextype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE, newIndextype, newIndextype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Value newIndex, NotificationChain msgs)
  {
    Value oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Value newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.EXTRACT_ELEMENT__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.EXTRACT_ELEMENT__INDEX, newIndex, newIndex));
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
      case LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE:
        return basicSetVectortype(null, msgs);
      case LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE:
        return basicSetVectorvalue(null, msgs);
      case LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE:
        return basicSetIndextype(null, msgs);
      case LlvmPackage.EXTRACT_ELEMENT__INDEX:
        return basicSetIndex(null, msgs);
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
      case LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE:
        return getVectortype();
      case LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE:
        return getVectorvalue();
      case LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE:
        return getIndextype();
      case LlvmPackage.EXTRACT_ELEMENT__INDEX:
        return getIndex();
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
      case LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE:
        setVectortype((TypeUse)newValue);
        return;
      case LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE:
        setVectorvalue((Value)newValue);
        return;
      case LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE:
        setIndextype((TypeUse)newValue);
        return;
      case LlvmPackage.EXTRACT_ELEMENT__INDEX:
        setIndex((Value)newValue);
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
      case LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE:
        setVectortype((TypeUse)null);
        return;
      case LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE:
        setVectorvalue((Value)null);
        return;
      case LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE:
        setIndextype((TypeUse)null);
        return;
      case LlvmPackage.EXTRACT_ELEMENT__INDEX:
        setIndex((Value)null);
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
      case LlvmPackage.EXTRACT_ELEMENT__VECTORTYPE:
        return vectortype != null;
      case LlvmPackage.EXTRACT_ELEMENT__VECTORVALUE:
        return vectorvalue != null;
      case LlvmPackage.EXTRACT_ELEMENT__INDEXTYPE:
        return indextype != null;
      case LlvmPackage.EXTRACT_ELEMENT__INDEX:
        return index != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtractElementImpl
