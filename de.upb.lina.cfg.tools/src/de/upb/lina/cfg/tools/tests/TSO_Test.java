package de.upb.lina.cfg.tools.tests;


import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.Before;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.lina.cfg.tools.stringrepresentation.StringConversionManager;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;


public abstract class TSO_Test {
   protected String testLocation;
   protected LLVM ast;
   protected FunctionDefinition functionTestData;
   protected ControlFlowDiagram diag;
   protected StringConversionManager stringConversionManager;


   @Before
   public void setUp() throws Exception {
      this.ast = getLLVMOfTestFile();
      this.functionTestData = (FunctionDefinition) this.ast.getElements().get(0);

      TSOGraphGenerator generator = new TSOGraphGenerator(this.functionTestData);
      diag = generator.createGraph();

      stringConversionManager = new StringConversionManager();
   }


   private LLVM getLLVMOfTestFile() {
      IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
      IProject examplesProject = workSpaceRoot.getProject("/examples");
      IResource resource = examplesProject.findMember("SimpleTests" + File.separator + testLocation);
      return ResourceIOUtil.createAstFromLLVM(resource.getFullPath().toPortableString());
   }
}
