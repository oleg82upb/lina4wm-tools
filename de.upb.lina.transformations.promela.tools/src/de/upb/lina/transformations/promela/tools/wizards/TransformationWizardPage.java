package de.upb.lina.transformations.promela.tools.wizards;

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
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
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
import org.eclipse.ui.XMLMemento;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import de.upb.lina.transformations.promela.tools.Activator;

public class TransformationWizardPage extends WizardPage {

	private final static String FILE_EXT = "cfg";

	public final static String MEMENTO__KEY = "de.upb.lina.cfg.transformations.transformationwizardpage";
	private final static String CFGLOC = "cfgloc";
	private final static String CONTAINER = "container";
	private final static String NEW_FILE = "newFile";
	private final static String MODEL_SELECTION = "modelSelection";

	private Image ok = new Image(Display.getCurrent(), getClass().getResourceAsStream("ok.gif"));
	private Image nok = new Image(Display.getCurrent(), getClass().getResourceAsStream("error.gif"));
	private String newFileLoc = "";
	private String containerLoc = "";
	private String cfgLoc = "";

	private Text tx_container;
	private Text tx_file;
	private Text tx_graphModelFile;
	private Label lb_fileEnding;
	
	private ISelection selection;
	//0 - promela
	//1 - kif
	private int type = 0;
	private Combo cb_model;

