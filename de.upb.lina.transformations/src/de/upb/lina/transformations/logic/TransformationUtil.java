package de.upb.lina.transformations.logic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.wizard.Wizard;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.lina.cfg.tools.strategies.PSOGraphGenerator;
import de.upb.lina.cfg.tools.strategies.SCGraphGenerator;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.lina.transformations.Activator;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;

/**
 * Utility class implementing several utility methods useful for the transformation process.
 * 
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
	public static List<ControlFlowDiagram> createCFGFromAst(int memoryModel, LLVM ast)
	{
		List<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();
		// generating cfg for each function
		Iterator<AbstractElement> i = ast.getElements().iterator();
		while (i.hasNext())
		{
			AbstractElement e = i.next();
			if (e instanceof FunctionDefinition)
			{
				FunctionDefinition function = (FunctionDefinition) e;
				if (function.getBody() != null)
				{
					IGraphGenerator generator = null;
	
					switch(memoryModel){
					case CFGConstants.SC: 
						generator = new SCGraphGenerator(function);
						break;
					case CFGConstants.TSO:
						generator = new TSOGraphGenerator(function);
						break;
					case CFGConstants.PSO:
						generator = new PSOGraphGenerator(function);
						break;
					default:
						throw new RuntimeException("Memory model selection not supported");
					}
	
					list.add(generator.createGraph());
					if (generator.getWarnings() != null)
					{
						CFGActivator.logWarning(generator.getWarnings(), null);
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
	public static void runTransformationOperation(Wizard wizardToRunOperation,
			TransformationOperation transformationOperation) {
		try
		{
			wizardToRunOperation.getContainer().run(true, false, transformationOperation);
		} catch (InvocationTargetException e)
		{
			Activator.logError("InvocationTargetException occured during the transformation.", e);
		} catch (InterruptedException e)
		{
			Activator.logError("InterruptedException occured during the transformation.", e);
		}
	}

}
