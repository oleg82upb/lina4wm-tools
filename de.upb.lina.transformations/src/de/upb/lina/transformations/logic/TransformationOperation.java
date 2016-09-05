package de.upb.lina.transformations.logic;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.engine.utils.AcceleoEngineUtils;
import org.eclipse.acceleo.profiler.Profiler;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.tools.CFGConstants;
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

   private ETransformationType transformationType;

   private Profiler profiler;


   public TransformationOperation(String outputFolderLocation, String outputFileName, String outputFileExtension,
         TransformationConfiguration configuration) {
      this.outputFolderLocation = outputFolderLocation;
      this.outputFileName = outputFileName;
      this.outputFileExtension = outputFileExtension;
      this.configuration = configuration;
   }


	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
			InterruptedException
	{
		long startTimeInMillis = System.currentTimeMillis();

      computeGenerationData();
      computeCompleteOutputPath();

      profiler = new Profiler();
		try
		{
			setAcceleoPreferences();
         determineTransformationType();
         startTransformation();
		} catch (IOException e)
		{
			Activator.logError(e.getMessage(), e);
		} finally
		{
         saveAndResetProfiler();
		}

		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		long endTimeInMillis = System.currentTimeMillis();
		Activator.log(IStatus.INFO, "Operation completed in " + (endTimeInMillis - startTimeInMillis) + "ms.", null);

	}


   /**
    * Starts the transformation.
    * 
    * @throws IOException if the output files cannot be generated correctly during the
    *            transformation
    */
   private void startTransformation() throws IOException
   {
      AbstractAcceleoGenerator generator = createAcceleoGenerator();
      generator.doGenerate(new BasicMonitor());
   }


   /**
    * Saves and resets the profiler.
    */
   private void saveAndResetProfiler()
   {
      if (CFGConstants.IN_DEBUG_MODE)
      {
         try
         {
            AcceleoPreferences.switchProfiler(false);
            String profileURI = completeOutputPath.toOSString() + "\\lastprofile.mtlp";
            profiler.save(profileURI);
         } catch (Exception e2)
         {
            // do nothing
         }
      }
   }


   /**
    * Determines the transformation type.
    */
   private void determineTransformationType()
   {
      transformationType = this.configuration.getTransformationType();
      assertTransformationTypeNotNull();
   }


   /**
    * Creates the {@link AbstractAcceleoGenerator} fitting the local transformation type.
    * 
    * @return the Acceleo generator fitting the local transformation type
    * @throws IOException if a problem during the creation of the Acceleo generator occurs
    */
   private AbstractAcceleoGenerator createAcceleoGenerator() throws IOException
   {
      ArrayList<Object> transformationArguments = generateTransformationArguments();

      AbstractAcceleoGenerator generator = transformationType.createAcceleoGenerator(generatorData,
 completeOutputPath.toFile(),
            transformationArguments);
      return generator;
   }


   /**
    * Generates and returns the transformation arguments required by the Acceleo generator.
    * 
    * @return the transformation arguments required by the Acceleo generator
    */
   private ArrayList<Object> generateTransformationArguments()
   {
      ArrayList<Object> transformationArguments = new ArrayList<Object>();

      if (transformationType == ETransformationType.PROMELA
      		|| transformationType == ETransformationType.PROMELA_OPERATIONAL)
      {
         transformationArguments.add(outputFileName + outputFileExtension);
      }
      return transformationArguments;
   }


   /**
    * Computes the complete output path.
    */
   private void computeCompleteOutputPath()
   {
      IResource outputResource = findOutputResource();
      completeOutputPath = outputResource.getLocation();
   }


   /**
    * Computes the generation data required as additional information to the store buffer graph
    * model.
    */
   private void computeGenerationData()
   {
      if (generatorData == null)
      {
         GendataPrecomputer precomp = new GendataPrecomputer(configuration);
         generatorData = precomp.computeGeneratorData();
      }
   }


   /**
    * Asserts that the local transformation type is not {@code null} and throws a
    * {@link RuntimeException} otherwise.
    */
   private void assertTransformationTypeNotNull()
   {
      if (transformationType == null)
      {
         RuntimeException runtimeException = new RuntimeException("Unknown transformation type "
               + this.configuration.getTransformationType());
      	Activator.logError(
      			"Unknown transformation type " + this.configuration.getTransformationType(),
 runtimeException);
         throw runtimeException;
      }
   }


   /**
    * Sets the Acceleo preferences.
    */
   private void setAcceleoPreferences()
   {
      if (CFGConstants.IN_DEBUG_MODE)
      {
      	AcceleoEngineUtils.setProfiler(profiler);
      	AcceleoPreferences.switchQueryCache(false);
      	AcceleoPreferences.switchDebugMessages(true);
      	AcceleoPreferences.switchProfiler(true);
      	AcceleoPreferences.switchSuccessNotifications(false);
      } else
      {
      	AcceleoPreferences.switchDebugMessages(false);
      	AcceleoPreferences.switchProfiler(false);
      	AcceleoPreferences.switchSuccessNotifications(false);
      }
   }


   /**
    * Finds the output resource defined by the local {@link #outputFolderLocation} and the
    * {@link #outputFileName}.
    * 
    * @return the output resource
    */
   private IResource findOutputResource()
   {
      // get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		// get target path within project
		IPath targetFolderCont = new Path(outputFolderLocation);
		IResource outputResource = null;
		if (targetFolderCont.isAbsolute())
		{
			outputResource = workSpaceRoot.findMember(targetFolderCont);
		} else
		{
			outputResource = workSpaceRoot.findMember(targetFolderCont.makeAbsolute());
		}
      return outputResource;
   }
}
