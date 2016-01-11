package de.upb.llvm_parser.ui.contentassist;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;

import de.upb.llvm_parser.llvm.LlvmPackage;
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
	public void run(IAction action)
	{
		Shell currentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		//ensure LLVM is registered
		LlvmPackage.eINSTANCE.eClass();
		
		if (this.selection == null || this.selection instanceof IFile)
		{
			MessageDialog.openError(currentShell, "Wrong Selection", "Please select a file with .s extension");
			return;
		}

		IFile file = (IFile) this.selection.getFirstElement();
		SaveAsDialog sad = new SaveAsDialog(currentShell);
		sad.setOriginalFile(file);
		sad.setOriginalName(file.getName() + ".llvm");
		sad.open();

		IPath filePath = sad.getResult();
		if (filePath == null)
		{
			return;
		}

		Resource content = parseFile(currentShell, file);
		if(content == null)
		{
			return;
		}
		
		EObject ast = content.getContents().get(0);
		EcoreUtil.resolveAll(ast);
		
		ResourceSetImpl rset = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(filePath.toString(), true);
		Resource newResource = rset.createResource(uri, "llvm");
		rset.getResources().add(newResource);
		newResource.getContents().add(ast);

		try
		{
			newResource.save(Collections.EMPTY_MAP);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (Exception e)
		{
			LLVMUtil.logError(e, "An error occured while saving parse result");
		}
	}

	private Resource parseFile(Shell currentShell, IFile file)
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
						+ "Do really want to save the AST-file?");
				messageBox.setText("Syntax Errors");
				if (messageBox.open() == SWT.NO)
				{
					return null;
				}
			}
		}
		return resource;
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
