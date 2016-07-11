package de.upb.lina.cfg.tools.tests.custom;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.Before;
import org.junit.Test;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.stringrepresentation.StringConversionManager;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;


public abstract class StoreBufferGraphTest {

   protected LLVM ast;
   protected FunctionDefinition functionToTest;
   protected ControlFlowDiagram storeBufferGraph;
   protected StringConversionManager stringConversionManager;
   protected EMemoryModel memoryModel;


   @Before
   public void setUp() throws Exception
   {
      this.memoryModel = getMemoryModel();
      this.ast = getLLVMOfTestFile();
      this.functionToTest = (FunctionDefinition) this.ast.getElements().get(0);
      stringConversionManager = new StringConversionManager();

      IGraphGenerator storeBufferGraphGenerator = memoryModel.createGraphGenerator(this.functionToTest);
      storeBufferGraph = storeBufferGraphGenerator.createGraph();
   }


   private LLVM getLLVMOfTestFile()
   {
      IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
      IProject examplesProject = workSpaceRoot.getProject("/examples");
      IResource resource = examplesProject.findMember("SimpleTests" + File.separator + getTestLocation());
      return ResourceIOUtil.createAstFromLLVM(resource.getFullPath().toPortableString());
   }


   @Test
   public void assertStoreBufferSynchronizationBeforeFences()
   {
      for (Transition edgeWithSynchronizingInstruction : collectEdgesWithSynchronizingInstruction())
      {
         ControlFlowLocation targetNode = edgeWithSynchronizingInstruction.getTarget();
         assertTrue(targetNode.getBuffer().getAddressValuePairs().isEmpty());
      }
   }


   @Test
   public void testNumberOfNodes()
   {
      assertEquals(getExpectedNumberOfNodes(), getNumberOfNodes());
   }


   @Test
   public void testNumberOfEdges()
   {
      assertEquals(getExpectedNumberOfEdges(), getNumberOfEdges());
   }


   @Test
   public void testNumberOfEarlyReadEdges()
   {
      assertEquals(getExpectedNumberOfEarlyReadEdges(), getNumberOfEarlyReadEdges());
   }


   @Test
   public void testNumberOfWriteDefChainEdges()
   {
      assertEquals(getExpectedNumberOfWriteDefChainEdges(), getNumberOfWriteDefChainEdges());
   }


   @Test
   public void testNumberOfNodesWithNonEmptyStoreBuffers()
   {
      assertEquals(getExpectedNumberOfNodesWithNonEmptyBuffers(), getNumberOfNodesWithNonEmptyStoreBuffers());
   }


   @Test
   public void testValidityOfStoreBufferGraphEntries()
   {
      List<String> expectedStoreBufferStringRepresentations = getExpectedStoreBufferStringRepresentations();
      List<ControlFlowLocation> nodesWithNonEmptyStoreBuffers = collectNodesWithNonEmptyStoreBuffers();

      for (ControlFlowLocation nodeWithNonEmptyStoreBuffer : nodesWithNonEmptyStoreBuffers)
      {
         String storeBufferStringRepresentation = stringConversionManager.bufferToString(nodeWithNonEmptyStoreBuffer, memoryModel);
         assertTrue(expectedStoreBufferStringRepresentations.contains(storeBufferStringRepresentation));
      }
   }


   private int getNumberOfNodes()
   {
      return storeBufferGraph.getLocations().size();
   }


   private int getNumberOfEdges()
   {
      return storeBufferGraph.getTransitions().size();
   }
   
   private int getNumberOfWriteDefChainEdges()
   {
      return collectWriteDefChainTransitions().size();
   }


   private int getNumberOfEarlyReadEdges()
   {
      return collectEarlyReadEdges().size();
   }


   private int getNumberOfNodesWithNonEmptyStoreBuffers()
   {
      return collectNodesWithNonEmptyStoreBuffers().size();
   }
   

   private List<EarlyReadTransition> collectEarlyReadEdges()
   {
      return GraphUtility.collectEarlyReadEdges(storeBufferGraph);
   }
 

   private List<WriteDefChainTransition> collectWriteDefChainTransitions()
   {
      return GraphUtility.collectWriteDefChainTransitions(storeBufferGraph);
   }
   

   protected List<ControlFlowLocation> collectNodesWithNonEmptyStoreBuffers()
   {
      return GraphUtility.collectNodesWithNonEmptyStoreBuffers(storeBufferGraph);
   }


   protected List<Transition> collectEdgesWithSynchronizingInstruction()
   {
      return GraphUtility.collectEdgesWithSynchronizingInstruction(storeBufferGraph);
   }


   protected abstract EMemoryModel getMemoryModel();


   protected abstract String getTestLocation();


   protected abstract int getExpectedNumberOfNodes();


   protected abstract int getExpectedNumberOfEdges();


   protected abstract int getExpectedNumberOfEarlyReadEdges();


   protected abstract int getExpectedNumberOfWriteDefChainEdges();


   protected abstract int getExpectedNumberOfNodesWithNonEmptyBuffers();


   protected abstract List<String> getExpectedStoreBufferStringRepresentations();


}
