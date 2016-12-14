package de.upb.lina.transformations.logic.precomputation.offsetcomputation;


import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import de.upb.lina.transformations.logic.precomputation.offsetcomputation.exception.GetElementPointerOffsetComputationException;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.ObjectMemorySizeComputer;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.TypeUtils;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.exception.ObjectMemorySizeComputationException;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.exception.TypeExplorationException;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.FunctionType;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.Vector;


/**
 * The {@link GetElementPointerOffsetComputer} is used to compute the required offsets of given
 * {@link GetElementPtr} instructions for the transformation.
 *
 */
public class GetElementPointerOffsetComputer {


   private LLVM llvmProgram;


   public GetElementPointerOffsetComputer(LLVM llvmProgram)
   {
      Objects.requireNonNull(llvmProgram, "llvmProgram must not be null");
      this.llvmProgram = llvmProgram;
   }


   public OffsetElementList computeNestedGetElementPointerOffset(NestedGetElementPtr nestedGetElementPointer)
   {
      return computeGetElementPointerOffset(new GetElementPointerWrapper(nestedGetElementPointer));
   }


   public OffsetElementList computeGetElementPointerOffset(GetElementPtr getElementPointer)
   {
      return computeGetElementPointerOffset(new GetElementPointerWrapper(getElementPointer));
   }


   public OffsetElementList computeGetElementPointerOffset(GetElementPointerWrapper getElementPointer)
   {
      try
      {
         Objects.requireNonNull(getElementPointer, "getElementPointer must not be null");
         List<Parameter> indices = getElementPointer.getIndices();
         int firstIndexToConsider = getFirstIndexToConsider(getElementPointer.getAggregate().getType());
         if (TypeUtils.areAllParametersConstants(indices))
         {
            return computeGetElementPointerOffsetForConstantIndices(getElementPointer,
                  firstIndexToConsider);
         }
         else
         {
            return computeGetElementPointerOffsetForNonConstantIndices(getElementPointer, firstIndexToConsider);
         }
      } catch (ObjectMemorySizeComputationException | TypeExplorationException exception)
      {
         throw new GetElementPointerOffsetComputationException(exception.getMessage(), exception);
      }
   }


   private OffsetElementList computeGetElementPointerOffsetForConstantIndices(GetElementPointerWrapper getElementPointer,
         int firstIndexToConsider)
   {
      EObject aggregateType = getElementPointer.getAggregate().getType();
      List<Parameter> indices = getElementPointer.getIndices();

      int partialAggregateSize = 0;
      ObjectMemorySizeComputer objectMemorySizeComputer = new ObjectMemorySizeComputer(llvmProgram);
      for (int i = firstIndexToConsider; i < indices.size(); i++)
      {
         int upperIndexBound = TypeUtils.getIntValueFromParameter(indices.get(i));
         partialAggregateSize += objectMemorySizeComputer.computePartialObjectMemorySize(aggregateType, upperIndexBound);
         aggregateType = getTypeOfSubAggregate(aggregateType, upperIndexBound);
      }
      OffsetElementJoiner offsetElementJoiner = new OffsetElementJoiner();
      offsetElementJoiner.addConstantOffsetWithValue(partialAggregateSize);
      return offsetElementJoiner.toOffsetElementList();
   }


   private OffsetElementList computeGetElementPointerOffsetForNonConstantIndices(GetElementPointerWrapper getElementPointer,
         int firstIndexToConsider)
   {
      List<Parameter> indices = getElementPointer.getIndices();
      OffsetElementJoiner partialAggregateSizeJoiner = new OffsetElementJoiner();
      EObject aggregate = getElementPointer.getAggregate().getType();

      ObjectMemorySizeComputer objectMemorySizeComputer = new ObjectMemorySizeComputer(llvmProgram);
      for (int i = firstIndexToConsider; i < indices.size(); i++)
      {
         Value indexValue = indices.get(i).getValue();
         if (indexValue instanceof IntegerConstant)
         {
            int upperIndexBound = ((IntegerConstant) indexValue).getValue();
            partialAggregateSizeJoiner.addConstantOffsetWithValue(objectMemorySizeComputer.computePartialObjectMemorySize(aggregate,
                  upperIndexBound));
            aggregate = getTypeOfSubAggregate(aggregate, upperIndexBound);
         }
         else
         {
            assertAggregateIsNotOfTypeStructure(aggregate);

            EObject subAggregate = getTypeOfSubAggregate(aggregate, 0);
            int subAggregateSize = objectMemorySizeComputer.computeObjectMemorySize(subAggregate);
            partialAggregateSizeJoiner.addDynamicOffsetWithValue(indexValue, subAggregateSize);

            // as we asserted that aggregate is not a structure, it can only be a vector or array.
            // this means that it does not matter which part of the array or vector we take a look at
            // next, as they are all equivalent.
            aggregate = getTypeOfSubAggregate(aggregate, 0);
         }
      }
      return partialAggregateSizeJoiner.toOffsetElementList();
   }


   /**
    * If the type of the aggregate of a {@link GetElementPtr} instruction is {@link Predefined},
    * this function returns {@code 0}, as we have to consider the 0th index. Otherwise it returns
    * {@code 1}, as we can ignore the {@code 0}th index.
    * 
    * @param typeOfAggregate the type of the aggregate of the according {@link GetElementPtr}
    * @return {@code 0}, if the type of the aggregate is {@link Predefined}, otherwise {@code 1}
    */
   private int getFirstIndexToConsider(EObject typeOfAggregate)
   {
      if (typeOfAggregate instanceof Predefined)
      {
         return 0;
      }
      return 1;
   }


   private void assertAggregateIsNotOfTypeStructure(EObject aggregate)
   {
      if (aggregate instanceof Structure)
      {
         throw new RuntimeException("Cannot compute a getElementPtr offset for a non constant index in combination with a structure.");
      }
      if (aggregate instanceof AddressUse)
      {
         AddressUse addressUse = (AddressUse) aggregate;
         TypeDefinition typeDefinition = TypeUtils.getTypeDefinitionOfAddress(addressUse.getAddress(), llvmProgram);
         if (typeDefinition != null)
         {
            throw new GetElementPointerOffsetComputationException(
                  "Cannot compute a getElementPtr offset for a non constant index in combination with a structure.");
         }
      }
   }


   private EObject getTypeOfSubAggregate(EObject object, int index)
   {
      if (object instanceof Aggregate_Type)
      {
         if (object instanceof Structure)
         {
            Structure structure = (Structure) object;
            return structure.getTypes().get(index);
         }
         else if (object instanceof Array)
         {
            Array arr = ((Array) object);
            return arr.getType();
         }
         else if (object instanceof Vector)
         {
            Vector vector = (Vector) object;
            return vector.getType();
         }
      }
      else if (object instanceof TypeUse)
      {
         if (object instanceof AddressUse)
         {
            AddressUse addressUse = (AddressUse) object;
            TypeDefinition typeDefinition = TypeUtils.getTypeDefinitionOfAddress(addressUse.getAddress(), llvmProgram);
            if (typeDefinition != null)
            {
               return typeDefinition.getStruct().getTypes().get(index);
            }
         }
         else if (object instanceof FunctionType)
         {
            return ((FunctionType) object).getReturnType();
         }
         else if (object instanceof Predefined)
         {
            return object;
         }
      }
      throw new GetElementPointerOffsetComputationException("Could not determine type of sub aggregate '" + object + "' for index '"
            + index + "'.");
   }
}
