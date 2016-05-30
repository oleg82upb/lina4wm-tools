package de.upb.lina.transformations.logic;


import java.util.List;
import java.util.Map;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;


/**
 * Stores the configuration for a transformation. It is required by the
 * 
 * @see de.upb.lina.transformations.logic.TransformationOperation class in order to make a
 *      transformation. It is currently used for both promela and kiv transformations.
 *
 */
public class TransformationConfiguration {

   private List<ControlFlowDiagram> storeBufferGraphs;
   private Map<String, String> oldToNewStoerBufferGraphNameMap;

   private String kivBasis;
   private ETransformationType transformationType;


   /**
    * Constructor intended for promela transformations only, as the kiv basis is not set properly by
    * this constructor.
    * 
    * @param storeBufferGraphs cfgs to transform
    * @param oldToNewStoerBufferGraphNameMap
    * @param transformationType
    */
   public TransformationConfiguration(List<ControlFlowDiagram> storeBufferGraphs, Map<String, String> oldToNewStoerBufferGraphNameMap,
         ETransformationType transformationType) {
      this.storeBufferGraphs = storeBufferGraphs;
      this.oldToNewStoerBufferGraphNameMap = oldToNewStoerBufferGraphNameMap;
      this.transformationType = transformationType;
      this.kivBasis = "";
   }


   /**
    * Constructor intended for KIV transformations.
    * 
    * @param storeBufferGraphs
    * @param kivBasis
    * @param oldToNewStoerBufferGraphNameMap
    * @param transformationType
    */
   public TransformationConfiguration(List<ControlFlowDiagram> storeBufferGraphs, String kivBasis,
         Map<String, String> oldToNewStoerBufferGraphNameMap, ETransformationType transformationType) {
      this(storeBufferGraphs, oldToNewStoerBufferGraphNameMap, transformationType);
      this.kivBasis = kivBasis;
   }


   public List<ControlFlowDiagram> getCfgs() {
      return storeBufferGraphs;
   }


   public String getKIVBasis() {
      return kivBasis;
   }


   public Map<String, String> getOldToNewCfgName() {
      return oldToNewStoerBufferGraphNameMap;
   }


   public ETransformationType getTransformationType() {
      return transformationType;
   }

}
