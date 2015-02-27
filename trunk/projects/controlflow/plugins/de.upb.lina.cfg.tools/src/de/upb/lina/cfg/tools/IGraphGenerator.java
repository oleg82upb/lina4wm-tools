package de.upb.lina.cfg.tools;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

/**
 * @author Oleg Travkin
 *
 */
public interface IGraphGenerator
{

	/**
	 * Note, this method is meant to be called no more than once.
	 * @return creates store buffer graph for the FunctionDefinition that was used to create the instance of the IGraphGenerator.
	 */
	public ControlFlowDiagram createGraph(); 
	
	/**
	 * @return Warnings (text message) that occurred during store buffer graph generation.
	 */
	public String getWarnings();
}
