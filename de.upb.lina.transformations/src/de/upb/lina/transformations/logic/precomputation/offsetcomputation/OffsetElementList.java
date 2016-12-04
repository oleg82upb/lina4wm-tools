package de.upb.lina.transformations.logic.precomputation.offsetcomputation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.OffsetElement;


public class OffsetElementList {

   private List<OffsetElement> offsetElements;


   private OffsetElementList()
   {
      this.offsetElements = new ArrayList<>();
   }


   public OffsetElementList(OffsetElement offsetElement)
   {
      Objects.requireNonNull(offsetElement, "offsetElement must not be null");
      this.offsetElements = new ArrayList<>();
      offsetElements.add(offsetElement);
   }

   public OffsetElementList(List<OffsetElement> offsetElements)
   {
      Objects.requireNonNull(offsetElements, "offsetElements must not be null");
      this.offsetElements = new ArrayList<>(offsetElements);
   }


   public List<OffsetElement> getOffsetElements()
   {
      return Collections.unmodifiableList(offsetElements);
   }


   public static OffsetElementList emptyOffsetElementList()
   {
      return new OffsetElementList();
   }


   public static OffsetElementList createErrorOffsetElementList()
   {
      OffsetElement offsetElement = GendataFactory.eINSTANCE.createOffsetElement();
      offsetElement.setConstant(true);
      offsetElement.setIntValue(-666);
      return new OffsetElementList(offsetElement);
   }


}
