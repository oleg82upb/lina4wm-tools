/**
 */
package de.upb.lina.cfg.gendata.util;

import de.upb.lina.cfg.gendata.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.lina.cfg.gendata.GendataPackage
 * @generated
 */
public class GendataAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GendataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = GendataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GendataSwitch<Adapter> modelSwitch =
		new GendataSwitch<Adapter>() {
			@Override
			public Adapter caseLocalVariables(LocalVariables object) {
				return createLocalVariablesAdapter();
			}
			@Override
			public Adapter caseGeneratorData(GeneratorData object) {
				return createGeneratorDataAdapter();
			}
			@Override
			public Adapter caseAddressMapping(AddressMapping object) {
				return createAddressMappingAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseConstraintMapping(ConstraintMapping object) {
				return createConstraintMappingAdapter();
			}
			@Override
			public Adapter caseFunctionParamsMapping(FunctionParamsMapping object) {
				return createFunctionParamsMappingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.LocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.LocalVariables
	 * @generated
	 */
	public Adapter createLocalVariablesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.GeneratorData <em>Generator Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.GeneratorData
	 * @generated
	 */
	public Adapter createGeneratorDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.AddressMapping <em>Address Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.AddressMapping
	 * @generated
	 */
	public Adapter createAddressMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.Label
	 * @generated
	 */
	public Adapter createLabelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.ConstraintMapping <em>Constraint Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.ConstraintMapping
	 * @generated
	 */
	public Adapter createConstraintMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping <em>Function Params Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping
	 * @generated
	 */
	public Adapter createFunctionParamsMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //GendataAdapterFactory
