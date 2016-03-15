package de.upb.lina.transformations.logic;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.checks.LoadsInWriteDefChainPropertyChecker;
import de.upb.lina.cfg.tools.checks.WritingLoopWithoutFencePropertyChecker;
import de.upb.lina.cfg.tools.checks.PropertyCheckerManager;
import de.upb.lina.cfg.tools.checks.UnsupportedInstructionPropertyChecker;
import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.Constants;
import de.upb.llvm_parser.llvm.LLVM;

/**
 * This is a handler class for the Create All Transformations menu extension button. It generates all transformations
 * for the selected llvm files and saves them in according folders. The according asts and cfgs are computed on the fly
 * but not explicitly saved. 
 * 
 * @author Alexander Hetzer
 *
 */
public class CreateAllHandler extends AbstractHandler
{
	private static final int[] TRANSFORMATION_TYPES_KIV = { Constants.TRANSFORMATION_TYPE_KIV_GLOBAL,
		Constants.TRANSFORMATION_TYPE_KIV_LOCAL };
	private static final String[] TRANSFORMATION_TYPE_NAMES_KIV = { "kiv_global", "kiv_local" };
	private static final String[] KIV_BASES = { Constants.KIV_BASIS_INT, Constants.KIV_BASIS_NAT };

	private static final int[] TRANSFORMATION_TYPES_PROMELA = { Constants.TRANSFORMATION_TYPE_PROMELA,
		Constants.TRANSFORMATION_TYPE_OPERATIONAL_PROMELA };
	private static final String[] TRANSFORMATION_TYPE_NAMES_PROMELA = { "promela", "operational_promela" };

	private IFile file = null;
	private Shell shell = null;
	private IProgressMonitor monitor = null;
	
	private boolean userContinues = true;
	
