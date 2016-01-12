package de.upb.lina.transformations.logic;

import java.util.List;
import java.util.Map;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.Constants;

public class Configuration {
	
	private List<ControlFlowDiagram> cfgs;	
	private String kIVBasis;
	private Map<String, String> oldToNewCfgName;
	private int transformationType = Constants.TRANSFORMATION_TYPE_KIV_LOCAL;
	
	
	public Configuration(List<ControlFlowDiagram> cfgs, String kIVBasis, Map<String, String> oldToNewCfgName){
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
	public String getKIVBasis()
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

	/**
	 * @return the transformationType
	 */
	public int getTransformationType()
	{
		return transformationType;
	}

	/**
	 * @param transformationType the transformationType to set
	 */
	public void setTransformationType(int kivSpecType)
	{
		this.transformationType = kivSpecType;
	}
}
