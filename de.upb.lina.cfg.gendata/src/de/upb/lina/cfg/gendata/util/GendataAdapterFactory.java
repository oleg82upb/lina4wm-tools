/**
 */
package de.upb.lina.cfg.gendata.util;

import de.upb.lina.cfg.gendata.*;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;
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
			public Adapter caseGeneratorData(GeneratorData object) {
				return createGeneratorDataAdapter();
			}
			@Override
			public Adapter caseAddressMapping(AddressMapping object) {
				return createAddressMappingAdapter();
			}
			@Override
			public Adapter caseConstraintMapping(ConstraintMapping object) {
				return createConstraintMappingAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseLocationLabel(LocationLabel object) {
				return createLocationLabelAdapter();
			}
			@Override
			public Adapter caseTransitionLabel(TransitionLabel object) {
				return createTransitionLabelAdapter();
			}
			@Override
			public Adapter casePhiMapping(PhiMapping object) {
				return createPhiMappingAdapter();
			}
			@Override
			public Adapter caseFilterToAddressMapping(Map.Entry<String, EList<AddressMapping>> object) {
				return createFilterToAddressMappingAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.LocationLabel <em>Location Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.LocationLabel
	 * @generated
	 */
	public Adapter createLocationLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.TransitionLabel <em>Transition Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.TransitionLabel
	 * @generated
	 */
	public Adapter createTransitionLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.cfg.gendata.PhiMapping <em>Phi Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.cfg.gendata.PhiMapping
	 * @generated
	 */
	public Adapter createPhiMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Filter To Address Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createFilterToAddressMappingAdapter() {
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
