package de.upb.lina.transformations.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.logic.Configuration;
import de.upb.lina.transformations.logic.TransformationOperation;

public class TransformationWizard extends Wizard implements INewWizard {
	
	private TransformationConfigurationPage wizardPage;
	private FunctionSelectionPage functionSelectionPage;
	private ISelection selection;
	

	@Override
	public boolean performFinish()
	{
		wizardPage.saveMementoState();
		WorkspaceModifyOperation wmo = null;

		// create config object from selected configuration
		List<ControlFlowDiagram> cfgs = functionSelectionPage.getSelectedFunctions();
		String kIVBasis = wizardPage.getBasis();
		Map<String, String> oldToNewCfgName = functionSelectionPage.getMap();
		Configuration config = new Configuration(cfgs, kIVBasis, oldToNewCfgName, wizardPage.getType());

		wmo = new TransformationOperation(wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(),
				wizardPage.getFileEndingLabel().getText(), config);

		try
		{
			getContainer().run(true, false, wmo);
		} catch (InvocationTargetException e)
		{
			Activator.logError("InvocationTargetException occured during the transformation.", e);
		} catch (InterruptedException e)
		{
			Activator.logError("InterruptedException occured during the transformation.", e);
		}
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
