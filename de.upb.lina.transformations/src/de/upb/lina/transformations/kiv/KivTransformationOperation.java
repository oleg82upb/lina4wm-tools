package de.upb.lina.transformations.kiv;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;

import de.upb.lina.transformations.wizards.TransformationOperation;

public class KivTransformationOperation extends TransformationOperation {

	public KivTransformationOperation(String graphModelFileLocation,
			String targetContainer, String targetName, String fileEnding) {
		super(graphModelFileLocation, targetContainer, targetName, fileEnding);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		super.execute(monitor);
		//TODO: Do stuff here
		try {
			ArrayList<Object> args = new ArrayList<Object>();
			GenerateKIVspec generator = new GenerateKIVspec(genData, fullPath.toFile(), args);
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		refreshWorkspace(monitor);
	}
	
	
	

}
