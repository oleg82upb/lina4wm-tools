package de.upb.lina.transformations.kiv;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

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
		System.out.println("TODO - KIVTransformationOperation");
	}
	
	
	

}
