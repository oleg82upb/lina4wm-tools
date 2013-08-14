/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getLabeltype <em>Labeltype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndirectBranchImpl extends InstructionImpl implements IndirectBranch
{
  /**
	 * The cached value of the '{@link #getAdresstype() <em>Adresstype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdresstype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse adresstype;

  /**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
  protected Value adress;

  /**
	 * The cached value of the '{@link #getLabeltype() <em>Labeltype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabeltype()
	 * @generated
	 * @ordered
	 */
  protected EList<TypeUse> labeltype;

  /**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
  protected EList<Value> labels;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IndirectBranchImpl()
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
		return LlvmPackage.Literals.INDIRECT_BRANCH;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getAdresstype()
  {
		return adresstype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAdresstype(TypeUse newAdresstype, NotificationChain msgs)
  {
		TypeUse oldAdresstype = adresstype;
		adresstype = newAdresstype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE, oldAdresstype, newAdresstype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAdresstype(TypeUse newAdresstype)
  {
		if (newAdresstype != adresstype)
		{
			NotificationChain msgs = null;
			if (adresstype != null)
				msgs = ((InternalEObject)adresstype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE, null, msgs);
			if (newAdresstype != null)
				msgs = ((InternalEObject)newAdresstype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE, null, msgs);
			msgs = basicSetAdresstype(newAdresstype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE, newAdresstype, newAdresstype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getAdress()
  {
		return adress;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAdress(Value newAdress, NotificationChain msgs)
  {
		Value oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__ADRESS, oldAdress, newAdress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAdress(Value newAdress)
  {
		if (newAdress != adress)
		{
			NotificationChain msgs = null;
			if (adress != null)
				msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INDIRECT_BRANCH__ADRESS, null, msgs);
			if (newAdress != null)
				msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INDIRECT_BRANCH__ADRESS, null, msgs);
			msgs = basicSetAdress(newAdress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__ADRESS, newAdress, newAdress));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TypeUse> getLabeltype()
  {
		if (labeltype == null)
		{
			labeltype = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.INDIRECT_BRANCH__LABELTYPE);
		}
		return labeltype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Value> getLabels()
  {
		if (labels == null)
		{
			labels = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.INDIRECT_BRANCH__LABELS);
		}
		return labels;
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				return basicSetAdresstype(null, msgs);
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				return basicSetAdress(null, msgs);
			case LlvmPackage.INDIRECT_BRANCH__LABELTYPE:
				return ((InternalEList<?>)getLabeltype()).basicRemove(otherEnd, msgs);
			case LlvmPackage.INDIRECT_BRANCH__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				return getAdresstype();
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				return getAdress();
			case LlvmPackage.INDIRECT_BRANCH__LABELTYPE:
				return getLabeltype();
			case LlvmPackage.INDIRECT_BRANCH__LABELS:
				return getLabels();
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				setAdresstype((TypeUse)newValue);
				return;
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				setAdress((Value)newValue);
				return;
			case LlvmPackage.INDIRECT_BRANCH__LABELTYPE:
				getLabeltype().clear();
				getLabeltype().addAll((Collection<? extends TypeUse>)newValue);
				return;
			case LlvmPackage.INDIRECT_BRANCH__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Value>)newValue);
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				setAdresstype((TypeUse)null);
				return;
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				setAdress((Value)null);
				return;
			case LlvmPackage.INDIRECT_BRANCH__LABELTYPE:
				getLabeltype().clear();
				return;
			case LlvmPackage.INDIRECT_BRANCH__LABELS:
				getLabels().clear();
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				return adresstype != null;
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				return adress != null;
			case LlvmPackage.INDIRECT_BRANCH__LABELTYPE:
				return labeltype != null && !labeltype.isEmpty();
			case LlvmPackage.INDIRECT_BRANCH__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndirectBranchImpl
