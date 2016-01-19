package de.upb.lina.transformations.logic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.lina.cfg.tools.checks.LIWDCPropertyChecker;
import de.upb.lina.cfg.tools.checks.LWFPropertyChecker;
import de.upb.lina.cfg.tools.checks.PropertyCheckerManager;
import de.upb.lina.cfg.tools.checks.UnsupportedInstructionPropertyChecker;
import de.upb.lina.cfg.tools.strategies.PSOGraphGenerator;
import de.upb.lina.cfg.tools.strategies.SCGraphGenerator;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.Constants;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;

public class CreateAllHandler extends AbstractHandler
{
	IFile file = null;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		// Check for a proper selection
		if (selection != null & selection instanceof IStructuredSelection)
		{

			// obtain shell
			Shell shell = HandlerUtil.getActiveShellChecked(event);

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
					LLVM ast = createAstFromLLVM(shell, file);
					// check if everything worked out
					if (ast == null)
					{
						return null;
					}

					// ==generate all cfgs==
					if (!doesUserAbortAsOfErrors(shell, ast))
					{
						List<ControlFlowDiagram> cfgs = null;
						cfgs = createCFGFromAst(CFGConstants.SC, ast, shell);
						createTransformations(cfgs, CFGConstants.SC);
						cfgs = createCFGFromAst(CFGConstants.TSO, ast, shell);
						createTransformations(cfgs, CFGConstants.TSO);
						cfgs = createCFGFromAst(CFGConstants.PSO, ast, shell);
						createTransformations(cfgs, CFGConstants.PSO);
					}
				}
			}
		}
		return null;
	}

	private void createTransformations(List<ControlFlowDiagram> cfgs, int mm )
	{
		TransformationOperation wmo = null;
		Map<String, String> oldToNewCfgName = new HashMap<String, String>();
		for (ControlFlowDiagram cfg : cfgs)
		{
			oldToNewCfgName.put(cfg.getName(), cfg.getName().replaceAll("@_", "").replaceAll("@", ""));
		}

		// Do kiv transformations
		int[] kivTransformationTypes = { Constants.TRANSFORMATION_TYPE_KIV_GLOBAL,
				Constants.TRANSFORMATION_TYPE_KIV_LOCAL };
		String[] kivTransformationTypeNames = { "kiv_global", "kiv_local" };

		for (int i = 0; i < kivTransformationTypes.length; i++)
		{
			int transformationType = kivTransformationTypes[i];
			String transformationTypeName = kivTransformationTypeNames[i];
			String[] kivBases = { Constants.INT, Constants.NAT };
			for (String kIVBasis : kivBases)
			{
				Configuration config = new Configuration(cfgs, kIVBasis, oldToNewCfgName);
				config.setTransformationType(transformationType);
				wmo = new TransformationOperation(createFolder(mm, transformationTypeName + "_" + kIVBasis) , "", "", config);
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
		int[] promelaTransformationTypes = { Constants.TRANSFORMATION_TYPE_PROMELA,
				Constants.TRANSFORMATION_TYPE_OPERATIONAL_PROMELA };
		String[] promelaTransformationTypeNames = { "promela", "operational_promela" };
		for (int i = 0; i < promelaTransformationTypes.length; i++)
		{
			int transformationType = promelaTransformationTypes[i];
			String transformationTypeName = promelaTransformationTypeNames[i];
			Configuration config = new Configuration(cfgs, Constants.INT, oldToNewCfgName);
			config.setTransformationType(transformationType);
			wmo = new TransformationOperation(createFolder(mm, transformationTypeName),
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
	
	
	private String createFolder(int mm, String subfolder)
	{
		try
		{
			IPath p = null;
			IPath pr = null;
			if (mm == CFGConstants.SC)
			{
				p = file.getParent().getLocation().append("SC").append(subfolder);
				pr = file.getFullPath().removeLastSegments(1).append("SC").append(subfolder);
			} else if (mm == CFGConstants.TSO)
			{
				p = file.getParent().getLocation().append("TSO").append(subfolder);
				pr = file.getFullPath().removeLastSegments(1).append("SC").append(subfolder);
			} else if (mm == CFGConstants.PSO)
			{
				p = file.getParent().getLocation().append("PSO").append(subfolder);
				pr = file.getFullPath().removeLastSegments(1).append("SC").append(subfolder);
			} else
			{
				p = file.getParent().getLocation().append("UNKNOWN").append(subfolder);
				pr = file.getFullPath().removeLastSegments(1).append("SC").append(subfolder);
			}

			p.toFile().mkdirs();
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		
			return pr.toPortableString();

		} catch (CoreException e)
		{
			Activator.logError(e.getMessage(), e);
			return null;
		}
	}



	private List<ControlFlowDiagram> createCFGFromAst(int memoryModel, LLVM ast, Shell shell)
	{
		List<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();
		// generating cfg for each function
		Iterator<AbstractElement> i = ast.getElements().iterator();
		while (i.hasNext())
		{
			AbstractElement e = i.next();
			if (e instanceof FunctionDefinition)
			{
				FunctionDefinition function = (FunctionDefinition) e;
				if (function.getBody() != null)
				{
					IGraphGenerator generator = null;
					if (memoryModel == CFGConstants.SC)
					{
						generator = new SCGraphGenerator(function);
					} else if (memoryModel == CFGConstants.TSO)
					{
						generator = new TSOGraphGenerator(function);
					} else if (memoryModel == CFGConstants.PSO)
					{
						generator = new PSOGraphGenerator(function);
					} else
					{
						throw new RuntimeException("Memory model selection not supported");
					}

					list.add(generator.createGraph());
					if (generator.getWarnings() != null)
					{
						CFGActivator.logWarning(generator.getWarnings(), null);
					}
				}
			}
		}
		return list;
	}

	/**
	 * Returns true, if the user wants to abort the transformation, false if not
	 * 
	 * @param model
	 * @param errors
	 * @param warnings
	 * @param shell
	 * @return
	 */
	private boolean doesUserAbortAsOfErrors(Shell shell, LLVM ast)
	{
		// Setup checker and register checkers
		PropertyCheckerManager manager = new PropertyCheckerManager();
		manager.registerPropertyChecker(new LIWDCPropertyChecker(ast));
		manager.registerPropertyChecker(new LWFPropertyChecker(ast));
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

			MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION | SWT.YES | SWT.NO);
			messageBox.setMessage(message);
			messageBox.setText("Problems");
			if (messageBox.open() == SWT.NO)
			{
				Activator.log(IStatus.INFO, "User aborted creation of all transformations.", null);
				return true;
			}
		}
		return false;
	}

	private LLVM createAstFromLLVM(Shell currentShell, IFile file)
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
				MessageBox messageBox = new MessageBox(currentShell, SWT.ICON_QUESTION | SWT.YES | SWT.NO);
				messageBox.setMessage("There are errors located on selected file.\n"
						+ "Do really want to save the AST file?");
				messageBox.setText("Syntax Errors");
				if (messageBox.open() == SWT.NO)
				{
					Activator.log(IStatus.INFO, "User aborted creation of all transformations.", null);
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

}
