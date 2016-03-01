package de.upb.lina.transformations.logic;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.transformations.Activator;
import de.upb.llvm_parser.llvm.LLVM;

/**
 * This is a handler class for the Save AST menu extension button. It generates and saves the according ast file 
 * of a given .s file.
 * 
 * @author Alexander Hetzer
 *
 */
public class SaveAstHandler extends AbstractHandler {
	
	private Shell shell;
	private SaveAsDialog saveAsDialog;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// obtain shell
		shell = HandlerUtil.getActiveShellChecked(event);
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		// Check for a proper selection
		if (selection != null & selection instanceof IStructuredSelection)
		{
			// iterate over selected objects
			IStructuredSelection structuredUserSelection = (IStructuredSelection) selection;
			Iterator<?> iteratorForStructuredUserSelection = structuredUserSelection.iterator();
			while (iteratorForStructuredUserSelection.hasNext())
			{
				Object selectedElement = iteratorForStructuredUserSelection.next();

				// Check if the current selected object is a file
				if (selectedElement instanceof IFile)
				{
					IFile selectedFile = (IFile) selectedElement;
					
					//create save as dialog
					saveAsDialog = new SaveAsDialog(shell);
					setDefaultValuesOfSaveAsDialogAccordingToSelectedFile(selectedFile);
					saveAsDialog.open();

					LLVM astParsedFromInputFile = ResourceIOUtil.createAstFromLLVM(selectedFile.getFullPath().toString());
					if(astParsedFromInputFile == null){
						MessageDialog.openError(shell, "Error parsing LLVM file", "An error occured while parsing the LLVM file. Check the error log.");
						return null;
					}
					
					IPath pathToOutputFileAst = saveAsDialog.getResult();
					
					//if user did not cancel the dialog
					if(pathToOutputFileAst != null){
						ResourceIOUtil.saveResourceToDisk(pathToOutputFileAst.toString(), CFGConstants.LLVM_FILE_EXTENSION, astParsedFromInputFile);
					}
				}else{
					Activator.logError("One or more of the selected elements is not an instance of IFile.", null);
				}
			}
		}else{
			MessageDialog.openError(shell, "Wrong Selection", "Please select a file with" + CFGConstants.S_FILE_EXTENSION + "extension");
		}
		return null;
	}

	/**
	 * Sets the default path to the output file and its name accordingly to the selected file
	 * in the SaveAsDialog.
	 * 
	 * @param selectedFile file selected by the user
	 */
	private void setDefaultValuesOfSaveAsDialogAccordingToSelectedFile(
			IFile selectedFile) {
		
		//try to get a handle to the default output ast file
		IPath defaultPathToOutputAstFile = new Path(selectedFile.getLocation().toPortableString());
		defaultPathToOutputAstFile = defaultPathToOutputAstFile.removeFileExtension();
		defaultPathToOutputAstFile = defaultPathToOutputAstFile.addFileExtension(CFGConstants.LLVM_FILE_EXTENSION);
		IWorkspace workspace= ResourcesPlugin.getWorkspace(); 
		IFile oldAstFile= workspace.getRoot().getFileForLocation(defaultPathToOutputAstFile);
		
		//if we acquired a handle, we can use it
		if(oldAstFile != null){
			saveAsDialog.setOriginalFile(oldAstFile);
		}
		//if not, we set the file name directly
		else{
			String defaultNameOfOutputFile = selectedFile.getName().replaceAll("." + CFGConstants.S_FILE_EXTENSION, "." + CFGConstants.LLVM_FILE_EXTENSION);
			saveAsDialog.setOriginalName(defaultNameOfOutputFile);
		}
	}

}
