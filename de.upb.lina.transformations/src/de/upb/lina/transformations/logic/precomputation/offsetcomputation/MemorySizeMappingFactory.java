package de.upb.lina.transformations.logic.precomputation.offsetcomputation;


import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.MemorySizeMapping;
import de.upb.lina.cfg.tools.StringUtils;
import de.upb.lina.transformations.logic.precomputation.offsetcomputation.exception.GetElementPointerOffsetComputationException;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.ObjectMemorySizeComputer;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.TypeUse;


/**
 * Given an {@link LLVM} the {@link MemorySizeMappingFactory} can be used to create
 * {@link MemorySizeMapping}s for given {@link GetElementPtr}, {@link NestedGetElementPtr} and
 * {@link Alloc} instructions. It makes use of the {@link GetElementPointerOffsetComputer} and the
 * {@link ObjectMemorySizeComputer} in order to compute the necessary parameters and creates the
 * according {@link MemorySizeMapping}s.
 */
public class MemorySizeMappingFactory {

   private GetElementPointerOffsetComputer getElementPointerOffsetComputer;

   private LLVM llvmProgram;


   public MemorySizeMappingFactory(LLVM llvmProgram)
   {
      this.llvmProgram = llvmProgram;
      this.getElementPointerOffsetComputer = new GetElementPointerOffsetComputer(llvmProgram);
   }


   public MemorySizeMapping createGetElementPointerMemorySizeMapping(GetElementPtr getElementPointer)
   {
      return createGetElementPointerWrapperMemorySizeMapping(new GetElementPointerWrapper(getElementPointer));
   }


   public MemorySizeMapping createNestedGetElementPointerMemorySizeMapping(NestedGetElementPtr nestedGetElementPointer)
   {
      return createGetElementPointerWrapperMemorySizeMapping(new GetElementPointerWrapper(nestedGetElementPointer));
   }


   private MemorySizeMapping createGetElementPointerWrapperMemorySizeMapping(GetElementPointerWrapper getElementPointerWrapper)
   {
      GetElementPointerValidator validator = new GetElementPointerValidator(getElementPointerWrapper);
      validator.validate();
      String warnings = validator.getWarnings();
      try{
         OffsetElementList totalOffset = getElementPointerOffsetComputer.computeGetElementPointerOffset(getElementPointerWrapper);
         ObjectMemorySizeComputer objectMemorySizeComputer = new ObjectMemorySizeComputer(llvmProgram);
         int completeAggregateSize = objectMemorySizeComputer.computeObjectMemorySize(getElementPointerWrapper.getAggregate().getType());
         return createMemorySizeMapping(getElementPointerWrapper.getWrappedObject(), totalOffset, warnings,
               completeAggregateSize);
      } catch (GetElementPointerOffsetComputationException exception)
      {
         return createMemorySizeMapping(getElementPointerWrapper.getWrappedObject(), OffsetElementList.createErrorOffsetElementList(),
               "Could not compute memory size mapping correctly due to a problem: " + exception.getMessage()
                     + GetElementPointerValidator.WARNING_SEPARATOR + warnings, -666);
      }
   }


   public MemorySizeMapping createAllocMemorySizeMapping(Alloc alloc)
   {
      TypeUse allocType = alloc.getType();
      ObjectMemorySizeComputer objectMemorySizeComputer = new ObjectMemorySizeComputer(llvmProgram);
      int allocTypeSize = objectMemorySizeComputer.computeObjectMemorySize(allocType);
      return createMemorySizeMapping(alloc, allocTypeSize);
   }


   private MemorySizeMapping createMemorySizeMapping(EObject objectToBeMapped, int completeTypeSize)
   {
      return createMemorySizeMapping(objectToBeMapped, OffsetElementList.emptyOffsetElementList(), StringUtils.EMPTY_STRING,
            completeTypeSize);
   }


   private MemorySizeMapping createMemorySizeMapping(EObject objectToBeMapped, OffsetElementList offsetElements, String warning, int completeTypeSize)
   {
      MemorySizeMapping memorySizeMapping = GendataFactory.eINSTANCE.createMemorySizeMapping();
      memorySizeMapping.setInstruction(objectToBeMapped);
      memorySizeMapping.getOffset().addAll(offsetElements.getOffsetElements());
      memorySizeMapping.setCompleteTypeSize(completeTypeSize);
      memorySizeMapping.setWarning(warning);
      return memorySizeMapping;
   }
}