	/**
	 * Creates all transformations for the selected llvm file. 
	 */

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		// Check for a proper selection
		if (selection != null & selection instanceof IStructuredSelection)
		{

			// obtain shell
			shell = HandlerUtil.getActiveShellChecked(event);
			doExecute(selection);

		}
		return null;
	}

	/**
	 * Execution wrapper method in order to let the transformation be run by a job instance.
	 * This is needed to get access to a progress monitor.
	 * 
	 * @param selection selected elements
	 */
	public void doExecute(ISelection selection){
		Job job = new Job("Create All Transformations") {

			@Override
			protected IStatus run(IProgressMonitor mon) {
				monitor = mon;
				try{
					monitor.beginTask("Create all transformations.", 7);
					// iterate over selected objects
					IStructuredSelection structSelection = (IStructuredSelection) selection;
					Iterator<?> iterator = structSelection.iterator();
					while (iterator.hasNext())
					{
						Object element = iterator.next();

						// Check if the current selected object is a file
						if (element instanceof IFile)
						{
							file = (IFile) element;

							// save ast first
							LLVM ast = createAstFromLLVM(file);
							monitor.worked(1);
							// check if everything worked out
							if (ast == null)
							{
								monitor.done();
								return Status.CANCEL_STATUS;
							}

							// generate all cfgs and transformations
							List<ControlFlowDiagram> cfgs = null;
							if (!doesUserAbortAsOfErrors(ast, CFGConstants.SC))
							{
								cfgs = TransformationUtil.createCFGFromAst(CFGConstants.SC, ast);
								monitor.worked(1);
								createTransformations(cfgs);
								monitor.worked(1);
							}
							if (!doesUserAbortAsOfErrors(ast, CFGConstants.TSO))
							{
								cfgs = TransformationUtil.createCFGFromAst(CFGConstants.TSO, ast);
								monitor.worked(1);
								createTransformations(cfgs);
								monitor.worked(1);
							}
							if (!doesUserAbortAsOfErrors(ast, CFGConstants.PSO))
							{
								cfgs = TransformationUtil.createCFGFromAst(CFGConstants.PSO, ast);
								monitor.worked(1);
								createTransformations(cfgs);
								monitor.worked(1);
							}
							
						}
					}
				}finally{
					monitor.done();
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
	}

	/**
	 * Creates all transformations for the list of current cfgs. Note that all cfgs in the list 
	 * need to have the same memory model.
	 * @param cfgs list of cfgs to create transformations for
	 */
	private void createTransformations(List<ControlFlowDiagram> cfgs)
	{
		//make sure we have something to transform
		if(cfgs.isEmpty()){
			Activator.logError("Transformation could not be done as of missing control flow diagrams.", null);
			return;
		}

		int memoryModel = cfgs.get(0).getMemoryModel();
		TransformationOperation wmo = null;

		//Create default function name map
		Map<String, String> oldToNewCfgName = new HashMap<String, String>();
		for (ControlFlowDiagram cfg : cfgs)
		{
			oldToNewCfgName.put(cfg.getName(), cfg.getName().replaceAll("@_", "").replaceAll("@", ""));
		}


		// Do kiv transformations
		for (int i = 0; i < TRANSFORMATION_TYPES_KIV.length; i++)
		{
			int transformationType = TRANSFORMATION_TYPES_KIV[i];
			String transformationTypeName = TRANSFORMATION_TYPE_NAMES_KIV[i];
			for (String kIVBasis : KIV_BASES)
			{
				TransformationConfiguration config = new TransformationConfiguration(cfgs, kIVBasis, oldToNewCfgName, transformationType);
				wmo = new TransformationOperation(createFolder(memoryModel, transformationTypeName + "_" + kIVBasis) , "", "", config);
				try
				{
					wmo.run(new NullProgressMonitor());
				} catch (InvocationTargetException | InterruptedException e)
				{
					Activator.logError(e.getMessage(), e);
				}
			}

		}

		// Do promela transformations
		for (int i = 0; i < TRANSFORMATION_TYPES_PROMELA.length; i++)
		{
			int transformationType = TRANSFORMATION_TYPES_PROMELA[i];
			String transformationTypeName = TRANSFORMATION_TYPE_NAMES_PROMELA[i];
			TransformationConfiguration config = new TransformationConfiguration(cfgs,oldToNewCfgName, transformationType);
			wmo = new TransformationOperation(createFolder(memoryModel, transformationTypeName),
					transformationTypeName + "_" + file.getName(), ".pml", config);
			try
			{
				wmo.run(new NullProgressMonitor());
			} catch (InvocationTargetException | InterruptedException e)
			{
				Activator.logError(e.getMessage(), e);
			}

		}
	}


	/**
	 * Creates a folder (and all parent folder) for storing the resulting transformations. Folders are 
	 * created depending on the location of the original llvm file and the transformation parameters.
	 * Make sure to return the workspace relative path to the created folder!
	 * 
	 * @param mm memoryModel to create folder for
	 * @param subfolder subfolder path implicitly specified by the transformation parameters
	 * @return the workspace relative path of the created folder
	 */
	private String createFolder(int mm, String subfolder)
	{
		try
		{
			String memoryModelName = "";

			switch(mm){
			case CFGConstants.SC: 
				memoryModelName = "SC";
				break;
			case CFGConstants.TSO:
				memoryModelName = "TSO";
				break;
			case CFGConstants.PSO:
				memoryModelName = "PSO";
				break;
			default:
				memoryModelName = "UNKNOWN";
				break;
			}

			IPath p = file.getParent().getLocation().append(memoryModelName).append(subfolder);
			IPath pr = file.getFullPath().removeLastSegments(1).append(memoryModelName).append(subfolder);

			//use absolut paths to make directories
			p.toFile().mkdirs();
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);

			//ensure to return a workspace relative path
			return pr.toPortableString();

		} catch (CoreException e)
		{
			Activator.logError(e.getMessage(), e);
			return null;
		}
	}


	/**
	 * Checks for problems and errors in the given ast and reports them to the user. The user is asked if he
	 * wants to continue or abort the transformation, if errors exist.
	 * 
	 * @param ast ast to check for errors and problems
	 * @param semantic semantic to check on
	 * @return true, if errors exist and use decided to abort transformation, false, if no errors exist or
	 * user decided not to abort the transformation although errors exist
	 */
	private boolean doesUserAbortAsOfErrors(LLVM ast, int semantic)
	{
		// Setup checker and register checkers
		PropertyCheckerManager manager = new PropertyCheckerManager(semantic);
		manager.registerPropertyChecker(new LoadsInWriteDefChainPropertyChecker(ast));
		manager.registerPropertyChecker(new WritingLoopWithoutFencePropertyChecker(ast));
		manager.registerPropertyChecker(new UnsupportedInstructionPropertyChecker(ast));

		manager.performChecks();

		List<String> errors = manager.getErrorMessages();
		List<String> warnings = manager.getWarningMessages();

		if (!errors.isEmpty() || !warnings.isEmpty())
		{
			String message = "Encountered problems in cfg creation. \n";
			message += "---- \n";
			if (!errors.isEmpty())
			{
				message += "Errors: \n";
				for (String error : errors)
				{
					message += error + " \n";
					Activator.logError("Error in cfg creation: " + error, null);
				}
				message += "---- \n";
			}
			if (!warnings.isEmpty())
			{
				message += "Warnings: \n";
				for (String warning : warnings)
				{
					message += warning + " \n";
					Activator.logWarning("Warning in cfg creation: " + warning, null);
				}
				message += "---- \n";
			}
			message += "Do you want to continue the transformation?";

			boolean abortTransformation = !askUserToContinue(message, "Problems");
			return abortTransformation;
		}
		return false;
	}

	/**
	 * Creates the according ast for a given (llvm) file. 
	 * 
	 * @param file llvm file to create ast for
	 * @return created ast, if no problems occurred - null, if error occurred during ast creation, 
	 */
	private LLVM createAstFromLLVM(IFile file)
	{
		ResourceSetImpl xtextResourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(((IFile) file).getFullPath().toString());
		Resource resource = xtextResourceSet.getResource(uri, true);
		if (resource instanceof LazyLinkingResource)
		{
			LazyLinkingResource llr = (LazyLinkingResource) resource;
			Iterator<INode> i = llr.getParseResult().getSyntaxErrors().iterator();
			if (i.hasNext())
			{
				boolean continueTransformation = askUserToContinue("There are errors located on selected file.\n" + 
						"Do really want to save the AST file?", "Syntax Errors");
				if(!continueTransformation){
					return null;
				}
			}
		}

		EObject ast = resource.getContents().get(0);
		EcoreUtil.resolveAll(ast);
		if (!(ast instanceof LLVM))
		{
			Activator.log(IStatus.ERROR, "Unexpected problem while creating ast file.", null);
			return null;
		}
		return (LLVM) ast;
	}

	/**
	 * Opens a @see org.eclipse.swt.widgets.MessageBox instance displaying the given message and text. If the users
	 * answers with no, a transformation abortion by the user is logged.
	 * 
	 * @param message question to be displayed
	 * @param text heading of the box
	 * @return true, if user hits yes - false, if not
	 */
	private boolean askUserToContinue(String message, String text){
		userContinues = true;
		Runnable runnable = new Runnable() {
            public void run() {
            	MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION | SWT.YES | SWT.NO);
    			messageBox.setMessage(message);
    			messageBox.setText(text);
    			if (messageBox.open() == SWT.NO)
    			{
    				Activator.log(IStatus.INFO, "User aborted creation of all transformations.", null);
    				userContinues = false;
    			}
            }
         };
		Display.getDefault().syncExec(runnable);
		return userContinues;
	}

}
