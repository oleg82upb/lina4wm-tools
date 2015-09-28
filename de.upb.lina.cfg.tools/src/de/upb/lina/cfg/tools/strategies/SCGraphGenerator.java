package de.upb.lina.cfg.tools.strategies;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
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

	@Override
	protected ControlFlowLocation getLocationByPcAndBuffer(int pc, StoreBuffer buffer)
	{
		return GraphUtility.getLocationRepresentedBy(this.graph.getLocations(), pc, buffer, CFGConstants.SC);
	}

	@Override
	public int getMemoryModel()
	{
		return CFGConstants.SC;
	}
	


}
