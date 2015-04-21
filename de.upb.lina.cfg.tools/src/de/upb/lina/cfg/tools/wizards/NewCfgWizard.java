package de.upb.lina.cfg.tools.wizards;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CreateGraphOperation;
import de.upb.lina.cfg.tools.strategies.PreComputationChecker;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "cfg". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */

public class NewCfgWizard extends Wizard implements INewWizard {
	private SelectionPage page;
	private ISelection selection;
	private String astlocation;
	private boolean containsLoopWithoutFence = false;
	private boolean containsLoadsInWriteDefChains = false;

	/**
	 * Constructor for NewCfgWizard.
	 */
	public NewCfgWizard() {
		super();
		setNeedsProgressMonitor(true);
	}




	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new SelectionPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish()
	{

		page.saveMementoState();
		CreateGraphOperation cgo = new CreateGraphOperation(page.getAstLocation(),
				(page.getContainerName() + "/" + page.getFileName()), page.getMemoryModelSelection(), this.getShell());

		try
		{
			getContainer().run(true, false, cgo);
		} catch (Exception e)
		{
			if (!cgo.finishedWithoutWarnings())
			{
				MessageDialog
						.openWarning(
								getShell(),
								"Warning",
								"The graph may contain loops without fences or flush transitions after return statement."
								+ "\n Please check the error log for more details.");
			} else
			{
				CFGActivator.logError(e.getMessage(), e);
			}
		}

		return true;
	}

	@Override
	public boolean canFinish()
	{

		if (!super.canFinish())
		{
			return false;
		}
		try
		{
			if (page.getMemoryModelSelection() == 1)
			{
				if (astlocation == null || !astlocation.equals(page.getAstLocation()))
				{
					astlocation = page.getAstLocation();
					PreComputationChecker checker = new PreComputationChecker(page.getAstLocation(),
							page.getMemoryModelSelection());
//					containsEarlyReads = checker.checkforEarlyReads();
					containsLoopWithoutFence = checker.checkforLoopWithoutFence();
					if(!containsLoopWithoutFence){
					containsLoadsInWriteDefChains = checker.checkForLoadsInWriteDefChains();
					}
//					List<FunctionDefinition> functions = checker.getFunctions();
//					funcWithEarlyReads = "";
//					for (int i = 0; i < functions.size(); i++)
//					{
//						funcWithEarlyReads = funcWithEarlyReads.concat(functions.get(i).getAddress().getName() + " ");
//					}
				}
				if (containsLoopWithoutFence && astlocation.equals(page.getAstLocation()))
				{
					page.setErrorMessage("The selected Ast-File contains a loop without fence");
					return false;
				}

				if(containsLoadsInWriteDefChains){
					page.setMessage("The selected Ast-File contains reads for which it cannot be determined whether they are early reads or not", 2);
				}
//				if (containsEarlyReads)
//					page.setMessage("The selected Ast-File contains possible early reads at functions: "
//							+ funcWithEarlyReads, 2);
			}

		} catch (InterruptedException e)
		{
			CFGActivator.logError(e.getMessage(), e);
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