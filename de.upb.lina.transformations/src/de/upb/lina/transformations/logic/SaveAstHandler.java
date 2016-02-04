package de.upb.lina.transformations.logic;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;

import de.upb.lina.transformations.Activator;
import de.upb.llvm_parser.llvm.LlvmPackage;

/**
 * This is a handler class for the Save AST menu extension button. It generates and saves the according ast file 
 * of a given .s file.
 * 
 * @author Alexander Hetzer
 *
 */
public class SaveAstHandler extends AbstractHandler {
	private Shell shell;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// obtain shell
		shell = HandlerUtil.getActiveShellChecked(event);
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		// Check for a proper selection
		if (selection != null & selection instanceof IStructuredSelection)
		{
			// iterate over selected objects
			IStructuredSelection structSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structSelection.iterator();
			while (iterator.hasNext())
			{
				Object element = iterator.next();

				// Check if the current selected object is a file
				if (element instanceof IFile)
				{
					IFile file = (IFile) element;
					
					//ensure LLVM is registered
					LlvmPackage.eINSTANCE.eClass();
					
					SaveAsDialog sad = new SaveAsDialog(shell);
					
					//see if we can get the old llvm file 
					IWorkspace workspace= ResourcesPlugin.getWorkspace();    
					IPath llvmFilePath = new Path(file.getLocation().toPortableString() + ".llvm");
					IFile oldLLVMFile= workspace.getRoot().getFileForLocation(llvmFilePath);
					
					//if we found it, let it be overwritten
					if(oldLLVMFile != null){
						sad.setOriginalFile(oldLLVMFile);
					}else{
						sad.setOriginalName(file.getName() + ".llvm");
					}
					sad.open();

					IPath filePath = sad.getResult();
					if (filePath == null)
					{
						Activator.logError("An error occured while saving parse result",null);
						return null;
					}

					Resource content = parseFile(file);
					if(content == null)
					{
						Activator.logError("An error occured while saving parse result",null);
						return null;
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
						Activator.logError("An error occured while saving parse result",e);
					}
					
				}else{
					Activator.logError("An error occured while trying to parse the file.", null);
				}
			}
		}else{
			MessageDialog.openError(shell, "Wrong Selection", "Please select a file with .s extension");
		}
		return null;
	}
	
	/**
	 * Passes the given file to the LLVM parser and tries to save the resulting llvm file. 
	 * Displays an error message to the user incase the .s file contans errors.
	 * 
	 * @param currentShell 
	 * @param file
	 * @return
	 */
	private Resource parseFile(IFile file)
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
				MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION | SWT.YES | SWT.NO);
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

}
