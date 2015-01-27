/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TopLevelEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl#getModule <em>Module</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl#getLibs <em>Libs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopLevelEntityImpl extends AbstractElementImpl implements TopLevelEntity
{
  /**
   * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected static final String MODULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected String module = MODULE_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getLibs() <em>Libs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibs()
   * @generated
   * @ordered
   */
  protected EList<String> libs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelEntityImpl()
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
    return LlvmPackage.Literals.TOP_LEVEL_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(String newModule)
  {
    String oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.TOP_LEVEL_ENTITY__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.TOP_LEVEL_ENTITY__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLibs()
  {
    if (libs == null)
    {
      libs = new EDataTypeEList<String>(String.class, this, LlvmPackage.TOP_LEVEL_ENTITY__LIBS);
    }
    return libs;
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
      case LlvmPackage.TOP_LEVEL_ENTITY__MODULE:
        return getModule();
      case LlvmPackage.TOP_LEVEL_ENTITY__TARGET:
        return getTarget();
      case LlvmPackage.TOP_LEVEL_ENTITY__LIBS:
        return getLibs();
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
      case LlvmPackage.TOP_LEVEL_ENTITY__MODULE:
        setModule((String)newValue);
        return;
      case LlvmPackage.TOP_LEVEL_ENTITY__TARGET:
        setTarget((String)newValue);
        return;
      case LlvmPackage.TOP_LEVEL_ENTITY__LIBS:
        getLibs().clear();
        getLibs().addAll((Collection<? extends String>)newValue);
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
      case LlvmPackage.TOP_LEVEL_ENTITY__MODULE:
        setModule(MODULE_EDEFAULT);
        return;
      case LlvmPackage.TOP_LEVEL_ENTITY__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case LlvmPackage.TOP_LEVEL_ENTITY__LIBS:
        getLibs().clear();
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
      case LlvmPackage.TOP_LEVEL_ENTITY__MODULE:
        return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
      case LlvmPackage.TOP_LEVEL_ENTITY__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case LlvmPackage.TOP_LEVEL_ENTITY__LIBS:
        return libs != null && !libs.isEmpty();
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
    result.append(" (module: ");
    result.append(module);
    result.append(", target: ");
    result.append(target);
    result.append(", libs: ");
    result.append(libs);
    result.append(')');
    return result.toString();
  }

} //TopLevelEntityImpl
