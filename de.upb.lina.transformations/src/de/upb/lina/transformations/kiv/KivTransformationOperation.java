package de.upb.lina.transformations.kiv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.wizards.TransformationOperation;

public class KivTransformationOperation extends TransformationOperation {

	public KivTransformationOperation(List<ControlFlowDiagram> cfgs, String targetContainer, String targetName,
			String fileEnding, int basis) {
		super(cfgs, targetContainer, targetName, fileEnding, basis);
	}

	@Override
	protected void runSpecGeneration() throws IOException {
		ArrayList<Object> args = new ArrayList<Object>();
		GenerateKIVspec generator = new GenerateKIVspec(genData, fullPath.toFile(), args);
		generator.doGenerate(new BasicMonitor());

	}

}
