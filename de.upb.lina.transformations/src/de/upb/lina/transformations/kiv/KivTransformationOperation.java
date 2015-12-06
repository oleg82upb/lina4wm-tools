package de.upb.lina.transformations.kiv;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;

import de.upb.lina.transformations.plugin.Configuration;
import de.upb.lina.transformations.plugin.Constants;
import de.upb.lina.transformations.wizards.TransformationOperation;

public class KivTransformationOperation extends TransformationOperation 
{

	public KivTransformationOperation(String targetContainer, String targetName,
			String fileEnding, Configuration config) 
	{
		super(targetContainer, targetName, fileEnding, config);
	}

	@Override
	protected void runSpecGeneration() throws IOException 
	{
		ArrayList<Object> args = new ArrayList<Object>();
		if(config.getKivTransformationType() == Constants.TRANSFORMATION_TYPE_KIV_LOCAL)
		{
			GenerateKIVspec generator = new GenerateKIVspec(genData, fullPath.toFile(), args);
			generator.doGenerate(new BasicMonitor());
		}
		else if(config.getKivTransformationType() == Constants.TRANSFORMATION_TYPE_KIV_GLOBAL)
		{
			GenerateKIVspecGlobal generator = new GenerateKIVspecGlobal(genData, fullPath.toFile(), args);
			generator.doGenerate(new BasicMonitor());
		}
		

	}

}
