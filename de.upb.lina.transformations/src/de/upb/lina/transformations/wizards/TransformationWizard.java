package de.upb.lina.transformations.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.kiv.KivTransformationOperation;
import de.upb.lina.transformations.plugin.ETransformationTarget;
import de.upb.lina.transformations.promela.PromelaTransformationOperation;

public class TransformationWizard extends Wizard implements INewWizard {
	
	private TransformationWizardPage wizardPage;
	private ControlFlowDiagram cfg;
	
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		wizardPage.saveMementoState();
		WorkspaceModifyOperation wmo = null;
		
		if(wizardPage.getType() == ETransformationTarget.PROMELA){
			//Promela
			wmo = new PromelaTransformationOperation(wizardPage.getGraphModelFile().getText(), wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(), wizardPage.getFileEndingLabel().getText());
		}else if (wizardPage.getType() == ETransformationTarget.KIV){
			//KIV
			wmo = new KivTransformationOperation(wizardPage.getGraphModelFile().getText(), wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(), wizardPage.getFileEndingLabel().getText());
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
		wizardPage = new TransformationWizardPage("Generate New Specification");
		addPage(wizardPage);
		
	}
	
	
	@Override
	public boolean canFinish(){
		
		if (!super.canFinish()){
			return false;
		}
		
		
		
		return true;
	}

	
	

}
