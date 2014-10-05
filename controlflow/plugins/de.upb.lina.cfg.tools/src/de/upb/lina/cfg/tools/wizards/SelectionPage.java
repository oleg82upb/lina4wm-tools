package de.upb.lina.cfg.tools.wizards;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.XMLMemento;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import de.upb.lina.cfg.tools.CFGActivator;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (cfg).
 */

public class SelectionPage extends WizardPage {
	private final static String FILE_EXT = "llvm";
	private Image ok = new Image(Display.getCurrent(), getClass().getResourceAsStream("ok.gif"));
	private Image nok = new Image(Display.getCurrent(), getClass().getResourceAsStream("error.gif"));
	String newfile = "";
	String containerloc = "";
	private Text containerText;
	private Text fileText;
	private ISelection selection;
	private int reordering = 0;
	private Combo combo;

	private Text astFile;
	String astloc = "";
	private IMemento memento;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public SelectionPage(ISelection selection) {
		super("wizardPage");
		setTitle("AST-Selection");
		setDescription("Please select the AST-Model you wish to convert.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		memento = loadState();
		/* init */
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		/* AST select */
		Label label = new Label(container, SWT.NULL);
		label.setText("&AST-File:");
		astFile = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		astFile.setLayoutData(gd);
		astFile.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged(container);
				checkastfile();
			}
		});
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleElementBrowse(astFile);
			}
		});

		/* container select */
		Label label1 = new Label(container, SWT.NULL);
		label1.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged(container);
			}
		});

		Button button1 = new Button(container, SWT.PUSH);
		button1.setText("Browse...");
		button1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerBrowse(containerText);
			}
		});

		/* new_file name */
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");
		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		fileText.setLayoutData(gd);

		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged(container);
			}
		});
		new Label(container, SWT.NULL).setText("");

		/* ordering select */
		new Label(container, SWT.NULL).setText("Reordering:");
		combo = new Combo(container, SWT.NULL);
		String[] orderings = new String[] { "SC", "TSO" };
		for (int i = 0; i < orderings.length; i++)
			combo.add(orderings[i]);
		combo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				reordering = combo.getSelectionIndex();
			}
		});
		
		combo.select(0);
		combo.setEnabled(true);
		setControl(container);
		if (memento != null) {
			astFile.setText(memento.getString("astloc"));
			dialogChanged(container);
			containerText.setText(memento.getString("container"));
			dialogChanged(container);
			fileText.setText(memento.getString("newfile"));
			dialogChanged(container);
			try{
				combo.select(memento.getInteger("reordering"));
			}catch(NullPointerException ex){
				System.out.println("Warning: Memento not setup correctly - this warning will disappear after creating one cfg.");
			}
		}
		initialize();
		dialogChanged(container);

	}

	// @Override
	// public void setVisible(boolean visible) {
	// super.setVisible(visible);
	// if (memento != null) {
	// astFile.setText(memento.getString("astloc"));
	// containerText.setText(memento.getString("container"));
	// fileText.setText(memento.getString("newfile"));
	// combo.select(0);
	// }
	// }

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (memento != null) {
			return;
		}
		astFile.setText("");
		astloc = "";
		fileText.setText("new_file.cfg");
		combo.select(0);
		this.newfile = this.fileText.getText();

		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
		this.containerloc = this.containerText.getText();
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleElementBrowse(Text textf) {
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());

		dialog.addFilter(new ViewerFilter() {
			
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if(element instanceof IFolder || element instanceof IProject) {
					return true;
				}
				if(element instanceof IFile)
				{
					IFile file = (IFile) element;
					return FILE_EXT.equals(file.getFileExtension());
				}
				return false;
			}
		});
		dialog.setTitle("Tree Selection");
		dialog.setMessage("Please select an AST:");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setDoubleClickSelects(true);
		// dialog.setSorter(new ResourceSorter(ResourceSorter.TYPE));
		if (dialog.open() == Dialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				String s = result[0].toString();
				char c = s.charAt(0);
				if (c == ('P') || c == ('L'))
					s = s.substring(1);
				textf.setText(s);
			}
		}
	}

	private void handleContainerBrowse(Text textf) {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Please select new file location.");
		if (dialog.open() == Dialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				String s = result[0].toString();
				char c = s.charAt(0);
				if (c == ('P') || c == ('L'))
					s = s.substring(1);
				textf.setText(s);
			}
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged(Composite container) {
		this.astloc = this.astFile.getText();
		this.containerloc = this.containerText.getText();
		this.newfile = this.fileText.getText();
		setDescription("Please Select next");

		int result = (checkastfile() + checkastmeta() + checkcfgmeta());
		if (result >= 300) {
			updateStatus("Please Select an AST-File (*.llvm)");
			return;
		} else if (result >= 200) {
			updateStatus("The specified path refers no exisiting AST-file.");
			return;
		} else if (result >= 100) {
			updateStatus("The AST-File extension has to be type of *.llvm");
			return;
		}
		updateDescription("Check your Input and hit finish.");
		updateStatus(null);
		getControl().redraw();
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	private void updateDescription(String message) {
		setMessage(message, INFORMATION);
		setPageComplete(false);
	}

	public String getAstLocation() {
		return astloc;
	}

	public int checkastfile() {
		if (getAstLocation().length() == 0) {
			return 300;
		}
		IWorkspace iw = ResourcesPlugin.getWorkspace();
		IPath root = iw.getRoot().getLocation();
		Path p = new Path(getAstLocation());
		File ast = new File(root + p.toOSString());
		if (!ast.exists()) {
			return 200;
		}
		if (getAstLocation().substring(getAstLocation().length() - 4).equalsIgnoreCase("llvm") == false) {
			return 100;
		}
		return 0;
	}

	public int checkastmeta() {
		return 0;
	}

	public int checkcfgmeta() {
		return 0;
	}

	public String getContainerName() {
		return containerloc;
	}

	public String getFileName() {
		return newfile;
	}

	/**
	 * 
	 * @return reordering 0 - SC 1 - TSO
	 */
	public int getReordering() {

		return reordering;
	}

	protected synchronized IMemento loadState() {
		{
			try {
				XMLMemento memento = XMLMemento.createReadRoot(new BufferedReader(new FileReader(CFGActivator.getStateFile())));
				IMemento thisMemento = memento.getChild(NewCfgWizard.MEMENTO__KEY);
				if (thisMemento != null) {
					return thisMemento;
				}
			} catch (WorkbenchException we) {
				// ignoreit
			} catch (FileNotFoundException fnfe) {
				// ignore
			}
			return null;
		}
	}

	public String getNewfile() {
		return newfile;
	}

	public void setNewfile(String newfile) {
		this.newfile = newfile;
	}

	public String getContainerloc() {
		return containerloc;
	}

	public void setContainerloc(String containerloc) {
		this.containerloc = containerloc;
	}

	public String getAstloc() {
		return astloc;
	}

	public void setAstloc(String astloc) {
		this.astloc = astloc;
	}

	public void setReordering(int reordering) {
		this.reordering = reordering;
	}
	
	
}