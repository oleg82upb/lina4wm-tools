package de.upb.lina.cfg.tools.wizards;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.XMLMemento;
import org.eclipse.ui.dialogs.SelectionDialog;

public abstract class ExtendedWizardPage extends WizardPage {

	protected ExtendedWizardPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName);
		setTitle(pageTitle);
		setDescription(pageDescription);
	}

	protected synchronized IMemento loadMementoState(String mementoKey, File stateFile)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(stateFile));
			XMLMemento data = XMLMemento.createReadRoot(reader);
			return data.getChild(mementoKey);
		} catch (Exception e)
		{
			// hide it, as this is just for convenience and the previous data is not crucial for the dialog
		}
		return null;
	}
	

	protected static Button createButton(Composite container, int buttonStyle, String buttonText, SelectionListener selectionListener){
		Button button = new Button(container, buttonStyle);
		button.setText(buttonText);
		button.addSelectionListener(selectionListener);
		return button;
	}
	
	protected Text createText(Composite container, int style, ModifyListener listener, Object layoutData){
		Text tx = new Text(container, style);
		tx.setLayoutData(layoutData);
		tx.addModifyListener(listener);
		return tx;
	}
	
	protected Label createLabel(Composite container, int style ,String labelText){
		Label label = new Label(container, style);
		label.setText(labelText);
		return label;
	}
	
	/**
	 * Updates the error message and sets the page status to incomplete, 
	 * if the given message is not null. 
	 * 
	 * @param message null to remove the error message and to set the page status to complete
	 */
	protected void updateErrorMessage(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	/**
	 * Checks if the given folder path yields a valid folder.
	 * 
	 * @param folderPath path to the folder to check
	 * @return true if the path yields a valid folder, false else.
	 */
	protected boolean isValidFolderPath(String folderPath)
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = root.findMember(folderPath);
		if (file != null && file.isAccessible() && !file.equals(root) && folderPath.startsWith("/"))
		{
			return true;
		}
		return false;
	}
	
	protected void evaluateSelectionDialogResult(SelectionDialog dialog, Text resultHolder){
		if (dialog.open() == Dialog.OK)
		{
			Object[] result = dialog.getResult();
			if (result.length == 1)
			{
				String s = result[0].toString();
				char c = s.charAt(0);
				if (c == ('P') || c == ('L'))
					s = s.substring(1);
				resultHolder.setText(s);
			}
		}
	}
	
	/**
	 * Checks whether the  given file is accessible.
	 * 
	 * @param filePath path to the file to check
	 * @return true, if the given file exists and is accessible, false else
	 */
	protected boolean isFileAccessible(String filePath)
	{
		IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = r.findMember(filePath);
		if(file != null && file.isAccessible() && filePath.startsWith("/")){
			return true;
		}
		return false;
	}
}
