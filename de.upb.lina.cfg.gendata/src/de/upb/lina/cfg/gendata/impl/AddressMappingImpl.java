/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.llvm_parser.llvm.Address;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getAdresses <em>Adresses</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getOldNames <em>Old Names</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getGeneratorData <em>Generator Data</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressMappingImpl extends NamedElementImpl implements AddressMapping
{
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
    * The cached value of the '{@link #getGeneratorData() <em>Generator Data</em>}' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getGeneratorData()
    * @generated
    * @ordered
    */
	protected GeneratorData generatorData;

	/**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
	protected static final String TYPE_EDEFAULT = null;

	/**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
	protected String type = TYPE_EDEFAULT;

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
	public GeneratorData getGeneratorData() {
      if (generatorData != null && generatorData.eIsProxy()) {
         InternalEObject oldGeneratorData = (InternalEObject)generatorData;
         generatorData = (GeneratorData)eResolveProxy(oldGeneratorData);
         if (generatorData != oldGeneratorData) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA, oldGeneratorData, generatorData));
         }
      }
      return generatorData;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public GeneratorData basicGetGeneratorData() {
      return generatorData;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public NotificationChain basicSetGeneratorData(GeneratorData newGeneratorData, NotificationChain msgs) {
      GeneratorData oldGeneratorData = generatorData;
      generatorData = newGeneratorData;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA, oldGeneratorData, newGeneratorData);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setGeneratorData(GeneratorData newGeneratorData) {
      if (newGeneratorData != generatorData) {
         NotificationChain msgs = null;
         if (generatorData != null)
            msgs = ((InternalEObject)generatorData).eInverseRemove(this, GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS, GeneratorData.class, msgs);
         if (newGeneratorData != null)
            msgs = ((InternalEObject)newGeneratorData).eInverseAdd(this, GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS, GeneratorData.class, msgs);
         msgs = basicSetGeneratorData(newGeneratorData, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA, newGeneratorData, newGeneratorData));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public String getType() {
      return type;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setType(String newType) {
      String oldType = type;
      type = newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.ADDRESS_MAPPING__TYPE, oldType, type));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA:
            if (generatorData != null)
               msgs = ((InternalEObject)generatorData).eInverseRemove(this, GendataPackage.GENERATOR_DATA__ADDRESS_MAPPINGS, GeneratorData.class, msgs);
            return basicSetGeneratorData((GeneratorData)otherEnd, msgs);
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
         case GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA:
            return basicSetGeneratorData(null, msgs);
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
         case GendataPackage.ADDRESS_MAPPING__ADRESSES:
            return getAdresses();
         case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
            return getOldNames();
         case GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA:
            if (resolve) return getGeneratorData();
            return basicGetGeneratorData();
         case GendataPackage.ADDRESS_MAPPING__TYPE:
            return getType();
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
         case GendataPackage.ADDRESS_MAPPING__ADRESSES:
            getAdresses().clear();
            getAdresses().addAll((Collection<? extends Address>)newValue);
            return;
         case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
            getOldNames().clear();
            getOldNames().addAll((Collection<? extends String>)newValue);
            return;
         case GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA:
            setGeneratorData((GeneratorData)newValue);
            return;
         case GendataPackage.ADDRESS_MAPPING__TYPE:
            setType((String)newValue);
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
         case GendataPackage.ADDRESS_MAPPING__ADRESSES:
            getAdresses().clear();
            return;
         case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
            getOldNames().clear();
            return;
         case GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA:
            setGeneratorData((GeneratorData)null);
            return;
         case GendataPackage.ADDRESS_MAPPING__TYPE:
            setType(TYPE_EDEFAULT);
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
         case GendataPackage.ADDRESS_MAPPING__ADRESSES:
            return adresses != null && !adresses.isEmpty();
         case GendataPackage.ADDRESS_MAPPING__OLD_NAMES:
            return oldNames != null && !oldNames.isEmpty();
         case GendataPackage.ADDRESS_MAPPING__GENERATOR_DATA:
            return generatorData != null;
         case GendataPackage.ADDRESS_MAPPING__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
      result.append(" (oldNames: ");
      result.append(oldNames);
      result.append(", type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} //AddressMappingImpl