	private IMemento memento;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public TransformationWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("AST-Selection");
		setDescription("Please select the AST-Model you wish to convert.");
		this.selection = selection;
	}


	protected TransformationWizardPage(String pageName) {
		super(pageName);
		setTitle("CFG - Selection");
		setDescription("Please select the CFG model you wish to transform.");
	}

	@Override
	public void createControl(Composite parent) {
		/* init */
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		/* Graph select */
		Label label = new Label(container, SWT.NULL);
		label.setText("&ControlFlowDiagram-File:");

		tx_graphModelFile = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		tx_graphModelFile.setLayoutData(gd);
		tx_graphModelFile.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleElementBrowse(tx_graphModelFile);
			}
		});

		/* container select */
		Label label1 = new Label(container, SWT.NULL);
		label1.setText("&Container:");

		tx_container = new Text(container, SWT.BORDER | SWT.SINGLE);
		tx_container.setLayoutData(gd);
		tx_container.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});

		Button button1 = new Button(container, SWT.PUSH);
		button1.setText("Browse...");
		button1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerBrowse(tx_container);
			}
		});

		/* new_file name */
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");
		tx_file = new Text(container, SWT.BORDER | SWT.SINGLE);
		tx_file.setLayoutData(gd);

		tx_file.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});
		
		lb_fileEnding = new Label(container, SWT.NULL);
		lb_fileEnding.setText(".pml");

		/* ordering select */
		new Label(container, SWT.NULL).setText("Transformation type:");
		cb_model = new Combo(container, SWT.NULL);
		String[] orderings = new String[] { "Promela", "KIF" };
		for (int i = 0; i < orderings.length; i++){
			cb_model.add(orderings[i]);
		}
		cb_model.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				type = cb_model.getSelectionIndex();
				validateInput();
			}
		});

		cb_model.select(0);
		cb_model.setEnabled(true);
		setControl(container);
				if (memento != null) {
					tx_graphModelFile.setText(memento.getString("astloc"));
					validateInput();
					tx_container.setText(memento.getString("container"));
					validateInput();
					tx_file.setText(memento.getString("newfile"));
					validateInput();
					try {
						cb_model.select(memento.getInteger("reordering"));
					} catch (NullPointerException ex) {
						Activator.logWarning(
								"Warning: Memento not setup correctly - this warning will disappear after creating one cfg.",
								ex);
					}
				}
		initializeMementoAndSelection();
		validateInput();


	}
	
	public String getFileEndForSelection(){
		switch (cb_model.getSelectionIndex()) {
		case 0:
			return ".pml";
//			break;

		case 1:
			return ".kif";
//			break;
			
		default:
			break;
		}
		
		return "ERROR";
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
				if (element instanceof IFolder || element instanceof IProject) {
					return true;
				}
				if (element instanceof IFile) {
					IFile file = (IFile) element;
					return FILE_EXT.equals(file.getFileExtension());
				}
				return false;
			}
		});
		dialog.setTitle("CFG - Selection");
		dialog.setMessage("Select a ControlFlowDiagram-file:");
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
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace()
				.getRoot(), false, "Select new file container.");
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

	private void validateInput() {
		cfgLoc = this.tx_graphModelFile.getText();
		containerLoc = this.tx_container.getText();
		newFileLoc = this.tx_file.getText();
		setDescription("Valid input! Finish!");
		lb_fileEnding.setText(getFileEndForSelection());

		int result = checkCFGFile(cfgLoc);
		if (result >= 400) {
			updateStatus("The selected CFG-file cannot be loaded.");
			return;
		}else if (result >= 300) {
			updateStatus("Select a CFG-file (*.cfg)");
			return;
		} else if (result >= 200) {
			updateStatus("The specified path refers no exisiting CFG-file.");
			return;
		} else if (result >= 100) {
			updateStatus("The CFG-file extension has to be type of *.cfg");
			return;
		}

		if (!isValidContainer(tx_container.getText())) {
			if(!tx_container.getText().startsWith("/")){
				updateStatus("The container has to start with '/'.");
			}else{
				updateStatus("No valid container is selected.");
			}
			return;
		}
//		if (!isValidTypeName(tx_file.getText())) {
//			if(type == 0){
//				updateStatus("No valid filename. Check the extension (*.pml)");
//			}else if(type == 1){
//				updateStatus("No valid filename. Check the extension (*.kif)");
//			}
//			return;
//		}
		
		//TODO: See why this bugs
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IPath path = new Path(tx_container.getText() + File.separator + tx_file.getText() + lb_fileEnding.getText());
		IFile file = myWorkspaceRoot.getFile(path);
		
		if(file.exists()){
			updateWarning("A file with the given name does already exist. If you continue the present file will be overwritten!", WARNING);
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
	
	/**
	 * Displays a warning, but finishes the dialog
	 * @param message
	 * @param level
	 */
	private void updateWarning(String message, int level) {
		setMessage(message, level);
		setPageComplete(false);
		updateStatus(null);
		getControl().redraw();
	}

	private void updateDescription(String message) {
		setMessage(message, INFORMATION);
		setPageComplete(false);
	}

	public boolean isValidContainer(String container) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		//		IPath path = root.getFullPath().append(container);
		IResource file = root.findMember(container);
		if (file != null && file.isAccessible() && !file.equals(root) && container.startsWith("/")) {
			return true;
		}
		return false;
	}

	public boolean isValidTypeName(String string) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = root.getFullPath().append(string);
		File file = path.toFile();
		try {
			file.getCanonicalPath();
		}
		catch (IOException e) {
			return false;
		}

		if(string.contains(" ")){
			return false;
		}
		if(type == 0){
			if (string.endsWith(".pml")){
				return true;
			}
		}

		if(type == 1){
			if (string.endsWith(".kif")){
				return true;
			}
		}

		return false;
	}

	public int checkCFGFile(String cfgLocation) {
		if (cfgLocation.length() == 0) {
			return 300;
		}
		if (cfgLocation.substring(cfgLocation.length() - 3).equalsIgnoreCase("cfg") == false) {
			return 100;
		}

		IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();
		IResource file = r.findMember(cfgLocation);
		if (file == null || !file.isAccessible() || !cfgLocation.startsWith("/")) {
			return 200;
		}

		//check if ast-file can be loaded or if an exception occurs
		try{
			ResourceSet resourceSet = new ResourceSetImpl();
			Path cfgpath = new Path(cfgLocation);
			URI uri = URI.createPlatformResourceURI(cfgpath.toOSString(), true);
			Resource cfgResource = resourceSet.getResource(uri, true);
		}catch(WrappedException e){
			return 400;
		}
		return 0;
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

		if (memento.getString(CFGLOC) != null)
		{
			cfgLoc = memento.getString(CFGLOC);
			tx_graphModelFile.setText(cfgLoc);
		}

		if (memento.getString(CONTAINER) != null)
		{
			containerLoc = memento.getString(CONTAINER);
			tx_container.setText(containerLoc);
		}

		if (memento.getString(NEW_FILE) != null)
		{
			newFileLoc = memento.getString(NEW_FILE);
			tx_file.setText(newFileLoc);
		}

		if (memento.getString(MODEL_SELECTION) != null)
		{
			cb_model.select(memento.getInteger(MODEL_SELECTION));
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
					cfgLoc = file.getFullPath().toPortableString();
					tx_graphModelFile.setText(cfgLoc);
				}
			}
		}
	}

	protected synchronized IMemento loadMementoState()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(Activator.getStateFile()));
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
		child.putString(CFGLOC, tx_graphModelFile.getText());
		child.putString(CONTAINER, tx_container.getText());
		child.putString(NEW_FILE, tx_file.getText());
		child.putInteger(MODEL_SELECTION, cb_model.getSelectionIndex());
		Activator.saveMementoToFile(memento);
	}


	public String getNewFileLoc() {
		return newFileLoc;
	}


	public void setNewFileLoc(String newFileLoc) {
		this.newFileLoc = newFileLoc;
	}


	public String getContainerLoc() {
		return containerLoc;
	}


	public void setContainerLoc(String containerLoc) {
		this.containerLoc = containerLoc;
	}


	public Text getContainerText() {
		return tx_container;
	}


	public void setContainerText(Text containerText) {
		this.tx_container = containerText;
	}


	public Text getGraphModelFile() {
		return tx_graphModelFile;
	}

	public Text getFileText(){
		return tx_file;
	}


	public void setGraphModelFile(Text graphModelFile) {
		this.tx_graphModelFile = graphModelFile;
	}
	
	public Label getFileEndingLabel(){
		return lb_fileEnding;
	}



}
