package de.upb.lina.cfgwizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;

import javax.management.RuntimeErrorException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;

public class CFGWorkspaceOperation extends WorkspaceModifyOperation {

	private LLVM ast = null;
	private Path cfgpath = null;
	private int reordering;
	private ArrayList<ControlFlowDiagram> list = new ArrayList<ControlFlowDiagram>();

	public CFGWorkspaceOperation(EObject ast, String path, int reordering) {
		super();
		if (ast instanceof LLVM)
			this.ast = (LLVM) ast;
		cfgpath = new Path(path);
		this.reordering = reordering;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		if (monitor == null)
			monitor = new NullProgressMonitor();
		if (ast == null) {
			throw new InterruptedException("Now specified LLVM Object inside the ast.");
		}

		try {
			int a_elem = ast.getElements().size();
			
			//generating cfg for each function
			for (int i = 0; i < a_elem; i++) {
				if (ast.getElements().get(i) instanceof FunctionDefinitionImpl) {
					if (((FunctionDefinition) ast.getElements().get(i)).getBody() != null)
						list.add(createCFG((FunctionDefinition) ast.getElements().get(i)));
				}
			}

			//adding TSO control flow
			ReorderingUtil rutil = new ReorderingUtil();
			if (reordering == 1) {
				rutil.addTSO(list);
				
			}

			//store resulting cfg
			ResourceSet resSet = new ResourceSetImpl();
			String osString = cfgpath.toPortableString();
			Resource resource = resSet.createResource(URI.createURI(osString));

			for (ControlFlowDiagram cfg : list) {
				EcoreUtil.resolveAll(cfg);
				resource.getContents().add(cfg);
			}

			resource.save(Collections.EMPTY_MAP);
			refreshWorkspace();

		} catch (IOException e) {
			CFGActivator.logError(e.getMessage(), e);
		}

	}

	private ControlFlowDiagram createCFG(FunctionDefinition function) {

		ProgramCounter pc = new ProgramCounter();
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE.createControlFlowDiagram();

		cfg.setName(function.getAddress().getName());

		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks)
		{
			ControlFlowLocation location = createControlFlowLocation(cfg, pc);
			if (cfg.getStart() == null)
			{
				cfg.setStart(location);
			}
			

			for (Instruction instr : b.getInstructions())
			{
				Transition t = createTransition(cfg, instr);
				ControlFlowLocation nextLocation = createControlFlowLocation(cfg, pc);

				t.setSource(location);
				t.setTarget(nextLocation);
				location = nextLocation;
			}
		}
		

//		if (type.equals(LlvmPackage.eINSTANCE.getIndirectBranch()))
//		{
//			for (int i = 0; i < ((IndirectBranch) instr).getLabels().size(); i++)
//			{
//				GuardedTransition jump = createGuardedTransition(cfg, instr);
//				jump.setCondition(valueToString(((IndirectBranch) instr).getAdress())
//						+ valueToString(((IndirectBranch) instr).getLabels().get(i)));
//				location.getOutgoing().add(jump);
//				jump.setSource(location);
//			}
//		} 
		
		ArrayList<Transition> newTransitions = new ArrayList<Transition>();
		for (Transition t : cfg.getTransitions())
		{			
			if(t.getInstruction() instanceof Branch)
			{
				Branch br = (Branch) t.getInstruction();
				if (br.getDestination() != null && br.getElseDestination() != null)
				{
					//replace transition with guarded
					GuardedTransition trueCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
					trueCase.setInstruction(t.getInstruction());
					GuardedTransition elseCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
					elseCase.setInstruction(t.getInstruction());
					newTransitions.add(trueCase);
					newTransitions.add(elseCase);
					
					trueCase.setSource(t.getSource());
					elseCase.setSource(t.getSource());
					trueCase.setCondition("[" + valueToString(br.getCondition()) + "]");
					elseCase.setCondition("[else]");
					t.setSource(null);
					t.setTarget(null);
					
					trueCase.setTarget(findLabeledLocation(cfg, function, br.getDestination().substring(1)));
					elseCase.setTarget(findLabeledLocation(cfg, function, br.getElseDestination().substring(1)));
				} else if(br.getDestination() != null)
				{
					//check Destination
					ControlFlowLocation source = findLabeledLocation(cfg, function, br.getDestination().substring(1));
					if(!t.getTarget().equals(source))
					{
						t.setTarget(source);
					}
				}
				else
				{
					throw new RuntimeException("NO DESTINATION FOR BRANCH");
				}
			}
			else if (t.getInstruction() instanceof IndirectBranch)
			{
				//TODO: target depends on register content -> condition of control flow guards unclear
				throw new RuntimeException("IndirectBranch found. Handling of such is not implemented yet");
			}
			else if (t.getInstruction() instanceof Switch)
			{
				//replace normal transition by guarded one
				Switch sw = (Switch) t.getInstruction();
				GuardedTransition newT = ControlflowFactory.eINSTANCE.createGuardedTransition();
				newT.setCondition("else");
				newT.setSource(t.getSource());
				ControlFlowLocation defaultTarget = findLabeledLocation(cfg, function, sw.getDefaultCase().substring(1));
				newT.setTarget(defaultTarget);
				
				newTransitions.add(newT);
				
				//add other cases
				for (SwitchCase sc : sw.getCases())
				{
					GuardedTransition otherCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
					otherCase.setSource(t.getSource());
					otherCase.setCondition(valueToString(sc.getCaseValue().getValue()));
					ControlFlowLocation target = findLabeledLocation(cfg, function, sc.getDestination().substring(1));
					otherCase.setTarget(target);
					
					newTransitions.add(otherCase);
				}
				
				
				//will be cleaned up later
				t.setSource(null);
				t.setTarget(null);
				
				
			}
			else if (t.getInstruction() instanceof Invoke)
			{
				//do nothing
			}
		}
		
