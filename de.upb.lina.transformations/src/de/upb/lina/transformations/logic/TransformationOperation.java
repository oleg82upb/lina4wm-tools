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

public class TransformationOperation extends WorkspaceModifyOperation{
	protected String graphModelFileLocation;
	protected String targetContainer;
	protected String targetName;
	protected String fileEnding;
	protected IPath fullPath;
	
	protected GeneratorData genData;
	protected TransformationConfiguration config;
	
	
	public TransformationOperation(String targetContainer, String targetName, String fileEnding, TransformationConfiguration config) {
		this.targetContainer = targetContainer; 
		this.targetName = targetName;
		this.fileEnding = fileEnding;
		this.config = config;
	}
	
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
			InterruptedException
	{

		// Run Precomputation
		GendataPrecomputer precomp = new GendataPrecomputer(config);
		genData = precomp.computeGeneratorData();

		// get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		// get target path within project
		IPath targetFolderCont = new Path(targetContainer);
		
		IResource resource = null;
		if(targetFolderCont.isAbsolute())
		{
			resource = workSpaceRoot.getFolder(targetFolderCont);
		}
		else
		{
			resource = workSpaceRoot.getFolder(targetFolderCont.makeAbsolute());
		}
		 
		// build correct full path
		fullPath = resource.getLocation();

		try
		{
			AcceleoPreferences.switchQueryCache(false);
			AcceleoPreferences.switchDebugMessages(true);
			AcceleoPreferences.switchProfiler(true);
			AcceleoPreferences.switchSuccessNotifications(false);
			ETransformationType transformationType = ETransformationType.getTransformationTypeById(this.config.getTransformationType());
			if(transformationType == null){
				Activator.logError("Unknown transformation type " + this.config.getTransformationType(), new RuntimeException("Unknown transformation type " + this.config.getTransformationType()));
			}
			ArrayList<Object> args = new ArrayList<Object>();

			
			if (transformationType == ETransformationType.PROMELA
					|| transformationType == ETransformationType.PROMELA_OPERATIONAL)
			{
				args.add(targetName + fileEnding);
			}

			transformationType.createAcceleoGenerator(genData, fullPath.toFile(), args);
			AbstractAcceleoGenerator generator = transformationType.createAcceleoGenerator(genData, fullPath.toFile(), args);
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e)
		{
			Activator.logError(e.getMessage(), e);
		}

		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);

	}	
}
