package de.upb.lina.cfg.tools;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.MultiTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;

public class CreateGraphOperation extends WorkspaceModifyOperation {

	private LLVM ast = null;
	private Path cfgpath = null;
	private int reordering;
	private ArrayList<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();
	private WarningLogger warningLogger = new WarningLogger();

	public CreateGraphOperation(EObject ast, String path, int reordering) {
		super();
		if (ast instanceof LLVM)
			this.ast = (LLVM) ast;
		cfgpath = new Path(path);
		this.reordering = reordering;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		if (monitor == null)
			monitor = new NullProgressMonitor();
		if (ast == null) {
			throw new InterruptedException(
					"Now specified LLVM Object inside the ast.");
		}

		try {
			int a_elem = ast.getElements().size();
			
			// generating cfg for each function
			for (int i = 0; i < a_elem; i++) {
				if (ast.getElements().get(i) instanceof FunctionDefinitionImpl) {
					if (((FunctionDefinition) ast.getElements().get(i))
							.getBody() != null)
						if(reordering == 1){
							ReorderingUtil reord = new ReorderingUtil();
								list.add(reord.createReachibilityGraph((FunctionDefinition) ast
									.getElements().get(i), warningLogger));
						}else{
							SCUtil sc = new SCUtil();
							list.add(sc.createCFG((FunctionDefinition) ast
									.getElements().get(i)));
						}
				}
			}
			
			if(reordering == 1){
				if(warningLogger.displayWarning()){
					throw new IllegalArgumentException();
				}
			}

			// store resulting cfg
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource(URI.createURI(cfgpath
					.toPortableString()));

			for (ControlFlowDiagram cfg : list) {
				EcoreUtil.resolveAll(cfg);
				resource.getContents().add(cfg);
			}

			resource.save(Collections.EMPTY_MAP);
			refreshWorkspace();

		} catch (IOException e) {
			CFGActivator.logError(e.getMessage(), e);
		} catch(IllegalArgumentException e){
			CFGActivator.log(1, "User stopped the transformation due to a warning.", e);
		}

	}

	private void refreshWorkspace() {
		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		for (int i = 0; i < iProjects.length; i++)
			try {
				iProjects[i].refreshLocal(0,
						new org.eclipse.core.runtime.NullProgressMonitor());
			} catch (CoreException e) {
				CFGActivator.logError(e.getMessage(), e);
			}
	}

	private String valueToString(Value value) {
		if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
			Constant constant = (Constant) value;
			return constant.getValue().toString();
		}

		if (value instanceof AddressUseImpl) {
			AddressUseImpl aui = (AddressUseImpl) value;
			return aui.getAddress().getName();
		}
		return value.toString();
	}
}