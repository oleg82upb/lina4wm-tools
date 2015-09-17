package de.upb.lina.cfg.tools.strategies;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;

public class PSOGraphGenerator extends AbstractGraphGenerator
{
	public PSOGraphGenerator(FunctionDefinition function)
	{
		//intialize variables
		super(function);
	}


	protected void addTransitions(ControlFlowLocation sourceLocation, Instruction nextInstruction)
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