		//has to be done separately in order to not modify collection while iterating
		for (Transition t : newTransitions)
		{
			t.setDiagram(cfg);			
		}
		
		
		cleanUp(cfg);
		return cfg;
	}
	
	/**Searches for the block with label destLabel and returns preceeding location of the transition that is 
	 * corresponding to the first instruction of the block.  
	 * 
	 * @param cfg
	 * @param function
	 * @param destLabel
	 * @return
	 */
	private ControlFlowLocation findLabeledLocation(ControlFlowDiagram cfg, FunctionDefinition function, String destLabel)
	{
		Instruction dest = getInstructionWithLabel(function, destLabel);
		Transition destTrans = findCorrespondingTransition(cfg, dest);
		return destTrans.getSource();
	}
		
	/**
	 * Removes locations and transitions if not connected
	 * @param cfl
	 */
	private void cleanUp(ControlFlowDiagram cfg)
	{
		ArrayList<ControlFlowLocation> locations = new ArrayList<ControlFlowLocation>();
		for(ControlFlowLocation location : cfg.getLocations())
		{
			if(location.getIncoming().isEmpty() && location.getOutgoing().isEmpty())
			{
				locations.add(location);
			}
		}
		
		for (ControlFlowLocation location : locations)
		{
			location.setDiagram(null); //remove
		}
		
		
		ArrayList<Transition> transitions  = new ArrayList<Transition>();
		for(Transition t : cfg.getTransitions())
		{
			//should not happen
			if(t.getSource() == null || t.getTarget() ==  null)
			{
				transitions.add(t);
			}
		}
		for(Transition t : transitions)
		{
			t.setDiagram(null);
			t.setSource(null);
			t.setTarget(null);
		}
	}
	

	/**
	 * @param function
	 * @param destLabel
	 * @return instruction corresponding to the label
	 */
	private Instruction getInstructionWithLabel(FunctionDefinition function, String destLabel)
	{
		for(BasicBlock b :function.getBody().getBlocks())
		{
			if(destLabel.equals(b.getLabel()))
			{
				return b.getInstructions().get(0);
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param cfg
	 * @param i
	 * @return CFG transition corresponding to instruction i
	 */
	private Transition findCorrespondingTransition(ControlFlowDiagram cfg, Instruction i)
	{
		for(Transition t : cfg.getTransitions())
		{
			if(i.equals(t.getInstruction()))
			{
				return t;
			}
		}
		return null;
	}


	/**
	 * @param diag
	 * @param pc
	 * @return
	 */
	private ControlFlowLocation createControlFlowLocation(ControlFlowDiagram diag, ProgramCounter pc) {
		ControlFlowLocation loc = ControlflowFactory.eINSTANCE.createControlFlowLocation();
		loc.setPc(pc.next());
		loc.setDiagram(diag);
		return loc;
	}

	/**
	 * @param diag
	 * @param i
	 * @return
	 */
	private Transition createTransition(ControlFlowDiagram diag, Instruction i) {
		Transition transition = ControlflowFactory.eINSTANCE.createTransition();
		transition.setInstruction(i);
		transition.setDiagram(diag);
		return transition;
	}


	/**
	 * 
	 */
	private void refreshWorkspace() {
		IProject[] iProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < iProjects.length; i++)
			try {
				iProjects[i].refreshLocal(0, new org.eclipse.core.runtime.NullProgressMonitor());
			} catch (CoreException e) {
				CFGActivator.logError(e.getMessage(), e);
			}
	}

	private String valueToString(Value value)
	{
		if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant()))
		{
			Constant constant = (Constant) value;
			return constant.getValue().toString();
		} 
		return value.toString();
	}
}