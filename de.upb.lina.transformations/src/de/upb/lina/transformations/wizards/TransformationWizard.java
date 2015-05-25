package de.upb.lina.transformations.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import de.upb.lina.transformations.kiv.KivTransformationOperation;
import de.upb.lina.transformations.plugin.ETransformationTarget;
import de.upb.lina.transformations.promela.PromelaTransformationOperation;

public class TransformationWizard extends Wizard implements INewWizard {
	
	private TransformationWizardPage wizardPage;
	private FunctionSelectionPage functionSelectionPage;
	private ISelection selection;
	

	@Override
	public boolean performFinish() {
		wizardPage.saveMementoState();
		WorkspaceModifyOperation wmo = null;
		
		if(wizardPage.getType() == ETransformationTarget.PROMELA){
			//Promela
			wmo = new PromelaTransformationOperation(functionSelectionPage.getSelectedFunctions(), wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(), wizardPage.getFileEndingLabel().getText());
		}else if (wizardPage.getType() == ETransformationTarget.KIV){
			//KIV
			wmo = new KivTransformationOperation(functionSelectionPage.getSelectedFunctions(), wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(), wizardPage.getFileEndingLabel().getText());
		}
		
		try {
			getContainer().run(true, false, wmo);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void addPages() {
		super.addPages();
		functionSelectionPage = new FunctionSelectionPage();
		wizardPage = new TransformationWizardPage("Generate New Specification", selection, functionSelectionPage);
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
