/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ValuePair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ValuePairImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ValuePairImpl#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuePairImpl extends CompareImpl implements ValuePair
{
  /**
   * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected static final String VALUE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected String value1 = VALUE1_EDEFAULT;

  /**
   * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue2()
   * @generated
   * @ordered
   */
  protected static final String VALUE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue2()
   * @generated
   * @ordered
   */
  protected String value2 = VALUE2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValuePairImpl()
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
    return LlvmPackage.Literals.VALUE_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue1()
  {
    return value1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue1(String newValue1)
  {
    String oldValue1 = value1;
    value1 = newValue1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VALUE_PAIR__VALUE1, oldValue1, value1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue2()
  {
    return value2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue2(String newValue2)
  {
    String oldValue2 = value2;
    value2 = newValue2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VALUE_PAIR__VALUE2, oldValue2, value2));
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
      case LlvmPackage.VALUE_PAIR__VALUE1:
        return getValue1();
      case LlvmPackage.VALUE_PAIR__VALUE2:
        return getValue2();
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
      case LlvmPackage.VALUE_PAIR__VALUE1:
        setValue1((String)newValue);
        return;
      case LlvmPackage.VALUE_PAIR__VALUE2:
        setValue2((String)newValue);
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
      case LlvmPackage.VALUE_PAIR__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case LlvmPackage.VALUE_PAIR__VALUE2:
        setValue2(VALUE2_EDEFAULT);
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
      case LlvmPackage.VALUE_PAIR__VALUE1:
        return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
      case LlvmPackage.VALUE_PAIR__VALUE2:
        return VALUE2_EDEFAULT == null ? value2 != null : !VALUE2_EDEFAULT.equals(value2);
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
    result.append(" (value1: ");
    result.append(value1);
    result.append(", value2: ");
    result.append(value2);
    result.append(')');
    return result.toString();
  }

} //ValuePairImpl
