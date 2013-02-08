/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getAggregatename <em>Aggregatename</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getIndTypes <em>Ind Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getIndizies <em>Indizies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetElementPtrImpl extends InstructionImpl implements GetElementPtr {
	/**
	 * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate()
	 * @generated
	 * @ordered
	 */
	protected EObject aggregate;

	/**
	 * The cached value of the '{@link #getAggregatename() <em>Aggregatename</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatename()
	 * @generated
	 * @ordered
	 */
	protected Value aggregatename;

	/**
	 * The cached value of the '{@link #getIndTypes() <em>Ind Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUse> indTypes;

	/**
	 * The cached value of the '{@link #getIndizies() <em>Indizies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndizies()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> indizies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetElementPtrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.GET_ELEMENT_PTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAggregate() {
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(EObject newAggregate, NotificationChain msgs) {
		EObject oldAggregate = aggregate;
		aggregate = newAggregate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__AGGREGATE, oldAggregate, newAggregate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregate(EObject newAggregate) {
		if (newAggregate != aggregate) {
			NotificationChain msgs = null;
			if (aggregate != null)
				msgs = ((InternalEObject)aggregate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__AGGREGATE, null, msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__AGGREGATE, null, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__AGGREGATE, newAggregate, newAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getAggregatename() {
		return aggregatename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregatename(Value newAggregatename, NotificationChain msgs) {
		Value oldAggregatename = aggregatename;
		aggregatename = newAggregatename;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME, oldAggregatename, newAggregatename);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregatename(Value newAggregatename) {
		if (newAggregatename != aggregatename) {
			NotificationChain msgs = null;
			if (aggregatename != null)
				msgs = ((InternalEObject)aggregatename).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME, null, msgs);
			if (newAggregatename != null)
				msgs = ((InternalEObject)newAggregatename).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME, null, msgs);
			msgs = basicSetAggregatename(newAggregatename, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME, newAggregatename, newAggregatename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUse> getIndTypes() {
		if (indTypes == null) {
			indTypes = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.GET_ELEMENT_PTR__IND_TYPES);
		}
		return indTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getIndizies() {
		if (indizies == null) {
			indizies = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.GET_ELEMENT_PTR__INDIZIES);
		}
		return indizies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATE:
				return basicSetAggregate(null, msgs);
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME:
				return basicSetAggregatename(null, msgs);
			case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
				return ((InternalEList<?>)getIndTypes()).basicRemove(otherEnd, msgs);
			case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
				return ((InternalEList<?>)getIndizies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATE:
				return getAggregate();
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME:
				return getAggregatename();
			case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
				return getIndTypes();
			case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
				return getIndizies();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATE:
				setAggregate((EObject)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME:
				setAggregatename((Value)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
				getIndTypes().clear();
				getIndTypes().addAll((Collection<? extends TypeUse>)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
				getIndizies().clear();
				getIndizies().addAll((Collection<? extends Value>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATE:
				setAggregate((EObject)null);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME:
				setAggregatename((Value)null);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
				getIndTypes().clear();
				return;
			case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
				getIndizies().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATE:
				return aggregate != null;
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME:
				return aggregatename != null;
			case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
				return indTypes != null && !indTypes.isEmpty();
			case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
				return indizies != null && !indizies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GetElementPtrImpl
