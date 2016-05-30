package de.upb.lina.cfg.tools;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
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


public class CreateGraphOperation extends WorkspaceModifyOperation {

   private LLVM ast = null;
   private String astLocation;
   private Path storeBufferGraphLocation = null;
   private EMemoryModel memoryModel;
   private ArrayList<ControlFlowDiagram> generatedStoreBufferGraphs = new ArrayList<ControlFlowDiagram>();


   public CreateGraphOperation(String astLocation, String storeBufferGraphLocation, EMemoryModel memoryModel) {
      super();
      this.astLocation = astLocation;
      this.storeBufferGraphLocation = new Path(storeBufferGraphLocation);
      this.memoryModel = memoryModel;
   }


   private LLVM loadAst() {
      if (ast == null) {
         ast = ResourceIOUtil.loadAst(astLocation);
      }
      return ast;
   }


   @Override
   protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
      if (loadAst() == null) {
         throw new RuntimeException("Could not load the LLVM AST model.");
      }

      // generating cfg for each function
      generateStoreBufferGraphsForAllFunctionsInAst();

      try {
         // store resulting cfg
         ResourceSet resSet = new ResourceSetImpl();
         Resource resource = resSet.createResource(URI.createURI(storeBufferGraphLocation.toPortableString()));

         for (ControlFlowDiagram cfg : generatedStoreBufferGraphs) {
            EcoreUtil.resolveAll(cfg);
            resource.getContents().add(cfg);
         }

         resource.save(Collections.EMPTY_MAP);
         refreshWorkspace(monitor);

         for (ControlFlowDiagram cfg : generatedStoreBufferGraphs) {
            CFGActivator.log(IStatus.INFO, "Generated " + cfg.getName() + " with " + cfg.getLocations().size() + " nodes and "
                  + cfg.getTransitions().size() + " edges.", null);
         }

      } catch (IOException e) {
         CFGActivator.logError(e.getMessage(), e);
      } catch (IllegalArgumentException e) {
         CFGActivator.log(IStatus.INFO, "User stopped the transformation due to a warning.", e);
      }
   }


   private void generateStoreBufferGraphsForAllFunctionsInAst() {
      for (AbstractElement abstractElement : ast.getElements()) {
         if (abstractElement instanceof FunctionDefinition) {
            FunctionDefinition function = (FunctionDefinition) abstractElement;
            ControlFlowDiagram storeBufferGraph = generateStoreBufferGraphOfFunction(function);
            generatedStoreBufferGraphs.add(storeBufferGraph);
         }
      }
   }


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


   private void refreshWorkspace(IProgressMonitor monitor) throws CoreException {
      IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
      for (int i = 0; i < iProjects.length; i++) {
         iProjects[i].refreshLocal(0, monitor);
      }
   }

}