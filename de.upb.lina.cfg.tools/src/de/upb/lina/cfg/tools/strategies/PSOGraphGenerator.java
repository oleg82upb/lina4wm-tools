package de.upb.lina.cfg.tools.strategies;

import java.util.ArrayList;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;

public class PSOGraphGenerator extends AbstractGraphGenerator
{
	public PSOGraphGenerator(FunctionDefinition function)
	{
		//intialize variables
		this.function = function;
		this.toBeProcessedLocations = new ArrayList<ControlFlowLocation>();
		this.processedLocations = new ArrayList<ControlFlowLocation>();
		this.instructions = gatherInstructions();
	}


	public ControlFlowDiagram createGraph()
	{
		if(this.graph != null)
		{
			return this.graph;
		}
		
		this.graph = ControlflowFactory.eINSTANCE.createControlFlowDiagram();
		this.graph.setName(this.function.getAddress().getName());

		// setup first node
		ControlFlowLocation first = createControlFlowLocation(0, ControlflowFactory.eINSTANCE.createStoreBuffer());
		//GraphUtility.findLabelByInstruction(function, instructions.get(0));
		this.graph.setStart(first);
		this.toBeProcessedLocations.add(first);

		// while we have still nodes to work on
		while (!toBeProcessedLocations.isEmpty())
		{
			ControlFlowLocation sourceLocation = toBeProcessedLocations.get(0);
			if (sourceLocation.getPc() < instructions.size())
			{
				Instruction nextInstruction = instructions.get(sourceLocation.getPc());

				if (nextInstruction != null)
				{
					addTransitions(sourceLocation, nextInstruction);
				}
			}
			
			this.toBeProcessedLocations.remove(sourceLocation);
			this.processedLocations.add(sourceLocation);
		}

		return graph;
	}


	private void addTransitions(ControlFlowLocation sourceLocation, Instruction nextInstruction)
	{
		addInstructionTransitions(sourceLocation, nextInstruction);
//TODO:		addFlushTransitions(sourceLocation);
	}

	@Override
	public String getWarnings()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
