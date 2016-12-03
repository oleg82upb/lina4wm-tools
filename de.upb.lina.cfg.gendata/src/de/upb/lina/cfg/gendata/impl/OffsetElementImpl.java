/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.MemorySizeMapping;
import de.upb.lina.cfg.gendata.OffsetElement;

import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offset Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.OffsetElementImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.OffsetElementImpl#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.OffsetElementImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.OffsetElementImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.OffsetElementImpl#getMemorySizeMapping <em>Memory Size Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OffsetElementImpl extends MinimalEObjectImpl.Container implements OffsetElement {
	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected int factor = FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableValue()
	 * @generated
	 * @ordered
	 */
	protected Value variableValue;

	/**
	 * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected int intValue = INT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffsetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.OFFSET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(int newFactor) {
		int oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.OFFSET_ELEMENT__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getVariableValue() {
		if (variableValue != null && variableValue.eIsProxy()) {
			InternalEObject oldVariableValue = (InternalEObject)variableValue;
			variableValue = (Value)eResolveProxy(oldVariableValue);
			if (variableValue != oldVariableValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.OFFSET_ELEMENT__VARIABLE_VALUE, oldVariableValue, variableValue));
			}
		}
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetVariableValue() {
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableValue(Value newVariableValue) {
		Value oldVariableValue = variableValue;
		variableValue = newVariableValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.OFFSET_ELEMENT__VARIABLE_VALUE, oldVariableValue, variableValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntValue() {
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntValue(int newIntValue) {
		int oldIntValue = intValue;
		intValue = newIntValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.OFFSET_ELEMENT__INT_VALUE, oldIntValue, intValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.OFFSET_ELEMENT__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySizeMapping getMemorySizeMapping() {
		if (eContainerFeatureID() != GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING) return null;
		return (MemorySizeMapping)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemorySizeMapping(MemorySizeMapping newMemorySizeMapping, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMemorySizeMapping, GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySizeMapping(MemorySizeMapping newMemorySizeMapping) {
		if (newMemorySizeMapping != eInternalContainer() || (eContainerFeatureID() != GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING && newMemorySizeMapping != null)) {
			if (EcoreUtil.isAncestor(this, newMemorySizeMapping))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMemorySizeMapping != null)
				msgs = ((InternalEObject)newMemorySizeMapping).eInverseAdd(this, GendataPackage.MEMORY_SIZE_MAPPING__OFFSET, MemorySizeMapping.class, msgs);
			msgs = basicSetMemorySizeMapping(newMemorySizeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING, newMemorySizeMapping, newMemorySizeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMemorySizeMapping((MemorySizeMapping)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				return basicSetMemorySizeMapping(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				return eInternalContainer().eInverseRemove(this, GendataPackage.MEMORY_SIZE_MAPPING__OFFSET, MemorySizeMapping.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GendataPackage.OFFSET_ELEMENT__FACTOR:
				return getFactor();
			case GendataPackage.OFFSET_ELEMENT__VARIABLE_VALUE:
				if (resolve) return getVariableValue();
				return basicGetVariableValue();
			case GendataPackage.OFFSET_ELEMENT__INT_VALUE:
				return getIntValue();
			case GendataPackage.OFFSET_ELEMENT__CONSTANT:
				return isConstant();
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				return getMemorySizeMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GendataPackage.OFFSET_ELEMENT__FACTOR:
				setFactor((Integer)newValue);
				return;
			case GendataPackage.OFFSET_ELEMENT__VARIABLE_VALUE:
				setVariableValue((Value)newValue);
				return;
			case GendataPackage.OFFSET_ELEMENT__INT_VALUE:
				setIntValue((Integer)newValue);
				return;
			case GendataPackage.OFFSET_ELEMENT__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				setMemorySizeMapping((MemorySizeMapping)newValue);
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
			case GendataPackage.OFFSET_ELEMENT__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case GendataPackage.OFFSET_ELEMENT__VARIABLE_VALUE:
				setVariableValue((Value)null);
				return;
			case GendataPackage.OFFSET_ELEMENT__INT_VALUE:
				setIntValue(INT_VALUE_EDEFAULT);
				return;
			case GendataPackage.OFFSET_ELEMENT__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				setMemorySizeMapping((MemorySizeMapping)null);
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
			case GendataPackage.OFFSET_ELEMENT__FACTOR:
				return factor != FACTOR_EDEFAULT;
			case GendataPackage.OFFSET_ELEMENT__VARIABLE_VALUE:
				return variableValue != null;
			case GendataPackage.OFFSET_ELEMENT__INT_VALUE:
				return intValue != INT_VALUE_EDEFAULT;
			case GendataPackage.OFFSET_ELEMENT__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case GendataPackage.OFFSET_ELEMENT__MEMORY_SIZE_MAPPING:
				return getMemorySizeMapping() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (factor: ");
		result.append(factor);
		result.append(", intValue: ");
		result.append(intValue);
		result.append(", constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //OffsetElementImpl
