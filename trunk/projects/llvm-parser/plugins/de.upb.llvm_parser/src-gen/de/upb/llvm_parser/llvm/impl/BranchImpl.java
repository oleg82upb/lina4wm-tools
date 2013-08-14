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
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getCondvalue <em>Condvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelTrue <em>Label True</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelFalse <em>Label False</em>}</li>
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
	 * The cached value of the '{@link #getCondvalue() <em>Condvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCondvalue()
	 * @generated
	 * @ordered
	 */
  protected Value condvalue;

  /**
	 * The default value of the '{@link #getLabelTrue() <em>Label True</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabelTrue()
	 * @generated
	 * @ordered
	 */
  protected static final String LABEL_TRUE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLabelTrue() <em>Label True</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabelTrue()
	 * @generated
	 * @ordered
	 */
  protected String labelTrue = LABEL_TRUE_EDEFAULT;

  /**
	 * The default value of the '{@link #getLabelFalse() <em>Label False</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabelFalse()
	 * @generated
	 * @ordered
	 */
  protected static final String LABEL_FALSE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLabelFalse() <em>Label False</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabelFalse()
	 * @generated
	 * @ordered
	 */
  protected String labelFalse = LABEL_FALSE_EDEFAULT;

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
  public Value getCondvalue()
  {
		return condvalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCondvalue(Value newCondvalue, NotificationChain msgs)
  {
		Value oldCondvalue = condvalue;
		condvalue = newCondvalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDVALUE, oldCondvalue, newCondvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCondvalue(Value newCondvalue)
  {
		if (newCondvalue != condvalue)
		{
			NotificationChain msgs = null;
			if (condvalue != null)
				msgs = ((InternalEObject)condvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__CONDVALUE, null, msgs);
			if (newCondvalue != null)
				msgs = ((InternalEObject)newCondvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__CONDVALUE, null, msgs);
			msgs = basicSetCondvalue(newCondvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDVALUE, newCondvalue, newCondvalue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLabelTrue()
  {
		return labelTrue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLabelTrue(String newLabelTrue)
  {
		String oldLabelTrue = labelTrue;
		labelTrue = newLabelTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUE, oldLabelTrue, labelTrue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLabelFalse()
  {
		return labelFalse;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLabelFalse(String newLabelFalse)
  {
		String oldLabelFalse = labelFalse;
		labelFalse = newLabelFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSE, oldLabelFalse, labelFalse));
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
			case LlvmPackage.BRANCH__CONDVALUE:
				return basicSetCondvalue(null, msgs);
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
			case LlvmPackage.BRANCH__CONDVALUE:
				return getCondvalue();
			case LlvmPackage.BRANCH__LABEL_TRUE:
				return getLabelTrue();
			case LlvmPackage.BRANCH__LABEL_FALSE:
				return getLabelFalse();
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
			case LlvmPackage.BRANCH__CONDVALUE:
				setCondvalue((Value)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				setLabelTrue((String)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				setLabelFalse((String)newValue);
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
			case LlvmPackage.BRANCH__CONDVALUE:
				setCondvalue((Value)null);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				setLabelTrue(LABEL_TRUE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				setLabelFalse(LABEL_FALSE_EDEFAULT);
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
			case LlvmPackage.BRANCH__CONDVALUE:
				return condvalue != null;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				return LABEL_TRUE_EDEFAULT == null ? labelTrue != null : !LABEL_TRUE_EDEFAULT.equals(labelTrue);
			case LlvmPackage.BRANCH__LABEL_FALSE:
				return LABEL_FALSE_EDEFAULT == null ? labelFalse != null : !LABEL_FALSE_EDEFAULT.equals(labelFalse);
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
		result.append(", labelTrue: ");
		result.append(labelTrue);
		result.append(", labelFalse: ");
		result.append(labelFalse);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
