/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getElseDestination <em>Else Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends InstructionImpl implements Branch
{
  /**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
  protected String destination = DESTINATION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
  protected Value condition;

  /**
	 * The default value of the '{@link #getElseDestination() <em>Else Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElseDestination()
	 * @generated
	 * @ordered
	 */
  protected static final String ELSE_DESTINATION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getElseDestination() <em>Else Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElseDestination()
	 * @generated
	 * @ordered
	 */
  protected String elseDestination = ELSE_DESTINATION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BranchImpl()
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
		return LlvmPackage.Literals.BRANCH;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDestination()
  {
		return destination;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDestination(String newDestination)
  {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATION, oldDestination, destination));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getCondition()
  {
		return condition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCondition(Value newCondition, NotificationChain msgs)
  {
		Value oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCondition(Value newCondition)
  {
		if (newCondition != condition)
		{
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDITION, newCondition, newCondition));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getElseDestination()
  {
		return elseDestination;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setElseDestination(String newElseDestination)
  {
		String oldElseDestination = elseDestination;
		elseDestination = newElseDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__ELSE_DESTINATION, oldElseDestination, elseDestination));
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
			case LlvmPackage.BRANCH__CONDITION:
				return basicSetCondition(null, msgs);
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
			case LlvmPackage.BRANCH__DESTINATION:
				return getDestination();
			case LlvmPackage.BRANCH__CONDITION:
				return getCondition();
			case LlvmPackage.BRANCH__ELSE_DESTINATION:
				return getElseDestination();
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
			case LlvmPackage.BRANCH__DESTINATION:
				setDestination((String)newValue);
				return;
			case LlvmPackage.BRANCH__CONDITION:
				setCondition((Value)newValue);
				return;
			case LlvmPackage.BRANCH__ELSE_DESTINATION:
				setElseDestination((String)newValue);
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
			case LlvmPackage.BRANCH__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__CONDITION:
				setCondition((Value)null);
				return;
			case LlvmPackage.BRANCH__ELSE_DESTINATION:
				setElseDestination(ELSE_DESTINATION_EDEFAULT);
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
			case LlvmPackage.BRANCH__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case LlvmPackage.BRANCH__CONDITION:
				return condition != null;
			case LlvmPackage.BRANCH__ELSE_DESTINATION:
				return ELSE_DESTINATION_EDEFAULT == null ? elseDestination != null : !ELSE_DESTINATION_EDEFAULT.equals(elseDestination);
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
		result.append(" (destination: ");
		result.append(destination);
		result.append(", elseDestination: ");
		result.append(elseDestination);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
