package de.upb.lina.cfg.tools.strategies;

import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;

public abstract class AbstractGraphGenerator implements IGraphGenerator
{
	protected FunctionDefinition function;
	protected ControlFlowDiagram graph;
	protected List<ControlFlowLocation> toBeProcessedLocations;
	protected List<ControlFlowLocation> processedLocations;
	protected ArrayList<Instruction> instructions;
	
	

	public AbstractGraphGenerator(FunctionDefinition function)
	{
		// intialize variables
		this.function = function;
	}
	
	
	public ControlFlowDiagram createGraph()
	{
		if(this.graph != null)
		{
			return this.graph;
		}
		
		initialize();
		
		this.graph = ControlflowFactory.eINSTANCE.createControlFlowDiagram();
		this.graph.setName(this.function.getAddress().getName());

		// setup first node
		ControlFlowLocation first = createControlFlowLocation(0, ControlflowFactory.eINSTANCE.createStoreBuffer());
		//GraphUtility.findLabelByInstruction(function, instructions.get(0));
		this.graph.setStart(first);
		this.toBeProcessedLocations.add(first);

		// while we have still nodes to work on
		while (!toBeProcessedLocations.isEmpty())
		{
			ControlFlowLocation sourceLocation = toBeProcessedLocations.get(0);
			if (sourceLocation.getPc() < instructions.size())
			{
				Instruction nextInstruction = instructions.get(sourceLocation.getPc());
				addTransitions(sourceLocation, nextInstruction);
			}
			
			this.toBeProcessedLocations.remove(sourceLocation);
			this.processedLocations.add(sourceLocation);
		}
		
		if (CFGConstants.DEBUG) {
			System.out.println("#nodes: " + this.graph.getLocations().size() + " ;#edges: " + this.graph.getTransitions().size());
		}

		return graph;
	}


	/**
	 * Initialize variables and other stuff and don't forget to call super.initialize(); 
	 */
	protected void initialize()
	{
		this.toBeProcessedLocations = new ArrayList<ControlFlowLocation>();
		this.processedLocations = new ArrayList<ControlFlowLocation>();
		this.instructions = GraphUtility.gatherInstructionsInCodeOrder(this.function);
	}


