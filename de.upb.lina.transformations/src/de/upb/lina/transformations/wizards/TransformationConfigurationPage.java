package de.upb.lina.transformations.wizards;

import java.io.File;

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
import de.upb.lina.cfg.tools.wizards.WizardMessageConstants;
import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.Constants;
import de.upb.lina.transformations.logic.ETransformationType;

/**
 * @author Oleg Travkin
 *
 */
public class TransformationConfigurationPage extends ExtendedWizardPage {
	private static final String PAGE_NAME = "Generate New Specification";
	private static final String PAGE_DESCRIPTION = "Please select the SBG model you wish to transform.";
	private static final String PAGE_TITLE = "SBG - Selection";
	
	private static final String LB_TX_TRANSFORMATION_BASIS = "Transformation based on ";
	private static final String LB_TX_TRANSFORMATION_TYPE = "Transformation type:";
	private static final String LB_TX_INPUT_FILE = "&Input file: \n(." + CFGConstants.CFG_FILE_EXTENSION + ")";
	private static final String LB_TX_NEW_FILENAME = "&Output filename:";
	private static final String LB_TX_CONTAINER = "&Output folder:";
	
	private static final String MSG_STATUS_WRONG_FILE_TYPE = "Invalid input file type. Please select a ." + CFGConstants.CFG_FILE_EXTENSION + " file.";
	
	
	//GUI elements
	private Text tx_outputFolderPath;
	private Text tx_outputFileName;
	private Text tx_inputFilePath;
	private Combo cb_transformationType;
	private Combo cb_kivBasis;
	private Label lb_outputFileExtension;

	//storage for input of GUI elements
	private ETransformationType transformationType = ETransformationType.PROMELA;

	private boolean canGoToNextPage = true;
	
	private boolean guiCompletelySetUp = false;

	private ISelection userSelection;

	private FunctionSelectionPage nextPage;
	private IMemento memento;


	public TransformationConfigurationPage(ISelection userSelection, FunctionSelectionPage nextPage) {
		super(PAGE_NAME, PAGE_TITLE, PAGE_DESCRIPTION);
		this.nextPage = nextPage;
		this.userSelection = userSelection;
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

		createInputFileGui(container, gd);
		createOutputFolderGui(container, gd);
		createOutputFileGui(container, gd);
		createTransformationTypeGui(container);
		createKivBasisGui(container);

		setControl(container);
		initializeGuiElements();
		validateInput();
	}

	/**
	 * Creates all GUI elements for the KIV basis selection.
	 * 
	 * @param container gui container to add the elements
	 */
	private void createKivBasisGui(final Composite container) {
		createLabel(container, SWT.NONE, "");
		createLabel(container, SWT.NULL, LB_TX_TRANSFORMATION_BASIS);
		cb_kivBasis = new Combo(container, SWT.NULL);
		String[] basisTypes = new String[] { Constants.KIV_BASIS_NAT, Constants.KIV_BASIS_INT };
		for (int i = 0; i < basisTypes.length; i++){
			cb_kivBasis.add(basisTypes[i]);
		}
		cb_kivBasis.select(Constants.NAT_INDEX);
		cb_kivBasis.setEnabled(false);
	}

	/**
	 * Creates all GUI elements for the transformation type selection.
	 * 
	 * @param container gui container to add the elements
	 */
	private void createTransformationTypeGui(final Composite container) {
		createLabel(container, SWT.NULL, LB_TX_TRANSFORMATION_TYPE);
		
		cb_transformationType = new Combo(container, SWT.NULL);
		for(ETransformationType transformationType: ETransformationType.getTransformationTypes()){
			cb_transformationType.add(transformationType.getIdentifier());
		}
		
		cb_transformationType.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setTransformationTypeAccordingToSelection();
				adaptGuiAccordingToTransformationType();
				validateInput();
			}

			private void adaptGuiAccordingToTransformationType() {
				if(transformationType.isKivTransformation()){
					tx_outputFileName.setEnabled(false);
					enableKivBasisComboBox();
				}else if(transformationType.isPromelaTransformation()){
					tx_outputFileName.setEnabled(true);
					disableKivBasisComboBox();
				}
			}

			private void setTransformationTypeAccordingToSelection() {
				int transformationTypeId = cb_transformationType.getSelectionIndex();
				transformationType = ETransformationType.getTransformationTypeById(transformationTypeId);
				handleUnkownTransformationTypeId(transformationTypeId);
			}

