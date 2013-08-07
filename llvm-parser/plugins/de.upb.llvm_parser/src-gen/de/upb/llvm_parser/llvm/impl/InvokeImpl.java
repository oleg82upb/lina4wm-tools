/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getFunctiontype <em>Functiontype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getTotype <em>Totype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getTovalue <em>Tovalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwindtype <em>Unwindtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwindvalue <em>Unwindvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends ReturnInstructionImpl implements Invoke
{
  /**
   * The cached value of the '{@link #getFunctiontype() <em>Functiontype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctiontype()
   * @generated
   * @ordered
   */
  protected TypeUse functiontype;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Address name;

  /**
   * The cached value of the '{@link #getPList() <em>PList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPList()
   * @generated
   * @ordered
   */
  protected ParameterList pList;

  /**
   * The cached value of the '{@link #getTotype() <em>Totype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotype()
   * @generated
   * @ordered
   */
  protected TypeUse totype;

  /**
   * The cached value of the '{@link #getTovalue() <em>Tovalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTovalue()
   * @generated
   * @ordered
   */
  protected Value tovalue;

  /**
   * The cached value of the '{@link #getUnwindtype() <em>Unwindtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnwindtype()
   * @generated
   * @ordered
   */
  protected TypeUse unwindtype;

  /**
   * The cached value of the '{@link #getUnwindvalue() <em>Unwindvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnwindvalue()
   * @generated
   * @ordered
   */
  protected Value unwindvalue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokeImpl()
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
    return LlvmPackage.Literals.INVOKE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getFunctiontype()
  {
    return functiontype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctiontype(TypeUse newFunctiontype, NotificationChain msgs)
  {
    TypeUse oldFunctiontype = functiontype;
    functiontype = newFunctiontype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTIONTYPE, oldFunctiontype, newFunctiontype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctiontype(TypeUse newFunctiontype)
  {
    if (newFunctiontype != functiontype)
    {
      NotificationChain msgs = null;
      if (functiontype != null)
        msgs = ((InternalEObject)functiontype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__FUNCTIONTYPE, null, msgs);
      if (newFunctiontype != null)
        msgs = ((InternalEObject)newFunctiontype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__FUNCTIONTYPE, null, msgs);
      msgs = basicSetFunctiontype(newFunctiontype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTIONTYPE, newFunctiontype, newFunctiontype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Address newName, NotificationChain msgs)
  {
    Address oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Address newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getPList()
  {
    return pList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPList(ParameterList newPList, NotificationChain msgs)
  {
    ParameterList oldPList = pList;
    pList = newPList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__PLIST, oldPList, newPList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPList(ParameterList newPList)
  {
    if (newPList != pList)
    {
      NotificationChain msgs = null;
      if (pList != null)
        msgs = ((InternalEObject)pList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__PLIST, null, msgs);
      if (newPList != null)
        msgs = ((InternalEObject)newPList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__PLIST, null, msgs);
      msgs = basicSetPList(newPList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__PLIST, newPList, newPList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getTotype()
  {
    return totype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTotype(TypeUse newTotype, NotificationChain msgs)
  {
    TypeUse oldTotype = totype;
    totype = newTotype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TOTYPE, oldTotype, newTotype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTotype(TypeUse newTotype)
  {
    if (newTotype != totype)
    {
      NotificationChain msgs = null;
      if (totype != null)
        msgs = ((InternalEObject)totype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__TOTYPE, null, msgs);
      if (newTotype != null)
        msgs = ((InternalEObject)newTotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__TOTYPE, null, msgs);
      msgs = basicSetTotype(newTotype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TOTYPE, newTotype, newTotype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getTovalue()
  {
    return tovalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTovalue(Value newTovalue, NotificationChain msgs)
  {
    Value oldTovalue = tovalue;
    tovalue = newTovalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TOVALUE, oldTovalue, newTovalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTovalue(Value newTovalue)
  {
    if (newTovalue != tovalue)
    {
      NotificationChain msgs = null;
      if (tovalue != null)
        msgs = ((InternalEObject)tovalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__TOVALUE, null, msgs);
      if (newTovalue != null)
        msgs = ((InternalEObject)newTovalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__TOVALUE, null, msgs);
      msgs = basicSetTovalue(newTovalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TOVALUE, newTovalue, newTovalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getUnwindtype()
  {
    return unwindtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnwindtype(TypeUse newUnwindtype, NotificationChain msgs)
  {
    TypeUse oldUnwindtype = unwindtype;
    unwindtype = newUnwindtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWINDTYPE, oldUnwindtype, newUnwindtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnwindtype(TypeUse newUnwindtype)
  {
    if (newUnwindtype != unwindtype)
    {
      NotificationChain msgs = null;
      if (unwindtype != null)
        msgs = ((InternalEObject)unwindtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__UNWINDTYPE, null, msgs);
      if (newUnwindtype != null)
        msgs = ((InternalEObject)newUnwindtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__UNWINDTYPE, null, msgs);
      msgs = basicSetUnwindtype(newUnwindtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWINDTYPE, newUnwindtype, newUnwindtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getUnwindvalue()
  {
    return unwindvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnwindvalue(Value newUnwindvalue, NotificationChain msgs)
  {
    Value oldUnwindvalue = unwindvalue;
    unwindvalue = newUnwindvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWINDVALUE, oldUnwindvalue, newUnwindvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnwindvalue(Value newUnwindvalue)
  {
    if (newUnwindvalue != unwindvalue)
    {
      NotificationChain msgs = null;
      if (unwindvalue != null)
        msgs = ((InternalEObject)unwindvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__UNWINDVALUE, null, msgs);
      if (newUnwindvalue != null)
        msgs = ((InternalEObject)newUnwindvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__UNWINDVALUE, null, msgs);
      msgs = basicSetUnwindvalue(newUnwindvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWINDVALUE, newUnwindvalue, newUnwindvalue));
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
      case LlvmPackage.INVOKE__FUNCTIONTYPE:
        return basicSetFunctiontype(null, msgs);
      case LlvmPackage.INVOKE__NAME:
        return basicSetName(null, msgs);
      case LlvmPackage.INVOKE__PLIST:
        return basicSetPList(null, msgs);
      case LlvmPackage.INVOKE__TOTYPE:
        return basicSetTotype(null, msgs);
      case LlvmPackage.INVOKE__TOVALUE:
        return basicSetTovalue(null, msgs);
      case LlvmPackage.INVOKE__UNWINDTYPE:
        return basicSetUnwindtype(null, msgs);
      case LlvmPackage.INVOKE__UNWINDVALUE:
        return basicSetUnwindvalue(null, msgs);
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
      case LlvmPackage.INVOKE__FUNCTIONTYPE:
        return getFunctiontype();
      case LlvmPackage.INVOKE__NAME:
        return getName();
      case LlvmPackage.INVOKE__PLIST:
        return getPList();
      case LlvmPackage.INVOKE__TOTYPE:
        return getTotype();
      case LlvmPackage.INVOKE__TOVALUE:
        return getTovalue();
      case LlvmPackage.INVOKE__UNWINDTYPE:
        return getUnwindtype();
      case LlvmPackage.INVOKE__UNWINDVALUE:
        return getUnwindvalue();
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
      case LlvmPackage.INVOKE__FUNCTIONTYPE:
        setFunctiontype((TypeUse)newValue);
        return;
      case LlvmPackage.INVOKE__NAME:
        setName((Address)newValue);
        return;
      case LlvmPackage.INVOKE__PLIST:
        setPList((ParameterList)newValue);
        return;
      case LlvmPackage.INVOKE__TOTYPE:
        setTotype((TypeUse)newValue);
        return;
      case LlvmPackage.INVOKE__TOVALUE:
        setTovalue((Value)newValue);
        return;
      case LlvmPackage.INVOKE__UNWINDTYPE:
        setUnwindtype((TypeUse)newValue);
        return;
      case LlvmPackage.INVOKE__UNWINDVALUE:
        setUnwindvalue((Value)newValue);
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
      case LlvmPackage.INVOKE__FUNCTIONTYPE:
        setFunctiontype((TypeUse)null);
        return;
      case LlvmPackage.INVOKE__NAME:
        setName((Address)null);
        return;
      case LlvmPackage.INVOKE__PLIST:
        setPList((ParameterList)null);
        return;
      case LlvmPackage.INVOKE__TOTYPE:
        setTotype((TypeUse)null);
        return;
      case LlvmPackage.INVOKE__TOVALUE:
        setTovalue((Value)null);
        return;
      case LlvmPackage.INVOKE__UNWINDTYPE:
        setUnwindtype((TypeUse)null);
        return;
      case LlvmPackage.INVOKE__UNWINDVALUE:
        setUnwindvalue((Value)null);
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
      case LlvmPackage.INVOKE__FUNCTIONTYPE:
        return functiontype != null;
      case LlvmPackage.INVOKE__NAME:
        return name != null;
      case LlvmPackage.INVOKE__PLIST:
        return pList != null;
      case LlvmPackage.INVOKE__TOTYPE:
        return totype != null;
      case LlvmPackage.INVOKE__TOVALUE:
        return tovalue != null;
      case LlvmPackage.INVOKE__UNWINDTYPE:
        return unwindtype != null;
      case LlvmPackage.INVOKE__UNWINDVALUE:
        return unwindvalue != null;
    }
    return super.eIsSet(featureID);
  }

} //InvokeImpl
