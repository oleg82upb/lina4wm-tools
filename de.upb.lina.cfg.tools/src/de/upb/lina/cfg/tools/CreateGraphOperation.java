package de.upb.lina.cfg.tools;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;


/**
 * This workspace modify operation creates a store buffer graph based on a given AST and memory
 * model.
 * 
 * @author Alexander Hetzer
 *
 */
public class CreateGraphOperation extends WorkspaceModifyOperation {

   private LLVM ast = null;
   private String astLocation;
   private Path storeBufferGraphLocation = null;
   private EMemoryModel memoryModel;
   private ArrayList<ControlFlowDiagram> generatedStoreBufferGraphs = new ArrayList<ControlFlowDiagram>();


   /**
    * Creates a new instance of the create graph operation, initialized with the given values.
    * 
    * @param astLocation location of the ast file to generate the store buffer graphs from
    * @param storeBufferGraphLocation location of the output store buffer graph
    * @param memoryModel memory model to use for the generation
    */
   public CreateGraphOperation(String astLocation, String storeBufferGraphLocation, EMemoryModel memoryModel) {
      super();
      this.astLocation = astLocation;
      this.storeBufferGraphLocation = new Path(storeBufferGraphLocation);
      this.memoryModel = memoryModel;
   }


   @Override
   protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
      assertAstIsNotNull();
      generateStoreBufferGraphsForAllFunctionsInAst();
      storeGeneratedStoreBufferGraphs();
   }


   /**
    * Asserts that the ast is not {@code null}, after it was loaded
    * 
    * @throws RuntimeException if the AST is {@code null}
    */
   private void assertAstIsNotNull() {
      if (loadAst() == null) {
         throw new RuntimeException("Could not load the LLVM AST model.");
      }
   }


   /**
    * Loads the AST located at the local ast location.
    * 
    * @return AST produced by the loading process
    */
   private LLVM loadAst() {
      if (ast == null) {
         ast = ResourceIOUtil.loadAst(astLocation);
      }
      return ast;
   }


   /**
    * Stores the generated store buffer graphs to the hard drive.
    */
   private void storeGeneratedStoreBufferGraphs() {
      try {
         // store resulting cfg
         ResourceSet resSet = new ResourceSetImpl();
         Resource resource = resSet.createResource(URI.createURI(storeBufferGraphLocation.toPortableString()));

         for (ControlFlowDiagram cfg : generatedStoreBufferGraphs) {
            EcoreUtil.resolveAll(cfg);
            resource.getContents().add(cfg);
         }

         resource.save(Collections.EMPTY_MAP);
         ResourceIOUtil.refreshWorkspace();

         logGeneratedStoreBufferGraphs();

      } catch (IOException e) {
         CFGActivator.logError(e.getMessage(), e);
      } catch (IllegalArgumentException e) {
         CFGActivator.log(IStatus.INFO, "User stopped the transformation due to a warning.", e);
      }
   }


   /**
    * Logs which store buffer graphs were generated.
    */
   private void logGeneratedStoreBufferGraphs() {
      for (ControlFlowDiagram cfg : generatedStoreBufferGraphs) {
         CFGActivator.log(IStatus.INFO, "Generated " + cfg.getName() + " with " + cfg.getLocations().size() + " nodes and "
               + cfg.getTransitions().size() + " edges.", null);
      }
   }


   /**
    * Generates store buffer graphs for all non-empty functions in the given AST.
    */
   private void generateStoreBufferGraphsForAllFunctionsInAst() {
      for (AbstractElement abstractElement : ast.getElements()) {
         if (abstractElement instanceof FunctionDefinition) {
            FunctionDefinition function = (FunctionDefinition) abstractElement;
            ControlFlowDiagram storeBufferGraph = generateStoreBufferGraphOfFunction(function);
            if (storeBufferGraph != null) {
               generatedStoreBufferGraphs.add(storeBufferGraph);
            }
         }
      }
   }


   /**
    * Generates the store buffer graph for the given function definition.
    * 
    * @param function function definition to generate the store buffer graph from
    * @return store buffer graph computed from the given function
    */
   private ControlFlowDiagram generateStoreBufferGraphOfFunction(FunctionDefinition function) {
      if (function.getBody() != null) {
         if (memoryModel != null) {
            IGraphGenerator generator = memoryModel.createGraphGenerator(function);
            ControlFlowDiagram storeBufferGraph = generator.createGraph();
            return storeBufferGraph;
         } else {
            throw new RuntimeException("Memory model selection not supported");
         }

      }
      return null;
   }

}