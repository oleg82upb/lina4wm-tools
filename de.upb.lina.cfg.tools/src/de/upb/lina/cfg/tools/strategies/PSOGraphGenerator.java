package de.upb.lina.cfg.tools.strategies;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.llvm_parser.llvm.FunctionDefinition;

public class PSOGraphGenerator implements IGraphGenerator
{
	private FunctionDefinition function;

	public PSOGraphGenerator(FunctionDefinition function)
	{
		this.function = function;
	}


	public ControlFlowDiagram createGraph()
	{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getWarnings()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
