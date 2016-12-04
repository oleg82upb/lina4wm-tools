package de.upb.lina.transformations.logic.precomputation.offsetcomputation;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.OffsetElement;
import de.upb.llvm_parser.llvm.Value;


public class OffsetElementJoiner {

   private List<OffsetElement> offsetElements;


   public OffsetElementJoiner()
   {
      this.offsetElements = new ArrayList<>();
   }


   public void addOffsetElement(OffsetElement offsetElement)
   {
      Objects.requireNonNull(offsetElement, "offsetElement must not be null");
      offsetElements.add(offsetElement);
   }


   public void addConstantOffsetWithValue(int offsetValue)
   {
      OffsetElement offsetElement = createConstantOffsetElement(offsetValue);
      offsetElements.add(offsetElement);
   }


   public void addDynamicOffsetWithValue(Value variableValue, int offsetFactor)
   {
      OffsetElement offsetElement = createDynamicOffsetElement(variableValue, offsetFactor);
      offsetElements.add(offsetElement);
   }


   private OffsetElement createConstantOffsetElement(int offsetValue)
   {
      OffsetElement offsetElement = GendataFactory.eINSTANCE.createOffsetElement();
      offsetElement.setConstant(true);
      offsetElement.setIntValue(offsetValue);
      return offsetElement;
   }


   private OffsetElement createDynamicOffsetElement(Value variableValue, int offsetFactor)
   {
      Objects.requireNonNull(variableValue, "variableValue must not be null");
      OffsetElement offsetElement = GendataFactory.eINSTANCE.createOffsetElement();
      offsetElement.setConstant(false);
      offsetElement.setVariableValue(variableValue);
      offsetElement.setFactor(offsetFactor);
      return offsetElement;
   }

   public List<OffsetElement> toOffsetElements()
   {
      return new ArrayList<>(offsetElements);
   }


   public OffsetElementList toOffsetElementList()
   {
      return new OffsetElementList(offsetElements);
   }
}
