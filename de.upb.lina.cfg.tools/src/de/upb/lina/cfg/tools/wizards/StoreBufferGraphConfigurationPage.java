package de.upb.lina.cfg.tools.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.ResourceIOUtil;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (cfg).
 */

public class StoreBufferGraphConfigurationPage extends ConfigurationPage {
	
	private static final String MSG_WARNING_AST_FILE_OVERWRITE = "This generation will overwrite the according AST file: ";
	//Other Constants
	public final static String MEMENTO__KEY = "de.upb.lina.cfg.selection.wizard";
	private final static String ASTLOC = "astloc";
	private final static String CONTAINER = "container";
	private final static String NEW_FILE = "newFile";
	private final static String MODEL_SELECTION = "modelSelection";
	public static final String[] SUPPORTED_SEMANTICS = new String[] { "SC", "TSO", "PSO" };
	
	private static final String MSG_STATUS_WRONG_FILE_TYPE = "Invalid input file type. Please select a ." + CFGConstants.LLVM_FILE_EXTENSION + " or ." + CFGConstants.S_FILE_EXTENSION + " file.";
	
	/*output folder browse dialog*/
	public static final String DG_TX_SELECTION_MESSAGE = "Please select the output file folder.";
	
	/*input file browse dialog*/
	private static final String DG_TX_MESSAGE = "Please select an input file (." + CFGConstants.S_FILE_EXTENSION + " or ." + CFGConstants.LLVM_FILE_EXTENSION + ").";
	private static final String DG_TX_TITLE = "Input file selection";
	
	/*GUI label labels*/
	private static final String LB_TX_INPUT_FILE = "&Input file: \n(." + CFGConstants.S_FILE_EXTENSION + " or ." + CFGConstants.LLVM_FILE_EXTENSION + ")";
	private static final String LB_TX_REORDERING = "Semantics:";
	private static final String LB_TX_NEW_FILENAME = "&Output filename:";
	private static final String LB_TX_CONTAINER = "&Output folder:";
	
	/*GUI page information*/
	private static final String PAGE_DESCRIPTION = "Please configure your transformation.";
	private static final String PAGE_TITLE = "Configuration of transformation.";
	
	//GUI elements
	private Text tx_targetContainerName;
	private Text tx_outputFileName;
	private Combo cb_semanticsSelection;
	private Text tx_sourceAstFileName;
	private Label lb_overwritingFilesWarning;
	
	//storage for GUI element input
	private int selectedSemantics = 0;
	
	private CreateStoreBufferGraphWizard createStoreBufferGraphWizard;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public StoreBufferGraphConfigurationPage(IStructuredSelection selection, CreateStoreBufferGraphWizard wizard) {
		super("wizardPage", PAGE_TITLE, PAGE_DESCRIPTION, selection, wizard);
		this.createStoreBufferGraphWizard = (CreateStoreBufferGraphWizard)wizard;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		
		createInputFileGui(container, gd);

		createOutputFolderGui(container, gd);

		createButton(container, SWT.PUSH, WizardMessageConstants.BT_TX_BROWSE, createSelectionAdapter(false, true));		
		
		createOutputFileNameGui(container, gd);
		
		createLabel(container, SWT.NULL, "");

		createSemanticSelectionGui(container);
		
		createLabel(container, SWT.NULL, "");
		
		createOverwritingOutputFileWarningGui(container);
		
		setControl(container);
		initializeGuiElements(MEMENTO__KEY, CFGActivator.getStateFile());
		validateInput();

	}

	public void createOutputFolderGui(final Composite container, GridData gd) {
		Label label1 = new Label(container, SWT.NULL);
		label1.setText(LB_TX_CONTAINER);

		tx_targetContainerName = createText(container, SWT.BORDER | SWT.SINGLE, createModifyListener(false), gd);
	}

	public void createInputFileGui(final Composite container, GridData gd) {
		Label label = new Label(container, SWT.NULL);
		label.setText(LB_TX_INPUT_FILE);
		tx_sourceAstFileName = createText(container, SWT.BORDER | SWT.SINGLE, createModifyListener(false), gd);
		//browse button
		createButton(container, SWT.PUSH, WizardMessageConstants.BT_TX_BROWSE, createSelectionAdapter(true, false));	
	}

