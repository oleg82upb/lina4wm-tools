package de.upb.lina.transformations.wizards.allinone;

import java.util.List;
import java.util.Map;

import org.eclipse.ui.INewWizard;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.wizards.ConfigurationPage;
import de.upb.lina.cfg.tools.wizards.ConfigurationWizardUsingChecks;
import de.upb.lina.cfg.tools.wizards.WarningPage;
import de.upb.lina.transformations.logic.TransformationConfiguration;
import de.upb.lina.transformations.logic.TransformationOperation;
import de.upb.lina.transformations.logic.TransformationUtil;
import de.upb.lina.transformations.wizards.FunctionSelectionPage;
import de.upb.llvm_parser.llvm.LLVM;

public class AllInOneWizard extends ConfigurationWizardUsingChecks implements INewWizard {
	
	private AllInOneConfigurationPage allInOneConfigurationPage;
	private FunctionSelectionPage functionSelectionPage;
	
	//this variable only be set during the perform finish method
	private TransformationConfiguration transformationConfiguration;
	
	@Override
	public boolean performFinish() {
		super.performFinish();
		LLVM ast = createAstFromUserInput();
		if(ast != null){
			transformationConfiguration = createTransformationConfigurationFromUserInput(ast);
			TransformationOperation transformationOperation = createTransformationOperationFromUserInput();
			TransformationUtil.runTransformationOperation(this, transformationOperation);
			return true;
		}
		return false;
	}

	/**
	 * Creates a {@link TransformationOpertion} defined by the parameters specified
	 * by the user. 
	 * 
	 * @return transformation operation
	 */
	private TransformationOperation createTransformationOperationFromUserInput() {
		String outputFolderPath = allInOneConfigurationPage.getPathToOutputFolder();
		String outputFileName = allInOneConfigurationPage.getNameOfOutputFile();
		String outputFileExtension = allInOneConfigurationPage.getOutputFileExtension();
		
		TransformationOperation transformationOperation 
				= new TransformationOperation(outputFolderPath, outputFileName, outputFileExtension, transformationConfiguration);
		return transformationOperation;
	}

	/**
	 * Creates a {@link TransformationConfiguration} according to the parameters
	 * selected by the user for the given AST. 
	 * 
	 * @param ast to create the configuration for
	 * @return transformation confgiguration
	 */
	private TransformationConfiguration createTransformationConfigurationFromUserInput(
			LLVM ast) {
		List<ControlFlowDiagram> storeBufferGraphs = createStoreBufferGraphsFromAstAndUserInput(ast);
		
		String kivBasis = allInOneConfigurationPage.getSelectedKivBasisAsString();
		int transformationType = allInOneConfigurationPage.getSelectedTransformationType();
		Map<String, String> oldToNewCfgName = functionSelectionPage.getMap();
		TransformationConfiguration config = new TransformationConfiguration(storeBufferGraphs, kivBasis, oldToNewCfgName, transformationType);
		return config;
	}

	/**
	 * Creates a list of store buffer graphs fitting the given AST. As semantics the
	 * user selected semantics are used. 
	 * 
	 * @param ast ast to create store buffer graphs for
	 * @return list of store buffer graphs for the functions in the AST
	 */
	private List<ControlFlowDiagram> createStoreBufferGraphsFromAstAndUserInput(LLVM ast) {
		int semantics = allInOneConfigurationPage.getSelectedSemantics();
		List<ControlFlowDiagram> storeBufferGraphs = TransformationUtil.createCFGFromAst(semantics, ast);
		return storeBufferGraphs;
	}

	/**
	 * Loads the LLVM file specified by the user and creates the according
	 * AST for it. 
	 * 
	 * @return AST fitting the user specified LLVM file
	 */
	private LLVM createAstFromUserInput() {
		String llvmPath = getConfigurationPage().getPathToInputFile();
		return ResourceIOUtil.createAstFromLLVM(llvmPath);
	}

	@Override
	public void addPages() {
		super.addPages();
		functionSelectionPage = new FunctionSelectionPage();
		
		setConfigurationPage(new AllInOneConfigurationPage("All in One Configuration Page", "New Transformation", 
				"Create a new transformation from a LLVM file!", getUserSelection(), this, functionSelectionPage));
		addPage(getConfigurationPage());
		
		setWarningPage(new WarningPage());
		addPage(getWarningPage());
		
		addPage(functionSelectionPage);
	}

	@Override
	public void restartChecks() {
		LLVM ast = null;
		setPathToCheckableFile(getConfigurationPage().getPathToInputFile());
		
		ast = ResourceIOUtil.createAstFromLLVM(getPathToCheckableFile());

		if(ast == null){
			setMyCanFinish(false);
		}else{
			performLogicChecksOnASTModel(ast, allInOneConfigurationPage.getSelectedSemantics());
		}
		
	}
	
	@Override
	protected void setConfigurationPage(ConfigurationPage configurationPage) {
		super.setConfigurationPage(configurationPage);
		if(configurationPage instanceof AllInOneConfigurationPage){
			this.allInOneConfigurationPage = (AllInOneConfigurationPage) configurationPage;
		}
	}
	
	
	

}
