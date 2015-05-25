package de.upb.lina.transformations.wizards;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlflowPackage;

public class FunctionSelectionPage extends WizardPage{
	
	
	private List<ControlFlowDiagram> allCFGs;
	private List<ControlFlowDiagram>selectedFunctions = new ArrayList<ControlFlowDiagram>();
	private HashMap<String, ControlFlowDiagram> cfgMap;
	private Tree tree;
	

	protected FunctionSelectionPage(String pageName) {
		super(pageName);
		setTitle("Function - Selection");
		setDescription("Please select the functions you wish to transform.");
	}
	
	public FunctionSelectionPage() {
		super("wizardPage");
		setTitle("Function - Selection");
		setDescription("Please select the functions you wish to transform.");
	}

	@Override
	public void createControl(Composite parent) {
		
		/* init */
		final Composite composite = new Composite(parent, SWT.NULL);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		
		tree = new Tree(composite,SWT.CHECK | SWT.MULTI | SWT.H_SCROLL |SWT.BORDER);
		TreeColumn column = new TreeColumn(tree, SWT.H_SCROLL);
		column.setText("Available Functions");
		column.setWidth(450);
		tree.setHeaderVisible(true);
		loadCfg();
		
		tree.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if (event.detail == SWT.CHECK) {
					TreeItem item = (TreeItem) event.item;
					updateSelectedFunctions(item);
				}
				
			}
			
		});
		setControl(composite);
		
	}
	
	private void refreshTree(){
		if(tree!=null){
			tree.removeAll();
			selectedFunctions.clear();
			for(ControlFlowDiagram diagram : allCFGs){
				String cfgname = diagram.getName();
				TreeItem item = new TreeItem(tree, SWT.NONE);
				item.setText(new String[]{cfgname});
				item.setChecked(true);
				updateSelectedFunctions(item);
			}
			//tree.pack();
		}
	}

	protected List<ControlFlowDiagram> loadCfg() {
		String location= ((TransformationWizardPage)this.getPreviousPage()).getGraphModelFile().getText();
		ControlflowPackage.eINSTANCE.getNsURI();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path cfgpath = new Path(location);
		URI uri = URI.createPlatformResourceURI(cfgpath.toOSString(), true);
		Resource cfgResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(cfgResource);
		List<EObject> graphList = cfgResource.getContents();
		List<ControlFlowDiagram> graphList2  = new ArrayList<ControlFlowDiagram>();
		for(EObject o: graphList){
			if(o instanceof ControlFlowDiagram){
				graphList2.add((ControlFlowDiagram)o);
			}
		}
		this.allCFGs = graphList2;
		
		//mapping from name to cfg
		cfgMap  = new HashMap<String, ControlFlowDiagram>();
		for(ControlFlowDiagram cfg : allCFGs){
			cfgMap.put(cfg.getName(), cfg);
		}
		refreshTree();
		return allCFGs;
	}
	
	private void updateSelectedFunctions(TreeItem item) {
		String functionName = item.getText();
		if(item.getChecked()){
			//add to selected functions
			ControlFlowDiagram selectedCFG = cfgMap.get(functionName);
			this.selectedFunctions.add(selectedCFG);
		}else{
			//remove from selected functions
			ControlFlowDiagram deselectedCFG = cfgMap.get(functionName);
			this.selectedFunctions.remove(deselectedCFG);
		}
	}
	
	protected List<ControlFlowDiagram> getSelectedFunctions(){
		return selectedFunctions;
	}

}
