package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.strategies.SCGraphGenerator;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;

/**
 * 
 * Checker for loads in write-def-chains
 * 
 * @author Alexander Hetzer
 *
 */
public class LIWDCPropertyChecker extends AbstractPropertyChecker {
	
	private List<FunctionDefinition> functionsWithLoadsInWriteDefChains;
	private List<Transition> wdcAddress;
	private List<Transition> wdcValue;
	private List<Transition> wdcAddressValue;

	/**
	 * Default constructor - should be used if all checks are required.
	 * @param ast
	 * @param manager
	 */
	public LIWDCPropertyChecker(LLVM ast) {
		super(ast);
		
		wdcAddress = new ArrayList<Transition>();
		wdcValue = new ArrayList<Transition>();
		wdcAddressValue = new ArrayList<Transition>();
	}

	@Override
	public boolean check() {
		isPropetyFulfilled = checkForLoadsInWriteDefChains();
		if(isPropetyFulfilled){
			String funcWithLoadsInWDC = "";
			for (int i = 0; i < functionsWithLoadsInWriteDefChains.size(); i++)
			{
				funcWithLoadsInWDC += functionsWithLoadsInWriteDefChains.get(i).getAddress().getName() + ", ";
			}
			funcWithLoadsInWDC = funcWithLoadsInWDC.substring(0,funcWithLoadsInWDC.length()-2);
			
			String warning = "For some reads in functions " + funcWithLoadsInWDC + " it cannot be statically determined whether they are early reads or not.";
			addMessage(warning);
		}
		return isPropetyFulfilled;
	}
	
