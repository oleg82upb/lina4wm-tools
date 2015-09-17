package de.upb.lina.cfg.tools.strategies;

import de.upb.llvm_parser.llvm.FunctionDefinition;

public class SCGraphGenerator extends AbstractGraphGenerator{
	
	public SCGraphGenerator(FunctionDefinition function)
	{
		super(function);
	}
	
	@Override
	public String getWarnings()
	{
		return null;
	}

}
