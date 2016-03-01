package de.upb.lina.cfg.tools.wizards;

import java.io.File;

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
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.checks.LIWDCPropertyChecker;
import de.upb.lina.cfg.tools.checks.LWFPropertyChecker;
import de.upb.lina.cfg.tools.checks.PropertyCheckerManager;
import de.upb.lina.cfg.tools.checks.UnsupportedInstructionPropertyChecker;
import de.upb.llvm_parser.llvm.LLVM;


/**
 * The CreateStoreBufferGraphWizard is an implementation of {@link INewWizard} for creating 
 * a store buffer graph from a LLVM or AST file. It is made up of a {@link ConfigurationPage}, 
 * where the user can define all required parameters for the creation process. Any change of the input
 * of the {@link ConfigurationPage} results in a check if the input is valid or yields any problems. 
 * If logical problems occur, the user will be notified and can see additional information on the 
 * {@link WarningPage}. 
 * 
 * @author Thomas Haarhoff
 * @author Alexander Hetzer
 * @author Oleg Travkin
 *
 */

public class CreateStoreBufferGraphWizard extends Wizard implements INewWizard {
	private ConfigurationPage configurationPage;
	private WarningPage warningPage;
	private ISelection userSelection;
	private String pathToInputFile;

	private boolean myCanFinish;
	private boolean foundError;
	private boolean foundWarning;
	private String messageForUser;


	/**
	 * Default constructor setting all required parameters
	 */
	public CreateStoreBufferGraphWizard() {
		super();
		setNeedsProgressMonitor(true);
		myCanFinish = false;
		messageForUser = "Check your input and press next or finish!";
		foundError = false;
		foundWarning = false;
	}


	/**
	 * Executes checks of several property checkers on the AST model 
	 * and passes the results to the {@link WarningPage}. 
	 * 
	 * @param ast AST model to check on 
	 */
	public void performLogicChecksOnASTModel(LLVM ast){
		foundError = false;
		foundWarning = false;
		myCanFinish = true;

		PropertyCheckerManager manager = new PropertyCheckerManager();	
		manager.registerPropertyChecker(new LIWDCPropertyChecker(ast));
		manager.registerPropertyChecker(new LWFPropertyChecker(ast));
		manager.registerPropertyChecker(new UnsupportedInstructionPropertyChecker(ast));

		manager.performChecks();

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

		warningPage.setWarningMessages(manager.getWarningMessages());
		warningPage.setErrorMessages(manager.getErrorMessages());

	}


	/**
	 * Adds all necessary pages.
	 */
	public void addPages() {
		warningPage = new WarningPage();
		configurationPage = new ConfigurationPage(userSelection, this);
		addPage(configurationPage);
		addPage(warningPage);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. It creates a 
	 * {@link CreateGraphOperation} and runs it according the parameters specified via the 
	 * {@link ConfigurationPage}.
	 */
	public boolean performFinish()
	{
		configurationPage.saveMementoState();
		CreateGraphOperation cgo = null;

		if(doesPathToInputFileHasGivenFileExtenion(CFGConstants.S_FILE_EXTENSION)){
			//we first need to transform the LLVM file into an AST file
			LLVM astForInputLLVMFile = ResourceIOUtil.createAstFromLLVM(pathToInputFile);

			if(astForInputLLVMFile == null){
				return false;
			}

			//store the transformed ast file
			String pathToOutputFileForAst = configurationPage.getPathToOutputFolder() + File.separator + configurationPage.getOutputFileName().replace("." + CFGConstants.CFG_FILE_EXTENSION, "." + CFGConstants.LLVM_FILE_EXTENSION);
			ResourceIOUtil.saveResourceToDisk(pathToOutputFileForAst, CFGConstants.LLVM_FILE_EXTENSION, astForInputLLVMFile);

			//create graph operation accordingly
			cgo = new CreateGraphOperation(pathToOutputFileForAst, 
					configurationPage.getCompletePathToOutputFile(), configurationPage.getSelectedSemantics(), this.getShell());

		}else if(doesPathToInputFileHasGivenFileExtenion(CFGConstants.LLVM_FILE_EXTENSION)){
			cgo = new CreateGraphOperation(configurationPage.getInputFilePath(),
					configurationPage.getCompletePathToOutputFile() , configurationPage.getSelectedSemantics(), this.getShell());
		}

		//execute the CreateGraphOperation
		try
		{
			getContainer().run(true, false, cgo);
		} catch (Exception e)
		{
			CFGActivator.logError(e.getMessage(), e);
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


	/**
	 * If {@link CreateStoreBufferGraphWizard#pathToInputFile} has changed, 
	 * we call {@link CreateStoreBufferGraphWizard#performLogicChecksOnASTModel(LLVM)
	 * in order to check the new AST for problems.
	 */
	public void restartChecks(){
		LLVM ast = null;
		pathToInputFile = configurationPage.getInputFilePath();

		if(doesPathToInputFileHasGivenFileExtenion(CFGConstants.LLVM_FILE_EXTENSION)){
			ast = ResourceIOUtil.loadAst(pathToInputFile);			
		}
		else if(doesPathToInputFileHasGivenFileExtenion(CFGConstants.S_FILE_EXTENSION)){
			ast = ResourceIOUtil.createAstFromLLVM(pathToInputFile);
		}

		if(ast == null){
			myCanFinish = false;
		}else{
			performLogicChecksOnASTModel(ast);
		}
	}

	/**
	 * Checks if {@link CreateStoreBufferGraphWizard#pathToInputFile} ends with the given file extension.
	 * 
	 * @param fileExtension file extension to check for
	 * @return true, if {@link CreateStoreBufferGraphWizard#pathToInputFile} ends with the given file extension, false if not
	 */
	private boolean doesPathToInputFileHasGivenFileExtenion(String fileExtension){
		return pathToInputFile.endsWith("." + fileExtension);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.userSelection = selection;
	}

	public String getMessageForUser(){
		return messageForUser;
	}

	public boolean hasFoundError(){
		return foundError;
	}

	public boolean hasFoundWarning(){
		return foundWarning;
	}
}