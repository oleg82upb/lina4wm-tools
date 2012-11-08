/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.JumpTable;
import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.lLVM.Switch;
import de.upb.llvm_parser.lLVM.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.SwitchImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.SwitchImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.SwitchImpl#getJTable <em>JTable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends InstructionImpl implements Switch
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected TypeAndValue value;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected TypeAndValue default_;

  /**
   * The cached value of the '{@link #getJTable() <em>JTable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJTable()
   * @generated
   * @ordered
   */
  protected JumpTable jTable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return LLVMPackage.Literals.SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(TypeAndValue newValue, NotificationChain msgs)
  {
    TypeAndValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.SWITCH__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(TypeAndValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SWITCH__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SWITCH__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.SWITCH__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(TypeAndValue newDefault, NotificationChain msgs)
  {
    TypeAndValue oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.SWITCH__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(TypeAndValue newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SWITCH__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SWITCH__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.SWITCH__DEFAULT, newDefault, newDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JumpTable getJTable()
  {
    return jTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJTable(JumpTable newJTable, NotificationChain msgs)
  {
    JumpTable oldJTable = jTable;
    jTable = newJTable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.SWITCH__JTABLE, oldJTable, newJTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJTable(JumpTable newJTable)
  {
    if (newJTable != jTable)
    {
      NotificationChain msgs = null;
      if (jTable != null)
        msgs = ((InternalEObject)jTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SWITCH__JTABLE, null, msgs);
      if (newJTable != null)
        msgs = ((InternalEObject)newJTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.SWITCH__JTABLE, null, msgs);
      msgs = basicSetJTable(newJTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.SWITCH__JTABLE, newJTable, newJTable));
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
      case LLVMPackage.SWITCH__VALUE:
        return basicSetValue(null, msgs);
      case LLVMPackage.SWITCH__DEFAULT:
        return basicSetDefault(null, msgs);
      case LLVMPackage.SWITCH__JTABLE:
        return basicSetJTable(null, msgs);
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
      case LLVMPackage.SWITCH__VALUE:
        return getValue();
      case LLVMPackage.SWITCH__DEFAULT:
        return getDefault();
      case LLVMPackage.SWITCH__JTABLE:
        return getJTable();
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
      case LLVMPackage.SWITCH__VALUE:
        setValue((TypeAndValue)newValue);
        return;
      case LLVMPackage.SWITCH__DEFAULT:
        setDefault((TypeAndValue)newValue);
        return;
      case LLVMPackage.SWITCH__JTABLE:
        setJTable((JumpTable)newValue);
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
      case LLVMPackage.SWITCH__VALUE:
        setValue((TypeAndValue)null);
        return;
      case LLVMPackage.SWITCH__DEFAULT:
        setDefault((TypeAndValue)null);
        return;
      case LLVMPackage.SWITCH__JTABLE:
        setJTable((JumpTable)null);
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
      case LLVMPackage.SWITCH__VALUE:
        return value != null;
      case LLVMPackage.SWITCH__DEFAULT:
        return default_ != null;
      case LLVMPackage.SWITCH__JTABLE:
        return jTable != null;
    }
    return super.eIsSet(featureID);
  }

} //SwitchImpl
