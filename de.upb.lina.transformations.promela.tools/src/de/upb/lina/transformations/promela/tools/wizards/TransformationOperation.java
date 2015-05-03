package de.upb.lina.transformations.promela.tools.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.common.util.BasicMonitor;
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
import de.upb.lina.transformations.promela.acceleo.main.GeneratePromelaModel;
import de.upb.lina.transformations.promela.tools.GendataPrecomputer;
import de.upb.lina.transformations.promela.tools.MTLWriter;
import de.upb.lina.transformations.promela.tools.PromelaMTLGenerator;

public class TransformationOperation extends WorkspaceModifyOperation {
	private String graphModelFileLocation;
	private String targetContainer;
	private String targetName;
	private String fileEnding;
	
	private List<ControlFlowDiagram> cfg;
	
	
	public TransformationOperation(String graphModelFileLocation, String targetContainer, String targetName, String fileEnding) {
		this.graphModelFileLocation = graphModelFileLocation;
		this.targetContainer = targetContainer; 
		this.targetName = targetName;
		this.fileEnding = fileEnding;
	}

	public TransformationOperation(ISchedulingRule rule) {
		super(rule);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		
		loadCfg();
		PromelaMTLGenerator gen = new PromelaMTLGenerator(cfg);
		gen.produceTransformation();
		
//		String toWrite = gen.getResult();
//		
//		String genDataPortableStringLocation = new Path(targetContainer + File.separator + targetName +"_gendata" + ".gendata").toPortableString();
//		
////		MTLWriter writer = new MTLWriter(new Path(targetContainer + File.separator + targetName + fileEnding).toPortableString(), genDataPortableStringLocation);
////		writer.write(toWrite);
		
		
		//Run Acceleo
		GendataPrecomputer precomp = new GendataPrecomputer(cfg);
		GeneratorData genData = precomp.computeGeneratorData();
		
		
		//get workspace root
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		File workspaceRootFile = workSpaceRoot.getRawLocation().makeAbsolute().toFile();		
		
		//get target path within project
		Path targetFolderCont = new Path(targetContainer);
		IPath targetPath = targetFolderCont.makeAbsolute();
		
		//build correct full path
		java.nio.file.Path fullPath = Paths.get(workspaceRootFile.toString() + File.separator + targetPath.toPortableString());
		
		//run acceleo
		GeneratePromelaModel generator;
		try {
			ArrayList<Object> args = new ArrayList<Object>();
			args.add(targetName + fileEnding);
			generator = new GeneratePromelaModel(genData, fullPath.toFile(), args); //TODO: add file name as parameters to be passed to template
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		refreshWorkspace(monitor);
		refreshWorkspace(monitor);
		
		
	}
	
	private List<ControlFlowDiagram> loadCfg()
	{
		if(cfg != null)
		{
			return cfg;
		}
		
		
		ControlflowPackage.eINSTANCE.getNsURI();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path cfgpath = new Path(graphModelFileLocation);
		URI uri = URI.createPlatformResourceURI(cfgpath.toOSString(), true);
		Resource cfgResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(cfgResource);
		List<EObject> graphList = cfgResource.getContents();
		List<ControlFlowDiagram> graphList2  = new ArrayList<ControlFlowDiagram>();
		for(EObject o: graphList){
			if(o instanceof ControlFlowDiagram){
				graphList2.add((ControlFlowDiagram)o);
			}
		}
		this.cfg = graphList2;
		return cfg;
	}
	
	private void refreshWorkspace(IProgressMonitor monitor) throws CoreException
	{
		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < iProjects.length; i++)
		{
			iProjects[i].refreshLocal(0, monitor);
		}
	}

}
