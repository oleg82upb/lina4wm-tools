package de.upb.lina.transformations.logic.precomputation.sizecomputation;


import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import de.upb.lina.transformations.logic.precomputation.sizecomputation.exception.ObjectMemorySizeComputationException;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.FunctionType;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Vector;


/**
 * The {@link ObjectMemorySizeComputer} is used to compute the (partial) size of any type which can
 * be represented in our {@link LLVM} model in terms of memory slots used in the transformation.
 */
public class ObjectMemorySizeComputer {

   private LLVM llvmProgram;

   private boolean countPointersAsOneField = true;
   private boolean firstComputationDone = false;


   public ObjectMemorySizeComputer(LLVM llvmProgram)
   {
      this.llvmProgram = Objects.requireNonNull(llvmProgram);
   }


   public int computePartialObjectMemorySize(EObject object, int upperIndexBound)
   {
      if (!this.firstComputationDone && !countPointersAsOneField)
      {
         setFirstComputationDone();
      }
      if (!this.firstComputationDone)
      {
         initializeForFirstComputation();
      }
      Objects.requireNonNull(object, "object must not be null");
      if (object instanceof Aggregate_Type)
      {
         return computeAggregateTypeMemorySize((Aggregate_Type) object, upperIndexBound);
      }
      else if (object instanceof TypeUse)
      {
         return computeTypeUseMemorySize((TypeUse) object, upperIndexBound);
      }

      throw new ObjectMemorySizeComputationException("The given object type '" + object + "' is unknown. Cannot compute the size of: "
            + object.toString());
   }


   public int computeObjectMemorySize(EObject object)
   {
      return computePartialObjectMemorySize(object, Integer.MAX_VALUE);
   }


   private int computeTypeUseMemorySize(TypeUse typeUse, int upperIndexBound)
   {
      if (upperIndexBound == 0)
      {
         return 0;
      }
      if (countPointersAsOneField && TypeUtils.isPointerSet(typeUse.getPointer()))
      {
         return 1;
      }
      if (typeUse instanceof AddressUse)
      {
         return computeAddressUseSize((AddressUse) typeUse, upperIndexBound);
      }
      else if (typeUse instanceof Predefined)
      {
         return 1;
      }
      else if (typeUse instanceof FunctionType)
      {
         return 1;
      }

      throw new ObjectMemorySizeComputationException("The given object type '" + typeUse + "' is unknown. Cannot compute the size of it.");
   }


   private int computeAddressUseSize(AddressUse addressUse, int upperIndexBound)
   {
      if (upperIndexBound == 0)
      {
         return 0;
      }
      if (countPointersAsOneField && TypeUtils.isPointerSet(addressUse.getPointer()))
      {
         return 1;
      }
      Address address = addressUse.getAddress();
      if (address != null)
      {
         TypeDefinition typeDefinitionOfAddress = TypeUtils.getTypeDefinitionOfAddress(address, llvmProgram);
         return computePartialObjectMemorySize(typeDefinitionOfAddress.getStruct(), upperIndexBound);
      }
      throw new ObjectMemorySizeComputationException(
            "The given AddressUse instance does have a null address. Cannot compute the size of it.");
   }


   private int computeAggregateTypeMemorySize(Aggregate_Type aggregateType, int upperIndexBound)
   {
      if (aggregateType instanceof Array)
      {
         return computeArrayMemorySize((Array) aggregateType, upperIndexBound);
      }
      else if (aggregateType instanceof Structure)
      {
         return computeStructureMemorySize((Structure) aggregateType, upperIndexBound);
      }
      else if (aggregateType instanceof Vector)
      {
         return computeVectorMemorySize((Vector) aggregateType, upperIndexBound);
      }
      throw new ObjectMemorySizeComputationException("The given aggregate type '" + aggregateType
            + "' is unknown. Cannot compute the size of it.");
   }


   private int computeStructureMemorySize(Structure structure, int upperIndexBound)
   {
      if (upperIndexBound == 0)
      {
         return 0;
      }
      if (countPointersAsOneField && TypeUtils.isPointerSet(structure.getPointer()))
      {
         return 1;
      }
      int sizeOfStructure = 0;
      for (int i = 0; i < structure.getTypes().size() && i < upperIndexBound; i++)
      {
         EObject structureElement = structure.getTypes().get(i);
         sizeOfStructure += computeObjectMemorySize(structureElement);
      }
      return sizeOfStructure;
   }


   private int computeArrayMemorySize(Array array, int upperIndexBound)
   {
      return computeArrayVectorWrapperMemorySize(new ArrayVectorWrapper(array), upperIndexBound);
   }


   private int computeVectorMemorySize(Vector vector, int upperIndexBound)
   {
      return computeArrayVectorWrapperMemorySize(new ArrayVectorWrapper(vector), upperIndexBound);
   }


   private int computeArrayVectorWrapperMemorySize(ArrayVectorWrapper arrayVectorWrapper, int upperIndexBound)
   {
      if (upperIndexBound == 0)
      {
         return 0;
      }
      if (countPointersAsOneField && TypeUtils.isPointerSet(arrayVectorWrapper.getPointer()))
      {
         return 1;
      }

      return Math.min(arrayVectorWrapper.getLength(), upperIndexBound) * computeObjectMemorySize(arrayVectorWrapper.getType());
   }


   private void initializeForFirstComputation()
   {
      this.countPointersAsOneField = false;
   }


   private void setFirstComputationDone()
   {
      if (!this.firstComputationDone)
      {
         this.firstComputationDone = true;
         this.countPointersAsOneField = true;
      }
   }

}
