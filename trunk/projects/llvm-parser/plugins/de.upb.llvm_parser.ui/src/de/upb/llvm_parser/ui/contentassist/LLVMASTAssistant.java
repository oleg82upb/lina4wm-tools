package de.upb.llvm_parser.ui.contentassist;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Collections;
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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import de.upb.llvm_parser.parser.antlr.LLVMParser;
import de.upb.llvm_parser.ui.LLVMUtil;
import de.upb.llvm_parser.ui.internal.LLVMActivator;

/**
 * @author Thomas Haarhoff (thha@mail.upb.de)
 * 
 */
public class LLVMASTAssistant extends LLVMParser implements
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
				saveAstUtil((IFile) last, window);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param llvmFile
	 * @param window
	 * Saves the parsed Model of llvmFile to a serialized llvm-File containing the AST of the Model. 
	 */
	public void saveAstUtil(IFile llvmFile, IWorkbenchWindow window) {
		/* Dialog for target file location */
		SaveAsDialog sad = new SaveAsDialog(window.getShell());
		sad.setOriginalName(llvmFile.getName());
		sad.open();
		String location = sad.getResult().toOSString();

		/* Prepare file for parser */
		String content;
		try {
			content = convertStreamToString((llvmFile).getContents());

			StringReader reader = new StringReader(content);

			/* Parser invokation */
			IParser parser = LLVMUtil.getLLVMParser();
			IParseResult ip = parser.parse(reader);
			if (ip.getSyntaxErrors().iterator().hasNext()) {
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

			/* Save the AST here */
			EObject ast = ip.getRootASTElement();
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource(URI
					.createFileURI(location));
			resource.getContents().add(ast);
			resource.save(Collections.EMPTY_MAP);
			refreshWorkspace();
		} catch (CoreException | IOException e) {
			System.out.println("Error on converting File-content to String");
			e.printStackTrace();
		}
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void selectionChanged(IAction action, ISelection selection) {
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
