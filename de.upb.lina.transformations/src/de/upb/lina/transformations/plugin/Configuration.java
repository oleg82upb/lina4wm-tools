package de.upb.lina.transformations.plugin;

import java.util.List;
import java.util.Map;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

public class Configuration {
	
	private List<ControlFlowDiagram> cfgs;	
	private String kIVBasis;
	private Map<String, String> oldToNewCfgName;
	private int kivTransformationType = Constants.TRANSFORMATION_TYPE_KIV_LOCAL;
	
	
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
	 * @return the kivTransformationType
	 */
	public int getKivTransformationType()
	{
		return kivTransformationType;
	}

	/**
	 * @param kivTransformationType the kivTransformationType to set
	 */
	public void setKivTransformationType(int kivSpecType)
	{
		this.kivTransformationType = kivSpecType;
	}
}
