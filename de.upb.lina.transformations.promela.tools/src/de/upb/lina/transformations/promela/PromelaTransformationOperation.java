package de.upb.lina.transformations.promela;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;

import de.upb.lina.transformations.wizards.TransformationOperation;

public class PromelaTransformationOperation extends TransformationOperation {
	
	
	
	public PromelaTransformationOperation(String graphModelFileLocation, String targetContainer, String targetName, String fileEnding) {
		super(graphModelFileLocation, targetContainer, targetName, fileEnding);
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		super.execute(monitor);
		
		//run acceleo
		GeneratePromelaModel generator;
		try {
			ArrayList<Object> args = new ArrayList<Object>();
			args.add(targetName + fileEnding);
			generator = new GeneratePromelaModel(genData, fullPath.toFile(), args);
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		refreshWorkspace(monitor);
		
		
	}
	
	

}
