package de.upb.lina.cfg.tools.wizards;

import java.util.List;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.XMLMemento;

import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.PreComputationChecker;
import de.upb.lina.cfg.tools.CreateGraphOperation;
import de.upb.lina.cfg.tools.SCUtil;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

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
	private IWorkspace iw = ResourcesPlugin.getWorkspace();
	// private IPath root = iw.getRoot().getLocation();
	public final static String MEMENTO__KEY = "CFGSelection";
	private String astlocation;
	private boolean containsEarlyReads = false;
	private boolean containsloopWithoutFence = false;
	private boolean interrupted = false;

	/**
	 * Constructor for NewCfgWizard.
	 */
	public NewCfgWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	protected synchronized void saveState() {
		XMLMemento memento = XMLMemento.createWriteRoot(MEMENTO__KEY);
		IMemento child = memento.createChild(MEMENTO__KEY);
		writeSelectionState(child);
		CFGActivator.saveMementoToFile(memento);
	}

	private void writeSelectionState(IMemento memento) {
		memento.putString("astloc", page.getAstLocation());
		memento.putString("container", page.getContainerName());
		memento.putString("newfile", page.getFileName());
		memento.putInteger("reordering", page.getReordering());
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
	public boolean performFinish() {

		this.saveState();
		CreateGraphOperation cgo = new CreateGraphOperation(page.getAstLocation(),
				(page.getContainerName() + "/" + page.getFileName()), page.getReordering(), this.getShell());

		try {
			getContainer().run(true, false, cgo);
		} catch (Exception e) {
			if (!cgo.finishedWithoutWarnings()) {
				MessageDialog
						.openWarning(
								getShell(),
								"Warning",
								"The graph may contain loops without fences or flush transitions after return statement.\n Please check the error log for more details.");
			} else {
				CFGActivator.logError(e.getMessage(), e);
			}
		}

		return true;
	}

	@Override
	public boolean canFinish() {

		if (!super.canFinish()) {
			return false;
		}
		try {
			if (page.getReordering() == 1) {
				if (astlocation == null || !astlocation.equals(page.getAstLocation())) {
					astlocation = page.getAstLocation();
					PreComputationChecker checker = new PreComputationChecker(page.getAstLocation(),
							page.getReordering());
					containsEarlyReads = checker.checkforEarlyReads();
					containsloopWithoutFence = checker.checkforLoopWithoutFence();

				}
				if (containsloopWithoutFence && astlocation.equals(page.getAstLocation())) {
					page.setErrorMessage("The selected Ast-File contains a loop without fence");
					return false;
				}
				if (containsEarlyReads)
					page.setMessage("The selected Ast-File contains possible early reads.", 2);
			}

		} catch (InterruptedException e) {
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