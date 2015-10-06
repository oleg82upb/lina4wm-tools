package de.upb.lina.cfg.tools.wizards;

import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.xtext.util.PolymorphicDispatcher.WarningErrorHandler;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.CreateGraphOperation;
import de.upb.lina.cfg.tools.checks.AstHolder;
import de.upb.lina.cfg.tools.checks.LIWDCPropertyChecker;
import de.upb.lina.cfg.tools.checks.LWFPropertyChecker;
import de.upb.lina.cfg.tools.checks.PropertyCheckerManager;
import de.upb.lina.cfg.tools.strategies.PreComputationChecker;
import de.upb.llvm_parser.llvm.FunctionDefinition;
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
	private Object astlocation;
	private boolean containsLoopWithoutFence;
	private boolean containsLoadsInWriteDefChains;
	private String funcWithLoadsInWDC;
	
	private boolean myCanFinish;


	/**
	 * Constructor for NewCfgWizard.
	 */
	public NewCfgWizard() {
		super();
		setNeedsProgressMonitor(true);
		myCanFinish = false;
	}

	/**
	 * 
	 * @param ast
	 * @return false if we are not allowed to finish the page
	 */
	private void performChecks(LLVM ast, boolean result){
		PropertyCheckerManager manager = new PropertyCheckerManager();
		
		addPropertyCheckers(ast, manager);
		
		manager.performChecks();
		if(manager.foundError()){
			result = false;
			page.setErrorMessage(" Problems were found in the specified program. Click 'next' for more details.");
		}else if(manager.foundWarning()){
			page.setMessage(" Warnings encountered while checking the program. Click 'next' for more details.", WizardPage.WARNING);
			result = true;
		}
		
		warningPage.setWarningMessages(manager.getWarningMessages());
		warningPage.setErrorMessages(manager.getErrorMessages());
		
	}

	private void addPropertyCheckers(LLVM ast, PropertyCheckerManager manager) {
		new LIWDCPropertyChecker(ast, manager);
		new LWFPropertyChecker(ast, manager);
	}


	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new SelectionPage(selection);
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
				LLVM ast = AstHolder.loadAst(astLocation);
				if(ast == null){
					myCanFinish = false;
				}else{
					performChecks(ast, myCanFinish);
				}
			}
			return myCanFinish;
		}
		return true;
	}

//		@Override
//		public boolean canFinish()
//		{
//	
//			if (!super.canFinish())
//			{
//				return false;
//			}
//			try
//			{
//				if (page.getMemoryModelSelection() > CFGConstants.SC)
//				{
//					if (astlocation == null || !astlocation.equals(page.getAstLocation()))
//					{
//						astlocation = page.getAstLocation();
//						PreComputationChecker checker = new PreComputationChecker(page.getAstLocation());
//						containsLoopWithoutFence = checker.checkforLoopWithoutFence();
//						if(!containsLoopWithoutFence)
//						{
//							containsLoadsInWriteDefChains = checker.checkForLoadsInWriteDefChains();
//							List<FunctionDefinition> functions = checker.getFunctions();
//							funcWithLoadsInWDC = "";
//							for (int i = 0; i < functions.size(); i++)
//							{
//								funcWithLoadsInWDC = funcWithLoadsInWDC.concat(functions.get(i).getAddress().getName() + " ");
//							}
//						}
//					}
//					if (containsLoopWithoutFence)
//					{
//						page.setErrorMessage("The selected Ast-File contains a loop without fence");
//						return false;
//					}
//	
//					if (containsLoadsInWriteDefChains) {
//						page.setMessage("For some reads in function " + funcWithLoadsInWDC
//								+"it cannot be statically determined whether they are early reads or not.", 2);
//					}
//				}
//	
//			} catch (InterruptedException e)
//			{
//				CFGActivator.logError(e.getMessage(), e);
//				return false;
//			}
//			return true;
//		}

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