package de.upb.lina.transformations.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.plugin.Activator;
import de.upb.lina.transformations.plugin.GendataPrecomputer;

public abstract class TransformationOperation extends WorkspaceModifyOperation{
	protected String graphModelFileLocation;
	protected String targetContainer;
	protected String targetName;
	protected String fileEnding;
	protected int basis;
	protected java.nio.file.Path fullPath;
	
	protected List<ControlFlowDiagram> cfgList;
	protected GeneratorData genData;
	
	
	public TransformationOperation(List<ControlFlowDiagram> cfgs, String targetContainer, String targetName, String fileEnding, int basis) {
		this.cfgList = cfgs;
		this.targetContainer = targetContainer; 
		this.targetName = targetName;
		this.fileEnding = fileEnding;
		this.basis = basis;
	}
	
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		
		//Run Precomputation
		GendataPrecomputer precomp = new GendataPrecomputer(cfgList, basis);
		genData = precomp.computeGeneratorData();
		
		//get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();		
		
		//get target path within project
		Path targetFolderCont = new Path(targetContainer);
		IResource resource =  workSpaceRoot.findMember(targetFolderCont.makeAbsolute());
		
		//build correct full path
		fullPath = Paths.get(resource.getLocation().toPortableString());
		
		try {
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
