/**
 */
package de.upb.lina.lll.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.lina.lll.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "expressions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upb.de/lina/lll/Expressions";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "expressions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExpressionsPackage eINSTANCE = de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.ExpressionImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.LExpressionImpl <em>LExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.LExpressionImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getLExpression()
   * @generated
   */
  int LEXPRESSION = 1;

  /**
   * The number of structural features of the '<em>LExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.CExpressionImpl <em>CExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.CExpressionImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getCExpression()
   * @generated
   */
  int CEXPRESSION = 2;

  /**
   * The number of structural features of the '<em>CExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXPRESSION_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.SomeValueImpl <em>Some Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.SomeValueImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getSomeValue()
   * @generated
   */
  int SOME_VALUE = 3;

  /**
   * The number of structural features of the '<em>Some Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_VALUE_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.AExpressionImpl <em>AExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.AExpressionImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getAExpression()
   * @generated
   */
  int AEXPRESSION = 4;

  /**
   * The number of structural features of the '<em>AExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.NumberValueImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 5;

  /**
   * The feature id for the '<em><b>Num Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__NUM_VALUE = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.BooleanValueImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.StringValueImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 7;

  /**
   * The feature id for the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__STR_VALUE = SOME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = SOME_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.VariableImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VAR_NAME = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.EquivalentImpl <em>Equivalent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.EquivalentImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getEquivalent()
   * @generated
   */
  int EQUIVALENT = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT__LEFT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT__RIGHT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equivalent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.ImplyImpl <em>Imply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.ImplyImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getImply()
   * @generated
   */
  int IMPLY = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__LEFT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__RIGHT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Imply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.OrImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getOr()
   * @generated
   */
  int OR = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.XorImpl <em>Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.XorImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getXor()
   * @generated
   */
  int XOR = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR__LEFT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR__RIGHT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.AndImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getAnd()
   * @generated
   */
  int AND = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.NotImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getNot()
   * @generated
   */
  int NOT = 14;

  /**
   * The feature id for the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__NOT = LEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = LEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.LessOrEqualImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getLessOrEqual()
   * @generated
   */
  int LESS_OR_EQUAL = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUAL__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUAL__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less Or Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUAL_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.LessImpl <em>Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.LessImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getLess()
   * @generated
   */
  int LESS = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.GreaterOrEqualImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getGreaterOrEqual()
   * @generated
   */
  int GREATER_OR_EQUAL = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater Or Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.GreaterImpl <em>Greater</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.GreaterImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getGreater()
   * @generated
   */
  int GREATER = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.EqualImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.UnequalImpl <em>Unequal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.UnequalImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getUnequal()
   * @generated
   */
  int UNEQUAL = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNEQUAL__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNEQUAL__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unequal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNEQUAL_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.ApproxImpl <em>Approx</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.ApproxImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getApprox()
   * @generated
   */
  int APPROX = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPROX__LEFT = CEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPROX__RIGHT = CEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Approx</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPROX_FEATURE_COUNT = CEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.PlusImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.MinusImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.MultiImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.DivImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getDiv()
   * @generated
   */
  int DIV = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.ModImpl <em>Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.ModImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getMod()
   * @generated
   */
  int MOD = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__LEFT = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__RIGHT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.lina.lll.expressions.impl.PowImpl <em>Pow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.lina.lll.expressions.impl.PowImpl
   * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getPow()
   * @generated
   */
  int POW = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__LEFT = AEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__RIGHT = AEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_FEATURE_COUNT = AEXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.upb.lina.lll.expressions.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.LExpression <em>LExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LExpression</em>'.
   * @see de.upb.lina.lll.expressions.LExpression
   * @generated
   */
  EClass getLExpression();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.CExpression <em>CExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CExpression</em>'.
   * @see de.upb.lina.lll.expressions.CExpression
   * @generated
   */
  EClass getCExpression();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.SomeValue <em>Some Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Value</em>'.
   * @see de.upb.lina.lll.expressions.SomeValue
   * @generated
   */
  EClass getSomeValue();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.AExpression <em>AExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AExpression</em>'.
   * @see de.upb.lina.lll.expressions.AExpression
   * @generated
   */
  EClass getAExpression();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see de.upb.lina.lll.expressions.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.lina.lll.expressions.NumberValue#getNumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Value</em>'.
   * @see de.upb.lina.lll.expressions.NumberValue#getNumValue()
   * @see #getNumberValue()
   * @generated
   */
  EAttribute getNumberValue_NumValue();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see de.upb.lina.lll.expressions.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.lina.lll.expressions.BooleanValue#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.upb.lina.lll.expressions.BooleanValue#isValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see de.upb.lina.lll.expressions.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.lina.lll.expressions.StringValue#getStrValue <em>Str Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str Value</em>'.
   * @see de.upb.lina.lll.expressions.StringValue#getStrValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_StrValue();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.upb.lina.lll.expressions.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link de.upb.lina.lll.expressions.Variable#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see de.upb.lina.lll.expressions.Variable#getVarName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_VarName();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Equivalent <em>Equivalent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent</em>'.
   * @see de.upb.lina.lll.expressions.Equivalent
   * @generated
   */
  EClass getEquivalent();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Equivalent#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Equivalent#getLeft()
   * @see #getEquivalent()
   * @generated
   */
  EReference getEquivalent_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Equivalent#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Equivalent#getRight()
   * @see #getEquivalent()
   * @generated
   */
  EReference getEquivalent_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Imply <em>Imply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imply</em>'.
   * @see de.upb.lina.lll.expressions.Imply
   * @generated
   */
  EClass getImply();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Imply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Imply#getLeft()
   * @see #getImply()
   * @generated
   */
  EReference getImply_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Imply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Imply#getRight()
   * @see #getImply()
   * @generated
   */
  EReference getImply_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see de.upb.lina.lll.expressions.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Xor <em>Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor</em>'.
   * @see de.upb.lina.lll.expressions.Xor
   * @generated
   */
  EClass getXor();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Xor#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Xor#getLeft()
   * @see #getXor()
   * @generated
   */
  EReference getXor_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Xor#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Xor#getRight()
   * @see #getXor()
   * @generated
   */
  EReference getXor_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see de.upb.lina.lll.expressions.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see de.upb.lina.lll.expressions.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Not#getNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Not</em>'.
   * @see de.upb.lina.lll.expressions.Not#getNot()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Not();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.LessOrEqual <em>Less Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Or Equal</em>'.
   * @see de.upb.lina.lll.expressions.LessOrEqual
   * @generated
   */
  EClass getLessOrEqual();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.LessOrEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.LessOrEqual#getLeft()
   * @see #getLessOrEqual()
   * @generated
   */
  EReference getLessOrEqual_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.LessOrEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.LessOrEqual#getRight()
   * @see #getLessOrEqual()
   * @generated
   */
  EReference getLessOrEqual_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less</em>'.
   * @see de.upb.lina.lll.expressions.Less
   * @generated
   */
  EClass getLess();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Less#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Less#getLeft()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Less#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Less#getRight()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.GreaterOrEqual <em>Greater Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Or Equal</em>'.
   * @see de.upb.lina.lll.expressions.GreaterOrEqual
   * @generated
   */
  EClass getGreaterOrEqual();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.GreaterOrEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.GreaterOrEqual#getLeft()
   * @see #getGreaterOrEqual()
   * @generated
   */
  EReference getGreaterOrEqual_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.GreaterOrEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.GreaterOrEqual#getRight()
   * @see #getGreaterOrEqual()
   * @generated
   */
  EReference getGreaterOrEqual_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Greater <em>Greater</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater</em>'.
   * @see de.upb.lina.lll.expressions.Greater
   * @generated
   */
  EClass getGreater();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Greater#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Greater#getLeft()
   * @see #getGreater()
   * @generated
   */
  EReference getGreater_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Greater#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Greater#getRight()
   * @see #getGreater()
   * @generated
   */
  EReference getGreater_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal</em>'.
   * @see de.upb.lina.lll.expressions.Equal
   * @generated
   */
  EClass getEqual();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Equal#getLeft()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Equal#getRight()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Unequal <em>Unequal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unequal</em>'.
   * @see de.upb.lina.lll.expressions.Unequal
   * @generated
   */
  EClass getUnequal();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Unequal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Unequal#getLeft()
   * @see #getUnequal()
   * @generated
   */
  EReference getUnequal_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Unequal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Unequal#getRight()
   * @see #getUnequal()
   * @generated
   */
  EReference getUnequal_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Approx <em>Approx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Approx</em>'.
   * @see de.upb.lina.lll.expressions.Approx
   * @generated
   */
  EClass getApprox();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Approx#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Approx#getLeft()
   * @see #getApprox()
   * @generated
   */
  EReference getApprox_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Approx#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Approx#getRight()
   * @see #getApprox()
   * @generated
   */
  EReference getApprox_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see de.upb.lina.lll.expressions.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see de.upb.lina.lll.expressions.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see de.upb.lina.lll.expressions.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see de.upb.lina.lll.expressions.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Mod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod</em>'.
   * @see de.upb.lina.lll.expressions.Mod
   * @generated
   */
  EClass getMod();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Mod#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Mod#getLeft()
   * @see #getMod()
   * @generated
   */
  EReference getMod_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Mod#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Mod#getRight()
   * @see #getMod()
   * @generated
   */
  EReference getMod_Right();

  /**
   * Returns the meta object for class '{@link de.upb.lina.lll.expressions.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow</em>'.
   * @see de.upb.lina.lll.expressions.Pow
   * @generated
   */
  EClass getPow();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Pow#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.upb.lina.lll.expressions.Pow#getLeft()
   * @see #getPow()
   * @generated
   */
  EReference getPow_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.lina.lll.expressions.Pow#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.upb.lina.lll.expressions.Pow#getRight()
   * @see #getPow()
   * @generated
   */
  EReference getPow_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExpressionsFactory getExpressionsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.ExpressionImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.LExpressionImpl <em>LExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.LExpressionImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getLExpression()
     * @generated
     */
    EClass LEXPRESSION = eINSTANCE.getLExpression();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.CExpressionImpl <em>CExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.CExpressionImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getCExpression()
     * @generated
     */
    EClass CEXPRESSION = eINSTANCE.getCExpression();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.SomeValueImpl <em>Some Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.SomeValueImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getSomeValue()
     * @generated
     */
    EClass SOME_VALUE = eINSTANCE.getSomeValue();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.AExpressionImpl <em>AExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.AExpressionImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getAExpression()
     * @generated
     */
    EClass AEXPRESSION = eINSTANCE.getAExpression();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.NumberValueImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '<em><b>Num Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUE__NUM_VALUE = eINSTANCE.getNumberValue_NumValue();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.BooleanValueImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.StringValueImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__STR_VALUE = eINSTANCE.getStringValue_StrValue();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.VariableImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VAR_NAME = eINSTANCE.getVariable_VarName();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.EquivalentImpl <em>Equivalent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.EquivalentImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getEquivalent()
     * @generated
     */
    EClass EQUIVALENT = eINSTANCE.getEquivalent();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIVALENT__LEFT = eINSTANCE.getEquivalent_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIVALENT__RIGHT = eINSTANCE.getEquivalent_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.ImplyImpl <em>Imply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.ImplyImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getImply()
     * @generated
     */
    EClass IMPLY = eINSTANCE.getImply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLY__LEFT = eINSTANCE.getImply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLY__RIGHT = eINSTANCE.getImply_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.OrImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.XorImpl <em>Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.XorImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getXor()
     * @generated
     */
    EClass XOR = eINSTANCE.getXor();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XOR__LEFT = eINSTANCE.getXor_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XOR__RIGHT = eINSTANCE.getXor_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.AndImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.NotImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__NOT = eINSTANCE.getNot_Not();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.LessOrEqualImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getLessOrEqual()
     * @generated
     */
    EClass LESS_OR_EQUAL = eINSTANCE.getLessOrEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS_OR_EQUAL__LEFT = eINSTANCE.getLessOrEqual_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS_OR_EQUAL__RIGHT = eINSTANCE.getLessOrEqual_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.LessImpl <em>Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.LessImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getLess()
     * @generated
     */
    EClass LESS = eINSTANCE.getLess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__LEFT = eINSTANCE.getLess_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__RIGHT = eINSTANCE.getLess_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.GreaterOrEqualImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getGreaterOrEqual()
     * @generated
     */
    EClass GREATER_OR_EQUAL = eINSTANCE.getGreaterOrEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_OR_EQUAL__LEFT = eINSTANCE.getGreaterOrEqual_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_OR_EQUAL__RIGHT = eINSTANCE.getGreaterOrEqual_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.GreaterImpl <em>Greater</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.GreaterImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getGreater()
     * @generated
     */
    EClass GREATER = eINSTANCE.getGreater();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER__LEFT = eINSTANCE.getGreater_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER__RIGHT = eINSTANCE.getGreater_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.EqualImpl <em>Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.EqualImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getEqual()
     * @generated
     */
    EClass EQUAL = eINSTANCE.getEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__LEFT = eINSTANCE.getEqual_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__RIGHT = eINSTANCE.getEqual_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.UnequalImpl <em>Unequal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.UnequalImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getUnequal()
     * @generated
     */
    EClass UNEQUAL = eINSTANCE.getUnequal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNEQUAL__LEFT = eINSTANCE.getUnequal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNEQUAL__RIGHT = eINSTANCE.getUnequal_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.ApproxImpl <em>Approx</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.ApproxImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getApprox()
     * @generated
     */
    EClass APPROX = eINSTANCE.getApprox();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPROX__LEFT = eINSTANCE.getApprox_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPROX__RIGHT = eINSTANCE.getApprox_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.PlusImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.MinusImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.MultiImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.DivImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.ModImpl <em>Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.ModImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getMod()
     * @generated
     */
    EClass MOD = eINSTANCE.getMod();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD__LEFT = eINSTANCE.getMod_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD__RIGHT = eINSTANCE.getMod_Right();

    /**
     * The meta object literal for the '{@link de.upb.lina.lll.expressions.impl.PowImpl <em>Pow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.lina.lll.expressions.impl.PowImpl
     * @see de.upb.lina.lll.expressions.impl.ExpressionsPackageImpl#getPow()
     * @generated
     */
    EClass POW = eINSTANCE.getPow();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW__LEFT = eINSTANCE.getPow_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW__RIGHT = eINSTANCE.getPow_Right();

  }

} //ExpressionsPackage
