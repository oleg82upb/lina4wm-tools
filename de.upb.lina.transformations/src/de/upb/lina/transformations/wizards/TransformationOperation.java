package de.upb.lina.transformations.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
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
//		this.graphModelFileLocation = graphModelFileLocation;
		this.cfgList = cfgs;
		this.targetContainer = targetContainer; 
		this.targetName = targetName;
		this.fileEnding = fileEnding;
		this.basis = basis;
	}
	
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		

//		loadCfg();
		
		//Run Precomputation
		GendataPrecomputer precomp = new GendataPrecomputer(cfgList, basis);
		genData = precomp.computeGeneratorData();
		
		//get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		File workspaceRootFile = workSpaceRoot.getRawLocation().makeAbsolute().toFile();		
		
		//get target path within project
		Path targetFolderCont = new Path(targetContainer);
		IPath targetPath = targetFolderCont.makeAbsolute();
		
		//build correct full path
		fullPath = Paths.get(workspaceRootFile.toString() + File.separator + targetPath.toPortableString());
		
		try {
			runSpecGeneration();
		} catch (IOException e) {
			Activator.logError(e.getMessage(), e);
		}
		
		refreshWorkspace(monitor);
		
	}
	
	protected abstract void runSpecGeneration() throws IOException;
	
	
//	protected void loadCfg(){
//		if(cfg != null){
//			return;
//		}
//
//		ControlflowPackage.eINSTANCE.getNsURI();
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Path cfgpath = new Path(graphModelFileLocation);
//		URI uri = URI.createPlatformResourceURI(cfgpath.toOSString(), true);
//		Resource cfgResource = resourceSet.getResource(uri, true);
//		EcoreUtil.resolveAll(cfgResource);
//		List<EObject> graphList = cfgResource.getContents();
//		List<ControlFlowDiagram> graphList2  = new ArrayList<ControlFlowDiagram>();
//		for(EObject o: graphList){
//			if(o instanceof ControlFlowDiagram){
//				graphList2.add((ControlFlowDiagram)o);
//			}
//		}
//		this.cfg = graphList2;
//	}
	
	protected void refreshWorkspace(IProgressMonitor monitor) throws CoreException
	{
		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
//		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
//		for (int i = 0; i < iProjects.length; i++)
//		{
//			iProjects[i].refreshLocal(IResource.DEPTH_INFINITE, monitor);
//		}
	}
	
}
