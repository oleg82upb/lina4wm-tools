package de.upb.lina.transformations.logic.precomputation.offsetcomputation.test;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LLVM;

public class TestUtils {

   public static LLVM getLLVMOfTestFile(String project, String testLocation)
   {
      IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
      IProject examplesProject = workSpaceRoot.getProject("/" + project);
      IResource resource = examplesProject.findMember(testLocation);
      return ResourceIOUtil.createAstFromLLVM(resource.getFullPath().toPortableString());
   }


   public static List<GetElementPtr> extractGetElementPointerInstructionsFromLLVMProgram(LLVM program)
   {
      List<GetElementPtr> getElementPointerInstructions = new ArrayList<>();
      for (FunctionDefinition functionDefinition : extractFunctionDefinitionsFromLLVMProgram(program))
      {
         List<BasicBlock> functionBlocks = functionDefinition.getBody().getBlocks();
         for (BasicBlock basicBlock : functionBlocks)
         {
            List<GetElementPtr> getElementPointaerInstructionsInBlock = extractGetElementPointerInstructionsFromBasicBlock(basicBlock);
            getElementPointerInstructions.addAll(getElementPointaerInstructionsInBlock);
         }
      }
      return getElementPointerInstructions;
   }


   public static List<FunctionDefinition> extractFunctionDefinitionsFromLLVMProgram(LLVM program)
   {
      return program.getElements().stream().filter(element -> element instanceof FunctionDefinition)
            .map(element -> (FunctionDefinition) element).collect(Collectors.toList());
   }


   public static List<GetElementPtr> extractGetElementPointerInstructionsFromBasicBlock(BasicBlock basicBlock)
   {
      return basicBlock.getInstructions().stream().filter(instruction -> instruction instanceof GetElementPtr)
            .map(instruction -> (GetElementPtr) instruction).collect(Collectors.toList());
   }

}
