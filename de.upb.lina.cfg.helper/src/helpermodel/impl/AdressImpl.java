/**
 */
package helpermodel.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

import de.upb.llvm_parser.llvm.LLVM;

import helpermodel.Adress;
import helpermodel.HelpermodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link helpermodel.impl.AdressImpl#getAst <em>Ast</em>}</li>
 *   <li>{@link helpermodel.impl.AdressImpl#getCfg <em>Cfg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdressImpl extends MinimalEObjectImpl.Container implements Adress {
	/**
	 * The cached value of the '{@link #getAst() <em>Ast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAst()
	 * @generated
	 * @ordered
	 */
	protected LLVM ast;

	/**
	 * The cached value of the '{@link #getCfg() <em>Cfg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowDiagram cfg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelpermodelPackage.Literals.ADRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM getAst() {
		return ast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAst(LLVM newAst, NotificationChain msgs) {
		LLVM oldAst = ast;
		ast = newAst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HelpermodelPackage.ADRESS__AST, oldAst, newAst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAst(LLVM newAst) {
		if (newAst != ast) {
			NotificationChain msgs = null;
			if (ast != null)
				msgs = ((InternalEObject)ast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HelpermodelPackage.ADRESS__AST, null, msgs);
			if (newAst != null)
				msgs = ((InternalEObject)newAst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HelpermodelPackage.ADRESS__AST, null, msgs);
			msgs = basicSetAst(newAst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelpermodelPackage.ADRESS__AST, newAst, newAst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram getCfg() {
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfg(ControlFlowDiagram newCfg, NotificationChain msgs) {
		ControlFlowDiagram oldCfg = cfg;
		cfg = newCfg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HelpermodelPackage.ADRESS__CFG, oldCfg, newCfg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfg(ControlFlowDiagram newCfg) {
		if (newCfg != cfg) {
			NotificationChain msgs = null;
			if (cfg != null)
				msgs = ((InternalEObject)cfg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HelpermodelPackage.ADRESS__CFG, null, msgs);
			if (newCfg != null)
				msgs = ((InternalEObject)newCfg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HelpermodelPackage.ADRESS__CFG, null, msgs);
			msgs = basicSetCfg(newCfg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelpermodelPackage.ADRESS__CFG, newCfg, newCfg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HelpermodelPackage.ADRESS__AST:
				return basicSetAst(null, msgs);
			case HelpermodelPackage.ADRESS__CFG:
				return basicSetCfg(null, msgs);
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
			case HelpermodelPackage.ADRESS__AST:
				return getAst();
			case HelpermodelPackage.ADRESS__CFG:
				return getCfg();
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
			case HelpermodelPackage.ADRESS__AST:
				setAst((LLVM)newValue);
				return;
			case HelpermodelPackage.ADRESS__CFG:
				setCfg((ControlFlowDiagram)newValue);
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
			case HelpermodelPackage.ADRESS__AST:
				setAst((LLVM)null);
				return;
			case HelpermodelPackage.ADRESS__CFG:
				setCfg((ControlFlowDiagram)null);
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
			case HelpermodelPackage.ADRESS__AST:
				return ast != null;
			case HelpermodelPackage.ADRESS__CFG:
				return cfg != null;
		}
		return super.eIsSet(featureID);
	}

} //AdressImpl
