package de.upb.lina.transformations.kiv;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.wizards.TransformationOperation;

public class KivTransformationOperation extends TransformationOperation {

	public KivTransformationOperation(List<ControlFlowDiagram> cfgs,
			String targetContainer, String targetName, String fileEnding) {
		super(cfgs, targetContainer, targetName, fileEnding);
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		super.execute(monitor);
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
