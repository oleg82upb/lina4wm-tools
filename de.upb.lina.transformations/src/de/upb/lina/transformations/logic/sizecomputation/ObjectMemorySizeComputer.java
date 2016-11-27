package de.upb.lina.transformations.logic.sizecomputation;


import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Strings;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionType;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.NestedCast;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.ValueStruct;
import de.upb.llvm_parser.llvm.Vector;

public class ObjectMemorySizeComputer {

   private LLVM llvmProgram;


   public ObjectMemorySizeComputer(LLVM llvmProgram)
   {
      this.llvmProgram = Objects.requireNonNull(llvmProgram);
   }


   public int computePartialObjectMemorySize(EObject object, int upperIndexBound)
   {
      Objects.requireNonNull(object);
      if (object instanceof Aggregate_Type)
      {
         return computeAggregateTypeMemorySize((Aggregate_Type) object, upperIndexBound);
      } else if (object instanceof TypeUse)
      {
         return computeTypeUseMemorySize((TypeUse) object);
      } else if (object instanceof Value) // as AddressUse is a subclass of both TypeUse and Value,
                                          // we know at this block that the object cannot be of type
                                          // AddressUse
      {
         return computeValueMemorySize((Value) object);
      }

      throw new IllegalArgumentException("The given object type is unknown. Cannot compute the size of it.");
   }


   public int computeObjectMemorySize(EObject object)
   {
      return computePartialObjectMemorySize(object, Integer.MAX_VALUE);
   }


   private int computeValueMemorySize(Value value)
   {
      if (value instanceof Constant)
      {
         return 1; // TODO is this correct?
      } else if (value instanceof PrimitiveValue)
      {
         return 1; // TODO is this correct?
      } else if (value instanceof ValueStruct)
      {
         return computeValueStructSize((ValueStruct) value);
      } else if (value instanceof NestedCast)
      {
         return computeNestedCastSize((NestedCast) value); // TODO is this correct?
      } else if (value instanceof NestedGetElementPtr)
      {
         return computeNestedGetElementPointerSize((NestedGetElementPtr) value);
      } else if (value instanceof AddressUse)
      {
         return computeAddressUseSize((AddressUse) value);
      }
      throw new IllegalArgumentException("The given object type is unknown. Cannot compute the size of it.");
   }
   

   private int computeNestedGetElementPointerSize(NestedGetElementPtr nestedGetElementPointer)
   {
      return 1; // TODO is this correct? It should be as we will only return a pointer here
                // anyway...
   }


   private int computeNestedCastSize(NestedCast nestedCast)
   {
      return computeObjectMemorySize(nestedCast.getTo());
   }


   private int computeValueStructSize(ValueStruct valueStruct)
   {
      int valueStructSize = 0;
      for (Parameter parameter : valueStruct.getValues())
      {
         valueStructSize += computeObjectMemorySize(parameter.getType());
      }
      return valueStructSize;
   }


   private int computeTypeUseMemorySize(TypeUse typeUse)
   {
      if (isPointerSet(typeUse.getPointer()))
      {
         return 1;
      }
      if (typeUse instanceof AddressUse)
      {
         return computeAddressUseSize((AddressUse) typeUse);
      } else if (typeUse instanceof Predefined)
      {
         return 1; // TODO what here?
      } else if (typeUse instanceof FunctionType)
      {
         return 1; // TODO what here?
      }

      throw new IllegalArgumentException("The given object type is unknown. Cannot compute the size of it.");
   }


   private int computeAddressUseSize(AddressUse addressUse)
   {
      Address address = addressUse.getAddress();
      if (address != null)
      {
         TypeDefinition typeDefinitionOfAddress = getTypeDefinitionOfAddress(address);
         return computeObjectMemorySize(typeDefinitionOfAddress.getStruct());
      }
      throw new IllegalArgumentException("The given AddressUse instance does have a null address. Cannot compute the size of it.");
   }


   private int computeAggregateTypeMemorySize(Aggregate_Type aggregateType, int upperIndexBound)
   {
      if (aggregateType instanceof Array)
      {
         return computeArrayMemorySize((Array) aggregateType, upperIndexBound);
      } else if (aggregateType instanceof Structure)
      {
         return computeStructureMemorySize((Structure) aggregateType, upperIndexBound);
      } else if (aggregateType instanceof Vector)
      {
         throw new IllegalArgumentException("Unsupported object type: Vector. Cannot compute size of it.");
      }
      throw new IllegalArgumentException("The given aggregate type is unknown. Cannot compute the size of it.");
   }


   private int computeStructureMemorySize(Structure structure, int upperIndexBound)
   {
      if (isPointerSet(structure.getPointer()))
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
      if (isPointerSet(array.getPointer()))
      {
         return 1;
      }

      return Math.min(array.getLength(), upperIndexBound) * computeObjectMemorySize(array.getType());
   }


   /**
    * Searches and returns the {@link TypeDefinition} linked to the given {@link Address}. If none
    * is found, a {@link IllegalArgumentException} is thrown.
    * 
    * @param address the {@link Address} for which the {@link TypeDefinition} should be found
    * @return the {@link TypeDefinition} linked to the given {@link Address}
    */
   private TypeDefinition getTypeDefinitionOfAddress(Address address)
   {
      return (TypeDefinition) llvmProgram
            .getElements()
            .stream()
            .filter(element -> (element instanceof TypeDefinition))
            .filter(element -> ((TypeDefinition) element).getAddress().getName().equalsIgnoreCase(address.getName()))
            .findAny()
            .orElseThrow(
                  () -> new IllegalArgumentException(
                        "The given AddressUse instance neither has a pointer nor a type definition. Cannot compute the size of it."));
   }


   /**
    * Checks whether the given pointer representation obtained from objects of the LLVM model is set
    * or not. Returns {@code true} if it is set, otherwise {@code false}.
    * 
    * @param pointerRepresentation the pointer representation from an object of the LLVM model to
    *           check
    * @return {@code true} if it is set, otherwise {@code false}
    */
   private boolean isPointerSet(String pointerRepresentation)
   {
      return Strings.isNullOrEmpty(pointerRepresentation) && pointerRepresentation.contains("*");
   }

}
