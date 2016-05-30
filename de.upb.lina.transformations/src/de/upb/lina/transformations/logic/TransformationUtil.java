package de.upb.lina.transformations.logic;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.wizard.Wizard;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.lina.transformations.Activator;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;


/**
 * Utility class implementing several utility methods useful for the transformation process.
 * 
 */
public abstract class TransformationUtil {

   /**
    * Creates the according controlflow diagrams for the given ast and memory model.
    * 
    * @param memoryModel memory model to consider for cfg creation
    * @param ast ast to create cfg for
    * @return created cfgs of the functions of ast
    */
   public static List<ControlFlowDiagram> createCFGFromAst(EMemoryModel memoryModel, LLVM ast) {
      List<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();
      // generating cfg for each function
      Iterator<AbstractElement> i = ast.getElements().iterator();
      while (i.hasNext()) {
         AbstractElement e = i.next();
         if (e instanceof FunctionDefinition) {
            FunctionDefinition function = (FunctionDefinition) e;
            if (function.getBody() != null) {
               if (memoryModel != null) {
                  IGraphGenerator generator = memoryModel.createGraphGenerator(function);
                  list.add(generator.createGraph());
               } else {
                  throw new RuntimeException("Memory model selection not supported");
               }
            }
         }
      }
      return list;
   }


   /**
    * Runs the given {@link TransformationOperation} using the given wizard.
    * 
    * @param wizardToRunOperation wizard which is used to run the operation
    * @param transformationOperation operation to be run
    */
   public static void runTransformationOperation(Wizard wizardToRunOperation, TransformationOperation transformationOperation) {
      try {
         wizardToRunOperation.getContainer().run(true, false, transformationOperation);
      } catch (InvocationTargetException e) {
         Activator.logError("InvocationTargetException occured during the transformation.", e);
      } catch (InterruptedException e) {
         Activator.logError("InterruptedException occured during the transformation.", e);
      }
   }

}
