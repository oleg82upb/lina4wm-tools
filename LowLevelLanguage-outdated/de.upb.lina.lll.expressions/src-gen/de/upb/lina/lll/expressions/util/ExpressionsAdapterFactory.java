/**
 */
package de.upb.lina.lll.expressions.util;

import de.upb.lina.lll.expressions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.lina.lll.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ExpressionsPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpressionsAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
  protected ExpressionsSwitch<Adapter> modelSwitch =
    new ExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseLExpression(LExpression object) {
				return createLExpressionAdapter();
			}
			@Override
			public Adapter caseCExpression(CExpression object) {
				return createCExpressionAdapter();
			}
			@Override
			public Adapter caseSomeValue(SomeValue object) {
				return createSomeValueAdapter();
			}
			@Override
			public Adapter caseAExpression(AExpression object) {
				return createAExpressionAdapter();
			}
			@Override
			public Adapter caseNumberValue(NumberValue object) {
				return createNumberValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseEquivalent(Equivalent object) {
				return createEquivalentAdapter();
			}
			@Override
			public Adapter caseImply(Imply object) {
				return createImplyAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseLessOrEqual(LessOrEqual object) {
				return createLessOrEqualAdapter();
			}
			@Override
			public Adapter caseLess(Less object) {
				return createLessAdapter();
			}
			@Override
			public Adapter caseGreaterOrEqual(GreaterOrEqual object) {
				return createGreaterOrEqualAdapter();
			}
			@Override
			public Adapter caseGreater(Greater object) {
				return createGreaterAdapter();
			}
			@Override
			public Adapter caseEqual(Equal object) {
				return createEqualAdapter();
			}
			@Override
			public Adapter caseUnequal(Unequal object) {
				return createUnequalAdapter();
			}
			@Override
			public Adapter caseApprox(Approx object) {
				return createApproxAdapter();
			}
			@Override
			public Adapter casePlus(Plus object) {
				return createPlusAdapter();
			}
			@Override
			public Adapter caseMinus(Minus object) {
				return createMinusAdapter();
			}
			@Override
			public Adapter caseMulti(Multi object) {
				return createMultiAdapter();
			}
			@Override
			public Adapter caseDiv(Div object) {
				return createDivAdapter();
			}
			@Override
			public Adapter caseMod(Mod object) {
				return createModAdapter();
			}
			@Override
			public Adapter casePow(Pow object) {
				return createPowAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Expression
	 * @generated
	 */
  public Adapter createExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.LExpression <em>LExpression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.LExpression
	 * @generated
	 */
  public Adapter createLExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.CExpression <em>CExpression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.CExpression
	 * @generated
	 */
  public Adapter createCExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.SomeValue <em>Some Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.SomeValue
	 * @generated
	 */
  public Adapter createSomeValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.AExpression <em>AExpression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.AExpression
	 * @generated
	 */
  public Adapter createAExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.NumberValue
	 * @generated
	 */
  public Adapter createNumberValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.BooleanValue
	 * @generated
	 */
  public Adapter createBooleanValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.StringValue
	 * @generated
	 */
  public Adapter createStringValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Variable
	 * @generated
	 */
  public Adapter createVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Equivalent <em>Equivalent</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Equivalent
	 * @generated
	 */
  public Adapter createEquivalentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Imply <em>Imply</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Imply
	 * @generated
	 */
  public Adapter createImplyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Or
	 * @generated
	 */
  public Adapter createOrAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Xor
	 * @generated
	 */
  public Adapter createXorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.And
	 * @generated
	 */
  public Adapter createAndAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Not
	 * @generated
	 */
  public Adapter createNotAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.LessOrEqual
	 * @generated
	 */
  public Adapter createLessOrEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Less
	 * @generated
	 */
  public Adapter createLessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.GreaterOrEqual
	 * @generated
	 */
  public Adapter createGreaterOrEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Greater
	 * @generated
	 */
  public Adapter createGreaterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Equal
	 * @generated
	 */
  public Adapter createEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Unequal <em>Unequal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Unequal
	 * @generated
	 */
  public Adapter createUnequalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Approx <em>Approx</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Approx
	 * @generated
	 */
  public Adapter createApproxAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Plus
	 * @generated
	 */
  public Adapter createPlusAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Minus
	 * @generated
	 */
  public Adapter createMinusAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Multi <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Multi
	 * @generated
	 */
  public Adapter createMultiAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Div
	 * @generated
	 */
  public Adapter createDivAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Mod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Mod
	 * @generated
	 */
  public Adapter createModAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.upb.lina.lll.expressions.Pow <em>Pow</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.lina.lll.expressions.Pow
	 * @generated
	 */
  public Adapter createPowAdapter()
  {
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

} //ExpressionsAdapterFactory
