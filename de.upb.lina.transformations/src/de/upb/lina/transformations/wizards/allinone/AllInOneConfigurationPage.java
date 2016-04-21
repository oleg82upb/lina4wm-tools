package de.upb.lina.transformations.wizards.allinone;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.wizards.ConfigurationPage;
import de.upb.lina.cfg.tools.wizards.ConfigurationWizardUsingChecks;
import de.upb.lina.cfg.tools.wizards.StoreBufferGraphConfigurationPage;
import de.upb.lina.cfg.tools.wizards.WizardMessageConstants;
import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.Constants;
import de.upb.lina.transformations.logic.ETransformationType;
import de.upb.lina.transformations.logic.TransformationUtil;
import de.upb.lina.transformations.wizards.FunctionSelectionPage;
import de.upb.llvm_parser.llvm.LLVM;

public class AllInOneConfigurationPage extends ConfigurationPage{
	
	/*input file browse dialog*/
	private static final String DG_TX_MESSAGE = "Please select an input file (." + CFGConstants.S_FILE_EXTENSION + ").";
	private static final String DG_TX_TITLE = "Input file selection";
	
	private static final String MSG_STATUS_WRONG_FILE_TYPE = "Invalid input file type. Please select a ." + CFGConstants.S_FILE_EXTENSION + " file.";
	
	/*GUI label labels*/
	private static final String LB_TX_INPUT_FILE = "Input file: \n(." + CFGConstants.S_FILE_EXTENSION + ")";
	private static final String LB_TX_REORDERING = "Semantics:";
	private static final String LB_TX_NEW_FILENAME = "Output filename:";
	private static final String LB_TX_CONTAINER = "Output folder:";
	private static final String LB_TX_TRANSFORMATION_TYPE = "Type of transformation:";
	private static final String LB_CB_KIV_BASIS = "KIV basis:";
	
	private static final String[] SUPPORTED_TRANSFORMATION_TYPES = {"Promela", "KIV local", "KIV global", "Operational Promela"};
	private static final String[] SUPPORTED_KIV_BASES = {Constants.KIV_BASIS_NAT, Constants.KIV_BASIS_INT};
	
	private Composite mainGuiContainer;
	private GridData gridData;
	
	private Text tx_inputFilePath;
	private Text tx_outputFolderPath;
	private Text tx_outputFileName;
	
	private Label lb_outputFileExtension;
	
	private Combo cb_semanticsSelection;
	private Combo cb_transformationTypeSelection;
	private Combo cb_kivBasis;
	
	private FunctionSelectionPage functionSelectionPage;

	public AllInOneConfigurationPage(String pageName, String pageTitle,
			String pageDescription, IStructuredSelection userSelection,
			ConfigurationWizardUsingChecks wizard, FunctionSelectionPage functionSelectionPage) {
		
		super(pageName, pageTitle, pageDescription, userSelection, wizard);
		this.functionSelectionPage = functionSelectionPage;
	}

	@Override
	public void createControl(Composite parent) {
		/* GUI initialization */
		createMainContainerWithLayout(parent);
			
		createGuiElementsForInputFileSelection();	
		createGuiElementsForOutputFolderSelection();	
		createGuiElementsForOutputFileNameSelection();
		createGuiElementsForSemanticsSelection();
		createGuiElementsForTransformationTypeSelection();
		createGuiElementsForKivBasisSelection();
		enablePromelaSpecificGuiSettings();
		
		setControl(mainGuiContainer);
		initializeGuiElements(Constants.ALL_IN_ONE_WIZARD_MEMENTO__KEY, Activator.getStateFile());
		validateInput();

	}

	private void createMainContainerWithLayout(Composite parent) {
		mainGuiContainer = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		mainGuiContainer.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		gridData = new GridData(GridData.FILL_HORIZONTAL);
	}

	private void createGuiElementsForInputFileSelection() {
		createLabel(mainGuiContainer, SWT.NULL, LB_TX_INPUT_FILE);
		tx_inputFilePath = createText(mainGuiContainer, SWT.BORDER | SWT.SINGLE, createValidationModificationListener(), gridData);
		createButton(mainGuiContainer, SWT.PUSH, WizardMessageConstants.BT_TX_BROWSE, createSelectionAdapter(true, false));
	}

	private void createGuiElementsForOutputFolderSelection() {
		createLabel(mainGuiContainer, SWT.NULL, LB_TX_CONTAINER);
		tx_outputFolderPath = createText(mainGuiContainer, SWT.BORDER | SWT.SINGLE, createValidationModificationListener(), gridData);
		createButton(mainGuiContainer, SWT.PUSH, WizardMessageConstants.BT_TX_BROWSE, createSelectionAdapter(false, true));
	}

	private void createGuiElementsForOutputFileNameSelection() {
		createLabel(mainGuiContainer, SWT.NULL, LB_TX_NEW_FILENAME);
		tx_outputFileName = createText(mainGuiContainer, SWT.BORDER | SWT.SINGLE, createValidationModificationListener(), gridData);
		tx_outputFileName.setText("new_file");
		lb_outputFileExtension = createLabel(mainGuiContainer, SWT.NULL, "");
	}

