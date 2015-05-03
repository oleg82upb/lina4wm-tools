/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.GendataPackage;

import de.upb.llvm_parser.llvm.Address;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getAdresses <em>Adresses</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getOldNames <em>Old Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressMappingImpl extends MinimalEObjectImpl.Container implements AddressMapping
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdresses() <em>Adresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> adresses;

	/**
	 * The cached value of the '{@link #getOldNames() <em>Old Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> oldNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressMappingImpl()
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
		return GendataPackage.Literals.ADDRESS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.ADDRESS_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAdresses()
	{
		if (adresses == null) {
			adresses = new EObjectResolvingEList<Address>(Address.class, this, GendataPackage.ADDRESS_MAPPING__ADRESSES);
		}
		return adresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOldNames() {
		if (oldNames == null) {
			oldNames = new EDataTypeUniqueEList<String>(String.class, this, GendataPackage.ADDRESS_MAPPING__OLD_NAMES);
		}
		return oldNames;
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
			case GendataPackage.ADDRESS_MAPPING__NAME:
				return getName();
			case GendataPackage.ADDRESS_MAPPING__ADRESSES:
				return getAdresses();
			case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
				return getOldNames();
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
			case GendataPackage.ADDRESS_MAPPING__NAME:
				setName((String)newValue);
				return;
			case GendataPackage.ADDRESS_MAPPING__ADRESSES:
				getAdresses().clear();
				getAdresses().addAll((Collection<? extends Address>)newValue);
				return;
			case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
				getOldNames().clear();
				getOldNames().addAll((Collection<? extends String>)newValue);
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
			case GendataPackage.ADDRESS_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GendataPackage.ADDRESS_MAPPING__ADRESSES:
				getAdresses().clear();
				return;
			case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
				getOldNames().clear();
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
			case GendataPackage.ADDRESS_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GendataPackage.ADDRESS_MAPPING__ADRESSES:
				return adresses != null && !adresses.isEmpty();
			case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
				return oldNames != null && !oldNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", oldNames: ");
		result.append(oldNames);
		result.append(')');
		return result.toString();
	}

} //AddressMappingImpl
