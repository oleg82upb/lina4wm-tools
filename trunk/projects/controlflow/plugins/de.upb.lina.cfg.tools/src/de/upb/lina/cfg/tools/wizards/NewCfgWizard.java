package de.upb.lina.cfg.tools.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.XMLMemento;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.GraphCreationUtil;
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
	private IPath root = iw.getRoot().getLocation();
	public final static String MEMENTO__KEY = "CFGSelection";

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
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		this.saveState();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					int reordering = page.getReordering();
					String astfileloc = page.getAstLocation();

					Path astfilep = new Path(astfileloc);

					File astfile = new File(root + astfilep.toOSString());

					monitor.beginTask("Transforming LLVM to CFG...", 3);

					LlvmPackage.eINSTANCE.getNsURI();
					ResourceSet resourceSet = new ResourceSetImpl();
					Path astpath = new Path(page.getAstLocation());
					Resource llvmast = getResource(resourceSet, astpath.toOSString());
					EObject ast = llvmast.getContents().get(0);
					new GraphCreationUtil(ast, (page.getContainerName() + "/" + page.getFileName()), reordering).run(monitor);

					monitor.worked(1);
				} catch (Exception e) {
					CFGActivator.logError(e.getMessage(), e);
				} finally {
					monitor.done();
				}
			}
		};

		try {
			getContainer().run(true, false, op);
		} catch (Exception e) {
			CFGActivator.logError(e.getMessage(), e);
			MessageDialog.openError(getShell(), "Error", e.getMessage());
			return false;
		}

		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	private void doFinish(String containerName, String fileName, IProgressMonitor monitor) throws CoreException {
		// create a sample file
		int reordering = page.getReordering();
		String astfileloc = page.getAstLocation();

		Path astfilep = new Path(astfileloc);

		File astfile = new File(root + astfilep.toOSString());

		// monitor.beginTask("Creating " + fileName, 2);
		// IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		// IResource resource = root.findMember(new Path(containerName));
		// if (!resource.exists() || !(resource instanceof IContainer)) {
		// throwCoreException("Container \"" + containerName
		// + "\" does not exist.");
		// }
		// IContainer container = (IContainer) resource;
		// final IFile file = container.getFile(new Path(fileName));
		// try {
		// InputStream stream = openContentStream();
		// if (file.exists()) {
		// file.setContents(stream, true, true, monitor);
		// } else {
		// file.create(stream, true, monitor);
		// }
		// stream.close();
		// } catch (IOException e) {
		// }
		// monitor.worked(1);

		monitor.beginTask("Transforming LLVM to CFG...", 3);

		LlvmPackage.eINSTANCE.getNsURI();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path astpath = new Path(page.getAstLocation());
		Resource llvmast = getResource(resourceSet, astpath.toOSString());
		EObject ast = llvmast.getContents().get(0);
//		try {
//			new CFGWorkspaceOperation(ast, (page.getContainerName() + "/" + page.getFileName()), reordering).run(monitor);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ReflectiveOperationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		monitor.worked(1);

		// monitor.setTaskName("Opening file for editing...");
		// getShell().getDisplay().asyncExec(new Runnable() {
		// public void run() {
		// IWorkbenchPage page = PlatformUI.getWorkbench()
		// .getActiveWorkbenchWindow().getActivePage();
		// try {
		// IDE.openEditor(page, file, true);
		// } catch (PartInitException e) {
		// }
		// }
		// });

	}

	// /**
	// * We will initialize file contents with a sample text.
	// */
	//
	// private InputStream openContentStream() {
	// String contents =
	// "This is the initial file contents for *.cfg file that should be word-sorted in the Preview page of the multi-page editor";
	// return new ByteArrayInputStream(contents.getBytes());
	// }
	//
	// private void throwCoreException(String message) throws CoreException {
	// IStatus status = new Status(IStatus.ERROR, "de.upb.lina.cfg.tools",
	// IStatus.OK, message, null);
	// throw new CoreException(status);
	// }

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	// private void doit() throws IOException {
	// Bundle cfgmeta = Platform.getBundle("de.upb.lina.cfg");
	// Bundle llvmmeta = Platform.getBundle("de.upb.llvm_parser");
	// Path cfgmetapath = new Path("model/ControlFlow.ecore");
	// Path llvmmetapath = new Path("src-gen/de/upb/llvm_parser/LLVM.ecore");
	// Path astpath = new Path(page.astloc);
	// URL cfgmetaurl = FileLocator.find(cfgmeta, cfgmetapath, null);
	// URL llvmmetaurl = FileLocator.find(llvmmeta, llvmmetapath, null);
	// InputStream iscfgmeta = cfgmetaurl.openStream();
	// InputStream isllvmmeta = llvmmetaurl.openStream();
	// File f = new File(root+astpath.toOSString());
	// InputStream isast = new FileInputStream(f);
	// ResourceSet resourceSet = new ResourceSetImpl();
	//
	// EcoreUtil eu = new EcoreUtil();
	// URL fileurl = FileLocator.toFileURL(llvmmetaurl);
	// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	// "ecore", new EcoreResourceFactoryImpl());
	// URIConverter uriconverter = resourceSet.getURIConverter();
	//
	// EcoreFactory factory = EcoreFactory.eINSTANCE;
	//
	// URI u;
	// try {
	// u = URI.createURI(fileurl.toURI().toString());
	// } catch (URISyntaxException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// return;
	// }
	// Resource astmeta = resourceSet.getResource(u, true);
	// Resource ast = getResource(resourceSet, astpath.toOSString());
	// astmeta.save(System.out, Collections.EMPTY_MAP);
	// EList <EObject> list = ast.getContents();
	// Iterator it = list.iterator();
	// EObject e = ast.getContents().get(0);
	// if(e instanceof LLVM)
	// {
	// LLVM l = (LLVM) e;
	// EList<AbstractElement> a = l.getElements();
	//
	// }
	//
	//
	// ControlFlowFactory c;
	// }

	private Resource getResource(ResourceSet resourceSet, String osString) {
		URI test = URI.createPlatformResourceURI(osString, true);
		Resource r = resourceSet.getResource(test, true);
		return r;
	}
}