package de.upb.lina.cfg.tools.wizards;


import java.io.File;

import org.eclipse.ui.INewWizard;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.CreateGraphOperation;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.ResourceIOUtil;
import de.upb.llvm_parser.llvm.LLVM;


/**
 * The CreateStoreBufferGraphWizard is an implementation of {@link INewWizard} for creating a store
 * buffer graph from a LLVM or AST file. It is made up of a
 * {@link StoreBufferGraphConfigurationPage}, where the user can define all required parameters for
 * the creation process. Any change of the input of the {@link StoreBufferGraphConfigurationPage}
 * results in a check if the input is valid or yields any problems. If logical problems occur, the
 * user will be notified and can see additional information on the {@link WarningPage}.
 * 
 * @author Thomas Haarhoff
 * @author Alexander Hetzer
 * @author Oleg Travkin
 *
 */

public class CreateStoreBufferGraphWizard extends ConfigurationWizardUsingChecks {

   private StoreBufferGraphConfigurationPage storeBufferConfigurationPage;


   /**
    * Default constructor setting all required parameters
    */
   public CreateStoreBufferGraphWizard() {
      super();
      setNeedsProgressMonitor(true);
      setMyCanFinish(false);
      setMessageForUser("Check your input and press next or finish!");
      setFoundError(false);
      setFoundWarning(false);
   }


   /**
    * Adds all necessary pages.
    */
   @Override
   public void addPages() {
      setConfigurationPage(new StoreBufferGraphConfigurationPage(getUserSelection(), this));
      addPage(getConfigurationPage());

      setWarningPage(new WarningPage());
      addPage(getWarningPage());
   }


   /**
    * This method is called when 'Finish' button is pressed in the wizard. It creates a
    * {@link CreateGraphOperation} and runs it according the parameters specified via the
    * {@link StoreBufferGraphConfigurationPage}.
    */
   @Override
   public boolean performFinish() {
      getConfigurationPage().saveMementoState();
      CreateGraphOperation createGraphOperation = null;

      String pathToInputFile = null;

      if (doesPathToInputFileHasGivenFileExtenion(CFGConstants.S_FILE_EXTENSION)) {
         // we first need to transform the LLVM file into an AST file
         LLVM astForInputLLVMFile = ResourceIOUtil.createAstFromLLVM(getPathToCheckableFile());

         if (astForInputLLVMFile == null) {
            return false;
         }

         // store the transformed ast file
         String pathToOutputFileForAst = getPathToAstOutputFile();
         ResourceIOUtil.saveResourceToDisk(pathToOutputFileForAst, CFGConstants.LLVM_FILE_EXTENSION, astForInputLLVMFile);

         pathToInputFile = pathToOutputFileForAst;
      } else if (doesPathToInputFileHasGivenFileExtenion(CFGConstants.LLVM_FILE_EXTENSION)) {
         pathToInputFile = getConfigurationPage().getPathToInputFile();
      }

      String pathToOutputFile = getConfigurationPage().getCompletePathToOutputFile();

      int selectedMemoryModelId = storeBufferConfigurationPage.getSelectedSemantics();
      EMemoryModel selectedMemoryModel = EMemoryModel.getMemoryModelById(selectedMemoryModelId);

      createGraphOperation = new CreateGraphOperation(pathToInputFile, pathToOutputFile, selectedMemoryModel);

      // execute the CreateGraphOperation
      try {
         getContainer().run(true, false, createGraphOperation);
      } catch (Exception e) {
         CFGActivator.logError(e.getMessage(), e);
      }

      return true;
   }


   public String getPathToAstOutputFile() {
      return getConfigurationPage().getPathToOutputFolder()
            + File.separator
            + getConfigurationPage().getNameOfOutputFile().replace("." + CFGConstants.CFG_FILE_EXTENSION,
                  "." + CFGConstants.LLVM_FILE_EXTENSION);
   }


   /**
    * If {@link CreateStoreBufferGraphWizard#pathToCheckableFile} has changed, we call
    * {@link CreateStoreBufferGraphWizard#performLogicChecksOnASTModel(LLVM) in order to check the
    * new AST for problems.
    */
   @Override
   public void restartChecks() {
      LLVM ast = null;
      setPathToCheckableFile(getConfigurationPage().getPathToInputFile());

      if (doesPathToInputFileHasGivenFileExtenion(CFGConstants.LLVM_FILE_EXTENSION)) {
         ast = ResourceIOUtil.loadAst(getPathToCheckableFile());
      } else if (doesPathToInputFileHasGivenFileExtenion(CFGConstants.S_FILE_EXTENSION)) {
         ast = ResourceIOUtil.createAstFromLLVM(getPathToCheckableFile());
      }

      if (ast == null) {
         setMyCanFinish(false);
      } else {
         EMemoryModel memoryModel = EMemoryModel.getMemoryModelById(storeBufferConfigurationPage.getSelectedSemantics());
         performLogicChecksOnASTModel(ast, memoryModel);
      }
   }


   @Override
   protected void setConfigurationPage(ConfigurationPage configurationPage) {
      super.setConfigurationPage(configurationPage);
      if (configurationPage instanceof StoreBufferGraphConfigurationPage) {
         this.storeBufferConfigurationPage = (StoreBufferGraphConfigurationPage) configurationPage;
      }
   }


}