	/**
	 * Creates SC transitions only. Overwrite, if you need to customize.
	 * @param sourceLocation
	 * @param nextInstruction
	 */
	protected void addTransitions(ControlFlowLocation sourceLocation, Instruction nextInstruction)
	{
		addInstructionTransitions(sourceLocation, nextInstruction);
	}
	
	
	/**
	 * @param pc
	 * @param buffer
	 * @return ControlFlowLocation representing pc and buffer value or null if there exists none
	 */
	protected ControlFlowLocation getLocationByPcAndBuffer(int pc, StoreBuffer buffer)
	{
		return GraphUtility.getLocationRepresentedBy(this.graph.getLocations(), pc, buffer);
	}

	
	/**Overwrite this method to add special treatment of transitions, e.g., for read, write, atomicRmw instructions.
	 * This implementation handles all cases of instructions that DO NOT NEED store buffer modification. 
	 * Hence, all following locations will have a StoreBuffer that is identical to currentLocation. 
	 * @param currentLocation
	 * @param nextInstruction
	 */
	protected void addInstructionTransitions(ControlFlowLocation currentLocation, Instruction nextInstruction)
	{
		if (nextInstruction instanceof Branch)
		{
			Branch branch = (Branch) nextInstruction;
			if (branch.getElseDestination() != null)
			{
				// conditional branch -> if then else
				String trueCaseLabel = branch.getDestination().substring(1);
				String elseCaseLabel = branch.getElseDestination().substring(1);

				Instruction trueCaseNextInstruction = GraphUtility.getInstructionByLabel(this.function, trueCaseLabel);
				Instruction elseCaseNextInstruction = GraphUtility.getInstructionByLabel(this.function, elseCaseLabel);

				int trueCasePC = GraphUtility.getPcOfInstruction(trueCaseNextInstruction, this.instructions);
				int elseCasePC = GraphUtility.getPcOfInstruction(elseCaseNextInstruction, this.instructions);

				// check if the target location need to be created or if they
				// already exist
				ControlFlowLocation trueCaseNextLocation = getLocationByPcAndBuffer(trueCasePC,
						currentLocation.getBuffer());
				ControlFlowLocation elseCaseNextLocation = getLocationByPcAndBuffer(elseCasePC,
						currentLocation.getBuffer());

				if (trueCaseNextLocation == null)
				{
					trueCaseNextLocation = createControlFlowLocation(trueCasePC,
							cloneStoreBuffer(currentLocation.getBuffer()));
					this.toBeProcessedLocations.add(trueCaseNextLocation);
				}

				if (elseCaseNextLocation == null)
				{
					elseCaseNextLocation = createControlFlowLocation(elseCasePC,
							cloneStoreBuffer(currentLocation.getBuffer()));
					this.toBeProcessedLocations.add(elseCaseNextLocation);
				}

				GuardedTransition trueCase = createGuardedTransition(currentLocation, branch, trueCaseNextLocation);
				trueCase.setCondition("[" + GraphUtility.valueToString(branch.getCondition()) + "]");
				GuardedTransition falseCase = createGuardedTransition(currentLocation, branch, elseCaseNextLocation);
				falseCase.setCondition("[not " + GraphUtility.valueToString(branch.getCondition()) + "]");
			} else if (branch.getDestination() != null)
			{
				// simple jump, unconditional
				String targetInstructionLabel = branch.getDestination().substring(1);
				Instruction targetInstruction = GraphUtility.getInstructionByLabel(this.function,
						targetInstructionLabel);
				int targetPC = GraphUtility.getPcOfInstruction(targetInstruction, this.instructions);

				ControlFlowLocation nextLocation = getLocationByPcAndBuffer(targetPC, currentLocation.getBuffer());

				if (nextLocation == null)
				{
					nextLocation = createControlFlowLocation(targetPC, cloneStoreBuffer(currentLocation.getBuffer()));
					this.toBeProcessedLocations.add(nextLocation);
				}

				createTransition(currentLocation, branch, nextLocation);
			}
		} else if (nextInstruction instanceof Switch)
		{
			Switch switchInstruction = (Switch) nextInstruction;
			String defaultCaseLabel = switchInstruction.getDefaultCase().substring(1);
			Instruction defaultTargetInstruction = GraphUtility.getInstructionByLabel(this.function, defaultCaseLabel);
			int defaultCasePC = GraphUtility.getPcOfInstruction(defaultTargetInstruction, this.instructions);

			ControlFlowLocation defaultCaseLocation = getLocationByPcAndBuffer(defaultCasePC,
					currentLocation.getBuffer());
			if (defaultCaseLocation == null)
			{
				defaultCaseLocation = createControlFlowLocation(defaultCasePC,
						cloneStoreBuffer(currentLocation.getBuffer()));
				this.toBeProcessedLocations.add(defaultCaseLocation);
			}

			GuardedTransition defaultCase = createGuardedTransition(currentLocation, switchInstruction,
					defaultCaseLocation);
			defaultCase.setCondition("[default]");

			for (SwitchCase sc : switchInstruction.getCases())
			{
				String caseLabel = sc.getDestination().substring(1);
				Instruction caseInstruction = GraphUtility.getInstructionByLabel(this.function, caseLabel);
				int casePC = GraphUtility.getPcOfInstruction(caseInstruction, this.instructions);
				ControlFlowLocation caseTargetLocation = getLocationByPcAndBuffer(casePC, currentLocation.getBuffer());
				if (caseTargetLocation == null)
				{
					caseTargetLocation = createControlFlowLocation(casePC,
							cloneStoreBuffer(currentLocation.getBuffer()));
					this.toBeProcessedLocations.add(caseTargetLocation);
				}

				GuardedTransition caseC = createGuardedTransition(currentLocation, switchInstruction,
						caseTargetLocation);
				caseC.setCondition("[" + GraphUtility.valueToString(sc.getCaseValue().getValue()) + "]");
			}
		} else if (nextInstruction instanceof IndirectBranch)
		{
			throw new RuntimeException("IndirectBranch found. Handling of such is not implemented yet");
		} else
		{
			ControlFlowLocation nextLocation = getLocationByPcAndBuffer(currentLocation.getPc() + 1,
					currentLocation.getBuffer());
			if (nextLocation == null)
			{
				nextLocation = createControlFlowLocation(currentLocation.getPc() + 1,
						cloneStoreBuffer(currentLocation.getBuffer()));
				this.toBeProcessedLocations.add(nextLocation);
			}

			createTransition(currentLocation, nextInstruction, nextLocation);
		}
	}


	protected StoreBuffer cloneStoreBuffer(StoreBuffer oldBuffer)
	{
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		//create deep copy
		for (AddressValuePair pair : oldBuffer.getAddressValuePairs())
		{
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.getValues().addAll(pair.getValues());
			buffer.getAddressValuePairs().add(newPair);
		}

		return buffer;
	}
	
	/**
	 * @param pc
	 * @param buffer
	 * @return new ControlFlowLocation set up with pc, buffer, and attached to ControlFlowDiagram
	 */
	protected ControlFlowLocation createControlFlowLocation(int pc, StoreBuffer buffer)
	{
		ControlFlowLocation loc = ControlflowFactory.eINSTANCE.createControlFlowLocation();
		loc.setBuffer(buffer);
		loc.setPc(pc);
		loc.setDiagram(this.graph);
		return loc;
	}
	
	/**
	 * @param source
	 * @param instr
	 * @param target
	 * @return newly created transition that has source, target, instruction and the control flow graph set up
	 */
	protected Transition createTransition(ControlFlowLocation source, Instruction instr, ControlFlowLocation target) {
		Transition transition = ControlflowFactory.eINSTANCE.createTransition();
		transition.setInstruction(instr);
		transition.setDiagram(this.graph);
		transition.setSource(source);
		transition.setTarget(target);
		return transition;
	}
	
	
	/**
	 * @param source
	 * @param instr
	 * @param target
	 * @return newly created transition that has source, target, instruction and the control flow graph set up
	 */
	protected GuardedTransition createGuardedTransition(ControlFlowLocation source, Instruction instr, ControlFlowLocation target) {
		GuardedTransition transition = ControlflowFactory.eINSTANCE.createGuardedTransition();
		transition.setInstruction(instr);
		transition.setDiagram(this.graph);
		transition.setSource(source);
		transition.setTarget(target);
		return transition;
	}

}