			private void handleUnkownTransformationTypeId(
					int transformationTypeId) {
				if(transformationType == null){
					new RuntimeException("Unknown transformation type with id " + transformationTypeId);
				}
			}

			private void disableKivBasisComboBox() {
				if(cb_kivBasis != null){
					cb_kivBasis.setEnabled(false);
				}
			}

			private void enableKivBasisComboBox() {
				if(cb_kivBasis != null)
				{
					cb_kivBasis.setEnabled(true);
				}
			}
		});

		cb_transformationType.select(0);
		cb_transformationType.setEnabled(true);
	}

	/**
	 * Creates all GUI elements for output file selection.
	 * 
	 * @param container gui container to add the elements
	 */
	public void createOutputFileGui(final Composite container, GridData gd) {
		createLabel(container, SWT.NULL, LB_TX_NEW_FILENAME);

		tx_outputFileName = createText(container, SWT.BORDER | SWT.SINGLE, 
				new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		}, gd);

		lb_outputFileExtension = new Label(container, SWT.NULL);
		lb_outputFileExtension.setText(".pml");
	}

	/**
	 * Creates all GUI elements for the output folder selection.
	 * 
	 * @param container gui container to add the elements
	 */
	public void createOutputFolderGui(final Composite container, GridData gd) {
		createLabel(container, SWT.NULL, LB_TX_CONTAINER);

		tx_outputFolderPath = createText(container, SWT.BORDER | SWT.SINGLE, 
				new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		}, gd);


		createButton(container, SWT.PUSH, WizardMessageConstants.BT_TX_BROWSE, 
				new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerBrowse(tx_outputFolderPath);
			}
		});
	}

	/**
	 * Creates all GUI elements for the input file selection.
	 * 
	 * @param container gui container to add the elements
	 */
	public void createInputFileGui(final Composite container, GridData gd) {
		createLabel(container, SWT.NULL, LB_TX_INPUT_FILE);
		tx_inputFilePath = createText(container, SWT.BORDER | SWT.SINGLE, 
				new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateInput();
			}
		}, gd);
		
		createButton(container, SWT.PUSH, WizardMessageConstants.BT_TX_BROWSE, 
				new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleElementBrowse(tx_inputFilePath);
			}
		});
	}


	/**
	 * Returns the id of the selected transformation type. See also {@see ETransformationType}.
	 * 
	 * @return id of the selected transformation type
	 */
	public int getIdForSelectedTransformationType()
	{
		return cb_transformationType.getSelectionIndex();
	}

	/**
	 * Returns the file extension for the selected transformation type.
	 * 
	 * @return file extension for the selected transformation type.
	 */
	private String getFileExtensionForSelectedTransformationType(){
		switch (cb_transformationType.getSelectionIndex()) {
		case 0:
			return "." + Constants.PROMELA_FILE_EXTENSION;
		case 1:
			return "";
		case 2:
			return "";
		case 3:
			return "." + Constants.PROMELA_FILE_EXTENSION;
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
		dialog.setTitle(PAGE_TITLE);
		dialog.setMessage(PAGE_DESCRIPTION);
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
		if(guiCompletelySetUp){
			lb_outputFileExtension.setText(getFileExtensionForSelectedTransformationType());
			lb_outputFileExtension.pack();
	
			int result = checkCFGFile(getInputFilePath());
			if (result >= 400) {
				updateErrorMessage(WizardMessageConstants.MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED);
				return;
			}else if (result >= 300) {
				updateErrorMessage(MSG_STATUS_WRONG_FILE_TYPE);
				return;
			} else if (result >= 200) {
				updateErrorMessage(WizardMessageConstants.MSG_STATUS_INPUT_FILE_NOT_EXISTING);
				return;
			} else if (result >= 100) {
				updateErrorMessage(MSG_STATUS_WRONG_FILE_TYPE);
				return;
			}
	
			if (!isValidFolderPath(tx_outputFolderPath.getText())) {
				if(!tx_outputFolderPath.getText().startsWith("/")){
					updateErrorMessage(WizardMessageConstants.MSG_STATUS_INVALID_OUTPUT_CONTAINER_NAME);
				}else{
					updateErrorMessage(WizardMessageConstants.MSG_STATUS_INVALID_OUTPUT_CONTAINER);
				}
				return;
			}
	
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	
			IPath path = new Path(tx_outputFolderPath.getText());
			IResource resource = myWorkspaceRoot.findMember(path);
			IPath searchPath = resource.getLocation().append(File.separator + tx_outputFileName.getText() + lb_outputFileExtension.getText());
	
			if(searchPath.toFile().exists()){
				updateWarning("A file with the given name does already exist. If you continue the present file will be overwritten!", WARNING);
				return;
			}
	
			path = new Path(tx_outputFolderPath.getText());
			resource = myWorkspaceRoot.findMember(path);
			searchPath = resource.getLocation().append(File.separator+"specs"+File.separator+"PC.utf8");
	
			if(searchPath.toFile().exists() && (transformationType == ETransformationType.KIV_LOCAL ||transformationType == ETransformationType.KIV_GLOBAL)){
				updateWarning("The selected target folder already contains a KIV Specification. If you continue the present files will be overwritten!", WARNING);
				return;
			}
			
			nextPage.setPathToInputFile(getInputFilePath());
			
			updateDescription(WizardMessageConstants.MSG_STATUS_OK);
			updateErrorMessage(null);
			getControl().redraw();
		}
	}



	@Override
	protected void updateErrorMessage(String message) {
		super.updateErrorMessage(message);
		canGoToNextPage = true;
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
			resourceSet.getResource(uri, true);
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

		if (userSelection != null && userSelection instanceof IStructuredSelection)
		{
			IStructuredSelection structuredSelectionByUser = (IStructuredSelection) userSelection;
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
		guiCompletelySetUp = true;
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
			tx_inputFilePath.setText(file.getFullPath().toPortableString());
			tx_outputFolderPath.setText(file.getFullPath().removeLastSegments(1).toPortableString());
			tx_outputFileName.setText(file.getName().replace("." + CFGConstants.CFG_FILE_EXTENSION,""));
		}
	}

	private void initializeDefaultGuiElementValuesFromMemento() {
		if(memento != null){
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_CFGLOC) != null)
			{
				tx_inputFilePath.setText(memento.getString(Constants.TRANSFORMATION_WIZARD_CFGLOC));
			}
	
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_CONTAINER) != null)
			{
				tx_outputFolderPath.setText(memento.getString(Constants.TRANSFORMATION_WIZARD_CONTAINER));
			}
	
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_NEW_FILE) != null)
			{
				tx_outputFileName.setText(memento.getString(Constants.TRANSFORMATION_WIZARD_NEW_FILE));
			}
	
			if (memento.getString(Constants.TRANSFORMATION_WIZARD_MODEL_SELECTION) != null)
			{
				cb_transformationType.select(memento.getInteger(Constants.TRANSFORMATION_WIZARD_MODEL_SELECTION));
			}
		}
	}

	protected synchronized void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(Constants.TRANSFORMATION_WIZARD_MEMENTO__KEY);
		IMemento child = memento.createChild(Constants.TRANSFORMATION_WIZARD_MEMENTO__KEY);
		child.putString(Constants.TRANSFORMATION_WIZARD_CFGLOC, tx_inputFilePath.getText());
		child.putString(Constants.TRANSFORMATION_WIZARD_CONTAINER, tx_outputFolderPath.getText());
		child.putString(Constants.TRANSFORMATION_WIZARD_NEW_FILE, tx_outputFileName.getText());
		child.putInteger(Constants.TRANSFORMATION_WIZARD_MODEL_SELECTION, cb_transformationType.getSelectionIndex());
		Activator.saveMementoToFile(memento);
	}

	@Override
	public boolean canFlipToNextPage(){
		return canGoToNextPage;
	}
	
	public String getOutputFileExtension(){
		return lb_outputFileExtension.getText();
	}

	public String getKivBasis() {
		if(cb_kivBasis.getSelectionIndex() == Constants.NAT_INDEX){
			return Constants.KIV_BASIS_NAT;
		}else if(cb_kivBasis.getSelectionIndex() == Constants.INT_INDEX){
			return Constants.KIV_BASIS_INT;
		}
		return null;
	}
	
	public String getInputFilePath(){
		return tx_inputFilePath.getText();
	}
	
	public String getOutputFileName(){
		return tx_outputFileName.getText();
	}
	
	public String getOutputFolderPath(){
		return tx_outputFolderPath.getText();
	}

}
