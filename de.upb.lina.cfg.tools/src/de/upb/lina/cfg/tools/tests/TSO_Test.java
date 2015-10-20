package de.upb.lina.cfg.tools.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public abstract class TSO_Test {
	protected String testLocation;
	protected LLVM ast;
	protected FunctionDefinition functionTestData;
	protected GraphUtility gUtil;
	protected ControlFlowDiagram diag;

	@Before
	public void setUp() throws Exception {
		LlvmPackage.eINSTANCE.getNsURI();
		ControlflowPackage.eINSTANCE.getNsPrefix();
		
		ResourceSetImpl xtextResourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(testLocation);
		Resource resource = xtextResourceSet.getResource(uri, true);
		EObject ast = resource.getContents().get(0);
		EcoreUtil.resolveAll(ast);
		if (ast instanceof LLVM) {
			this.ast = (LLVM) ast;
			this.functionTestData = (FunctionDefinition) this.ast.getElements().get(0);
		}
		
		TSOGraphGenerator generator = new TSOGraphGenerator(this.functionTestData);
		diag = generator.createGraph();
	}
}
