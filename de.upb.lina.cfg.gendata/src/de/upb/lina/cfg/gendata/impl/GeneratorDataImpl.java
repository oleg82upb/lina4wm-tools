/**
 */
package de.upb.lina.cfg.gendata.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl#getProgram <em>Program</em>}</li>
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
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

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
	public NotificationChain basicSetLocalVariables(LocalVariables newLocalVariables, NotificationChain msgs)
	{
		LocalVariables oldLocalVariables = localVariables;
		localVariables = newLocalVariables;
		if (eNotificationRequired())
		{
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
	public void setLocalVariables(LocalVariables newLocalVariables)
	{
		if (newLocalVariables != localVariables)
		{
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
	public EList<Label> getLabels()
	{
		if (labels == null)
		{
			labels = new EObjectContainmentEList<Label>(Label.class, this, GendataPackage.GENERATOR_DATA__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM getProgram()
	{
		if (program != null && program.eIsProxy())
		{
			InternalEObject oldProgram = (InternalEObject)program;
			program = (LLVM)eResolveProxy(oldProgram);
			if (program != oldProgram)
			{
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				return basicSetLocalVariables(null, msgs);
			case GendataPackage.GENERATOR_DATA__LABELS:
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
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				return getLocalVariables();
			case GendataPackage.GENERATOR_DATA__LABELS:
				return getLabels();
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
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
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				setProgram((LLVM)newValue);
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
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)null);
				return;
			case GendataPackage.GENERATOR_DATA__LABELS:
				getLabels().clear();
				return;
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				setProgram((LLVM)null);
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
			case GendataPackage.GENERATOR_DATA__LOCAL_VARIABLES:
				return localVariables != null;
			case GendataPackage.GENERATOR_DATA__LABELS:
				return labels != null && !labels.isEmpty();
			case GendataPackage.GENERATOR_DATA__PROGRAM:
				return program != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorDataImpl
