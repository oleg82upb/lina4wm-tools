/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.*;

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
		try {
			GendataFactory theGendataFactory = (GendataFactory)EPackage.Registry.INSTANCE.getEFactory(GendataPackage.eNS_URI);
			if (theGendataFactory != null) {
				return theGendataFactory;
			}
		}
		catch (Exception exception) {
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
		switch (eClass.getClassifierID()) {
			case GendataPackage.LOCAL_VARIABLES: return createLocalVariables();
			case GendataPackage.GENERATOR_DATA: return createGeneratorData();
			case GendataPackage.ADDRESS_MAPPING: return createAddressMapping();
			case GendataPackage.CONSTRAINT_MAPPING: return createConstraintMapping();
			case GendataPackage.FUNCTION_PARAMS_MAPPING: return createFunctionParamsMapping();
			case GendataPackage.LOCATION_LABEL: return createLocationLabel();
			case GendataPackage.TRANSITION_LABEL: return createTransitionLabel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariables createLocalVariables()
	{
		LocalVariablesImpl localVariables = new LocalVariablesImpl();
		return localVariables;
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
	public FunctionParamsMapping createFunctionParamsMapping() {
		FunctionParamsMappingImpl functionParamsMapping = new FunctionParamsMappingImpl();
		return functionParamsMapping;
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
