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
	private ConfigurationPage configurationPage;
	private WarningPage warningPage;
	private ISelection selection;
	private String inputFileLocation;

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


	public void performChecks(LLVM ast){

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
			configurationPage.setErrorMessage(userMessage);
		}else if(manager.foundWarning()){
			foundWarning = true;
			this.userMessage = " Warnings encountered while checking the program. Click 'next' for more details.";
			configurationPage.setMessage(userMessage, WizardPage.WARNING);
			myCanFinish = true;
		}else if(!manager.foundError() && !manager.foundWarning()){
			myCanFinish = true;
			configurationPage.setErrorMessage(null);
			configurationPage.setMessage("Check your input and hit finish.");
		}
		warningPage.setWarningMessages(manager.getWarningMessages());
		warningPage.setErrorMessages(manager.getErrorMessages());

	}


	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		warningPage = new WarningPage();
		configurationPage = new ConfigurationPage(selection, this);
		addPage(configurationPage);
		addPage(warningPage);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish()
	{

		configurationPage.saveMementoState();
		CreateGraphOperation cgo = new CreateGraphOperation(configurationPage.getInputFilePath(),
				(configurationPage.getContainerName() + "/" + configurationPage.getFileName()), configurationPage.getSelectedSemantics(), this.getShell());

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
		restartChecks();
		return myCanFinish;
	}
	
	public void restartChecks(){
		if (inputFileLocation == null || !inputFileLocation.equals(configurationPage.getInputFilePath()))
		{
			LLVM ast = null;
			inputFileLocation = configurationPage.getInputFilePath();
			
			if(configurationPage.getInputFilePath().endsWith("." + ConfigurationPage.LLVM_FILE_EXTENSION)){
				ast = AstLoader.loadAst(inputFileLocation);			
			}
			//.s extension
			else{
				ast = AstLoader.createAstFromLLVM(inputFileLocation);
			}
			
			if(ast == null){
				myCanFinish = false;
			}else{
				performChecks(ast);
			}
		}
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