	public boolean checkForLoadsInWriteDefChains()
	{
		int a_elem = ast.getElements().size();
		functionsWithLoadsInWriteDefChains = new ArrayList<FunctionDefinition>();

		// for every function
		for (int i = 0; i < a_elem; i++)
		{
			if (ast.getElements().get(i) instanceof FunctionDefinitionImpl)
			{
				FunctionDefinition func = (FunctionDefinition) ast.getElements().get(i);
				if (func.getBody() != null)
				{
					// create sc-graph and search for loops without fence
					SCGraphGenerator sc = new SCGraphGenerator(func);
					List<Transition> loadsFound = new ArrayList<Transition>();
					checkForWriteDefChains(sc.createGraph(), loadsFound);
					if (!loadsFound.isEmpty())
					{
						functionsWithLoadsInWriteDefChains.add(func);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void checkForWriteDefChains(ControlFlowDiagram cfg, List<Transition> loadsFound) {

		// find all store-transitions and check whether they are in a
		// writeDefChain
		for (Transition write : cfg.getTransitions()) {
			if (write.getInstruction() instanceof Store) {

				Store store = (Store) write.getInstruction();

				// to avoid infinite loops
				List<Transition> explored = new ArrayList<Transition>();
				explored.add(write);

				// check if address of store is redefined before a fence
				String storeAddress = ((AddressUse) store.getTargetAddress().getValue()).getAddress().getName();
				for (Transition t : write.getTarget().getOutgoing()) {

					Transition addressDef = findDefinition(t, explored, storeAddress);

					if (addressDef != null) {

						// search for a way back to the store-transition
						if (findWayBack(addressDef, write, new ArrayList<Transition>())) {

							// way back found -> add to list
							if (!wdcAddress.contains(write))
								wdcAddress.add(write);

							// search for a possible early read
							Transition read = searchLoadWithRedefStoreAddress(storeAddress, addressDef,
									new ArrayList<Transition>());
							if (read != null) {
								loadsFound.add(read);
								if(CFGConstants.DEBUG)
								System.out.println(((Load) read.getInstruction()).getResult().getName()
										+ " := LOAD "
										+ (((AddressUse) ((Load) read.getInstruction()).getAddress().getValue()))
												.getAddress().getName());
							}
						}
					}
				}

				// check if value of store is redefined before a fence
				if (store.getValue().getValue() instanceof AddressUse) {
					String storeValue = ((AddressUse) store.getValue().getValue()).getAddress().getName();

					// to avoid infinite loops
					explored.clear();
					explored.add(write);

					for (Transition t : write.getTarget().getOutgoing()) {

						Transition def = findDefinition(t, explored, storeValue);

						if (def != null) {

							// search for a way back to the store-transition
							if (findWayBack(def, write, new ArrayList<Transition>())) {

								// way back found -> add to list
								wdcValue.add(write);
								if (wdcAddress.contains(write)) {
									wdcAddressValue.add(write);
								}
								break;
							}
						}
					}
				}
			}
		}
	}
	
	private boolean findWayBack(Transition start, Transition finish, List<Transition> explored) {

		// way back found
		if (start.equals(finish)) {
			return true;
		}

		// loop found
		if (explored.contains(start)) {
			return false;
		}

		// find way from start to store
		explored.add(start);
		for (Transition t : start.getTarget().getOutgoing()) {
			if (findWayBack(t, finish, explored)) {
				return true;
			}
		}
		return false;
	}
	
	private Transition findDefinition(Transition t, List<Transition> explored, String address) {

		// loop
		if (explored.contains(t)) {
			return null;
		}

		// sync between write and def
		Instruction instruction = t.getInstruction();
		if (GraphUtility.isSynch(instruction)) {
			return null;
		}

		if (instruction instanceof ArithmeticOperation) {
			ArithmeticOperation op = (ArithmeticOperation) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof LogicOperation) {
			LogicOperation op = (LogicOperation) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Cast) {
			Cast op = (Cast) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof GetElementPtr) {
			GetElementPtr op = (GetElementPtr) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Load) {
			Load op = (Load) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Call) {
			Call op = (Call) t.getInstruction();
			if (op.getResult() != null && op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Alloc) {
			Alloc op = (Alloc) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Phi) {
			Phi op = (Phi) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof LandingPad) {
			LandingPad op = (LandingPad) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Select) {
			Select op = (Select) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof VariableAttributeAccess) {
			VariableAttributeAccess op = (VariableAttributeAccess) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof ExtractValue) {
			ExtractValue op = (ExtractValue) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof ExtractElement) {
			ExtractElement op = (ExtractElement) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof InsertValue) {
			InsertValue op = (InsertValue) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof InsertElement) {
			InsertElement op = (InsertElement) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof ShuffleVector) {
			ShuffleVector op = (ShuffleVector) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		} else if (instruction instanceof Compare) {
			Compare op = (Compare) t.getInstruction();
			if (op.getResult().getName().equals(address)) {
				return t;
			}
		}
		explored.add(t);
		// search in all outgoing nodes for a definition
		for (Transition nextTransition : t.getTarget().getOutgoing()) {
			Transition def = findDefinition(nextTransition, explored, address);
			if (def != null) {
				return def;
			}
		}
		explored.remove(t);
		return null;
	}
	
	private Transition searchLoadWithRedefStoreAddress(String storeAddress, Transition transition,
			ArrayList<Transition> explored) {
		Instruction instruction = transition.getInstruction();
		if (instruction instanceof Load) {
			Load load = (Load) transition.getInstruction();
			if (load.getAddress().getValue() instanceof AddressUse) {
				if (((AddressUse) load.getAddress().getValue()).getAddress().getName().equals(storeAddress)) {
					return transition;
				}
			}
		}
		// loop found
		if (explored.contains(transition)) {
			return null;
		}

		if (GraphUtility.isSynch(instruction)) {
			return null;
		}

		explored.add(transition);
		for (Transition t : transition.getTarget().getOutgoing()) {
			Transition read = searchLoadWithRedefStoreAddress(storeAddress, t, explored);
			if (read != null) {
				return read;
			}
		}

		return null;
	}

	public List<Transition> getWdcAddress() {
		return wdcAddress;
	}

	public List<Transition> getWdcValue() {
		return wdcValue;
	}

	public List<Transition> getWdcAddressValue() {
		return wdcAddressValue;
	}

	@Override
	protected void setErrorLevel() {
		errorLevel = CFGConstants.LEVEL_WARNING;
		
	}

	
}
