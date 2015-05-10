/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

import de.upb.lina.cfg.gendata.FunctionParamsMapping;
import de.upb.lina.cfg.gendata.GendataPackage;

import de.upb.llvm_parser.llvm.FunctionDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Params Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl#isNeedsReturnValue <em>Needs Return Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl#isNeedsGetElementPtr <em>Needs Get Element Ptr</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl#isNeedsCas <em>Needs Cas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionParamsMappingImpl extends MinimalEObjectImpl.Container implements FunctionParamsMapping {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionDefinition function;

	/**
	 * The cached value of the '{@link #getCfg() <em>Cfg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowDiagram cfg;

	/**
	 * The default value of the '{@link #isNeedsReturnValue() <em>Needs Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_RETURN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsReturnValue() <em>Needs Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsReturnValue()
	 * @generated
	 * @ordered
	 */
	protected boolean needsReturnValue = NEEDS_RETURN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsGetElementPtr() <em>Needs Get Element Ptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsGetElementPtr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_GET_ELEMENT_PTR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsGetElementPtr() <em>Needs Get Element Ptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsGetElementPtr()
	 * @generated
	 * @ordered
	 */
	protected boolean needsGetElementPtr = NEEDS_GET_ELEMENT_PTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsCas() <em>Needs Cas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsCas()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_CAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsCas() <em>Needs Cas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsCas()
	 * @generated
	 * @ordered
	 */
	protected boolean needsCas = NEEDS_CAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionParamsMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.FUNCTION_PARAMS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (FunctionDefinition)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.FUNCTION_PARAMS_MAPPING__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionDefinition newFunction) {
		FunctionDefinition oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.FUNCTION_PARAMS_MAPPING__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram getCfg() {
		if (cfg != null && cfg.eIsProxy()) {
			InternalEObject oldCfg = (InternalEObject)cfg;
			cfg = (ControlFlowDiagram)eResolveProxy(oldCfg);
			if (cfg != oldCfg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.FUNCTION_PARAMS_MAPPING__CFG, oldCfg, cfg));
			}
		}
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram basicGetCfg() {
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfg(ControlFlowDiagram newCfg) {
		ControlFlowDiagram oldCfg = cfg;
		cfg = newCfg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.FUNCTION_PARAMS_MAPPING__CFG, oldCfg, cfg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsReturnValue() {
		return needsReturnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsReturnValue(boolean newNeedsReturnValue) {
		boolean oldNeedsReturnValue = needsReturnValue;
		needsReturnValue = newNeedsReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE, oldNeedsReturnValue, needsReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsGetElementPtr() {
		return needsGetElementPtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsGetElementPtr(boolean newNeedsGetElementPtr) {
		boolean oldNeedsGetElementPtr = needsGetElementPtr;
		needsGetElementPtr = newNeedsGetElementPtr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR, oldNeedsGetElementPtr, needsGetElementPtr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsCas() {
		return needsCas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsCas(boolean newNeedsCas) {
		boolean oldNeedsCas = needsCas;
		needsCas = newNeedsCas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_CAS, oldNeedsCas, needsCas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GendataPackage.FUNCTION_PARAMS_MAPPING__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case GendataPackage.FUNCTION_PARAMS_MAPPING__CFG:
				if (resolve) return getCfg();
				return basicGetCfg();
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE:
				return isNeedsReturnValue();
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR:
				return isNeedsGetElementPtr();
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_CAS:
				return isNeedsCas();
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
			case GendataPackage.FUNCTION_PARAMS_MAPPING__FUNCTION:
				setFunction((FunctionDefinition)newValue);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__CFG:
				setCfg((ControlFlowDiagram)newValue);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE:
				setNeedsReturnValue((Boolean)newValue);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR:
				setNeedsGetElementPtr((Boolean)newValue);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_CAS:
				setNeedsCas((Boolean)newValue);
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
			case GendataPackage.FUNCTION_PARAMS_MAPPING__FUNCTION:
				setFunction((FunctionDefinition)null);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__CFG:
				setCfg((ControlFlowDiagram)null);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE:
				setNeedsReturnValue(NEEDS_RETURN_VALUE_EDEFAULT);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR:
				setNeedsGetElementPtr(NEEDS_GET_ELEMENT_PTR_EDEFAULT);
				return;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_CAS:
				setNeedsCas(NEEDS_CAS_EDEFAULT);
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
			case GendataPackage.FUNCTION_PARAMS_MAPPING__FUNCTION:
				return function != null;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__CFG:
				return cfg != null;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE:
				return needsReturnValue != NEEDS_RETURN_VALUE_EDEFAULT;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR:
				return needsGetElementPtr != NEEDS_GET_ELEMENT_PTR_EDEFAULT;
			case GendataPackage.FUNCTION_PARAMS_MAPPING__NEEDS_CAS:
				return needsCas != NEEDS_CAS_EDEFAULT;
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
		result.append(" (needsReturnValue: ");
		result.append(needsReturnValue);
		result.append(", needsGetElementPtr: ");
		result.append(needsGetElementPtr);
		result.append(", needsCas: ");
		result.append(needsCas);
		result.append(')');
		return result.toString();
	}

} //FunctionParamsMappingImpl
