package de.upb.lina.transformations.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.plugin.Activator;
import de.upb.lina.transformations.plugin.Configuration;
import de.upb.lina.transformations.plugin.GendataPrecomputer;

public abstract class TransformationOperation extends WorkspaceModifyOperation{
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
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		
		//Run Precomputation
		GendataPrecomputer precomp = new GendataPrecomputer(config);
		genData = precomp.computeGeneratorData();
		
		//get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();		
		
		//get target path within project
		Path targetFolderCont = new Path(targetContainer);
		IResource resource =  workSpaceRoot.findMember(targetFolderCont.makeAbsolute());
		
		//build correct full path
		fullPath = Paths.get(resource.getLocation().toPortableString());
		
		try {
			AcceleoPreferences.switchQueryCache(false);
			runSpecGeneration();
		} catch (IOException e) {
			Activator.logError(e.getMessage(), e);
		}
		
		refreshWorkspace(monitor);
		
	}
	
	protected abstract void runSpecGeneration() throws IOException;
	
	
	
	protected void refreshWorkspace(IProgressMonitor monitor) throws CoreException
	{
		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	
}
