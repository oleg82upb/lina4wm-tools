package de.upb.lina.transformations.logic.precomputation.offsetcomputation.test;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.upb.lina.transformations.logic.precomputation.offsetcomputation.GetElementPointerOffsetComputer;
import de.upb.lina.transformations.logic.precomputation.sizecomputation.TypeUtils;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LLVM;


public class GetElementPointerOffsetComputerTest {

   @Test
   public void testGetElementPointerOffsetComputation()
   {
      LLVM program = TestUtils.getLLVMOfTestFile("/examples", "SimpleTests/offset_computation/getElementPointerTest.s");

      List<String> expectedOffsets = Arrays.asList("2 + 1 + b*20 + 13", "116", "1", "0", "0", "1");
      testGetElementPointerOffsetsInLLVMProgram(program, expectedOffsets);


   }


   private void testGetElementPointerOffsetsInLLVMProgram(LLVM program, List<String> expectedOffsets)
   {
      GetElementPointerOffsetComputer getElementPointerOffsetComputer = new GetElementPointerOffsetComputer(program);
      
      List<GetElementPtr> getElementPointerInstructions = TypeUtils.extractGetElementPointerInstructionsFromLLVMProgram(program);
      for (int i = 0; i < expectedOffsets.size(); i++)
      {
         System.out.println(i);
         assertEquals(expectedOffsets.get(i),
               getElementPointerOffsetComputer.computeGetElementPointerOffset(getElementPointerInstructions.get(i)));
      }

   }



}
