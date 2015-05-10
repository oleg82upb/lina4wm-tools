/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.gendata.ConstraintMapping;
import de.upb.lina.cfg.gendata.FunctionParamsMapping;
import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.Label;
import de.upb.lina.cfg.gendata.LocalVariables;
import de.upb.llvm_parser.llvm.LLVM;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getCfgs <em>Cfgs</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#isNeedsGetElementPtr <em>Needs Get Element Ptr</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#isNeedsCas <em>Needs Cas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorDataImpl extends MinimalEObjectImpl.Container implements GeneratorData
{
	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected LocalVariables localVariables;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected LLVM program;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getCfgs() <em>Cfgs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlowDiagram> cfgs;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintMapping> constraints;

	/**
	 * The cached value of the '{@link #getParameterMappings() <em>Parameter Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionParamsMapping> parameterMappings;

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
	protected GeneratorDataImpl()
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
		return GendataPackage.Literals.GENERATOR_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariables getLocalVariables()
	{
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalVariables(LocalVariables newLocalVariables, NotificationChain msgs) {
		LocalVariables oldLocalVariables = localVariables;
		localVariables = newLocalVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES, oldLocalVariables, newLocalVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalVariables(LocalVariables newLocalVariables) {
		if (newLocalVariables != localVariables) {
			NotificationChain msgs = null;
			if (localVariables != null)
				msgs = ((InternalEObject)localVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES, null, msgs);
			if (newLocalVariables != null)
				msgs = ((InternalEObject)newLocalVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES, null, msgs);
			msgs = basicSetLocalVariables(newLocalVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES, newLocalVariables, newLocalVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM getProgram()
	{
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject)program;
			program = (LLVM)eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.GENERATOR_DATA__PROGRAM, oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM basicGetProgram()
	{
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(LLVM newProgram)
	{
		LLVM oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.GENERATOR_DATA__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<Label>(Label.class, this, GendataPackage.GENERATOR_DATA__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlowDiagram> getCfgs() {
		if (cfgs == null) {
			cfgs = new EObjectResolvingEList<ControlFlowDiagram>(ControlFlowDiagram.class, this, GendataPackage.GENERATOR_DATA__CFGS);
		}
		return cfgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintMapping> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ConstraintMapping>(ConstraintMapping.class, this, GendataPackage.GENERATOR_DATA__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionParamsMapping> getParameterMappings() {
		if (parameterMappings == null) {
			parameterMappings = new EObjectContainmentEList<FunctionParamsMapping>(FunctionParamsMapping.class, this, GendataPackage.GENERATOR_DATA__PARAMETER_MAPPINGS);
		}
		return parameterMappings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR, oldNeedsGetElementPtr, needsGetElementPtr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.GENERATOR_DATA__NEEDS_CAS, oldNeedsCas, needsCas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				return basicSetLocalVariables(null, msgs);
			case GendataPackage.GENERATOR_DATA__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case GendataPackage.GENERATOR_DATA__PARAMETER_MAPPINGS:
				return ((InternalEList<?>)getParameterMappings()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				return getLocalVariables();
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
			case GendataPackage.GENERATOR_DATA__LABELS:
				return getLabels();
			case GendataPackage.GENERATOR_DATA__CFGS:
				return getCfgs();
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return getConstraints();
			case GendataPackage.GENERATOR_DATA__PARAMETER_MAPPINGS:
				return getParameterMappings();
			case GendataPackage.GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR:
				return isNeedsGetElementPtr();
			case GendataPackage.GENERATOR_DATA__NEEDS_CAS:
				return isNeedsCas();
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
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				setProgram((LLVM)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__CFGS:
				getCfgs().clear();
				getCfgs().addAll((Collection<? extends ControlFlowDiagram>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintMapping>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				getParameterMappings().addAll((Collection<? extends FunctionParamsMapping>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR:
				setNeedsGetElementPtr((Boolean)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__NEEDS_CAS:
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)null);
				return;
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				setProgram((LLVM)null);
				return;
			case GendataPackage.GENERATOR_DATA__LABELS:
				getLabels().clear();
				return;
			case GendataPackage.GENERATOR_DATA__CFGS:
				getCfgs().clear();
				return;
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				getConstraints().clear();
				return;
			case GendataPackage.GENERATOR_DATA__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				return;
			case GendataPackage.GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR:
				setNeedsGetElementPtr(NEEDS_GET_ELEMENT_PTR_EDEFAULT);
				return;
			case GendataPackage.GENERATOR_DATA__NEEDS_CAS:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				return localVariables != null;
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				return program != null;
			case GendataPackage.GENERATOR_DATA__LABELS:
				return labels != null && !labels.isEmpty();
			case GendataPackage.GENERATOR_DATA__CFGS:
				return cfgs != null && !cfgs.isEmpty();
			case GendataPackage.GENERATOR_DATA__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case GendataPackage.GENERATOR_DATA__PARAMETER_MAPPINGS:
				return parameterMappings != null && !parameterMappings.isEmpty();
			case GendataPackage.GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR:
				return needsGetElementPtr != NEEDS_GET_ELEMENT_PTR_EDEFAULT;
			case GendataPackage.GENERATOR_DATA__NEEDS_CAS:
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
		result.append(" (needsGetElementPtr: ");
		result.append(needsGetElementPtr);
		result.append(", needsCas: ");
		result.append(needsCas);
		result.append(')');
		return result.toString();
	}

} //GeneratorDataImpl
