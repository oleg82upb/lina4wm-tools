package de.upb.lina.cfg.tools.tests;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;

import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public abstract class TSO_Test {
	protected String astLoc;
	protected LLVM ast;
	protected GraphUtility gUtil;

	@Before
	public void setUp() throws Exception {
		LlvmPackage.eINSTANCE.getNsURI();
		ControlflowPackage.eINSTANCE.getNsPrefix();
		
		gUtil = new GraphUtility();
		
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Path astpath = new Path(CFGActivator.PLUGIN_ID + "/" + astLoc);
		URI uri = URI.createPlatformPluginURI(astpath.toOSString(), true);
		Resource llvmast = resourceSet.getResource(uri, true);
		EObject ast = llvmast.getContents().get(0);
		if (ast instanceof LLVM){
			this.ast = (LLVM) ast;
		}
	}

//	@Test
//	public final void testCreateReachibilityGraph() {
//		ReorderingUtil util = new ReorderingUtil();
//
//		ControlFlowDiagram diag = util.createReachibilityGraph((FunctionDefinition) ast.getElements().get(0));
//		
//		//check for correct amount of locations and edges
//		assertEquals(diag.getLocations().size(),9);
//		assertEquals(diag.getTransitions().size(),10);
//		
//		List<ControlFlowLocation> locs = diag.getLocations();
//		
//		List<ControlFlowLocation> nonEmptyBuffers  = new ArrayList<ControlFlowLocation>();
//		for(ControlFlowLocation l: locs){
//			if(!l.getBuffer().getAddressValuePairs().isEmpty()){
//				nonEmptyBuffers.add(l);
//			}
//		}
//		
//		//check that there is only three nodes with a buffer
//		assertEquals(nonEmptyBuffers.size(), 3);
//		
//		//check that all buffers contain the correct elements
//		for(ControlFlowLocation l: nonEmptyBuffers){
//			String buffer = gUtil.getBufferAsString(l);
//			boolean isValidBuffer = buffer.equals(l.getPc()+"<(%b,%r1)>");
//			assertTrue(isValidBuffer);
//			
//		}
//	}
}