	public void createOutputFileNameGui(final Composite container, GridData gd) {
		createLabel(container, SWT.NULL, LB_TX_NEW_FILENAME);
		tx_outputFileName = createText(container, SWT.BORDER | SWT.SINGLE, createModifyListener(false), gd);
		tx_outputFileName.setText("new_file.cfg");
		tx_outputFileName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
	}

	public void createOverwritingOutputFileWarningGui(final Composite container) {
		lb_overwritingFilesWarning = createLabel(container, SWT.NULL, "");
		GridData gridData = new GridData(GridData.VERTICAL_ALIGN_END);
	    gridData.horizontalSpan = 2;
	    gridData.horizontalAlignment = GridData.FILL;
	    lb_overwritingFilesWarning.setLayoutData(gridData);
	}

	public void createSemanticSelectionGui(final Composite container) {
		new Label(container, SWT.NULL).setText(LB_TX_REORDERING);
		cb_semanticsSelection = new Combo(container, SWT.NULL);
		for (int i = 0; i < SUPPORTED_SEMANTICS.length; i++){
			cb_semanticsSelection.add(SUPPORTED_SEMANTICS[i]);
		}
		cb_semanticsSelection.addModifyListener(createModifyListener(true));
		cb_semanticsSelection.select(0);
		cb_semanticsSelection.setEnabled(true);
	}
	
