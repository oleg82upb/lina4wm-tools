package de.upb.lina.transformations.logic;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
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
import de.upb.lina.transformations.Constants;

public class TransformationOperation extends WorkspaceModifyOperation{
	protected String graphModelFileLocation;
	protected String targetContainer;
	protected String targetName;
	protected String fileEnding;
	protected java.nio.file.Path fullPath;
	
	protected GeneratorData genData;
	protected Configuration config;
	
	
	public TransformationOperation(String targetContainer, String targetName, String fileEnding, Configuration config) {
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
		
		IResource resource = workSpaceRoot.findMember(targetFolderCont.makeRelativeTo(workSpaceRoot.getLocation()));
		// build correct full path
		fullPath = Paths.get(resource.getLocation().toPortableString());

		try
		{
			AcceleoPreferences.switchQueryCache(false);
			AcceleoPreferences.switchDebugMessages(true);
			AcceleoPreferences.switchProfiler(true);
			AcceleoPreferences.switchSuccessNotifications(false);
			int type = this.config.getTransformationType();
			ArrayList<Object> args = new ArrayList<Object>();

			if (type == Constants.TRANSFORMATION_TYPE_PROMELA
					|| type == Constants.TRANSFORMATION_TYPE_OPERATIONAL_PROMELA)
			{
				args.add(targetName + fileEnding);
			}

			ModelGenerator generator = new ModelGenerator(type, genData, fullPath.toFile(), args);
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e)
		{
			Activator.logError(e.getMessage(), e);
		}

		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);

	}


	public String getTargetContainer() {
		return targetContainer;
	}
	
	
}
