package de.upb.lina.cfg.tools.tests;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.ReorderingUtil;
import de.upb.lina.cfg.tools.WarningLogger;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

@RunWith(Parameterized.class)
public class ReorderingUtilTest {
	private String astLoc;
	private LLVM ast;


	public ReorderingUtilTest(String astLoc){
		this.astLoc = astLoc;
	}

	@Before
	public void setUp() throws Exception {
		LlvmPackage.eINSTANCE.getNsURI();
		//We still have a problem with the set here - resources are not found
		//TODO: fix this
		ResourceSet resourceSet = new ResourceSetImpl();
		Path astpath = new Path(astLoc);
		Resource llvmast = getResource(resourceSet, astpath.toOSString());
		EObject ast = llvmast.getContents().get(0);
		if (ast instanceof LLVM){
			this.ast = (LLVM) ast;
		}

	}

	@Test
	public void testCreateReachibilityGraph() {
		WarningLogger logger = new WarningLogger(false);
		ReorderingUtil util = new ReorderingUtil();

		ControlFlowDiagram diag = util.createReachibilityGraph((FunctionDefinition) ast.getElements().get(0), logger);
		
		//TODO: We can check stuff here now
		//Eg if the diag has enough nodes, etc...
		//it might be a good idea to define the things to check in the constructor
		//so we can actually put the stuff to check as parameters into data()
		//addition: let data() read the data from a file -> we can define testcases in .txt
	}

	private Resource getResource(ResourceSet resourceSet, String osString) {
		URI test = URI.createPlatformResourceURI(osString, true);
		Resource r = resourceSet.getResource(test, true);
		return r;
	}


	//Change this to change the testset of llvm-files
	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { {"Test/UnitTests/SimpleLoop.s.llvm"},{"/Test/UnitTests/Test1.s.llvm"}, {"/Test/UnitTests/SimpleNoFenceLoop.s.llvm"}});
	}
	
	
//	 @Parameters
//	  public static List<Object[]> data() throws IOException {
//	    List<Object[]> testParams = new LinkedList<Object[]>();
//	    Properties testProps = new Properties();
//	    testProps.load(new FileInputStream("testparams.txt"));
//	    for (Entry<?, ?>  entry : testProps.entrySet()) {
//	      testParams.add(new Object[] {
//	          Integer.parseInt(entry.getKey().toString()), 
//	          Long.parseLong(entry.getValue().toString())});
//	    }
//	    return testParams;
//	  } 

}