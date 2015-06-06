/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.PhiMapping;
import de.upb.llvm_parser.llvm.Phi;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phi Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.PhiMappingImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.PhiMappingImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.PhiMappingImpl#getBlockLabelToUse <em>Block Label To Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhiMappingImpl extends MinimalEObjectImpl.Container implements PhiMapping {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected EList<Phi> phi;

	/**
	 * The default value of the '{@link #getBlockLabelToUse() <em>Block Label To Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockLabelToUse()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_LABEL_TO_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockLabelToUse() <em>Block Label To Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockLabelToUse()
	 * @generated
	 * @ordered
	 */
	protected String blockLabelToUse = BLOCK_LABEL_TO_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhiMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.PHI_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.PHI_MAPPING__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.PHI_MAPPING__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phi> getPhi() {
		if (phi == null) {
			phi = new EObjectResolvingEList<Phi>(Phi.class, this, GendataPackage.PHI_MAPPING__PHI);
		}
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockLabelToUse() {
		return blockLabelToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockLabelToUse(String newBlockLabelToUse) {
		String oldBlockLabelToUse = blockLabelToUse;
		blockLabelToUse = newBlockLabelToUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.PHI_MAPPING__BLOCK_LABEL_TO_USE, oldBlockLabelToUse, blockLabelToUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GendataPackage.PHI_MAPPING__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case GendataPackage.PHI_MAPPING__PHI:
				return getPhi();
			case GendataPackage.PHI_MAPPING__BLOCK_LABEL_TO_USE:
				return getBlockLabelToUse();
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
			case GendataPackage.PHI_MAPPING__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case GendataPackage.PHI_MAPPING__PHI:
				getPhi().clear();
				getPhi().addAll((Collection<? extends Phi>)newValue);
				return;
			case GendataPackage.PHI_MAPPING__BLOCK_LABEL_TO_USE:
				setBlockLabelToUse((String)newValue);
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
			case GendataPackage.PHI_MAPPING__TRANSITION:
				setTransition((Transition)null);
				return;
			case GendataPackage.PHI_MAPPING__PHI:
				getPhi().clear();
				return;
			case GendataPackage.PHI_MAPPING__BLOCK_LABEL_TO_USE:
				setBlockLabelToUse(BLOCK_LABEL_TO_USE_EDEFAULT);
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
			case GendataPackage.PHI_MAPPING__TRANSITION:
				return transition != null;
			case GendataPackage.PHI_MAPPING__PHI:
				return phi != null && !phi.isEmpty();
			case GendataPackage.PHI_MAPPING__BLOCK_LABEL_TO_USE:
				return BLOCK_LABEL_TO_USE_EDEFAULT == null ? blockLabelToUse != null : !BLOCK_LABEL_TO_USE_EDEFAULT.equals(blockLabelToUse);
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
		result.append(" (blockLabelToUse: ");
		result.append(blockLabelToUse);
		result.append(')');
		return result.toString();
	}

} //PhiMappingImpl
