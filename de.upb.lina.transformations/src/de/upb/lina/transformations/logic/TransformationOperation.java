package de.upb.lina.transformations.logic;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.Activator;


/**
 * This workspace modify operation starts an Acceleo MTL transformation from a given store buffer
 * graph model to a specified target transformation type such as KIV or Promela.
 * 
 * @author Alexander Hetzer
 *
 */
public class TransformationOperation extends WorkspaceModifyOperation {
   protected String inputFileLocation;
   protected String outputFolderLocation;
   protected String outputFileName;
   protected String outputFileExtension;
   protected IPath completeOutputPath;

   protected GeneratorData generatorData;
   protected TransformationConfiguration configuration;


   public TransformationOperation(String outputFolderLocation, String outputFileName, String outputFileExtension,
         TransformationConfiguration configuration) {
      this.outputFolderLocation = outputFolderLocation;
      this.outputFileName = outputFileName;
      this.outputFileExtension = outputFileExtension;
      this.configuration = configuration;
   }


   @Override
   protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {

      // Run Precomputation
      GendataPrecomputer precomp = new GendataPrecomputer(configuration);
      generatorData = precomp.computeGeneratorData();

      // get workspace root
      IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();

      // get target path within project
      IPath targetFolderCont = new Path(outputFolderLocation);
      IResource resource = null;
      if (targetFolderCont.isAbsolute()) {
         resource = workSpaceRoot.findMember(targetFolderCont);
      } else {
         resource = workSpaceRoot.findMember(targetFolderCont.makeAbsolute());
      }

      // build correct full path
      completeOutputPath = resource.getLocation();

      try {
         AcceleoPreferences.switchQueryCache(false);
         AcceleoPreferences.switchDebugMessages(true);
         AcceleoPreferences.switchProfiler(true);
         AcceleoPreferences.switchSuccessNotifications(false);
         ETransformationType transformationType = this.configuration.getTransformationType();
         if (transformationType == null) {
            Activator.logError("Unknown transformation type " + this.configuration.getTransformationType(), new RuntimeException(
                  "Unknown transformation type " + this.configuration.getTransformationType()));
         }
         ArrayList<Object> args = new ArrayList<Object>();


         if (transformationType == ETransformationType.PROMELA || transformationType == ETransformationType.PROMELA_OPERATIONAL) {
            args.add(outputFileName + outputFileExtension);
         }

         transformationType.createAcceleoGenerator(generatorData, completeOutputPath.toFile(), args);
         AbstractAcceleoGenerator generator = transformationType.createAcceleoGenerator(generatorData, completeOutputPath.toFile(), args);
         generator.doGenerate(new BasicMonitor());
      } catch (IOException e) {
         Activator.logError(e.getMessage(), e);
      }

      ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);

   }
}
