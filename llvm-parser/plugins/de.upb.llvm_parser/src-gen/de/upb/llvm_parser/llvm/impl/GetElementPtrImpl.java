/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.ARRAY;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getElementtype <em>Elementtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getElementarray <em>Elementarray</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getIndicetypes <em>Indicetypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetElementPtrImpl extends InstructionImpl implements GetElementPtr {
	/**
	 * The default value of the '{@link #getElementtype() <em>Elementtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementtype()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementtype() <em>Elementtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementtype()
	 * @generated
	 * @ordered
	 */
	protected String elementtype = ELEMENTTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected TypeList types;

	/**
	 * The cached value of the '{@link #getElementarray() <em>Elementarray</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementarray()
	 * @generated
	 * @ordered
	 */
	protected ARRAY elementarray;

	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected String element = ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndicetypes() <em>Indicetypes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indicetypes;

	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indices;

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
	public String getElementtype() {
		return elementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementtype(String newElementtype) {
		String oldElementtype = elementtype;
		elementtype = newElementtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__ELEMENTTYPE, oldElementtype, elementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeList getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(TypeList newTypes, NotificationChain msgs) {
		TypeList oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(TypeList newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAY getElementarray() {
		return elementarray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementarray(ARRAY newElementarray, NotificationChain msgs) {
		ARRAY oldElementarray = elementarray;
		elementarray = newElementarray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY, oldElementarray, newElementarray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementarray(ARRAY newElementarray) {
		if (newElementarray != elementarray) {
			NotificationChain msgs = null;
			if (elementarray != null)
				msgs = ((InternalEObject)elementarray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY, null, msgs);
			if (newElementarray != null)
				msgs = ((InternalEObject)newElementarray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY, null, msgs);
			msgs = basicSetElementarray(newElementarray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY, newElementarray, newElementarray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(String newElement) {
		String oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndicetypes() {
		if (indicetypes == null) {
			indicetypes = new EDataTypeEList<String>(String.class, this, LlvmPackage.GET_ELEMENT_PTR__INDICETYPES);
		}
		return indicetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndices() {
		if (indices == null) {
			indices = new EDataTypeEList<String>(String.class, this, LlvmPackage.GET_ELEMENT_PTR__INDICES);
		}
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.GET_ELEMENT_PTR__TYPES:
				return basicSetTypes(null, msgs);
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY:
				return basicSetElementarray(null, msgs);
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
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTTYPE:
				return getElementtype();
			case LlvmPackage.GET_ELEMENT_PTR__TYPES:
				return getTypes();
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY:
				return getElementarray();
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENT:
				return getElement();
			case LlvmPackage.GET_ELEMENT_PTR__INDICETYPES:
				return getIndicetypes();
			case LlvmPackage.GET_ELEMENT_PTR__INDICES:
				return getIndices();
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
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTTYPE:
				setElementtype((String)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__TYPES:
				setTypes((TypeList)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY:
				setElementarray((ARRAY)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENT:
				setElement((String)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__INDICETYPES:
				getIndicetypes().clear();
				getIndicetypes().addAll((Collection<? extends String>)newValue);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__INDICES:
				getIndices().clear();
				getIndices().addAll((Collection<? extends String>)newValue);
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
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTTYPE:
				setElementtype(ELEMENTTYPE_EDEFAULT);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__TYPES:
				setTypes((TypeList)null);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY:
				setElementarray((ARRAY)null);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case LlvmPackage.GET_ELEMENT_PTR__INDICETYPES:
				getIndicetypes().clear();
				return;
			case LlvmPackage.GET_ELEMENT_PTR__INDICES:
				getIndices().clear();
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
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTTYPE:
				return ELEMENTTYPE_EDEFAULT == null ? elementtype != null : !ELEMENTTYPE_EDEFAULT.equals(elementtype);
			case LlvmPackage.GET_ELEMENT_PTR__TYPES:
				return types != null;
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENTARRAY:
				return elementarray != null;
			case LlvmPackage.GET_ELEMENT_PTR__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
			case LlvmPackage.GET_ELEMENT_PTR__INDICETYPES:
				return indicetypes != null && !indicetypes.isEmpty();
			case LlvmPackage.GET_ELEMENT_PTR__INDICES:
				return indices != null && !indices.isEmpty();
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
		result.append(" (elementtype: ");
		result.append(elementtype);
		result.append(", element: ");
		result.append(element);
		result.append(", indicetypes: ");
		result.append(indicetypes);
		result.append(", indices: ");
		result.append(indices);
		result.append(')');
		return result.toString();
	}

} //GetElementPtrImpl
