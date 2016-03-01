package de.upb.lina.cfg.tools.wizards;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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

import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.CFGActivator;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (cfg).
 */

public class ConfigurationPage extends ExtendedWizardPage {
	
	//Other Constants
	public final static String MEMENTO__KEY = "de.upb.lina.cfg.selection.wizard";
	private final static String ASTLOC = "astloc";
	private final static String CONTAINER = "container";
	private final static String NEW_FILE = "newFile";
	private final static String MODEL_SELECTION = "modelSelection";
	public final static String LLVM_FILE_EXTENSION = "llvm";
	public static final String CFG_FILE_EXTENSION = "cfg";
	public static final String S_FILE_EXTENSION = "s";
	private static final String[] SUPPORTED_SEMANTICS = new String[] { "SC", "TSO", "PSO" };
	
	//Label Constants
	private static final String MSG_STATUS_INVALID_OUTPUT_CONTAINER_NAME = "The folder path has to start with '/'.";
	private static final String MSG_STATUS_INVALID_OUTPUT_CONTAINER = "Invalid output folder.";
	private static final String MSG_STATUS_INVALID_OUTPUT_FILE_NAME = "Invalid output filename.";
	private static final String MSG_STATUS_OK = "Check your input and press next or finish!";
	private static final String MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED = "Unable to load the specified input file.";
	private static final String MSG_STATUS_INPUT_FILE_NOT_EXISTING = "The specified input file does not exist.";
	private static final String MSG_STATUS_WRONG_FILE_TYPE = "Invalid input file type. Please select a ." + LLVM_FILE_EXTENSION + " or ." + S_FILE_EXTENSION + " file.";
	
	/*output folder browse dialog*/
	private static final String DG_TX_SELECTION_MESSAGE = "Please select the output file folder.";
	
	/*input file browse dialog*/
	private static final String DG_TX_MESSAGE = "Please select an input file (." + S_FILE_EXTENSION + " || ." + LLVM_FILE_EXTENSION + ").";
	private static final String DG_TX_TITLE = "Inpute file selection";
	
	/*GUI label labels*/
	private static final String LB_TX_INPUT_FILE = "&Input file: \n(." + S_FILE_EXTENSION + " || ." + LLVM_FILE_EXTENSION + ")";
	private static final String LB_TX_REORDERING = "Semantics:";
	private static final String LB_TX_NEW_FILENAME = "&Output filename:";
	private static final String LB_TX_CONTAINER = "&Output folder:";
	
	/*GUI button labels*/
	private static final String BT_TX_BROWSE = "Browse";
	
	/*GUI page information*/
	private static final String PAGE_DESCRIPTION = "Please configure your transformation.";
	private static final String PAGE_TITLE = "Configuration of transformation.";
	
	//GUI elements
	private Text tx_targetContainerName;
	private Text tx_outputFileName;
	private Combo cb_semanticsSelection;
	private Text tx_sourceAstFileName;
	
	//storage for GUI element input
	private String outputFileName = "";
	private String pathToOutputFolder = "";
	private String inputFilePath = "";
	private int selectedSemantics = 0;
	
	//selection given by user
	private ISelection selection;
	
	//memento
	private IMemento memento;
	
