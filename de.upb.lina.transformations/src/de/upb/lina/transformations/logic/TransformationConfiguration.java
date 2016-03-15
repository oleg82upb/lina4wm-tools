package de.upb.lina.transformations.logic;

import java.util.List;
import java.util.Map;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

/**
 * Stores the configuration for a transformation. It is required by the 
 * @see de.upb.lina.transformations.logic.TransformationOperation class in order to make a transformation. 
 * It is currently used for both promela and kiv transformations.
 *
 */
public class TransformationConfiguration {
	
	private List<ControlFlowDiagram> cfgs;	
	private Map<String, String> oldToNewCfgNameMap;
	
	private String kIVBasis;
	private int transformationType;
	
	/**
	 * Constructor intended for promela transformations only, as the kiv basis is not set 
	 * properly by this constructor.
	 * @param cfgs cfgs to transform
	 * @param oldToNewCfgNameMap 
	 * @param transformationType
	 */
	public TransformationConfiguration(List<ControlFlowDiagram> cfgs, Map<String, String> oldToNewCfgNameMap, int transformationType){
		this.cfgs = cfgs;
		this.oldToNewCfgNameMap = oldToNewCfgNameMap;
		this.transformationType = transformationType;
		this.kIVBasis = "";
	}
	
	/**
	 * Constructor intended for kiv transformations.
	 * @param cfgs
	 * @param kIVBasis
	 * @param oldToNewCfgNameMap
	 * @param transformationType
	 */
	public TransformationConfiguration(List<ControlFlowDiagram> cfgs, String kIVBasis, Map<String, String> oldToNewCfgNameMap,int transformationType){
		this(cfgs, oldToNewCfgNameMap, transformationType);
		this.kIVBasis = kIVBasis;
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
		return oldToNewCfgNameMap;
	}

	/**
	 * @return the transformationType
	 */
	public int getTransformationType()
	{
		return transformationType;
	}
	
}
