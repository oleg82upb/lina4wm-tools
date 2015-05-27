package de.upb.lina.transformations.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.plugin.GendataPrecomputer;

public class TransformationOperation extends WorkspaceModifyOperation{
	protected String graphModelFileLocation;
	protected String targetContainer;
	protected String targetName;
	protected String fileEnding;
	protected java.nio.file.Path fullPath;
	
	protected List<ControlFlowDiagram> cfg;
	protected GeneratorData genData;
	
	
	public TransformationOperation(List<ControlFlowDiagram> cfgs, String targetContainer, String targetName, String fileEnding) {
//		this.graphModelFileLocation = graphModelFileLocation;
		this.cfg = cfgs;
		this.targetContainer = targetContainer; 
		this.targetName = targetName;
		this.fileEnding = fileEnding;
	}
	
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		

//		loadCfg();
		
		//Run Precomputation
		GendataPrecomputer precomp = new GendataPrecomputer(cfg);
		genData = precomp.computeGeneratorData();
		
		//get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		File workspaceRootFile = workSpaceRoot.getRawLocation().makeAbsolute().toFile();		
		
		//get target path within project
		Path targetFolderCont = new Path(targetContainer);
		IPath targetPath = targetFolderCont.makeAbsolute();
		
		//build correct full path
		fullPath = Paths.get(workspaceRootFile.toString() + File.separator + targetPath.toPortableString());
		
	}
	
	
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
		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < iProjects.length; i++)
		{
			iProjects[i].refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
	}
	
}
