package de.upb.lina.transformations.wizards;

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

import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.Constants;

/**
 * @author Oleg Travkin
 *
 */
public class TransformationWizardPage extends WizardPage {


	//GUI elements
	private Text tx_targetContainer;
	private Text tx_targetFileName;
	private Text tx_sourceGraphModelFileName;
	private Combo cb_modelType;
	private Combo cb_basis;
	private Label lb_fileEnding;
	
	//storage for input of GUI elements
	private String targetFileName = "";
	private String targetContainer = "";
	private String sourceGraphModelFileName = "";
	private int modelType = Constants.TRANSFORMATION_TYPE_PROMELA;
	private String basis = Constants.NAT;

	private boolean canFlip = true;
	
	//selection of user 
	private ISelection selection;
	
	private FunctionSelectionPage nextPage;
	private IMemento memento;

	/**
	 * Constructor.
	 * 
	 * @param pageName
	 */
	public TransformationWizardPage(String pageName, ISelection selection, FunctionSelectionPage next) {
		super(pageName);
		nextPage = next;
		setTitle("CFG - Selection");
		setDescription("Please select the CFG model you wish to transform.");
		this.selection = selection;
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

		tx_sourceGraphModelFileName = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		tx_sourceGraphModelFileName.setLayoutData(gd);
		tx_sourceGraphModelFileName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleElementBrowse(tx_sourceGraphModelFileName);
			}
		});

		/* container select */
		Label label1 = new Label(container, SWT.NULL);
		label1.setText("&Target Container:");

		tx_targetContainer = new Text(container, SWT.BORDER | SWT.SINGLE);
		tx_targetContainer.setLayoutData(gd);
		tx_targetContainer.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});

		Button button1 = new Button(container, SWT.PUSH);
		button1.setText("Browse...");
		button1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerBrowse(tx_targetContainer);
			}
		});

		/* new_file name */
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");
		tx_targetFileName = new Text(container, SWT.BORDER | SWT.SINGLE);
		tx_targetFileName.setLayoutData(gd);

		tx_targetFileName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		});
		
		lb_fileEnding = new Label(container, SWT.NULL);
		lb_fileEnding.setText(".pml");

		/* ordering select */
		new Label(container, SWT.NULL).setText("Transformation type:");
		cb_modelType = new Combo(container, SWT.NULL);
		String[] orderings = new String[] { "Promela", "KIVLocal", "KIVGlobal", "operational Promela" };
		for (int i = 0; i < orderings.length; i++){
			cb_modelType.add(orderings[i]);
		}
		cb_modelType.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelType = cb_modelType.getSelectionIndex();
				if(modelType == Constants.TRANSFORMATION_TYPE_KIV_LOCAL)
				{
					tx_targetFileName.setEnabled(false);
					if(cb_basis != null)
					{
						cb_basis.setEnabled(true);
					}
				}else if(modelType == Constants.TRANSFORMATION_TYPE_KIV_GLOBAL)
				{
					tx_targetFileName.setEnabled(false);
					if(cb_basis != null)
					{
						cb_basis.setEnabled(true);
					}
				}else
				{
					tx_targetFileName.setEnabled(true);
					if(cb_basis != null)
					cb_basis.setEnabled(false);
				}
				validateInput();
			}
		});

		cb_modelType.select(0);
		cb_modelType.setEnabled(true);
				
		/*KIV transformation basis select */
		new Label(container, SWT.NONE);
		new Label(container, SWT.NULL).setText("Transformation based on ");
		cb_basis = new Combo(container, SWT.NULL);
		String[] basisTypes = new String[] { Constants.NAT, Constants.INT };
		for (int i = 0; i < basisTypes.length; i++){
			cb_basis.add(basisTypes[i]);
		}
		cb_basis.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(cb_basis.getSelectionIndex() == Constants.NAT_INDEX){
					basis = Constants.NAT;
				}else if(cb_basis.getSelectionIndex() == Constants.INT_INDEX){
					basis = Constants.INT;
				}
				
			}
		});
		
		cb_basis.select(Constants.NAT_INDEX);
		cb_basis.setEnabled(false);
		
		setControl(container);
				if (memento != null) {
					tx_sourceGraphModelFileName.setText(memento.getString(Constants.CFGLOC));
					validateInput();
					tx_targetContainer.setText(memento.getString(Constants.CONTAINER));
					validateInput();
					tx_targetFileName.setText(memento.getString(Constants.NEW_FILE));
					validateInput();
					try {
						cb_modelType.select(memento.getInteger(Constants.MODEL_SELECTION));
					} catch (NullPointerException ex) {
						Activator.logWarning(
								"Warning: Memento not setup correctly - this warning will disappear after creating one cfg.",
								ex);
					}
				}
		initializeMementoAndSelection();
		validateInput();


	}
	
	
	/**
	 * @return selected type of transformation see Constants.TRANSFORMATION... 
	 */
	public int getType()
	{
		return cb_modelType.getSelectionIndex();
	}
	
	public String getFileEndForSelection(){
		switch (cb_modelType.getSelectionIndex()) {
		case 0:
			return ".pml";

		case 1:
			return "";
			
		case 2:
			return "";
		
		case 3:
			return ".pml";
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
					return Constants.FILE_EXT.equals(file.getFileExtension());
				}
				return false;
			}
		});
		dialog.setTitle("CFG - Selection");
		dialog.setMessage("Select a ControlFlowDiagram-file:");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setDoubleClickSelects(true);
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
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace()
				.getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(),root , false, "Select new file container.");
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
		sourceGraphModelFileName = this.tx_sourceGraphModelFileName.getText();
		targetContainer = this.tx_targetContainer.getText();
		targetFileName = this.tx_targetFileName.getText();
		setDescription("Valid input! Finish!");
		lb_fileEnding.setText(getFileEndForSelection());
		lb_fileEnding.pack();

		int result = checkCFGFile(sourceGraphModelFileName);
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

		if (!isValidContainer(tx_targetContainer.getText())) {
			if(!tx_targetContainer.getText().startsWith("/")){
				updateStatus("The container has to start with '/'.");
			}else{
				updateStatus("No valid container is selected.");
			}
			return;
		}

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IPath path = new Path(tx_targetContainer.getText());
		IResource resource = myWorkspaceRoot.findMember(path);
		IPath searchPath = resource.getLocation().append(File.separator + tx_targetFileName.getText() + lb_fileEnding.getText());
		
		if(searchPath.toFile().exists()){
			updateWarning("A file with the given name does already exist. If you continue the present file will be overwritten!", WARNING);
			return;
		}
		
		path = new Path(tx_targetContainer.getText());
		resource = myWorkspaceRoot.findMember(path);
		searchPath = resource.getLocation().append(File.separator+"specs"+File.separator+"PC.utf8");
		
		if(searchPath.toFile().exists() && (modelType == Constants.TRANSFORMATION_TYPE_KIV_LOCAL ||modelType == Constants.TRANSFORMATION_TYPE_KIV_GLOBAL)){
			updateWarning("The selected target folder already contains a KIV Specification. If you continue the present files will be overwritten!", WARNING);
			return;
		}
		
		updateDescription("Check your Input and hit finish.");
		updateStatus(null);
		getControl().redraw();
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		canFlip = message == null;
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
		if(modelType == Constants.TRANSFORMATION_TYPE_PROMELA || modelType == Constants.TRANSFORMATION_TYPE_OPERATIONAL_PROMELA){
			if (string.endsWith(".pml")){
				return true;
			}
		}

		if(modelType == Constants.TRANSFORMATION_TYPE_KIV_LOCAL || modelType == Constants.TRANSFORMATION_TYPE_KIV_GLOBAL){
			if (string.endsWith(".kiv")){
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
			@SuppressWarnings("unused")
			Resource cfgResource = resourceSet.getResource(uri, true);
		}catch(WrappedException e){
			return 400;
		}
		nextPage.loadCfg();
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

		if (memento.getString(Constants.CFGLOC) != null)
		{
			sourceGraphModelFileName = memento.getString(Constants.CFGLOC);
			tx_sourceGraphModelFileName.setText(sourceGraphModelFileName);
		}

		if (memento.getString(Constants.CONTAINER) != null)
		{
			targetContainer = memento.getString(Constants.CONTAINER);
			tx_targetContainer.setText(targetContainer);
		}

		if (memento.getString(Constants.NEW_FILE) != null)
		{
			targetFileName = memento.getString(Constants.NEW_FILE);
			tx_targetFileName.setText(targetFileName);
		}

		if (memento.getString(Constants.MODEL_SELECTION) != null)
		{
			cb_modelType.select(memento.getInteger(Constants.MODEL_SELECTION));
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
				if (Constants.FILE_EXT.equals(file.getFileExtension()))
				{
					//set source file name according to selection
					sourceGraphModelFileName = file.getFullPath().toPortableString();
					tx_sourceGraphModelFileName.setText(sourceGraphModelFileName);
					
					//set target container according to selection
					this.targetContainer = file.getFullPath().removeLastSegments(1).toPortableString();
					tx_targetContainer.setText(this.targetContainer);
					
					//Set target file name according to selection
					targetFileName = file.getName().replace("."+Constants.FILE_EXT,"");
					tx_targetFileName.setText(targetFileName);
					
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
			return data.getChild(Constants.MEMENTO__KEY);
		} catch (Exception e)
		{
			// hide it, as this is just for convenience and the previous data is not crucial for the dialog
		}
		return null;
	}

	protected synchronized void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(Constants.MEMENTO__KEY);
		IMemento child = memento.createChild(Constants.MEMENTO__KEY);
		child.putString(Constants.CFGLOC, tx_sourceGraphModelFileName.getText());
		child.putString(Constants.CONTAINER, tx_targetContainer.getText());
		child.putString(Constants.NEW_FILE, tx_targetFileName.getText());
		child.putInteger(Constants.MODEL_SELECTION, cb_modelType.getSelectionIndex());
		Activator.saveMementoToFile(memento);
	}


	public String getNewFileLoc() {
		return targetFileName;
	}
	
	@Override
	public boolean canFlipToNextPage(){
		return canFlip;
	}


	public void setNewFileLoc(String newFileLoc) {
		this.targetFileName = newFileLoc;
	}


	public String getContainerLoc() {
		return targetContainer;
	}


	public void setContainerLoc(String containerLoc) {
		this.targetContainer = containerLoc;
	}


	public Text getContainerText() {
		return tx_targetContainer;
	}


	public void setContainerText(Text containerText) {
		this.tx_targetContainer = containerText;
	}


	public Text getGraphModelFile() {
		return tx_sourceGraphModelFileName;
	}

	public Text getFileText(){
		return tx_targetFileName;
	}


	public void setGraphModelFile(Text graphModelFile) {
		this.tx_sourceGraphModelFileName = graphModelFile;
	}
	
	public Label getFileEndingLabel(){
		return lb_fileEnding;
	}
	
	public String getBasis() {
		return basis;
	}

}
