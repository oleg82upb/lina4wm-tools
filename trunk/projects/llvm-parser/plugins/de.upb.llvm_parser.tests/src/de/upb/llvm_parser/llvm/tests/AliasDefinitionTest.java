/**
 */
package de.upb.llvm_parser.llvm.tests;

import de.upb.llvm_parser.llvm.AliasDefinition;
import de.upb.llvm_parser.llvm.LlvmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alias Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AliasDefinitionTest extends MainLevelEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AliasDefinitionTest.class);
	}

	/**
	 * Constructs a new Alias Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alias Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AliasDefinition getFixture() {
		return (AliasDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LlvmFactory.eINSTANCE.createAliasDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AliasDefinitionTest
