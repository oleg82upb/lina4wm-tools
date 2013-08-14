/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ResumeImpl#getResumestruct <em>Resumestruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ResumeImpl#getResumevalue <em>Resumevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResumeImpl extends InstructionImpl implements Resume
{
  /**
	 * The cached value of the '{@link #getResumestruct() <em>Resumestruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResumestruct()
	 * @generated
	 * @ordered
	 */
  protected Structure resumestruct;

  /**
	 * The cached value of the '{@link #getResumevalue() <em>Resumevalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResumevalue()
	 * @generated
	 * @ordered
	 */
  protected Value resumevalue;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ResumeImpl()
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
		return LlvmPackage.Literals.RESUME;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Structure getResumestruct()
  {
		return resumestruct;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetResumestruct(Structure newResumestruct, NotificationChain msgs)
  {
		Structure oldResumestruct = resumestruct;
		resumestruct = newResumestruct;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.RESUME__RESUMESTRUCT, oldResumestruct, newResumestruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResumestruct(Structure newResumestruct)
  {
		if (newResumestruct != resumestruct)
		{
			NotificationChain msgs = null;
			if (resumestruct != null)
				msgs = ((InternalEObject)resumestruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RESUME__RESUMESTRUCT, null, msgs);
			if (newResumestruct != null)
				msgs = ((InternalEObject)newResumestruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RESUME__RESUMESTRUCT, null, msgs);
			msgs = basicSetResumestruct(newResumestruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.RESUME__RESUMESTRUCT, newResumestruct, newResumestruct));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getResumevalue()
  {
		return resumevalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetResumevalue(Value newResumevalue, NotificationChain msgs)
  {
		Value oldResumevalue = resumevalue;
		resumevalue = newResumevalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.RESUME__RESUMEVALUE, oldResumevalue, newResumevalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResumevalue(Value newResumevalue)
  {
		if (newResumevalue != resumevalue)
		{
			NotificationChain msgs = null;
			if (resumevalue != null)
				msgs = ((InternalEObject)resumevalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RESUME__RESUMEVALUE, null, msgs);
			if (newResumevalue != null)
				msgs = ((InternalEObject)newResumevalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.RESUME__RESUMEVALUE, null, msgs);
			msgs = basicSetResumevalue(newResumevalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.RESUME__RESUMEVALUE, newResumevalue, newResumevalue));
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
			case LlvmPackage.RESUME__RESUMESTRUCT:
				return basicSetResumestruct(null, msgs);
			case LlvmPackage.RESUME__RESUMEVALUE:
				return basicSetResumevalue(null, msgs);
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
			case LlvmPackage.RESUME__RESUMESTRUCT:
				return getResumestruct();
			case LlvmPackage.RESUME__RESUMEVALUE:
				return getResumevalue();
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
			case LlvmPackage.RESUME__RESUMESTRUCT:
				setResumestruct((Structure)newValue);
				return;
			case LlvmPackage.RESUME__RESUMEVALUE:
				setResumevalue((Value)newValue);
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
			case LlvmPackage.RESUME__RESUMESTRUCT:
				setResumestruct((Structure)null);
				return;
			case LlvmPackage.RESUME__RESUMEVALUE:
				setResumevalue((Value)null);
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
			case LlvmPackage.RESUME__RESUMESTRUCT:
				return resumestruct != null;
			case LlvmPackage.RESUME__RESUMEVALUE:
				return resumevalue != null;
		}
		return super.eIsSet(featureID);
	}

} //ResumeImpl
