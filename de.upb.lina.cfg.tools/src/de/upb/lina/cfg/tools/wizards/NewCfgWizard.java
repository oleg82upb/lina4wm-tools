package de.upb.lina.cfg.tools.wizards;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.CreateGraphOperation;
import de.upb.lina.cfg.tools.checks.AstLoader;
import de.upb.lina.cfg.tools.checks.LIWDCPropertyChecker;
import de.upb.lina.cfg.tools.checks.LWFPropertyChecker;
import de.upb.lina.cfg.tools.checks.PropertyCheckerManager;
import de.upb.lina.cfg.tools.checks.UnsupportedInstructionPropertyChecker;
import de.upb.llvm_parser.llvm.LLVM;

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
	private WarningPage warningPage;
	private ISelection selection;
	private String astLocation;
	
	private boolean myCanFinish;
	private boolean foundError;
	private boolean foundWarning;
	private String userMessage;


	/**
	 * Constructor for NewCfgWizard.
	 */
	public NewCfgWizard() {
		super();
		setNeedsProgressMonitor(true);
		myCanFinish = false;
		userMessage = "Check your input and press next or finish!";
		foundError = false;
		foundWarning = false;
	}

	/**
	 * 
	 * @param ast
	 * @return false if we are not allowed to finish the page
	 */
	private void performChecks(LLVM ast){
		
		//Setup checker and register checkers
		PropertyCheckerManager manager = new PropertyCheckerManager();	
		manager.registerPropertyChecker(new LIWDCPropertyChecker(ast));
		manager.registerPropertyChecker(new LWFPropertyChecker(ast));
		manager.registerPropertyChecker(new UnsupportedInstructionPropertyChecker(ast));
		
		manager.performChecks();
		if(manager.foundError()){
			myCanFinish = false;
			foundError = true;
			this.userMessage = " Problems were found in the specified program. Click 'next' for more details.";
			page.setErrorMessage(userMessage);
		}else if(manager.foundWarning()){
			foundWarning = true;
			this.userMessage = " Warnings encountered while checking the program. Click 'next' for more details.";
			page.setMessage(userMessage, WizardPage.WARNING);
			myCanFinish = true;
		}else if(!manager.foundError() && !manager.foundWarning()){
			myCanFinish = true;
		}
		
		warningPage.setWarningMessages(manager.getWarningMessages());
		warningPage.setErrorMessages(manager.getErrorMessages());
		
	}


	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new SelectionPage(selection, this);
		warningPage = new WarningPage();
		addPage(page);
		addPage(warningPage);
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

		if (page.getMemoryModelSelection() > CFGConstants.SC)
		{
			if (astLocation == null || !astLocation.equals(page.getAstLocation()))
			{
				astLocation = page.getAstLocation();
				LLVM ast = AstLoader.loadAst(astLocation);
				if(ast == null){
					myCanFinish = false;
				}else{
					performChecks(ast);
				}
			}
			return myCanFinish;
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
	
	public String getUserMessage(){
		return userMessage;
	}
	
	public boolean hasFoundError(){
		return foundError;
	}
	
	public boolean hasFoundWarning(){
		return foundWarning;
	}
}