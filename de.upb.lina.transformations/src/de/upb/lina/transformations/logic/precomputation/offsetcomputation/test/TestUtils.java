package de.upb.lina.transformations.logic.precomputation.offsetcomputation.test;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.llvm_parser.llvm.LLVM;

public class TestUtils {

   public static LLVM getLLVMOfTestFile(String project, String testLocation)
   {
      IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
      IProject examplesProject = workSpaceRoot.getProject("/" + project);
      IResource resource = examplesProject.findMember(testLocation);
      return ResourceIOUtil.createAstFromLLVM(resource.getFullPath().toPortableString());
   }


}
