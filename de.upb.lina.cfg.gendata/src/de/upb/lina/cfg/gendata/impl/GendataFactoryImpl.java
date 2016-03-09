/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.*;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GendataFactoryImpl extends EFactoryImpl implements GendataFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GendataFactory init()
	{
		try
		{
			GendataFactory theGendataFactory = (GendataFactory)EPackage.Registry.INSTANCE.getEFactory(GendataPackage.eNS_URI);
			if (theGendataFactory != null)
			{
				return theGendataFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GendataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case GendataPackage.GENERATOR_DATA: return createGeneratorData();
			case GendataPackage.ADDRESS_MAPPING: return createAddressMapping();
			case GendataPackage.CONSTRAINT_MAPPING: return createConstraintMapping();
			case GendataPackage.LOCATION_LABEL: return createLocationLabel();
			case GendataPackage.TRANSITION_LABEL: return createTransitionLabel();
			case GendataPackage.PHI_MAPPING: return createPhiMapping();
			case GendataPackage.FILTER_TO_ADDRESS_MAPPING: return (EObject)createFilterToAddressMapping();
			case GendataPackage.MEMORY_SIZE_MAPPING: return createMemorySizeMapping();
			case GendataPackage.INPUT_TYPE_LIST: return createInputTypeList();
			case GendataPackage.OLD_TO_NEW_CFG_NAME_MAPPING: return (EObject)createOldToNewCfgNameMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorData createGeneratorData()
	{
		GeneratorDataImpl generatorData = new GeneratorDataImpl();
		return generatorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressMapping createAddressMapping()
	{
		AddressMappingImpl addressMapping = new AddressMappingImpl();
		return addressMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintMapping createConstraintMapping() {
		ConstraintMappingImpl constraintMapping = new ConstraintMappingImpl();
		return constraintMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationLabel createLocationLabel() {
		LocationLabelImpl locationLabel = new LocationLabelImpl();
		return locationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionLabel createTransitionLabel() {
		TransitionLabelImpl transitionLabel = new TransitionLabelImpl();
		return transitionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhiMapping createPhiMapping() {
		PhiMappingImpl phiMapping = new PhiMappingImpl();
		return phiMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EList<AddressMapping>> createFilterToAddressMapping() {
		FilterToAddressMappingImpl filterToAddressMapping = new FilterToAddressMappingImpl();
		return filterToAddressMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySizeMapping createMemorySizeMapping() {
		MemorySizeMappingImpl memorySizeMapping = new MemorySizeMappingImpl();
		return memorySizeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTypeList createInputTypeList() {
		InputTypeListImpl inputTypeList = new InputTypeListImpl();
		return inputTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createOldToNewCfgNameMapping() {
		OldToNewCfgNameMappingImpl oldToNewCfgNameMapping = new OldToNewCfgNameMappingImpl();
		return oldToNewCfgNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataPackage getGendataPackage()
	{
		return (GendataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GendataPackage getPackage()
	{
		return GendataPackage.eINSTANCE;
	}

} //GendataFactoryImpl
