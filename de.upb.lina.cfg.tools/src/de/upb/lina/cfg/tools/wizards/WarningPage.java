package de.upb.lina.cfg.tools.wizards;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class WarningPage extends WizardPage {

	private java.util.List<String> errorMessages = null;
	private java.util.List<String> warningMessages = null;
	private ListViewer errorViewer;
	private ListViewer warningViewer;

	protected WarningPage() {
		super("Errors and Warnings");
		setTitle("Errors and Warnings");
		setDescription("No errors or warnings found.");
	}

	public void setErrorMessages(java.util.List<String> errorMessages){
		this.errorMessages = errorMessages;
		updateContent();
	}

	public void setWarningMessages(java.util.List<String> warningMessages){
		this.warningMessages = warningMessages;
		updateContent();
	}

	private void updateDescription(){
		if(errorMessages == null && warningMessages == null || (errorMessages != null && warningMessages != null && errorMessages.isEmpty() && warningMessages.isEmpty())){
			setErrorMessage(null);
			setDescription("No errors or warnings found");
		}else{
			setErrorMessage("The following errors and warnings were found.");
		}
	}
	
	private void updateContent(){
		if(errorMessages != null && errorViewer != null){
			errorViewer.setInput(errorMessages.toArray());
			errorViewer.refresh();
		}
		
		if(warningMessages != null && warningViewer != null ){
			warningViewer.setInput(warningMessages.toArray());
			warningViewer.refresh();
		}
		updateDescription();
	}

	@Override
	public void createControl(Composite parent) {
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.makeColumnsEqualWidth = true;
		layout.numColumns = 1;

		Label errorlabel = new Label(container, SWT.NULL);
		errorlabel.setText("&Errors");

		errorViewer = new ListViewer(container, SWT.V_SCROLL);
		errorViewer.setContentProvider(ArrayContentProvider.getInstance());
		errorViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));


		Label warningLabel = new Label(container, SWT.NULL);
		warningLabel.setText("&Warnings");
		
		warningViewer = new ListViewer(container, SWT.V_SCROLL);
		warningViewer.setContentProvider(ArrayContentProvider.getInstance());
		warningViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));

		setControl(container);
		updateContent();
	}

}
