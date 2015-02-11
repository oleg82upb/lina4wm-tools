package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.Transition;
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
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;

public class PreComputationChecker {

	private LLVM ast = null;
	private String astLocation;
	private int reordering;
	private List<FunctionDefinition> functions = null;
	public static final int TSO = 1;

	public PreComputationChecker(String astLocation, int reordering) {
		this.astLocation = astLocation;
		this.reordering = reordering;

	}

	private LLVM loadAst() {
		if (ast != null) {
			return ast;
		}
		try {
			LlvmPackage.eINSTANCE.getNsURI();
			ResourceSet resourceSet = new ResourceSetImpl();
			Path astpath = new Path(astLocation);
			URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
			Resource llvmResource = resourceSet.getResource(uri, true);
			this.ast = (LLVM) llvmResource.getContents().get(0);
			return ast;
		} catch (WrappedException e) {
			CFGActivator.logError(e.getMessage(), e);
		}
		return null;
	}

	public boolean checkforEarlyReads() throws InterruptedException {

		if (loadAst() == null) {
			throw new InterruptedException("No specified LLVM Object inside the ast.");
		}

		int a_elem = ast.getElements().size();
		List<Transition> earlyReads = new ArrayList<Transition>();
		List<Transition> earlyReadsInFunction = new ArrayList<Transition>();
		functions = new ArrayList<FunctionDefinition>();

		// for every function
		for (int i = 0; i < a_elem; i++) {

			if (ast.getElements().get(i) instanceof FunctionDefinitionImpl) {
				FunctionDefinition func = (FunctionDefinition) ast.getElements().get(i);
				if (func.getBody() != null)

					if (reordering == TSO) {
						// create sc-graph and search for possible early reads
						SCUtil sc = new SCUtil();
						earlyReadsInFunction = collectEarlyReadsinSCGraph(sc.createCFG(func));
						if(!earlyReadsInFunction.isEmpty()){
							functions.add(func);
						}
					}
				if (Debug.DEBUG) {

					if (Debug.DEBUG && earlyReadsInFunction.isEmpty()) {
						System.out.println("No early reads found in function " + func.getAddress().getName());
					} else {
						System.out.println("Early reads found in function " + func.getAddress().getName()
								+ " at transition:");
						for (Transition t : earlyReadsInFunction)
							System.out.print(t.getSource().getPc() + " to " + t.getTarget().getPc() + "  ");
					}
					System.out.println();
				}
			}
			earlyReads.addAll(earlyReadsInFunction);
		}
		return !earlyReads.isEmpty();
	}
	

	/**
	 * This method should only be called if checkForEarlyReads() was called before 
	 * @return the functions
	 */
	public List<FunctionDefinition> getFunctions() {
		return functions;
	}


	public boolean checkforLoopWithoutFence() throws InterruptedException {

		if (loadAst() == null) {
			throw new InterruptedException("No specified LLVM Object inside the ast.");
		}

		int a_elem = ast.getElements().size();
		boolean loopWithoutFence = false;
		boolean loopWithoutFenceinfunc = false;

		// for every function
		for (int i = 0; i < a_elem; i++) {
			if (ast.getElements().get(i) instanceof FunctionDefinitionImpl) {
				FunctionDefinition func = (FunctionDefinition) ast.getElements().get(i);
				if (func.getBody() != null)

					if (reordering == TSO) {
						// create sc-graph and search for loops without fence
						SCUtil sc = new SCUtil();
						loopWithoutFenceinfunc = containsLoopWithoutFences(sc.createCFG(func));
					}
				if (Debug.DEBUG && loopWithoutFenceinfunc)
					System.out.println("Loops without fence found in function " + func.getAddress().getName());
			}
			loopWithoutFence = loopWithoutFence | loopWithoutFenceinfunc;
		}
		if (Debug.DEBUG)
			System.out.println("Loop without fence:" + loopWithoutFence);
		return loopWithoutFence;

	}

//	/**
//	 * @param cfg
//	 *            ControlFlowDiagram with TSO semantic
//	 * @return a list of transitions which are early reads
//	 */
//	public List<Transition> collectEarlyReadsinTSOGraph(ControlFlowDiagram cfg) {
//
//		List<Transition> earlyReads = new ArrayList<Transition>();
//		EList<Transition> TransitionList = cfg.getTransitions();
//		for (Transition t : TransitionList) {
//			if (detectEarlyReadforTSO(t)) {
//				earlyReads.add(t);
//			}
//		}
//		return earlyReads;
//	}
//
//	/**
//	 * @param t
//	 *            a transition, which is a load-instruction
//	 * @return <code>true</code> if the transition is an early read
//	 */
//	private boolean detectEarlyReadforTSO(Transition t) {
//
//		ControlFlowLocation source = t.getSource();
//
//		if (!source.getBuffer().getAddressValuePairs().isEmpty()) {
//
//			if (!(t instanceof FlushTransition)) {
//
//				if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getLoad())
//						|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg())
//						|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getAtomicRMW())
//						|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getInvoke())) {
//					
//					EList<AddressValuePair> avpList = source.getBuffer().getAddressValuePairs();
//
//					ListIterator<AddressValuePair> it = avpList.listIterator(avpList.size()-1);
//
//					while(it.hasPrevious()){
//						AddressValuePair avp = (AddressValuePair) it.previous();
//					
//						if (t.getInstruction() instanceof Load) {
//
//							Load load = (Load) t.getInstruction();
//							if (avp.getAddress().getValue() instanceof AddressUse
//									&& load.getAddress().getValue() instanceof AddressUse) {
//								AddressUse avpaddress = (AddressUse) avp.getAddress().getValue();
//								AddressUse taddress = (AddressUse) load.getAddress().getValue();
//
//								if (avpaddress.getAddress().equals(taddress.getAddress()))
//									return true;
//							} else if(Debug.DEBUG){
//								System.out.println("not of type AddressUse " + t.getSource().getPc() + " to "
//										+ t.getTarget().getPc());
//							}
//						} else if(Debug.DEBUG){
//							System.out.println("t.getInstruction() not of type Load");
//						}
//					}
//				}
//			}
//		}
//		return false;
//	}