	private ModifyListener createModifyListener(final boolean doModelSelection){
		return new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(doModelSelection){
					selectedSemantics = cb_semanticsSelection.getSelectionIndex();
				}
				validateInput();
			}
		};
	}
	
	/**
	 * updates ast location text field
	 */
	protected void handleInputFileSelection()
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
					return CFGConstants.LLVM_FILE_EXTENSION.equals(file.getFileExtension()) || CFGConstants.S_FILE_EXTENSION.equals(file.getFileExtension());
				}
				return false;
			}
		});
		dialog.setTitle(DG_TX_TITLE);
		dialog.setMessage(DG_TX_MESSAGE);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setDoubleClickSelects(true);
		
		evaluateSelectionDialogResult(dialog, tx_sourceAstFileName);
	}

	/**
	 * updates container text field
	 */
	protected void handleOutputFolderSelection()
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), root, false, DG_TX_SELECTION_MESSAGE);
		evaluateSelectionDialogResult(dialog, tx_targetContainerName);
	}

	/**
	 * Validates the dialog input.
	 */
	public void validateInput() {
		setPathToInputFile(this.tx_sourceAstFileName.getText());
		setPathToOutputFolder(this.tx_targetContainerName.getText());
		setNameOfOutputFile(this.tx_outputFileName.getText());
		setPageComplete(false);

		if (!isInputFileExtensionValid())
		{
			updateErrorMessage(MSG_STATUS_WRONG_FILE_TYPE);
			return;
		}
		
		if (!isFileAccessible(getPathToInputFile()))
		{
			updateErrorMessage(WizardMessageConstants.MSG_STATUS_INPUT_FILE_NOT_EXISTING);
			return;
		}
		if(getPathToInputFile().endsWith("." + CFGConstants.LLVM_FILE_EXTENSION)){
			if (ResourceIOUtil.loadAst(getPathToInputFile()) == null)
			{
				updateErrorMessage(WizardMessageConstants.MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED);
				return;
			}
			lb_overwritingFilesWarning.setText("");
		}
		//.s extension
		else{
			if(ResourceIOUtil.createAstFromLLVM(getPathToInputFile()) == null){
				updateErrorMessage(WizardMessageConstants.MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED);
				return;
			}
			
			if(doesFileExist(createStoreBufferGraphWizard.getPathToAstOutputFile())){
				lb_overwritingFilesWarning.setText(MSG_WARNING_AST_FILE_OVERWRITE + createStoreBufferGraphWizard.getPathToAstOutputFile());
			}else{
				lb_overwritingFilesWarning.setText("");
			}
		}		

		if (!isValidFolderPath(tx_targetContainerName.getText())) {
			if(!tx_targetContainerName.getText().startsWith("/")){
				updateErrorMessage(WizardMessageConstants.MSG_STATUS_INVALID_OUTPUT_CONTAINER_NAME);
			}else{
				updateErrorMessage(WizardMessageConstants.MSG_STATUS_INVALID_OUTPUT_CONTAINER);
			}
			return;
		}
		if (!isValidCFGName(tx_outputFileName.getText())) {
			updateErrorMessage(WizardMessageConstants.MSG_STATUS_INVALID_OUTPUT_FILE_NAME);
			return;
		}
		
		//make sure we can go into the error view
		updateErrorMessage(null);
		setDescription(WizardMessageConstants.MSG_STATUS_OK);
		
		//redo checks
		wizard.restartChecks();
		getControl().redraw();
	}

	/**
	 * Checks whether the extension of the input file is valid. 
	 * 
	 * @return true if the input file name ends on a valid extension, false else
	 */
	private boolean isInputFileExtensionValid()
	{
		String inputFilePath = getPathToInputFile();
		if(!inputFilePath.isEmpty()){
			if(inputFilePath.endsWith("." + CFGConstants.LLVM_FILE_EXTENSION) || inputFilePath.endsWith("." + CFGConstants.S_FILE_EXTENSION)){
				return true;
			}
		}
		
		return false;
	}
	
	protected synchronized void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(MEMENTO__KEY);
		IMemento child = memento.createChild(MEMENTO__KEY);
		child.putString(ASTLOC, getPathToInputFile());
		child.putString(CONTAINER, getPathToOutputFolder());
		child.putString(NEW_FILE, getNameOfOutputFile());
		child.putInteger(MODEL_SELECTION, getSelectedSemantics());
		CFGActivator.saveMementoToFile(memento);
	}
	
	/*=== Getter methods ===*/

	/**
	 * Returns the value of the selected semantics. 
	 * 
	 * @return selectedSemantics see semantics in {@link de.upb.lina.cfg.tools.CFGConstants}.
	 */
	public int getSelectedSemantics() {

		return selectedSemantics;
	}

	@Override
	protected void initializeDefaultGuiElementValuesFromFile(IFile file) {
		if (CFGConstants.LLVM_FILE_EXTENSION.equals(file.getFileExtension()) || CFGConstants.S_FILE_EXTENSION.equals(file.getFileExtension()))
		{
			IPath pathOfSelectedFile = file.getFullPath();
			//set input file according to selection
			setPathToInputFile(pathOfSelectedFile.toPortableString());
			tx_sourceAstFileName.setText(getPathToInputFile());
			
			//set output folder according to selection
			setPathToOutputFolder(pathOfSelectedFile.removeLastSegments(1).toPortableString());
			tx_targetContainerName.setText(getPathToOutputFolder());
			
			//set output file name according to selection
			setNameOfOutputFile(pathOfSelectedFile.lastSegment().split("\\.")[0]+ "." + CFGConstants.CFG_FILE_EXTENSION);
			tx_outputFileName.setText(getNameOfOutputFile());
		}
	}

	@Override
	protected void initializeDefaultGuiElementValuesFromMemento() {
		if(memento != null){
			if (memento.getString(ASTLOC) != null)
			{
				setPathToInputFile(memento.getString(ASTLOC));
				tx_sourceAstFileName.setText(getPathToInputFile());
			}
	
			if (memento.getString(CONTAINER) != null)
			{
				setPathToOutputFolder(memento.getString(CONTAINER));
				tx_targetContainerName.setText(getPathToOutputFolder());
			}
	
			if (memento.getString(NEW_FILE) != null)
			{
				setNameOfOutputFile(memento.getString(NEW_FILE));
				tx_outputFileName.setText(getNameOfOutputFile());
			}
	
			if (memento.getString(MODEL_SELECTION) != null)
			{
				cb_semanticsSelection.select(memento.getInteger(MODEL_SELECTION));
			}
		}
	}
}