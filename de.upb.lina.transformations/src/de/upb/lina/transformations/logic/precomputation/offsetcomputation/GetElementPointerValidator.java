package de.upb.lina.transformations.logic.precomputation.offsetcomputation;


import java.util.Objects;
import java.util.StringJoiner;

import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Value;


/**
 * Ther {@link GetElementPointerValidator} should be used on {@link GetElementPtr} and
 * {@link NestedGetElementPtr} via {@link GetElementPointerWrapper} objects in order to ensure that
 * they can be handled by our transformation. This validator checks several conditions and generates
 * warnings in case some problem might occur. In order to obtain those warnings, use the
 * {@link #validate()} and after that the {@link #getWarnings()} method.
 *
 */
public class GetElementPointerValidator {

   public static final String WARNING_SEPARATOR = " ;; ";

   private StringJoiner warningStringJoiner;

   private GetElementPointerWrapper getElementPointerWrapper;


   public GetElementPointerValidator(GetElementPointerWrapper getElementPointerWrapper)
   {
      reset(getElementPointerWrapper);
   }


   public void reset(GetElementPointerWrapper getElementPointerWrapper)
   {
      this.getElementPointerWrapper = Objects.requireNonNull(getElementPointerWrapper, "getElementPointerWrapper must not be null");
      this.warningStringJoiner = new StringJoiner(WARNING_SEPARATOR);
   }


   public void validate()
   {
      reset(getElementPointerWrapper);
      validateThatFirstIndexIsZeroForAddressUseAggregate();
      validateThatAllConstantIndicesAreIntegers();
   }


   private void validateThatFirstIndexIsZeroForAddressUseAggregate()
   {
      if (getElementPointerWrapper.getAggregate().getType() instanceof AddressUse)
      {
         Value firstIndexValue = getElementPointerWrapper.getIndices().get(0).getValue();
         if (!(firstIndexValue instanceof IntegerConstant))
         {
            addWarning("Check memory allocation. Since the getElementPtr's first index is not a constant, we cannot guarantee a correct transformation in this case.");
         }else{
            int firstIndex = ((IntegerConstant) firstIndexValue).getValue();
            if (firstIndex != 0)
            {
               addWarning("Check memory allocation. Since the getElementPtr's first index is not 0, we cannot guarantee a correct transformation in this case.");
            }
         }
      }
   }


   private void validateThatAllConstantIndicesAreIntegers()
   {
      if (!areAllConstantIndicesIntegers())
      {
         addWarning("Check memory allocation: Not all constant indices are i32 integers.");
      }
   }


   private boolean areAllConstantIndicesIntegers()
   {
      return getElementPointerWrapper.getIndices().stream().filter(parameter -> parameter.getValue() instanceof IntegerConstant)
            .allMatch(parameter -> ((Predefined) parameter.getType()).getType().contains("i32"));
   }


   private void addWarning(String warning)
   {
      warningStringJoiner.add(warning);
   }


   public String getWarnings()
   {
      return warningStringJoiner.toString();
   }

}