	/**
	 * @param cfg
	 *            ControlFlowDiagram with SC semantic
	 * @return a list of transitions which are possible early reads
	 */
	public List<Transition> collectEarlyReadsinSCGraph(ControlFlowDiagram cfg) {

		List<Transition> earlyReads = new ArrayList<Transition>();
		List<Transition> loads = new ArrayList<Transition>();
		EList<Transition> TransitionList = cfg.getTransitions();
		// find all loads
		for (Transition t : TransitionList) {
			if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getLoad())) {
				loads.add(t);
			}
		}
		// check for all loads whether they are early reads or not
		for (Transition t : loads) {
			if (detectEarlyReadforSC(t)) {
				earlyReads.add(t);
			}
		}
		return earlyReads;
	}

	/**
	 * @param t a transition, which is a load-instruction
	 * @return <code>true</code> if the transition is a possible early read
	 */
	private boolean detectEarlyReadforSC(Transition t) {
		Load load = (Load) t.getInstruction();
		List<Transition> explored = new ArrayList<Transition>();
		explored.add(t);
		if (load.getAddress().getValue() instanceof AddressUse) {
			for (Transition tr : t.getSource().getIncoming())
				if (isEarlyRead(tr, explored, t))
					return true;
		} else if(Debug.DEBUG){
			System.out.println("load.getAddress().getValue() of type " + load.getAddress().getValue().toString());
		}
		return false;
	}

	/**
	 * @param t the transition to be checked for being a store
	 * @param explored list of already checked transitions
	 * @param load the load transition to be checked
	 * @return <code>true</code> if load is an possible early read
	 */
	private boolean isEarlyRead(Transition t, List<Transition> explored, Transition load) {
		// fence found
		if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getFence())
				|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg())
				|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getAtomicRMW())
				|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getInvoke())) {
			return false;
		}
		// loop found
		if (explored.contains(t)) {
			return false;
		}
		// check if load is early read w.r.t. transition t
		explored.add(t);
		Load l = (Load) load.getInstruction();
		AddressUse loadaddress = (AddressUse) l.getAddress().getValue();

		if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getStore())) {
			Store store = (Store) t.getInstruction();
			if (store.getTargetAddress().getValue() instanceof AddressUse) {
				AddressUse storeaddress = (AddressUse) store.getTargetAddress().getValue();

				if (loadaddress.getAddress().equals(storeaddress.getAddress())) {
					return true;
				}
			}
		}
		// reached end of graph
		if (t.getSource().getIncoming().isEmpty())
			return false;
		// check for all incoming transitions
		for (Transition transition : t.getSource().getIncoming()) {
			if (isEarlyRead(transition, explored, load))
				return true;
		}
		// no early read found
		return false;
	}

	public boolean containsLoopWithoutFences(ControlFlowDiagram cfg) {
		List<Transition> transitions = cfg.getTransitions();
		for (Transition t : transitions){
			if (t.getInstruction() instanceof Store && detectLoopWithoutFence(t)){
				return true;
			}
		}

		return false;
	}

	private boolean detectLoopWithoutFence(Transition t) {
		List<Transition> explored = new ArrayList<Transition>();
		explored.add(t);
		for (Transition tr : t.getTarget().getOutgoing())
			if (isLoopWithoutFence(tr, explored, t))
				return true;
		return false;
	}

	private boolean isLoopWithoutFence(Transition t, List<Transition> explored, Transition write) {
		// fence found
		if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getFence())
				|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg())
				|| t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getAtomicRMW())) {
			return false;
		}
		// loop without fence found
		if(t.equals(write)){
			return true;
		}
		
		//loop found, but no write inside the loop
		if (explored.contains(t)) {
			return false;
		}
		// reached end of graph
		if (t.getTarget().getOutgoing().isEmpty())
			return false;
		// check for all outgoing transitions
		explored.add(t);
		for (Transition transition : t.getTarget().getOutgoing()) {
			if (isLoopWithoutFence(transition, explored, write)){
				return true;
			}
		}
		// no loop without fence found
		explored.remove(t);
		return false;
	}

	public List<Transition> checkForWriteDefChains(ControlFlowDiagram cfg) {
		EList<Transition> TransitionList = cfg.getTransitions();
		List<Transition> writedefchains = new ArrayList<Transition>();
		// find all writes
		if(Debug.DEBUG){
			System.out.print("WriteDefChains: ");
		}
		for (Transition t : TransitionList) {
			if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getStore())) {
				// check for all writes whether they are in a writeDefChain
				if (detectWriteDefChain(t)) {
					writedefchains.add(t);
					if(Debug.DEBUG){
						System.out.println(t.getSource().getPc()+" to "+t.getTarget().getPc());
					}
				}
			}
		}
		if(Debug.DEBUG){
			System.out.println();
		}
		return writedefchains;
	}

	private boolean detectWriteDefChain(Transition write) {
		Store store = (Store) write.getInstruction();
		List<Transition> explored = new ArrayList<Transition>();
		explored.add(write);
		for (Transition t : write.getTarget().getOutgoing()) {
			Transition def = findDefinition(store, t, explored);
			if (def != null) {
				if(findWayBack(def, write)){
					return true;
				}
			}
		}
		return false;
	}

	private boolean findWayBack(Transition start, Transition finish) {
		
		//way back found
		if(start.equals(finish)) return true;
		
		//find way from start to store
		for(Transition t : start.getTarget().getOutgoing()){
			if(findWayBack(t, finish)){
				return true;
			}
		}
		return false;
	}

	private Transition findDefinition(Store store, Transition t, List<Transition> explored) {
		
		//loop 
		if(explored.contains(t)){
			return null;
		}
		
		//sync between write and def
		EObject instructiontype = t.getInstruction().eClass();
		if (instructiontype.equals(LlvmPackage.eINSTANCE.getFence())
				|| instructiontype.equals(LlvmPackage.eINSTANCE.getCmpXchg())
				|| instructiontype.equals(LlvmPackage.eINSTANCE.getAtomicRMW())) {
			return null;
		}
		
		String storeAddress = ((AddressUse)store.getTargetAddress().getValue()).getAddress().getName();
		
		//FIXME: which of them are needed?
		
		if(instructiontype.equals(LlvmPackage.eINSTANCE.getArithmeticOperation())){
			ArithmeticOperation op = (ArithmeticOperation) t.getInstruction();
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getLogicOperation())){
			LogicOperation op = (LogicOperation) t.getInstruction();	
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getCast())){
			Cast op = (Cast) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getGetElementPtr())){
			GetElementPtr op = (GetElementPtr) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getLoad())){
			Load op = (Load) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
//		}else if(instructiontype.equals(LlvmPackage.eINSTANCE.getStore())){
//			Store op = (Store) t.getInstruction();		
//			if(((AddressUse)op.getTargetAddress().getValue()).getAddress().getName().equals(storeAddress)){
//				return t;
//			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getCall())){
			Call op = (Call) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getAlloc())){
			Alloc op = (Alloc) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if(instructiontype.equals(LlvmPackage.eINSTANCE.getPhi())){
			Phi op = (Phi) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getLandingPad())){
			LandingPad op =  (LandingPad) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getSelect())){
			Phi op = (Phi) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getVariableAttributeAccess())){
			VariableAttributeAccess op = (VariableAttributeAccess) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if(instructiontype.equals(LlvmPackage.eINSTANCE.getExtractValue())){
			ExtractValue op = (ExtractValue) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getExtractElement())){
			ExtractElement op = (ExtractElement) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getInsertValue())){
			InsertValue op = (InsertValue) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getInsertElement())){
			InsertElement op = (InsertElement) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getShuffleVector())){
			ShuffleVector op = (ShuffleVector) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}else if( instructiontype.equals(LlvmPackage.eINSTANCE.getCompare())){
			Compare op = (Compare) t.getInstruction();		
			if(op.getResult().getName().equals(storeAddress)){
				return t;
			}
		}
		explored.add(t);
		//search in all outgoing nodes for a definition
		for (Transition nextTransition : t.getTarget().getOutgoing()) {
			Transition def = findDefinition(store, nextTransition, explored);
			if(def != null){
				return def;
			}
		}
		explored.remove(t);
		return null;
	}
}
