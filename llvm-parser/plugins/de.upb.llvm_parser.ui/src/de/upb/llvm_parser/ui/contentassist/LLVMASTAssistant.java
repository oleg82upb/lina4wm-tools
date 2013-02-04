package de.upb.llvm_parser.ui.contentassist;

import java.io.IOException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FileSelectionDialog;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.builder.resourceloader.IResourceLoader;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.ClasspathUriResolutionException;
import org.eclipse.xtext.resource.ClasspathUriUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.upb.llvm_parser.LLVMStandaloneSetup;
import de.upb.llvm_parser.parser.antlr.LLVMParser;
import de.upb.llvm_parser.ui.LLVMUtil;
import de.upb.llvm_parser.ui.internal.LLVMActivator;

/**
 * @author Thomas Haarhoff (thha@mail.upb.de)
 * 
 */
public class LLVMASTAssistant extends XtextResource implements
		IObjectActionDelegate {
	public LLVMASTAssistant() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();

			ISelection selection = window.getSelectionService().getSelection(
					"org.eclipse.jdt.ui.PackageExplorer");

			TreePath[] paths = ((TreeSelection) selection).getPaths();
			TreePath p = paths[0];
			Object last = p.getLastSegment();

			if (last instanceof IFile) {
				IPath ipath = ((IFile) last).getLocation();

				IWorkbenchPage page = window.getActivePage();

				IDE.openEditorOnFileStore(page, EFS.getLocalFileSystem()
						.getStore(ipath));
			}
			if(testDocument((IFile)last, window))
			{
					MessageBox messageBox = new MessageBox(window.getShell(),
							SWT.ICON_QUESTION | SWT.YES | SWT.NO);
					messageBox
							.setMessage("There are errors located on selected file.\n"
									+ "Do really want to save the AST-file?");
					messageBox.setText("Syntax Errors");
					int response = messageBox.open();
					if (response == SWT.NO) {
						System.out
								.println("Save AST abort, because of file containing errors");
						return;
					}
			}
			XtextResourceSet xtextResourceSet = new XtextResourceSet();
			URI uri = URI.createURI(((IFile)last).getFullPath().toString());
			Resource resource = xtextResourceSet.getResource(uri, true);
			EObject ast = resource.getContents().get(0);
			ResourceSet resSet = new ResourceSetImpl();
			resource = resSet.createResource(URI.createFileURI(getLocation((IFile) last, window)));
			resource.getContents().add(ast);
			EcoreUtil.resolveAll(ast);
			resource.save(Collections.EMPTY_MAP);
			refreshWorkspace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param llvmFile
	 * @param window
	 * Saves the parsed Model of llvmFile to a serialized llvm-File containing the AST of the Model. 
	 */
	private String getLocation(IFile llvmFile, IWorkbenchWindow window) {
		/* Dialog for target file location */
		SaveAsDialog sad = new SaveAsDialog(window.getShell());
		sad.setOriginalName(llvmFile.getName()+".llvm");
		sad.open();
		if(sad.getResult()==null)
			return null;
		String location = sad.getResult().toOSString();
			return location;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}
	
	private boolean testDocument(IFile llvmFile, IWorkbenchWindow window) throws CoreException {
		/* Prepare file for parser */
		String content;
			content = convertStreamToString((llvmFile).getContents());
			StringReader reader = new StringReader(content);
			/* Parser invokation */
			IParser parser = LLVMUtil.getLLVMParser();
			IParseResult ip = parser.parse(reader);
			return (ip.getSyntaxErrors().iterator().hasNext());
	}
	
	
	public static String convertStreamToString(InputStream is) {
		String st = "";
		Scanner s = new Scanner(is).useDelimiter("\\A");
		if (s.hasNext())
			st = s.next();
		return st;
	}
	
	private void refreshWorkspace() {
		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		for (int i = 0; i < iProjects.length; i++)
			try {
				iProjects[i].refreshLocal(0,
						new org.eclipse.core.runtime.NullProgressMonitor());
			} catch (CoreException e) {
				System.out
						.println("Error on refreshing Workspace - perform F5 by your own.");
				e.printStackTrace();
			}
	}
}
