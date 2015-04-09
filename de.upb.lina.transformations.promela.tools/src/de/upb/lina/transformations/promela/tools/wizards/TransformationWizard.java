package de.upb.lina.transformations.promela.tools.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;

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
		TransformationOperation tfO = new TransformationOperation(wizardPage.getGraphModelFile().getText(), wizardPage.getContainerText().getText(), wizardPage.getFileText().getText(), wizardPage.getFileEndingLabel().getText());
		try {
			getContainer().run(true, false, tfO);
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
		wizardPage = new TransformationWizardPage("Transform Page");
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
