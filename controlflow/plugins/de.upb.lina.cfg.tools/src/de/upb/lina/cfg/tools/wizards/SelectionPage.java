package de.upb.lina.cfg.tools.wizards;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IMemento;
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
	public final static String MEMENTO__KEY = "de.upb.lina.cfg.selection.wizard";
	private final static String ASTLOC = "astloc";
	private final static String CONTAINER = "container";
	private final static String NEW_FILE = "newFile";
	private final static String MODEL_SELECTION = "modelSelection";
	private final static String FILE_EXT = "llvm";
	private String newfile = "";
	private String containerloc = "";
	private Text containerText;
	private Text fileText;
	private ISelection selection;
	private int modelSelection = 0;
	private Combo combo;
	private Text astFile;
	private String astloc = "";
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
				validateInput();
			}
		});
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleASTFileSelection();
				validateInput();
			}
		});

		/* container select */
		Label label1 = new Label(container, SWT.NULL);
		label1.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});

		Button button1 = new Button(container, SWT.PUSH);
		button1.setText("Browse...");
		button1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerSelection();
				validateInput();
			}
		});

		/* new_file name */
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");
		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		fileText.setLayoutData(gd);
		fileText.setText("new_file.cfg");

		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});
		new Label(container, SWT.NULL).setText("");

		/* ordering select */
		new Label(container, SWT.NULL).setText("Reordering:");
		combo = new Combo(container, SWT.NULL);
		String[] orderings = new String[] { "SC", "TSO", "PSO" };
		for (int i = 0; i < orderings.length; i++)
			combo.add(orderings[i]);
		combo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelSelection = combo.getSelectionIndex();
				validateInput();
			}
		});

		combo.select(0);
		combo.setEnabled(true);
		setControl(container);

		initializeMementoAndSelection();
		validateInput();

	}


	/**
	 * Fetch last dialog input and update to current selection if it is an AST file. 
	 */
	private void initializeMementoAndSelection()
	{
		if (memento != null)
		{
			return;
		} else
		{
			memento = loadMementoState();
			if (memento == null)
			{
				// nothing to initialize here
				return;
			}
		}

		if (memento.getString(ASTLOC) != null)
		{
			this.astloc = memento.getString(ASTLOC);
			astFile.setText(this.astloc);
		}

		if (memento.getString(CONTAINER) != null)
		{
			this.containerloc = memento.getString(CONTAINER);
			containerText.setText(containerloc);
		}

		if (memento.getString(NEW_FILE) != null)
		{
			this.newfile = memento.getString(NEW_FILE);
			fileText.setText(this.newfile);
		}

		if (memento.getString(MODEL_SELECTION) != null)
		{
			combo.select(memento.getInteger(MODEL_SELECTION));
		}

		if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection)
		{
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IFile)
			{
				IFile file = (IFile) obj;
				if (FILE_EXT.equals(file.getFileExtension()))
				{
					this.astloc = file.getFullPath().toPortableString();
					astFile.setText(this.astloc);
				}
			}
		}
	}

	/**
	 * updates ast location text field
	 */

	private void handleASTFileSelection()
	{
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());

		dialog.addFilter(new ViewerFilter()
		{

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element)
			{
				if (element instanceof IFolder || element instanceof IProject)
				{
					return true;
				}
				if (element instanceof IFile)
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
		if (dialog.open() == Dialog.OK)
		{
			Object[] result = dialog.getResult();
			if (result.length == 1)
			{
				String s = result[0].toString();
				char c = s.charAt(0);
				if (c == ('P') || c == ('L'))
					s = s.substring(1);
				this.astFile.setText(s);
			}
		}
	}

	/**
	 * updates container text field
	 */
	private void handleContainerSelection()
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), root, false, "Please select new file location.");
		if (dialog.open() == Dialog.OK)
		{
			Object[] result = dialog.getResult();
			if (result.length == 1)
			{
				String s = result[0].toString();
				char c = s.charAt(0);
				if (c == ('P') || c == ('L'))
					s = s.substring(1);
				this.containerText.setText(s);
			}
		}
	}

	/**
	 * Validates dialog input
	 */

	private void validateInput() {
		this.astloc = this.astFile.getText();
		this.containerloc = this.containerText.getText();
		this.newfile = this.fileText.getText();
		setDescription("Please Select next");

		if (!isAstFileExtOk())
		{
			updateStatus("Please, select an AST-File (*.llvm)");
			return;
		}
		
		if (!isAstFileExisting())
		{
			updateStatus("The specified path refers no exisiting AST-file.");
			return;
		}
		
		if (!isAstFileLoadable())
		{
			updateStatus("The selected AST-File can not be loaded.");
			return;
		}

		if (!isValidContainer(containerText.getText())) {
			if(!containerText.getText().startsWith("/")){
				updateStatus("The container has to start with '/'.");
			}else{
				updateStatus("No valid container is selected.");
			}
			return;
		}
		if (!isValidCFGName(fileText.getText())) {
			updateStatus("No valid filename.");
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

	private boolean isValidContainer(String container)
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = root.findMember(container);
		if (file != null && file.isAccessible() && !file.equals(root) && container.startsWith("/"))
		{
			return true;
		}
		return false;
	}

	private boolean isValidCFGName(String string)
	{

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = root.getFullPath().append(string);
		File file = path.toFile();
		try
		{
			file.getCanonicalPath();
		} catch (IOException e)
		{
			return false;
		}

		if (string.contains(" "))
		{
			return false;
		}
		if (string.endsWith(".cfg"))
			return true;

		return false;
	}

	private boolean isAstFileLoadable()
	{
		// check if ast-file can be loaded or if an exception occurs
		try
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			Path astpath = new Path(this.astloc);
			URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
			Resource llvmResource = resourceSet.getResource(uri, true);
			assert (llvmResource != null);
		} catch (Exception e)
		{
			return false;
		}
		return true;
	}

	private boolean isAstFileExtOk()
	{
		return !(this.astloc.length() == 0 || (this.astloc.substring(this.astloc.length() - 4).equalsIgnoreCase("llvm") == false));
	}

	private boolean isAstFileExisting()
	{
		IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = r.findMember(this.astloc);
		return !(file == null || !file.isAccessible() || !this.astloc.startsWith("/"));
	}

	public String getContainerName() {
		return containerloc;
	}

	public String getFileName() {
		return newfile;
	}

	/**
	 * 
	 * @return modelSelection 0 - SC 1 - TSO
	 */
	public int getMemoryModelSelection() {

		return modelSelection;
	}

	protected synchronized IMemento loadMementoState()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(CFGActivator.getStateFile()));
			XMLMemento data = XMLMemento.createReadRoot(reader);
			return data.getChild(MEMENTO__KEY);
		} catch (Exception e)
		{
			// hide it, as this is just for convenience and the previous data is not crucial for the dialog
		}
		return null;
	}
	
	protected synchronized void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(MEMENTO__KEY);
		IMemento child = memento.createChild(MEMENTO__KEY);
		child.putString("astloc", getAstLocation());
		child.putString("container", getContainerName());
		child.putString("newfile", getFileName());
		child.putInteger("modelSelection", getMemoryModelSelection());
		CFGActivator.saveMementoToFile(memento);
	}
}