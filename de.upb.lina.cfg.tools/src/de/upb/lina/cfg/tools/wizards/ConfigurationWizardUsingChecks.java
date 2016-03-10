package de.upb.lina.cfg.tools.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import de.upb.lina.cfg.tools.checks.LoadsInWriteDefChainPropertyChecker;
import de.upb.lina.cfg.tools.checks.PropertyCheckerManager;
import de.upb.lina.cfg.tools.checks.UnsupportedInstructionPropertyChecker;
import de.upb.lina.cfg.tools.checks.WritingLoopWithoutFencePropertyChecker;
import de.upb.llvm_parser.llvm.LLVM;

public abstract class ConfigurationWizardUsingChecks extends Wizard implements
		INewWizard {
	
	private boolean myCanFinish;
	private boolean foundError;
	private boolean foundWarning;
	private String messageForUser;
	
	private IStructuredSelection userSelection;
	private String pathToCheckableFile;
	
	private WarningPage warningPage;
	private ConfigurationPage configurationPage;

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.userSelection = selection;
	}
	
	public abstract void restartChecks();
	
	@Override
	public boolean canFinish()
	{
		if (!super.canFinish())
		{
			return false;
		}
		restartChecks();
		return isMyCanFinish();
	}
	
	/**
	 * Executes checks of several property checkers on the AST model 
	 * and passes the results to the {@link WarningPage}. 
	 * 
	 * @param ast AST model to check on 
	 */
	public void performLogicChecksOnASTModel(LLVM ast, int semanticToPerformChecksFor){
		foundError = false;
		foundWarning = false;
		myCanFinish = true;

		PropertyCheckerManager manager = new PropertyCheckerManager(semanticToPerformChecksFor);	
		manager.registerPropertyChecker(new LoadsInWriteDefChainPropertyChecker(ast));
		manager.registerPropertyChecker(new WritingLoopWithoutFencePropertyChecker(ast));
		manager.registerPropertyChecker(new UnsupportedInstructionPropertyChecker(ast));

		manager.performChecks();

		interpretManagerStatus(manager);

		warningPage.setWarningMessages(manager.getWarningMessages());
		warningPage.setErrorMessages(manager.getErrorMessages());

	}
	
	private void interpretManagerStatus(PropertyCheckerManager manager) {
		switch (manager.getStatus()) {
		case PropertyCheckerManager.STATUS_ERROR_FOUND:

			myCanFinish = false;
			foundError = true;
			this.messageForUser = " Problems were found in the specified program. Click 'next' for more details.";
			configurationPage.setErrorMessage(messageForUser);
			break;

		case PropertyCheckerManager.STATUS_WARNING_FOUND:

			foundWarning = true;
			this.messageForUser = " Warnings encountered while checking the program. Click 'next' for more details.";
			configurationPage.setMessage(messageForUser, WizardPage.WARNING);
			myCanFinish = true;
			break;

		case PropertyCheckerManager.STATUS_OK:

			myCanFinish = true;
			configurationPage.setErrorMessage(null);
			configurationPage.setMessage("Check your input and hit finish.");
			break;

		default:
			break;
		}
	}
	
	/**
	 * Checks if {@link CreateStoreBufferGraphWizard#pathToCheckableFile} ends with the given file extension.
	 * 
	 * @param fileExtension file extension to check for
	 * @return true, if {@link CreateStoreBufferGraphWizard#pathToCheckableFile} ends with the given file extension, false if not
	 */
	protected boolean doesPathToInputFileHasGivenFileExtenion(String fileExtension){
		return getPathToCheckableFile().endsWith("." + fileExtension);
	}

	protected IStructuredSelection getUserSelection() {
		return userSelection;
	}

	protected String getPathToCheckableFile() {
		return pathToCheckableFile;
	}

	protected void setPathToCheckableFile(String pathToCheckableFile) {
		this.pathToCheckableFile = pathToCheckableFile;
	}

	protected WarningPage getWarningPage() {
		return warningPage;
	}

	protected void setWarningPage(WarningPage warningPage) {
		this.warningPage = warningPage;
	}

	protected boolean isMyCanFinish() {
		return myCanFinish;
	}

	protected void setMyCanFinish(boolean myCanFinish) {
		this.myCanFinish = myCanFinish;
	}

	protected boolean isFoundError() {
		return foundError;
	}

	protected void setFoundError(boolean foundError) {
		this.foundError = foundError;
	}

	protected boolean isFoundWarning() {
		return foundWarning;
	}

	protected void setFoundWarning(boolean foundWarning) {
		this.foundWarning = foundWarning;
	}

	protected String getMessageForUser() {
		return messageForUser;
	}

	protected void setMessageForUser(String messageForUser) {
		this.messageForUser = messageForUser;
	}

	protected ConfigurationPage getConfigurationPage() {
		return configurationPage;
	}

	protected void setConfigurationPage(ConfigurationPage configurationPage) {
		this.configurationPage = configurationPage;
	}

	
	
}
