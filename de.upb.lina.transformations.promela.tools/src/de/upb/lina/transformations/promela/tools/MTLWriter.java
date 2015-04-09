package de.upb.lina.transformations.promela.tools;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class MTLWriter {
	private File file; 
	private String fileLoc; 
	private boolean started = false;

	public MTLWriter(String fileLoc){
		this.fileLoc = fileLoc;
		file = new File(fileLoc);
	}
	
	public boolean isOverwrite(){
		if(file.exists() && !started){
			started = true;
			return true;
		}
		return false;
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