	private void createGuiElementsForSemanticsSelection() {
		createLabel(mainGuiContainer, SWT.NULL, LB_TX_REORDERING);
		cb_semanticsSelection = new Combo(mainGuiContainer, SWT.NULL);
		for (int i = 0; i < StoreBufferGraphConfigurationPage.SUPPORTED_SEMANTICS.length; i++){
			cb_semanticsSelection.add(StoreBufferGraphConfigurationPage.SUPPORTED_SEMANTICS[i]);
		}
		cb_semanticsSelection.addModifyListener(createValidationModificationListener());
		cb_semanticsSelection.select(0);
		
		createLabel(mainGuiContainer, SWT.NULL, "");
	}

	private void createGuiElementsForTransformationTypeSelection() {
		createLabel(mainGuiContainer, SWT.NULL, LB_TX_TRANSFORMATION_TYPE);
		cb_transformationTypeSelection = new Combo(mainGuiContainer, SWT.NULL);
		for(String transformationType: SUPPORTED_TRANSFORMATION_TYPES){
			cb_transformationTypeSelection.add(transformationType);
		}
		cb_transformationTypeSelection.select(ETransformationType.PROMELA.getId());
		cb_transformationTypeSelection.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				ETransformationType selectedTransformationType = ETransformationType.getTransformationTypeById(getSelectedTransformationType());
				switch (selectedTransformationType) {
				case PROMELA:
					enablePromelaSpecificGuiSettings();
					break;
				case PROMELA_OPERATIONAL:
					enablePromelaSpecificGuiSettings();
					break;
				case KIV_LOCAL:
					enableKivSpecificGuiSettings();
					break;
				case KIV_GLOBAL:
					enableKivSpecificGuiSettings();
					break;
				default:
					break;
				}
				
				validateInput();
			}
		});
		
		createLabel(mainGuiContainer, SWT.NULL, "");
	}
	
	private void changeOutputFileExtension(String extension){
		lb_outputFileExtension.setText("." + extension);
		lb_outputFileExtension.pack();
	}
	
	private void createGuiElementsForKivBasisSelection() {
		createLabel(mainGuiContainer, SWT.NULL, LB_CB_KIV_BASIS);
		cb_kivBasis = new Combo(mainGuiContainer, SWT.NULL);
		for(String kivBasis: SUPPORTED_KIV_BASES){
			cb_kivBasis.add(kivBasis);
		}
		cb_kivBasis.select(Constants.NAT_INDEX);
		
		createLabel(mainGuiContainer, SWT.NULL, "");
	}

	@Override
	public void validateInput() {
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
		if(ResourceIOUtil.createAstFromLLVM(getPathToInputFile()) == null){
			updateErrorMessage(WizardMessageConstants.MSG_STATUS_INPUT_FILE_CANNOT_BE_LOADED);
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
		
		if (!isValidFileName(tx_outputFileName.getText())) {
			updateErrorMessage(WizardMessageConstants.MSG_STATUS_INVALID_OUTPUT_FILE_NAME);
			return;
		}
		
		updateFunctionSelectionPage();
		
		//make sure we can go into the error view
		updateErrorMessage(null);
		setDescription(WizardMessageConstants.MSG_STATUS_OK);
		
		//redo checks
		wizard.restartChecks();
		getControl().redraw();
		
	}

	private void updateFunctionSelectionPage() {
		LLVM ast = ResourceIOUtil.createAstFromLLVM(getPathToInputFile());
		List<ControlFlowDiagram> loadedCfgs = TransformationUtil.createCFGFromAst(CFGConstants.SC, ast);
		functionSelectionPage.setStoreBufferDiagramToUse(loadedCfgs);
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
			if(inputFilePath.endsWith("." + CFGConstants.S_FILE_EXTENSION)){
				return true;
			}
		}
		
		return false;
	}

	@Override
	protected void handleInputFileSelection() {
		ElementTreeSelectionDialog dialog = setupInputFileSelectionDialog();
		evaluateSelectionDialogResult(dialog, tx_inputFilePath);
	}

	private ElementTreeSelectionDialog setupInputFileSelectionDialog() {
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
					return CFGConstants.S_FILE_EXTENSION.equals(file.getFileExtension());
				}
				return false;
			}
		});
		dialog.setTitle(DG_TX_TITLE);
		dialog.setMessage(DG_TX_MESSAGE);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setDoubleClickSelects(true);
		return dialog;
	}

	@Override
	protected void handleOutputFolderSelection() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), root, false, StoreBufferGraphConfigurationPage.DG_TX_SELECTION_MESSAGE);
		evaluateSelectionDialogResult(dialog, tx_outputFolderPath);
	}
	
	
	private ValidationModifyListener createValidationModificationListener(){
		return new ValidationModifyListener(this);
	}
	
	public int getSelectedSemantics(){
		return cb_semanticsSelection.getSelectionIndex();
	}
	
	public int getSelectedTransformationType(){
		return cb_transformationTypeSelection.getSelectionIndex();
	}
	
	public int getSelectedKivBasis(){
		return cb_kivBasis.getSelectionIndex();
	}
	
	/**
	 * Returns the according string representation of the selected KIV basis. 
	 * 
	 * @return string representation of the selected KIV basis
	 */
	public String getSelectedKivBasisAsString(){
		switch (getSelectedKivBasis()) {
		case Constants.NAT_INDEX:
			return Constants.KIV_BASIS_NAT;
		case Constants.INT_INDEX:
			return Constants.KIV_BASIS_INT;
		default:
			break;
		}
		return "";
	}

	private void enableKivSpecificGuiSettings() {
		changeOutputFileExtension(Constants.KIV_FILE_EXTENSION);
		tx_outputFileName.setEnabled(false);
		cb_kivBasis.setEnabled(true);
	}

	private void enablePromelaSpecificGuiSettings() {
		changeOutputFileExtension(Constants.PROMELA_FILE_EXTENSION);
		tx_outputFileName.setEnabled(true);
		cb_kivBasis.setEnabled(false);
	}

	@Override
	protected void initializeDefaultGuiElementValuesFromFile(IFile file) {
		if (CFGConstants.S_FILE_EXTENSION.equals(file.getFileExtension()))
		{
			tx_inputFilePath.setText(file.getFullPath().toPortableString());
			tx_outputFolderPath.setText(file.getFullPath().removeLastSegments(1).toPortableString());	
			tx_outputFileName.setText(file.getName().replace("." + CFGConstants.S_FILE_EXTENSION,""));	
		}
		
	}
	
	@Override
	protected void saveMementoState() {
		XMLMemento memento = XMLMemento.createWriteRoot(Constants.ALL_IN_ONE_WIZARD_MEMENTO__KEY);
		IMemento child = memento.createChild(Constants.ALL_IN_ONE_WIZARD_MEMENTO__KEY);
		child.putString(Constants.ALL_IN_ONE_WIZARD_INPUTFILE, tx_inputFilePath.getText());
		child.putString(Constants.ALL_IN_ONE_WIZARD_OUTPUT_FOLDER, tx_outputFolderPath.getText());
		child.putString(Constants.ALL_IN_ONE_WIZARD_OUTPUT_FILE, tx_outputFileName.getText());
		child.putInteger(Constants.ALL_IN_ONE_WIZARD_SEMANTICS, getSelectedSemantics());
		child.putInteger(Constants.ALL_IN_ONE_WIZARD_TRANSFORMATION_TYPE, getSelectedTransformationType());
		child.putInteger(Constants.ALL_IN_ONE_WIZARD_KIV_BASIS, getSelectedKivBasis());
		Activator.saveMementoToFile(memento);
	}

	@Override
	protected void initializeDefaultGuiElementValuesFromMemento() {
		if(memento != null){
			
			String defaultInputFilePath = memento.getString(Constants.ALL_IN_ONE_WIZARD_INPUTFILE);
			if (defaultInputFilePath != null)
			{
				tx_inputFilePath.setText(defaultInputFilePath);
			}
			
			String defaultOutputFolderPath = memento.getString(Constants.ALL_IN_ONE_WIZARD_OUTPUT_FOLDER);
			if (defaultOutputFolderPath != null)
			{
				tx_outputFolderPath.setText(defaultOutputFolderPath);
			}
	
			String defaultOutputFileName = memento.getString(Constants.ALL_IN_ONE_WIZARD_OUTPUT_FILE);
			if (defaultOutputFileName != null)
			{
				tx_outputFileName.setText(defaultOutputFileName);
			}
	
			Integer defaultSemantics = memento.getInteger(Constants.ALL_IN_ONE_WIZARD_SEMANTICS);
			if (defaultSemantics != null)
			{
				cb_semanticsSelection.select(defaultSemantics);
			}
			
			Integer defaultTransformationType = memento.getInteger(Constants.ALL_IN_ONE_WIZARD_TRANSFORMATION_TYPE);
			if (defaultTransformationType != null)
			{
				cb_transformationTypeSelection.select(defaultTransformationType);
			}
			
			Integer defaultKivBasis = memento.getInteger(Constants.ALL_IN_ONE_WIZARD_KIV_BASIS);
			if (defaultKivBasis != null)
			{
				cb_kivBasis.select(defaultKivBasis);
			}
		}
		
	}

	@Override
	public String getPathToInputFile() {
		return tx_inputFilePath.getText();
	}

	@Override
	protected String getPathToOutputFolder() {
		return tx_outputFolderPath.getText();
	}

	@Override
	protected String getNameOfOutputFile() {
		return tx_outputFileName.getText();
	}
	
	public String getOutputFileExtension(){
		return lb_outputFileExtension.getText();
	}
	
	
}

class ValidationModifyListener implements ModifyListener{
	private ConfigurationPage configurationPage;
	
	public ValidationModifyListener(ConfigurationPage configurationPage){
		this.configurationPage = configurationPage;
	}

	@Override
	public void modifyText(ModifyEvent e) {
		configurationPage.validateInput();
	}
	
}
