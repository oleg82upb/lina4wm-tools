package de.upb.lina.transformations.promela.tools;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.gendata.GeneratorData;

public class MTLWriter {
	private File file; 
	private String fileLoc; 
	private String genDataLoc;
	private boolean started = false;

	public MTLWriter(String fileLoc, String genDataLoc){
		this.fileLoc = fileLoc;
		this.genDataLoc = genDataLoc;
		file = new File(fileLoc);
	}

	public boolean isOverwrite(){
		if(file.exists() && !started){
			started = true;
			return true;
		}
		return false;
	}

	public void writeGendata(IProgressMonitor monitor, GeneratorData genData){
		try
		{
			// store resulting cfg
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource(URI.createURI(genDataLoc));
			
			EcoreUtil.resolveAll(genData);
			resource.getContents().add(genData);


			resource.save(Collections.EMPTY_MAP);

		} catch (IOException e)
		{
			Activator.logError(e.getMessage(), e);
		} catch (IllegalArgumentException e)
		{
			Activator.log(IStatus.INFO, "User stopped the transformation due to a warning.", e);
		}
	}

	public void write(String line){
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = new Path(fileLoc);
		IFile file = myWorkspaceRoot.getFile(path);
		InputStream stream = new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8));
		try {
			if(!file.exists()){
				file.create(stream, false, null);
			}else{
				file.setContents(stream, false, false, null);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//	public void write(String line){
	//		
	//		BufferedWriter writer = null;
	//		try {
	//			if(!file.exists()){
	//				new File(container).mkdirs();
	//				//file.createNewFile();
	//			}
	//			writer = new BufferedWriter(new FileWriter(file,true));
	//
	//			writer.write(line);
	//			
	//		} catch (IOException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		} finally{
	//			try {
	//				writer.close();
	//			} catch (IOException e) {
	//				// TODO Auto-generated catch block
	//				e.printStackTrace();
	//			}
	//		}
	//	}
}
