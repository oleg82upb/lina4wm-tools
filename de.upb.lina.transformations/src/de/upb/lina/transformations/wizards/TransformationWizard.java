package de.upb.lina.transformations.wizards;


import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.transformations.logic.ETransformationType;
import de.upb.lina.transformations.logic.TransformationConfiguration;
import de.upb.lina.transformations.logic.TransformationOperation;
import de.upb.lina.transformations.logic.TransformationUtil;


/**
 * This wizard offers a possibility to start a transformation of store buffer graph. It is made up
 * out of a transformation configuration page, which asks the user to define all parameters of the
 * transformation to be executed. Afterwards the user has the ability to exclude certain functions
 * from the transformation or to rename some of them.
 * 
 * @author Alexander Hetzer
 *
 */
public class TransformationWizard extends Wizard implements INewWizard {

   private TransformationConfigurationPage transformationConfigurationPage;
   private FunctionSelectionPage functionSelectionPage;
   private TransformationConfiguration transformationConfiguration;
   private TransformationOperation transformationOperation;
   private ISelection selection;


   @Override
   public boolean performFinish() {
      saveMementoStateOfConfigurationPage();

      createTransformationConfiguration();
      createTransformationOperation();

      TransformationUtil.runTransformationOperation(this, transformationOperation);
      return true;
   }


   /**
    * Saves the memeto state of the transformation configuration page.
    */
   private void saveMementoStateOfConfigurationPage() {
      transformationConfigurationPage.saveMementoState();
   }


   /**
    * Creates the transformation operation based on the inputs of the local configuration wizard
    * page and the local transformation configuration. Note: Needs to be called after
    * {@link #createTransformationConfiguration()}!
    */
   private void createTransformationOperation() {
      transformationOperation = new TransformationOperation(transformationConfigurationPage.getOutputFolderPath(),
            transformationConfigurationPage.getOutputFileName(), transformationConfigurationPage.getOutputFileExtension(),
            transformationConfiguration);
   }


   /**
    * Creates the transformation operation based on the inputs of the local configuration wizard
    * page.
    */
   private void createTransformationConfiguration() {
      List<ControlFlowDiagram> storeBufferGraphs = functionSelectionPage.getSelectedStoreBufferGraphs();
      String kIVBasis = transformationConfigurationPage.getKivBasis();
      Map<String, String> oldToNewStoreBufferGraphNameMap = functionSelectionPage.getOldToNewStoreBufferGraphNameMap();

      int transformationTypeId = transformationConfigurationPage.getIdForSelectedTransformationType();
      ETransformationType transformationType = ETransformationType.getTransformationTypeById(transformationTypeId);

      transformationConfiguration = new TransformationConfiguration(storeBufferGraphs, kIVBasis, oldToNewStoreBufferGraphNameMap,
            transformationType);
   }


   @Override
   public void addPages() {
      super.addPages();
      functionSelectionPage = new FunctionSelectionPage();
      transformationConfigurationPage = new TransformationConfigurationPage(selection, functionSelectionPage);
      addPage(transformationConfigurationPage);
      addPage(functionSelectionPage);
   }


   @Override
   public boolean canFinish() {
      if (!super.canFinish()) {
         return false;
      }
      return true;
   }


   /**
    * {@inheritDoc} We will accept the selection in the workbench to see if we can initialize from
    * it.
    */
   @Override
   public void init(IWorkbench workbench, IStructuredSelection selection) {
      this.selection = selection;
   }


}
