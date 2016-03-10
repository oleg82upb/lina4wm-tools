package de.upb.lina.transformations.wizards.allinone;

import org.eclipse.ui.INewWizard;

import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.lina.cfg.tools.wizards.ConfigurationPage;
import de.upb.lina.cfg.tools.wizards.ConfigurationWizardUsingChecks;
import de.upb.lina.cfg.tools.wizards.WarningPage;
import de.upb.llvm_parser.llvm.LLVM;

public class AllInOneWizard extends ConfigurationWizardUsingChecks implements INewWizard {
	
	private AllInOneConfigurationPage allInOneConfigurationPage;
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPages() {
		super.addPages();
		setConfigurationPage(new AllInOneConfigurationPage("All in One Configuration Page", "New Transformation", 
				"Create a new transformation from a LLVM file!", getUserSelection(), this));
		addPage(getConfigurationPage());
		setWarningPage(new WarningPage());
		addPage(getWarningPage());
//		addPage(new FunctionSelectionPage());
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
