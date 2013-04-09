package de.upb.llvm_parser.ui.contentassist;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import de.upb.llvm_parser.ui.LLVMUtil;

/**
 * @author Thomas Haarhoff (thha@mail.upb.de)
 * 
 */
public class LLVMASTAssistant extends XtextResource implements
		IObjectActionDelegate {
	public LLVMASTAssistant() {
		super();
	}
	
	private IStructuredSelection selection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (this.selection == null || this.selection instanceof IFile) {
			MessageDialog.openError(window.getShell(), "Wrong Selection",
					"Please select a file with .s extension");
			return;
		}

		IFile file = (IFile) this.selection.getFirstElement();
 
		String loc = getLocation((IFile) file, window);
		if (loc == null)
			return;
		
		XtextResourceSet xtextResourceSet = new XtextResourceSet();
		URI uri = URI.createURI(((IFile) file).getFullPath().toString());
		Resource resource = xtextResourceSet.getResource(uri, true);
		if(resource instanceof LazyLinkingResource)
		{
			LazyLinkingResource llr = (LazyLinkingResource) resource; 
			Iterator<INode> i = llr.getParseResult().getSyntaxErrors().iterator();
			if(i.hasNext())
			{
				MessageBox messageBox = new MessageBox(window.getShell(),
						SWT.ICON_QUESTION | SWT.YES | SWT.NO);
				messageBox
						.setMessage("There are errors located on selected file.\n"
								+ "Do really want to save the AST-file?");
				messageBox.setText("Syntax Errors");
				if (messageBox.open() == SWT.NO) {
					return;
				}
			}
		}
		Resource newResource = xtextResourceSet.createResource(URI.createFileURI(loc));
		xtextResourceSet.getResources().add(newResource);
		
		EObject ast = resource.getContents().get(0);
		EcoreUtil.resolveAll(ast);
		newResource.getContents().add(ast);
		
		try {
			newResource.save(Collections.EMPTY_MAP);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (Exception e) {
			LLVMUtil.logError(e, "An error occured while saving parse result");
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
		if(selection instanceof IStructuredSelection)
		{
			this.selection = (IStructuredSelection) selection;
		}
		else {
			this.selection = null;
		}
	}
}
