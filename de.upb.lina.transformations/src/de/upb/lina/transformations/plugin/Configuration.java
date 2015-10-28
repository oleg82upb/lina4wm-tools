package de.upb.lina.transformations.plugin;

import java.util.List;
import java.util.Map;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

public class Configuration {
	
	private List<ControlFlowDiagram> cfgs;	
	private int kIVBasis;
	private Map<String, String> oldToNewCfgName;
	
	
	
	public Configuration(List<ControlFlowDiagram> cfgs, int kIVBasis, Map<String, String> oldToNewCfgName){
		this.cfgs = cfgs;
		this.kIVBasis = kIVBasis;
		this.oldToNewCfgName = oldToNewCfgName;
	}

	/**
	 * @return the cfgs
	 */
	public List<ControlFlowDiagram> getCfgs()
	{
		return cfgs;
	}
	/**
	 * @return the kIVBasis
	 */
	public int getKIVBasis()
	{
		return kIVBasis;
	}

	/**
	 * @return the oldToNewCfgName
	 */
	public Map<String, String> getOldToNewCfgName()
	{
		return oldToNewCfgName;
	}
}
