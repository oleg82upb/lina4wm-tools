package de.upb.lina.transformations.logic.precomputation.offsetcomputation.test;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import de.upb.lina.cfg.tools.StringUtils;
import de.upb.lina.transformations.logic.precomputation.offsetcomputation.GetElementPointerValidator;
import de.upb.lina.transformations.logic.precomputation.offsetcomputation.GetElementPointerWrapper;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.TypeUtils;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LLVM;


public class GetElementPointerValidatorTest {

   @Test
   public void testIfNonIntegerIndicesAreTreatedCorrectly()
   {
      LLVM program = TestUtils.getLLVMOfTestFile("/tutorial", "getElementPointerTest.s");

      List<GetElementPtr> getElementPointerInstructions = TypeUtils.extractGetElementPointerInstructionsFromLLVMProgram(program);
      testIfNonIntegerIndicesAreRecognized(getElementPointerInstructions.get(1));
      testIfNoWarningIsCreatedIfAllIndicesAreIntegers(getElementPointerInstructions.get(2));
      testBehaviorWhenFirstIndexIsZeroForAddressUseAggregate(getElementPointerInstructions.get(8));
      testBehaviorWhenFirstIndexIsNotZeroForAddressUseAggregate(getElementPointerInstructions.get(7));
      testBehaviorWhenBothValidationCasesFail(getElementPointerInstructions.get(6));
   }


   private void testBehaviorWhenBothValidationCasesFail(GetElementPtr getElementPointer)
   {
      assertThatValidatorProducesCorrectWarning(
            getElementPointer,
            "Check memory allocation. Since the getElementPtr's first index is not 0, we cannot guarantee a correct transformation in this case. ;; Check memory allocation: Not all constant indices are i32 integers.");
   }

   private void testBehaviorWhenFirstIndexIsZeroForAddressUseAggregate(GetElementPtr getElementPointer)
   {
      assertThatValidatorProducesCorrectWarning(getElementPointer,
 StringUtils.EMPTY_STRING);
   }


   private void testBehaviorWhenFirstIndexIsNotZeroForAddressUseAggregate(GetElementPtr getElementPointer)
   {
      assertThatValidatorProducesCorrectWarning(getElementPointer,
            "Check memory allocation. Since the getElementPtr's first index is not 0, we cannot guarantee a correct transformation in this case.");
   }

   private void testIfNonIntegerIndicesAreRecognized(GetElementPtr getElementPointer)
   {
      assertThatValidatorProducesCorrectWarning(getElementPointer, "Check memory allocation: Not all constant indices are i32 integers.");
   }


   private void testIfNoWarningIsCreatedIfAllIndicesAreIntegers(GetElementPtr getElementPointer)
   {
      assertThatValidatorProducesCorrectWarning(getElementPointer, StringUtils.EMPTY_STRING);
   }


   private void assertThatValidatorProducesCorrectWarning(GetElementPtr getElementPointer, String warning)
   {
      GetElementPointerValidator validator = new GetElementPointerValidator(new GetElementPointerWrapper(getElementPointer));
      validator.validate();
      assertEquals(warning, validator.getWarnings());
   }


}
