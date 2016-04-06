package de.upb.lina.cfg.tools.wizards;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.ui.IMemento;

import de.upb.lina.cfg.tools.CFGConstants;


public abstract class ConfigurationPage extends ExtendedWizardPage {
	
	private String pathToInputFile;
	private String pathToOutputFolder;
	private String nameOfOutputFile;
	protected IMemento memento;
	
	//selection given by user
	private IStructuredSelection userSelection;
	
	protected ConfigurationWizardUsingChecks wizard;
	
	public ConfigurationPage(String pageName, String pageTitle,
			String pageDescription, IStructuredSelection selection, 
			ConfigurationWizardUsingChecks wizard) {
		super(pageName, pageTitle, pageDescription);
		this.userSelection = selection;
		this.wizard = wizard;
	}
	
	protected abstract void saveMementoState();
	
	public abstract void validateInput();
	
	protected SelectionListener createSelectionAdapter(final boolean doHandleInputFile, final boolean handleOutputFolder){
		return new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if(doHandleInputFile){
					handleInputFileSelection();
				}
				if(handleOutputFolder){
					handleOutputFolderSelection();
				}
				
				validateInput();
			}
		};
	}
	
	/**
	 * Fetch last dialog input and update to current selection if it is an AST file. 
	 */
	protected void initializeGuiElements(String mementoKey, File stateFile)
	{
		if (memento == null){
			memento = loadMementoState(mementoKey, stateFile);
		}
		
		initializeDefaultGuiElementValuesFromMemento();

		if (userSelection != null)
		{
			if (hasExactlyOneSelectedElement(userSelection))
			{
				Object selectedObject = userSelection.getFirstElement();
				if (selectedObject instanceof IFile)
				{
					IFile file = (IFile) selectedObject;
					initializeDefaultGuiElementValuesFromFile(file);
				}
			}
		}

	}
	
	protected abstract void initializeDefaultGuiElementValuesFromFile(IFile file);
	protected abstract void initializeDefaultGuiElementValuesFromMemento();
	
	
	private boolean hasExactlyOneSelectedElement(
			IStructuredSelection structuredSelectionByUser) {
		return structuredSelectionByUser.size() == 1;
	}
	
	protected abstract void handleInputFileSelection();
	
	protected abstract void handleOutputFolderSelection();

	public String getPathToInputFile() {
		return pathToInputFile;
	}

	protected void setPathToInputFile(String pathToInputFile) {
		this.pathToInputFile = pathToInputFile;
	}

	protected String getPathToOutputFolder() {
		return pathToOutputFolder;
	}

	protected void setPathToOutputFolder(String pathToOutputFolder) {
		this.pathToOutputFolder = pathToOutputFolder;
	}

	protected String getNameOfOutputFile() {
		return nameOfOutputFile;
	}

	protected void setNameOfOutputFile(String pathToOtuputFile) {
		this.nameOfOutputFile = pathToOtuputFile;
	}

	protected IStructuredSelection getUserSelection() {
		return userSelection;
	}
	
	
	public String getCompletePathToOutputFile(){
		return getPathToOutputFolder() + File.separator + getNameOfOutputFile();
	}
	
	/**
	 * Checks if the given cfg name is valid. 
	 * 
	 * @param cfgNameToCheck name to check
	 * @return true if the given cfg name is valid, false if not
	 */
	protected boolean isValidCFGName(String cfgNameToCheck)
	{
		if(!isValidFileName(cfgNameToCheck)){
			return false;
		}
		
		if (cfgNameToCheck.endsWith("." + CFGConstants.CFG_FILE_EXTENSION)){
			return true;
		}

		return false;
	}
	
	protected boolean isValidFileName(String pathToFile){
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = root.getFullPath().append(pathToFile);
		File file = path.toFile();
		try
		{
			file.getCanonicalPath();
		} catch (IOException e)
		{
			return false;
		}

		if (pathToFile.contains(" "))
		{
			return false;
		}
		return true;
	}
	
	protected boolean doesFileExist(String pathToFile){
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = root.getFullPath().append(pathToFile);
		IResource resource = root.findMember(path);
		return (resource != null);
	}
	
	
	
}
