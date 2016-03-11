package de.upb.lina.transformations.wizards;

import java.io.File;
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
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

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.wizards.ExtendedWizardPage;
import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.Constants;

/**
 * @author Oleg Travkin
 *
 */
public class TransformationConfigurationPage extends ExtendedWizardPage {


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
	private String basis = Constants.KIV_BASIS_NAT;

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
	public TransformationConfigurationPage(String pageName, ISelection selection, FunctionSelectionPage nextPage) {
		super(pageName, "CFG - Selection", "Please select the CFG model you wish to transform.");
		this.nextPage = nextPage;
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
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);

		/* Graph select */
		Label label = new Label(container, SWT.NULL);
		label.setText("&ControlFlowDiagram-File:");

		tx_sourceGraphModelFileName = createText(container, SWT.BORDER | SWT.SINGLE, 
				new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		}, gd);


		createButton(container, SWT.PUSH, "Browse", 
				new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleElementBrowse(tx_sourceGraphModelFileName);
			}
		});


		/* container select */
		Label label1 = new Label(container, SWT.NULL);
		label1.setText("&Target Container:");

		tx_targetContainer = createText(container, SWT.BORDER | SWT.SINGLE, 
				new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		}, gd);


		createButton(container, SWT.PUSH, "Browse", 
				new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerBrowse(tx_targetContainer);
			}
		});

		/* new_file name */
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		tx_targetFileName = createText(container, SWT.BORDER | SWT.SINGLE, 
				new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		}, gd);

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
		String[] basisTypes = new String[] { Constants.KIV_BASIS_NAT, Constants.KIV_BASIS_INT };
		for (int i = 0; i < basisTypes.length; i++){
			cb_basis.add(basisTypes[i]);
		}
		cb_basis.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(cb_basis.getSelectionIndex() == Constants.NAT_INDEX){
					basis = Constants.KIV_BASIS_NAT;
				}else if(cb_basis.getSelectionIndex() == Constants.INT_INDEX){
					basis = Constants.KIV_BASIS_INT;
				}

			}
		});

		cb_basis.select(Constants.NAT_INDEX);
		cb_basis.setEnabled(false);

		setControl(container);
		initializeGuiElements();
		validateInput();
	}


	/**
	 * @return selected type of transformation according to @see Constants
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
					return CFGConstants.CFG_FILE_EXTENSION.equals(file.getFileExtension());
				}
				return false;
			}
		});
		dialog.setTitle("CFG - Selection");
		dialog.setMessage("Select a ControlFlowDiagram-file:");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setDoubleClickSelects(true);

		evaluateSelectionDialogResult(dialog, textf);
	}

	private void handleContainerBrowse(Text textf) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace()
				.getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(),root , false, "Select new file container.");
		evaluateSelectionDialogResult(dialog, textf);
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void validateInput() {
		sourceGraphModelFileName = this.tx_sourceGraphModelFileName.getText();
		targetContainer = this.tx_targetContainer.getText();
		targetFileName = this.tx_targetFileName.getText();
		
		lb_fileEnding.setText(getFileEndForSelection());
		lb_fileEnding.pack();

		int result = checkCFGFile(sourceGraphModelFileName);
		if (result >= 400) {
			updateErrorMessage("The selected CFG-file cannot be loaded.");
			return;
		}else if (result >= 300) {
			updateErrorMessage("Select a CFG-file (*.cfg)");
			return;
		} else if (result >= 200) {
			updateErrorMessage("The specified path refers no exisiting CFG-file.");
			return;
		} else if (result >= 100) {
			updateErrorMessage("The CFG-file extension has to be type of *.cfg");
			return;
		}

		if (!isValidContainer(tx_targetContainer.getText())) {
			if(!tx_targetContainer.getText().startsWith("/")){
				updateErrorMessage("The container has to start with '/'.");
			}else{
				updateErrorMessage("No valid container is selected.");
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
		
		nextPage.setPathToInputFile(sourceGraphModelFileName);
		
		updateDescription("Check your Input and hit finish.");
		updateErrorMessage(null);
		getControl().redraw();
	}



	@Override
	protected void updateErrorMessage(String message) {
		super.updateErrorMessage(message);
		canFlip = true;
	}

	/**
	 * Displays a warning, but finishes the dialog
	 * @param message
	 * @param level
	 */
	private void updateWarning(String message, int level) {
		setMessage(message, level);
		setPageComplete(false);
		updateErrorMessage(null);
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
		if (cfgLocation.substring(cfgLocation.length() - 3).equalsIgnoreCase(CFGConstants.CFG_FILE_EXTENSION) == false) {
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

		nextPage.setPathToInputFile(cfgLocation);
		return 0;
	}

	/**
	 * Fetch last dialog input and update to current selection if it is an AST file. 
	 */
	private void initializeGuiElements()
	{
		if (memento == null){
			memento = loadMementoState(Constants.TRANSFORMATION_WIZARD_MEMENTO__KEY, Activator.getStateFile());
		}
		
		initializeDefaultGuiElementValuesFromMemento();

		if (selection != null && selection instanceof IStructuredSelection)
		{
			IStructuredSelection structuredSelectionByUser = (IStructuredSelection) selection;
			if (hasExactlyOneSelectedElement(structuredSelectionByUser))
			{
				Object selectedObject = structuredSelectionByUser.getFirstElement();
				if (selectedObject instanceof IFile)
				{
					IFile file = (IFile) selectedObject;
					initializeDefaultGuiElementValuesFromFile(file);
				}
			}
		}

	}
	
	private boolean hasExactlyOneSelectedElement(
			IStructuredSelection structuredSelectionByUser) {
		return structuredSelectionByUser.size() == 1;
	}

	/**
	 * Intializes the default values of the GUI with the information from the given file
	 * if it is a SBG file.
	 * 
	 * @param file default values for initialization are taken from this file
	 */
	private void initializeDefaultGuiElementValuesFromFile(IFile file) {
		if (CFGConstants.CFG_FILE_EXTENSION.equals(file.getFileExtension()))
		{
			//set source file name according to selection
			sourceGraphModelFileName = file.getFullPath().toPortableString();
			tx_sourceGraphModelFileName.setText(sourceGraphModelFileName);

			//set target container according to selection
			this.targetContainer = file.getFullPath().removeLastSegments(1).toPortableString();
			tx_targetContainer.setText(this.targetContainer);

			//Set target file name according to selection
			targetFileName = file.getName().replace("." + CFGConstants.CFG_FILE_EXTENSION,"");
			tx_targetFileName.setText(targetFileName);

		}
	}

	private void initializeDefaultGuiElementValuesFromMemento() {
		if(memento != null){
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_CFGLOC) != null)
			{
				sourceGraphModelFileName = memento.getString(Constants.TRANSFORMATION_WIZARD_CFGLOC);
				tx_sourceGraphModelFileName.setText(sourceGraphModelFileName);
			}
	
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_CONTAINER) != null)
			{
				targetContainer = memento.getString(Constants.TRANSFORMATION_WIZARD_CONTAINER);
				tx_targetContainer.setText(targetContainer);
			}
	
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_NEW_FILE) != null)
			{
				targetFileName = memento.getString(Constants.TRANSFORMATION_WIZARD_NEW_FILE);
				tx_targetFileName.setText(targetFileName);
			}
	
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_MODEL_SELECTION) != null)
			{
				cb_modelType.select(memento.getInteger(Constants.TRANSFORMATION_WIZARD_MODEL_SELECTION));
			}
		}
	}

	protected synchronized void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(Constants.TRANSFORMATION_WIZARD_MEMENTO__KEY);
		IMemento child = memento.createChild(Constants.TRANSFORMATION_WIZARD_MEMENTO__KEY);
		child.putString(Constants.TRANSFORMATION_WIZARD_CFGLOC, tx_sourceGraphModelFileName.getText());
		child.putString(Constants.TRANSFORMATION_WIZARD_CONTAINER, tx_targetContainer.getText());
		child.putString(Constants.TRANSFORMATION_WIZARD_NEW_FILE, tx_targetFileName.getText());
		child.putInteger(Constants.TRANSFORMATION_WIZARD_MODEL_SELECTION, cb_modelType.getSelectionIndex());
		Activator.saveMementoToFile(memento);
	}

	@Override
	public boolean canFlipToNextPage(){
		return canFlip;
	}

	public Text getContainerText() {
		return tx_targetContainer;
	}

	public Text getGraphModelFile() {
		return tx_sourceGraphModelFileName;
	}

	public Text getFileText(){
		return tx_targetFileName;
	}

	public Label getFileEndingLabel(){
		return lb_fileEnding;
	}

	public String getBasis() {
		return basis;
	}

}
