package de.upb.lina.transformations.logic.precomputation.sizecomputation;

import java.util.List;

import de.upb.lina.cfg.tools.StringUtils;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.exception.TypeExplorationException;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.TypeDefinition;

public class TypeUtils {

   /**
    * Searches and returns the {@link TypeDefinition} linked to the given {@link Address} in the
    * given {@link LLVM}. If none is found, a {@link IllegalArgumentException} is thrown.
    * 
    * @param address the {@link Address} for which the {@link TypeDefinition} should be found
    * @param llvmProgram the {@link LLVM} to search for the {@link TypeDefinition} in
    * @return the {@link TypeDefinition} linked to the given {@link Address}
    */
   public static TypeDefinition getTypeDefinitionOfAddress(Address address, LLVM llvmProgram)
   {
      return (TypeDefinition) llvmProgram
            .getElements()
            .stream()
            .filter(element -> (element instanceof TypeDefinition))
            .filter(element -> ((TypeDefinition) element).getAddress().getName().equalsIgnoreCase(address.getName()))
            .findAny()
            .orElseThrow(
                  () -> new TypeExplorationException(
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
   public static boolean isPointerSet(String pointerRepresentation)
   {
      return !StringUtils.isEmpty(pointerRepresentation) && pointerRepresentation.contains("*");
   }

   public static int getIntValueFromParameter(Parameter parameter)
   {
      if (parameter.getValue() instanceof IntegerConstant)
      {
         return ((IntegerConstant) parameter.getValue()).getValue();
      }
      throw new TypeExplorationException(
            "Cannot return the int value of a paramter, which has a value of another type than IntegerConstant.");
   }

   public static boolean areAllParametersConstants(List<Parameter> parameters)
   {
      return !parameters.stream().anyMatch(parameter -> !(parameter.getValue() instanceof IntegerConstant));
   }

}