	//wizard
	private NewCfgWizard wizard;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ConfigurationPage(ISelection selection, NewCfgWizard wizard) {
		super("wizardPage", PAGE_TITLE, PAGE_DESCRIPTION);
		this.selection = selection;
		this.wizard = wizard;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		/* GUI initialization */
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		
		/* GUI elements for selection fo input file */
		Label label = new Label(container, SWT.NULL);
		label.setText(LB_TX_INPUT_FILE);
		
		
		tx_sourceAstFileName = createText(container, SWT.BORDER | SWT.SINGLE, createModifyListener(false), gd);
		
		createButton(container, SWT.PUSH, BT_TX_BROWSE, createSelectionAdapter(true, false));	

		/* container select */
		Label label1 = new Label(container, SWT.NULL);
		label1.setText(LB_TX_CONTAINER);

		tx_targetContainerName = createText(container, SWT.BORDER | SWT.SINGLE, createModifyListener(false), gd);

		createButton(container, SWT.PUSH, BT_TX_BROWSE, createSelectionAdapter(false, true));	

		/*GUI elements for the output file*/
		label = new Label(container, SWT.NULL);
		label.setText(LB_TX_NEW_FILENAME);
		
		tx_outputFileName = createText(container, SWT.BORDER | SWT.SINGLE, createModifyListener(false), gd);
		tx_outputFileName.setText("new_file.cfg");
		
		new Label(container, SWT.NULL).setText("");

		/*GUI elements for selection of semantics */
		new Label(container, SWT.NULL).setText(LB_TX_REORDERING);
		cb_semanticsSelection = new Combo(container, SWT.NULL);
		for (int i = 0; i < SUPPORTED_SEMANTICS.length; i++){
			cb_semanticsSelection.add(SUPPORTED_SEMANTICS[i]);
		}
		cb_semanticsSelection.addModifyListener(createModifyListener(true));
		cb_semanticsSelection.select(0);
		cb_semanticsSelection.setEnabled(true);
		
		setControl(container);
		initializeMementoAndSelection();
		validateInput();

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
	
	private SelectionListener createSelectionAdapter(final boolean doHandleAstFile, final boolean doHandleContainer){
		return new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if(doHandleAstFile){
					handleASTFileSelection();
				}
				if(doHandleContainer){
					handleContainerSelection();
				}
				
				validateInput();
			}
		};
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
			memento = loadMementoState(MEMENTO__KEY, CFGActivator.getStateFile());
			if (memento == null)
			{
				// nothing to initialize here
				return;
			}
		}

		if (memento.getString(ASTLOC) != null)
		{
			this.inputFilePath = memento.getString(ASTLOC);
			tx_sourceAstFileName.setText(this.inputFilePath);
		}

		if (memento.getString(CONTAINER) != null)
		{
			this.pathToOutputFolder = memento.getString(CONTAINER);
			tx_targetContainerName.setText(pathToOutputFolder);
		}

		if (memento.getString(NEW_FILE) != null)
		{
			this.outputFileName = memento.getString(NEW_FILE);
			tx_outputFileName.setText(this.outputFileName);
		}

		if (memento.getString(MODEL_SELECTION) != null)
		{
			cb_semanticsSelection.select(memento.getInteger(MODEL_SELECTION));
		}

		//if the user selected a file, we want to use that as standard input instead of the memento data
		if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection)
		{
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IFile)
			{
				IFile file = (IFile) obj;
				if (LLVM_FILE_EXTENSION.equals(file.getFileExtension()) || S_FILE_EXTENSION.equals(file.getFileExtension()))
				{
					IPath pathOfSelectedFile = file.getFullPath();
					//set input file according to selection
					this.inputFilePath = pathOfSelectedFile.toPortableString();
					tx_sourceAstFileName.setText(this.inputFilePath);
					
					//set output folder according to selection
					this.pathToOutputFolder = pathOfSelectedFile.removeLastSegments(1).toPortableString();
					tx_targetContainerName.setText(this.pathToOutputFolder);
					
					//set output file name according to selection
					this.outputFileName = pathOfSelectedFile.lastSegment().split("\\.")[0]+ "." + CFG_FILE_EXTENSION;
					tx_outputFileName.setText(this.outputFileName);
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
					return LLVM_FILE_EXTENSION.equals(file.getFileExtension()) || S_FILE_EXTENSION.equals(file.getFileExtension());
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
	private void handleContainerSelection()
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), root, false, DG_TX_SELECTION_MESSAGE);
		evaluateSelectionDialogResult(dialog, tx_targetContainerName);
	}

	/**
	 * Validates the dialog input.
	 */
	private void validateInput() {
		this.inputFilePath = this.tx_sourceAstFileName.getText();
		this.pathToOutputFolder = this.tx_targetContainerName.getText();
		this.outputFileName = this.tx_outputFileName.getText();
		setPageComplete(false);

		if (!isInputFileExtensionValid())
		{
			updateErrorMessage(MSG_STATUS_WRONG_FILE_TYPE);
			return;
		}
		
		if (!isFileAccessible(inputFilePath))
		{
			updateErrorMessage(MSG_STATUS_INPUT_FILE_NOT_EXISTING);
			return;
		}
		if(inputFilePath.endsWith("." + LLVM_FILE_EXTENSION)){
			if (ResourceIOUtil.loadAst(inputFilePath) == null)
			{
				updateErrorMessage(MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED);
				return;
			}
		}
		//.s extension
		else{
			if(ResourceIOUtil.createAstFromLLVM(inputFilePath) == null){
				updateErrorMessage(MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED);
				return;
			}
		}
			

		if (!isValidFolderPath(tx_targetContainerName.getText())) {
			if(!tx_targetContainerName.getText().startsWith("/")){
				updateErrorMessage(MSG_STATUS_INVALID_OUTPUT_CONTAINER_NAME);
			}else{
				updateErrorMessage(MSG_STATUS_INVALID_OUTPUT_CONTAINER);
			}
			return;
		}
		if (!isValidCFGName(tx_outputFileName.getText())) {
			updateErrorMessage(MSG_STATUS_INVALID_OUTPUT_FILE_NAME);
			return;
		}
		
		//make sure we can go into the error view
		updateErrorMessage(null);
		setDescription(MSG_STATUS_OK);
		
		//redo checks
		wizard.restartChecks();
		getControl().redraw();
	}

	
	

	/**
	 * Checks if the given cfg name is valid. 
	 * 
	 * @param cfgNameToCheck name to check
	 * @return true if the given cfg name is valid, false if not
	 */
	private boolean isValidCFGName(String cfgNameToCheck)
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = root.getFullPath().append(cfgNameToCheck);
		File file = path.toFile();
		try
		{
			file.getCanonicalPath();
		} catch (IOException e)
		{
			return false;
		}

		if (cfgNameToCheck.contains(" "))
		{
			return false;
		}
		if (cfgNameToCheck.endsWith("." + CFG_FILE_EXTENSION)){
			return true;
		}

		return false;
	}

	/**
	 * Checks whether the extension of the input file is valid. 
	 * 
	 * @return true if the input file name ends on a valid extension, false else
	 */
	private boolean isInputFileExtensionValid()
	{
		if(!inputFilePath.isEmpty()){
			if(inputFilePath.endsWith("." + LLVM_FILE_EXTENSION) || inputFilePath.endsWith("." + S_FILE_EXTENSION)){
				return true;
			}
		}
		
		return false;
	}
	
	protected synchronized void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(MEMENTO__KEY);
		IMemento child = memento.createChild(MEMENTO__KEY);
		child.putString(ASTLOC, getInputFilePath());
		child.putString(CONTAINER, getPathToOutputFolder());
		child.putString(NEW_FILE, getOutputFileName());
		child.putInteger(MODEL_SELECTION, getSelectedSemantics());
		CFGActivator.saveMementoToFile(memento);
	}
	
	/*=== Getter methods ===*/
	
	public String getPathToOutputFolder() {
		return pathToOutputFolder;
	}

	public String getOutputFileName() {
		return outputFileName;
	}
	
	public String getCompletePathToOutputFile(){
		return getPathToOutputFolder() + File.separator + getOutputFileName();
	}
	
	/**
	 * Returns the input file path.
	 * @return input file path
	 */
	public String getInputFilePath() {
		return inputFilePath;
	}

	/**
	 * Returns the value of the selected semantics. 
	 * 
	 * @return selectedSemantics see semantics in {@link de.upb.lina.cfg.tools.CFGConstants}.
	 */
	public int getSelectedSemantics() {

		return selectedSemantics;
	}
}