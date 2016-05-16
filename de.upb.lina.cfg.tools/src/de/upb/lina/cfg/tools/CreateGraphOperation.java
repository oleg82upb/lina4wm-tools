package de.upb.lina.cfg.tools;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.strategies.PSOGraphGenerator;
import de.upb.lina.cfg.tools.strategies.SCGraphGenerator;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class CreateGraphOperation extends WorkspaceModifyOperation {

	private LLVM ast = null;
	private String astLocation;
	private Path cfgpath = null;
	private int memoryModel;
	private ArrayList<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();

	public CreateGraphOperation(String astLocation, String path,
			int reordering, Shell shell) {
		super();
		this.astLocation = astLocation;
		cfgpath = new Path(path);
		this.memoryModel = reordering;
	}

	private LLVM loadAst() {
		if (ast != null) {
			return ast;
		}

		LlvmPackage.eINSTANCE.getNsURI();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path astpath = new Path(astLocation);
		URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
		Resource llvmResource = resourceSet.getResource(uri, true);
		this.ast = (LLVM) llvmResource.getContents().get(0);
		EcoreUtil.resolveAll(this.ast);
		return ast;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		if (loadAst() == null) {
			throw new RuntimeException("Could not load the LLVM AST model.");
		}

		// generating cfg for each function
		Iterator<AbstractElement> i = ast.getElements().iterator();
		while (i.hasNext()) {
			AbstractElement e = i.next();
			if (e instanceof FunctionDefinition) {
				FunctionDefinition function = (FunctionDefinition) e;
				if (function.getBody() != null) {
					IGraphGenerator generator = null;
					if (memoryModel == CFGConstants.SC) {
						generator = new SCGraphGenerator(function);
					} else if (memoryModel == CFGConstants.TSO) {
						generator = new TSOGraphGenerator(function);
					} else if (memoryModel == CFGConstants.PSO) {
						generator = new PSOGraphGenerator(function);
					} else {
						throw new RuntimeException(
								"Memory model selection not supported");
					}

					list.add(generator.createGraph());
				}
			}
		}

		try {
			// store resulting cfg
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource(URI.createURI(cfgpath
					.toPortableString()));

			for (ControlFlowDiagram cfg : list) {
				EcoreUtil.resolveAll(cfg);
				resource.getContents().add(cfg);
			}

			resource.save(Collections.EMPTY_MAP);
			refreshWorkspace(monitor);

			for (ControlFlowDiagram cfg : list) {
				CFGActivator.log(IStatus.INFO, "Generated " + cfg.getName()
						+ " with " + cfg.getLocations().size() + " nodes and "
						+ cfg.getTransitions().size() + " edges.", null);
			}

		} catch (IOException e) {
			CFGActivator.logError(e.getMessage(), e);
		} catch (IllegalArgumentException e) {
			CFGActivator.log(IStatus.INFO,
					"User stopped the transformation due to a warning.", e);
		}
	}

	private void refreshWorkspace(IProgressMonitor monitor)
			throws CoreException {
		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		for (int i = 0; i < iProjects.length; i++) {
			iProjects[i].refreshLocal(0, monitor);
		}
	}

}