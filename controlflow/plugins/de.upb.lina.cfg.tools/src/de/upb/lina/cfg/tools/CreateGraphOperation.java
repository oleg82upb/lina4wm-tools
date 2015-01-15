package de.upb.lina.cfg.tools;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;

public class CreateGraphOperation extends WorkspaceModifyOperation {

	private LLVM ast = null;
	private String astLocation;
	private Shell shell;
	private boolean warningsOccured = false;
	private Path cfgpath = null;
	private int reordering;
	private ArrayList<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();

//	public CreateGraphOperation(EObject ast, String path, int reordering) {
//		super();
//		if (ast instanceof LLVM)
//			this.ast = (LLVM) ast;
//		cfgpath = new Path(path);
//		this.reordering = reordering;
//	}
	
	public CreateGraphOperation(String astLocation, String path, int reordering, Shell shell) {
		super();
		this.astLocation = astLocation;
		cfgpath = new Path(path);
		this.reordering = reordering;
	}
	
	public boolean finishedWithoutWarnings()
	{
		return !warningsOccured;
	}
	
	private LLVM loadAst()
	{
		if(ast != null)
		{
			return ast;
		}
		
		LlvmPackage.eINSTANCE.getNsURI();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path astpath = new Path(astLocation);
		URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
		Resource llvmResource = resourceSet.getResource(uri, true);
		this.ast = (LLVM) llvmResource.getContents().get(0);
		return ast;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		if (monitor == null)
			monitor = new NullProgressMonitor();
		if (loadAst() == null) {
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
							TSOUtil reord = new TSOUtil();
								list.add(reord.createReachibilityGraph((FunctionDefinition) ast.getElements().get(i)));
								
								if(reord.getWarnings() != null)
								{
									warningsOccured = true;
									CFGActivator.logWarning(reord.getWarnings(), null);
								}
						}else{
//							SCUtilOld sc = new SCUtilOld();
							SCUtil sc2 = new SCUtil();
							list.add(sc2.createCFG((FunctionDefinition) ast
									.getElements().get(i)));
						}
				}
			}
			
//			if(reordering == 1){
//				if(warningLogger.getWarnings() != null){
//					throw new RuntimeException(warningLogger.getWarnings());
//				}
//			}

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
			CFGActivator.log(IStatus.INFO, "User stopped the transformation due to a warning.", e);
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