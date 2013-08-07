/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shuffle Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal1type <em>Val1type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal1value <em>Val1value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal2type <em>Val2type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getVal2value <em>Val2value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getMasktype <em>Masktype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getMaskvalue <em>Maskvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuffleVectorImpl extends StandartInstructionImpl implements ShuffleVector
{
  /**
   * The cached value of the '{@link #getVal1type() <em>Val1type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal1type()
   * @generated
   * @ordered
   */
  protected TypeUse val1type;

  /**
   * The cached value of the '{@link #getVal1value() <em>Val1value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal1value()
   * @generated
   * @ordered
   */
  protected Value val1value;

  /**
   * The cached value of the '{@link #getVal2type() <em>Val2type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2type()
   * @generated
   * @ordered
   */
  protected TypeUse val2type;

  /**
   * The cached value of the '{@link #getVal2value() <em>Val2value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2value()
   * @generated
   * @ordered
   */
  protected Value val2value;

  /**
   * The cached value of the '{@link #getMasktype() <em>Masktype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasktype()
   * @generated
   * @ordered
   */
  protected TypeUse masktype;

  /**
   * The cached value of the '{@link #getMaskvalue() <em>Maskvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaskvalue()
   * @generated
   * @ordered
   */
  protected Value maskvalue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShuffleVectorImpl()
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
    return LlvmPackage.Literals.SHUFFLE_VECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getVal1type()
  {
    return val1type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal1type(TypeUse newVal1type, NotificationChain msgs)
  {
    TypeUse oldVal1type = val1type;
    val1type = newVal1type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE, oldVal1type, newVal1type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal1type(TypeUse newVal1type)
  {
    if (newVal1type != val1type)
    {
      NotificationChain msgs = null;
      if (val1type != null)
        msgs = ((InternalEObject)val1type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE, null, msgs);
      if (newVal1type != null)
        msgs = ((InternalEObject)newVal1type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE, null, msgs);
      msgs = basicSetVal1type(newVal1type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE, newVal1type, newVal1type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVal1value()
  {
    return val1value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal1value(Value newVal1value, NotificationChain msgs)
  {
    Value oldVal1value = val1value;
    val1value = newVal1value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE, oldVal1value, newVal1value);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal1value(Value newVal1value)
  {
    if (newVal1value != val1value)
    {
      NotificationChain msgs = null;
      if (val1value != null)
        msgs = ((InternalEObject)val1value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE, null, msgs);
      if (newVal1value != null)
        msgs = ((InternalEObject)newVal1value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE, null, msgs);
      msgs = basicSetVal1value(newVal1value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE, newVal1value, newVal1value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getVal2type()
  {
    return val2type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal2type(TypeUse newVal2type, NotificationChain msgs)
  {
    TypeUse oldVal2type = val2type;
    val2type = newVal2type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE, oldVal2type, newVal2type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal2type(TypeUse newVal2type)
  {
    if (newVal2type != val2type)
    {
      NotificationChain msgs = null;
      if (val2type != null)
        msgs = ((InternalEObject)val2type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE, null, msgs);
      if (newVal2type != null)
        msgs = ((InternalEObject)newVal2type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE, null, msgs);
      msgs = basicSetVal2type(newVal2type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE, newVal2type, newVal2type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVal2value()
  {
    return val2value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal2value(Value newVal2value, NotificationChain msgs)
  {
    Value oldVal2value = val2value;
    val2value = newVal2value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE, oldVal2value, newVal2value);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal2value(Value newVal2value)
  {
    if (newVal2value != val2value)
    {
      NotificationChain msgs = null;
      if (val2value != null)
        msgs = ((InternalEObject)val2value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE, null, msgs);
      if (newVal2value != null)
        msgs = ((InternalEObject)newVal2value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE, null, msgs);
      msgs = basicSetVal2value(newVal2value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE, newVal2value, newVal2value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getMasktype()
  {
    return masktype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMasktype(TypeUse newMasktype, NotificationChain msgs)
  {
    TypeUse oldMasktype = masktype;
    masktype = newMasktype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASKTYPE, oldMasktype, newMasktype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMasktype(TypeUse newMasktype)
  {
    if (newMasktype != masktype)
    {
      NotificationChain msgs = null;
      if (masktype != null)
        msgs = ((InternalEObject)masktype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__MASKTYPE, null, msgs);
      if (newMasktype != null)
        msgs = ((InternalEObject)newMasktype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__MASKTYPE, null, msgs);
      msgs = basicSetMasktype(newMasktype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASKTYPE, newMasktype, newMasktype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMaskvalue()
  {
    return maskvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaskvalue(Value newMaskvalue, NotificationChain msgs)
  {
    Value oldMaskvalue = maskvalue;
    maskvalue = newMaskvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASKVALUE, oldMaskvalue, newMaskvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaskvalue(Value newMaskvalue)
  {
    if (newMaskvalue != maskvalue)
    {
      NotificationChain msgs = null;
      if (maskvalue != null)
        msgs = ((InternalEObject)maskvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__MASKVALUE, null, msgs);
      if (newMaskvalue != null)
        msgs = ((InternalEObject)newMaskvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__MASKVALUE, null, msgs);
      msgs = basicSetMaskvalue(newMaskvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASKVALUE, newMaskvalue, newMaskvalue));
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
      case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
        return basicSetVal1type(null, msgs);
      case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
        return basicSetVal1value(null, msgs);
      case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
        return basicSetVal2type(null, msgs);
      case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
        return basicSetVal2value(null, msgs);
      case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
        return basicSetMasktype(null, msgs);
      case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
        return basicSetMaskvalue(null, msgs);
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
      case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
        return getVal1type();
      case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
        return getVal1value();
      case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
        return getVal2type();
      case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
        return getVal2value();
      case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
        return getMasktype();
      case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
        return getMaskvalue();
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
      case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
        setVal1type((TypeUse)newValue);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
        setVal1value((Value)newValue);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
        setVal2type((TypeUse)newValue);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
        setVal2value((Value)newValue);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
        setMasktype((TypeUse)newValue);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
        setMaskvalue((Value)newValue);
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
      case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
        setVal1type((TypeUse)null);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
        setVal1value((Value)null);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
        setVal2type((TypeUse)null);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
        setVal2value((Value)null);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
        setMasktype((TypeUse)null);
        return;
      case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
        setMaskvalue((Value)null);
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
      case LlvmPackage.SHUFFLE_VECTOR__VAL1TYPE:
        return val1type != null;
      case LlvmPackage.SHUFFLE_VECTOR__VAL1VALUE:
        return val1value != null;
      case LlvmPackage.SHUFFLE_VECTOR__VAL2TYPE:
        return val2type != null;
      case LlvmPackage.SHUFFLE_VECTOR__VAL2VALUE:
        return val2value != null;
      case LlvmPackage.SHUFFLE_VECTOR__MASKTYPE:
        return masktype != null;
      case LlvmPackage.SHUFFLE_VECTOR__MASKVALUE:
        return maskvalue != null;
    }
    return super.eIsSet(featureID);
  }

} //ShuffleVectorImpl
