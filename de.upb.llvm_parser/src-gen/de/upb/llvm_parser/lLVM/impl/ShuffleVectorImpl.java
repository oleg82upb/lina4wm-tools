/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.lLVM.ShuffleVector;
import de.upb.llvm_parser.lLVM.TypeAndValue;

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
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl#getVector1 <em>Vector1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl#getVector2 <em>Vector2</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuffleVectorImpl extends InstructionImpl implements ShuffleVector
{
  /**
   * The cached value of the '{@link #getVector1() <em>Vector1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector1()
   * @generated
   * @ordered
   */
  protected TypeAndValue vector1;

  /**
   * The cached value of the '{@link #getVector2() <em>Vector2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector2()
   * @generated
   * @ordered
   */
  protected TypeAndValue vector2;

  /**
   * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
  protected TypeAndValue mask;

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
    return LLVMPackage.Literals.SHUFFLE_VECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getVector1()
  {
    return vector1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector1(TypeAndValue newVector1, NotificationChain msgs)
  {
    TypeAndValue oldVector1 = vector1;
    vector1 = newVector1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.SHUFFLE_VECTOR__VECTOR1, oldVector1, newVector1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector1(TypeAndValue newVector1)
  {
    if (newVector1 != vector1)
    {
      NotificationChain msgs = null;
      if (vector1 != null)
        msgs = ((InternalEObject)vector1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SHUFFLE_VECTOR__VECTOR1, null, msgs);
      if (newVector1 != null)
        msgs = ((InternalEObject)newVector1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SHUFFLE_VECTOR__VECTOR1, null, msgs);
      msgs = basicSetVector1(newVector1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.SHUFFLE_VECTOR__VECTOR1, newVector1, newVector1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getVector2()
  {
    return vector2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector2(TypeAndValue newVector2, NotificationChain msgs)
  {
    TypeAndValue oldVector2 = vector2;
    vector2 = newVector2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.SHUFFLE_VECTOR__VECTOR2, oldVector2, newVector2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector2(TypeAndValue newVector2)
  {
    if (newVector2 != vector2)
    {
      NotificationChain msgs = null;
      if (vector2 != null)
        msgs = ((InternalEObject)vector2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SHUFFLE_VECTOR__VECTOR2, null, msgs);
      if (newVector2 != null)
        msgs = ((InternalEObject)newVector2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SHUFFLE_VECTOR__VECTOR2, null, msgs);
      msgs = basicSetVector2(newVector2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.SHUFFLE_VECTOR__VECTOR2, newVector2, newVector2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getMask()
  {
    return mask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMask(TypeAndValue newMask, NotificationChain msgs)
  {
    TypeAndValue oldMask = mask;
    mask = newMask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.SHUFFLE_VECTOR__MASK, oldMask, newMask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMask(TypeAndValue newMask)
  {
    if (newMask != mask)
    {
      NotificationChain msgs = null;
      if (mask != null)
        msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SHUFFLE_VECTOR__MASK, null, msgs);
      if (newMask != null)
        msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SHUFFLE_VECTOR__MASK, null, msgs);
      msgs = basicSetMask(newMask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.SHUFFLE_VECTOR__MASK, newMask, newMask));
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
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR1:
        return basicSetVector1(null, msgs);
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR2:
        return basicSetVector2(null, msgs);
      case LLVMPackage.SHUFFLE_VECTOR__MASK:
        return basicSetMask(null, msgs);
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
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR1:
        return getVector1();
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR2:
        return getVector2();
      case LLVMPackage.SHUFFLE_VECTOR__MASK:
        return getMask();
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
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR1:
        setVector1((TypeAndValue)newValue);
        return;
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR2:
        setVector2((TypeAndValue)newValue);
        return;
      case LLVMPackage.SHUFFLE_VECTOR__MASK:
        setMask((TypeAndValue)newValue);
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
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR1:
        setVector1((TypeAndValue)null);
        return;
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR2:
        setVector2((TypeAndValue)null);
        return;
      case LLVMPackage.SHUFFLE_VECTOR__MASK:
        setMask((TypeAndValue)null);
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
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR1:
        return vector1 != null;
      case LLVMPackage.SHUFFLE_VECTOR__VECTOR2:
        return vector2 != null;
      case LLVMPackage.SHUFFLE_VECTOR__MASK:
        return mask != null;
    }
    return super.eIsSet(featureID);
  }

} //ShuffleVectorImpl
