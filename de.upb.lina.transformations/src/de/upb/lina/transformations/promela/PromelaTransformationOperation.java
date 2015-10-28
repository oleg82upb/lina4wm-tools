package de.upb.lina.transformations.promela;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;

import de.upb.lina.transformations.plugin.Configuration;
import de.upb.lina.transformations.wizards.TransformationOperation;

public class PromelaTransformationOperation extends TransformationOperation {
	
	public PromelaTransformationOperation(String targetContainer, String targetName, String fileEnding, Configuration config) {
		super(targetContainer, targetName, fileEnding, config);
	}


	@Override
	protected void runSpecGeneration() throws IOException {
		GeneratePromelaModel generator;
		ArrayList<Object> args = new ArrayList<Object>();
		args.add(targetName + fileEnding);
		generator = new GeneratePromelaModel(genData, fullPath.toFile(), args);
		generator.doGenerate(new BasicMonitor());
		
	}
	
	

}
