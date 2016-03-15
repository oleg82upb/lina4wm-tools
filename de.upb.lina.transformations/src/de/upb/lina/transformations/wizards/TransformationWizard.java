package de.upb.lina.transformations.wizards;

import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.logic.TransformationConfiguration;
import de.upb.lina.transformations.logic.TransformationOperation;
import de.upb.lina.transformations.logic.TransformationUtil;

public class TransformationWizard extends Wizard implements INewWizard {
	
	private TransformationConfigurationPage wizardPage;
	private FunctionSelectionPage functionSelectionPage;
	private ISelection selection;
	

	@Override
	public boolean performFinish()
	{
		wizardPage.saveMementoState();

		// create config object from selected configuration
		List<ControlFlowDiagram> cfgs = functionSelectionPage.getSelectedFunctions();
		String kIVBasis = wizardPage.getBasis();
		Map<String, String> oldToNewCfgName = functionSelectionPage.getMap();
		TransformationConfiguration config = new TransformationConfiguration(cfgs, kIVBasis, oldToNewCfgName, wizardPage.getType());

		TransformationOperation transformationOperation 
				= new TransformationOperation(wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(),
				wizardPage.getFileEndingLabel().getText(), config);

		TransformationUtil.runTransformationOperation(this, transformationOperation);
		return true;
	}

	@Override
	public void addPages() {
		super.addPages();
		functionSelectionPage = new FunctionSelectionPage();
		wizardPage = new TransformationConfigurationPage("Generate New Specification", selection, functionSelectionPage);
		addPage(wizardPage);
		addPage(functionSelectionPage);
	}
	
	
	@Override
	public boolean canFinish(){
		if (!super.canFinish()){
			return false;
		}
		return true;
	}
	
	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	
	

}
