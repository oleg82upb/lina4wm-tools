/**
 */
package de.upb.lina.lll.impl;

import de.upb.lina.lll.ConditionalBranch;
import de.upb.lina.lll.Label;
import de.upb.lina.lll.LllPackage;

import de.upb.lina.lll.expressions.LExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.lll.impl.ConditionalBranchImpl#getElseTarget <em>Else Target</em>}</li>
 *   <li>{@link de.upb.lina.lll.impl.ConditionalBranchImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalBranchImpl extends GotoImpl implements ConditionalBranch {
	/**
	 * The cached value of the '{@link #getElseTarget() <em>Else Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseTarget()
	 * @generated
	 * @ordered
	 */
	protected Label elseTarget;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected LExpression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LllPackage.Literals.CONDITIONAL_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getElseTarget() {
		if (elseTarget != null && elseTarget.eIsProxy()) {
			InternalEObject oldElseTarget = (InternalEObject)elseTarget;
			elseTarget = (Label)eResolveProxy(oldElseTarget);
			if (elseTarget != oldElseTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LllPackage.CONDITIONAL_BRANCH__ELSE_TARGET, oldElseTarget, elseTarget));
			}
		}
		return elseTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetElseTarget() {
		return elseTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseTarget(Label newElseTarget) {
		Label oldElseTarget = elseTarget;
		elseTarget = newElseTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.CONDITIONAL_BRANCH__ELSE_TARGET, oldElseTarget, elseTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(LExpression newCondition, NotificationChain msgs) {
		LExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LllPackage.CONDITIONAL_BRANCH__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(LExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LllPackage.CONDITIONAL_BRANCH__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LllPackage.CONDITIONAL_BRANCH__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LllPackage.CONDITIONAL_BRANCH__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LllPackage.CONDITIONAL_BRANCH__CONDITION:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LllPackage.CONDITIONAL_BRANCH__ELSE_TARGET:
				if (resolve) return getElseTarget();
				return basicGetElseTarget();
			case LllPackage.CONDITIONAL_BRANCH__CONDITION:
				return getCondition();
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
			case LllPackage.CONDITIONAL_BRANCH__ELSE_TARGET:
				setElseTarget((Label)newValue);
				return;
			case LllPackage.CONDITIONAL_BRANCH__CONDITION:
				setCondition((LExpression)newValue);
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
			case LllPackage.CONDITIONAL_BRANCH__ELSE_TARGET:
				setElseTarget((Label)null);
				return;
			case LllPackage.CONDITIONAL_BRANCH__CONDITION:
				setCondition((LExpression)null);
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
			case LllPackage.CONDITIONAL_BRANCH__ELSE_TARGET:
				return elseTarget != null;
			case LllPackage.CONDITIONAL_BRANCH__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalBranchImpl
