package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.DecimalConstant;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.FunctionParameter;
import de.upb.llvm_parser.llvm.FunctionType;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.NestedCast;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.PhiCase;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.Vector;

public abstract class GraphUtility {
	
	private static final String ASSIGN = " := ";
	private static final String STORE = "STORE";
	private static final String LOAD = "LOAD";
	private static final String FLUSH = "FLUSH";
	private static final String VOID = "void";
	private static final String ALLOC = "alloc";
	private static final String TRUE = "true";
	private static final String FALSE = "false";
	private static final String RETURN = "RET";
	private static final String BRANCH = "GOTO";
	private static final String TODO = "TODO";
	private static final String WS = " ";
	
	
	public static String valueToCleanString(Value value)
	{
		String result = GraphUtility.valueToString(value);
		return clean(result);
	}

	public static String clean(String string)
	{
		int loc = string.indexOf("%");
		// if the address is starts with a number, do not give it a v_
		if (loc > -1 && string.substring(loc + 1, loc + 2).matches("[0-9]"))
		{
			string = string.replaceAll("%", "v");
		} else
		{
			string = string.replaceAll("%", "");
		}
		string = string.trim();
		string = string.replaceAll(" ", "");
		string = string.replaceAll("\\.", "_");

		// if the address is starts with a number, do not give it a v_
		string = string.replaceAll("@_", "");

		string = string.replaceAll("@", "");

		return string;
	}
	
	/**
	 * Returns the label under which the given instruction is listed
	 * @param function function of the instruction
	 * @param instruction instruction to look for
	 * @return label of the instruction
	 */
	public static String findLabelByInstruction(FunctionDefinition function, Instruction instruction)
	{
		if (instruction == null)
		{
			return "null";
		}
		for (BasicBlock b : function.getBody().getBlocks())
		{
			if (b.getInstructions().contains(instruction))
			{
				return b.getLabel();
			}
		}
		return "null";
	}
	
	
	/**
	 * Returns the transition that belongs to the instruction i in cfg
	 * @param cfg
	 * @param i
	 * @return CFG transition corresponding to instruction i
	 */
	public static Transition findCorrespondingTransition(ControlFlowDiagram cfg, Instruction i)
	{
		for (Transition t : cfg.getTransitions())
		{
			if (i.equals(t.getInstruction()))
			{
				return t;
			}
		}
		return null;
	}

	/**
	 * Returns the first instruction that is listed under the given label
	 * @param function
	 * @param destLabel
	 * @return instruction corresponding to the label
	 */
	public static Instruction getInstructionWithLabel(FunctionDefinition function, String destLabel)
	{
		for (BasicBlock b : function.getBody().getBlocks())
		{
			if (destLabel.equals(b.getLabel()))
			{
				return b.getInstructions().get(0);
			}
		}
		throw new RuntimeException("Could not find label " + destLabel + " in function "
				+ function.getAddress().getName());
	}
	
	/**
	 * Searches for the block with label destLabel and returns preceeding
	 * location of the transition that is corresponding to the first instruction
	 * of the block.
	 * 
	 * @param cfg
	 * @param function
	 * @param destLabel
	 * @return
	 */
	public static ControlFlowLocation findLabeledLocation(ControlFlowDiagram cfg, FunctionDefinition function,
			String destLabel)
	{
		Instruction dest = getInstructionWithLabel(function, destLabel);
		Transition destTrans = findCorrespondingTransition(cfg, dest);
		return destTrans.getSource();
	}
	
	/**
	 * Checks weather l is equal to the given pc in combination with the given buffer
	 * 
	 * @param l
	 * @param pc
	 * @param buffer
	 * @return true if location is represented by the given pc and store buffer combination
	 */
	//FIXME this check depends on the chosen semantics. right now, it only works for SC and TSO
	public static boolean isRepresentedBy(ControlFlowLocation l, int pc, StoreBuffer buffer){
		return (bufferToString(l).equalsIgnoreCase(bufferToString(buffer, pc)));
	}
	
	/**
	 * Returns the given ControlFlowLocation as a String
	 * 
	 * @param nextLocation
	 * @return
	 */
	public static String bufferToString(ControlFlowLocation nextLocation){
		return bufferToString(nextLocation.getBuffer(), nextLocation.getPc());
	}
	
	/**
	 * Returns the given buffer and pc as a String
	 * @param buf
	 * @param pc
	 * @return
	 */
	public static String bufferToString(StoreBuffer buf, int pc)
	{
		String buffer = "L_" + pc;
		if (buf.getAddressValuePairs().isEmpty())
		{
			return clean(buffer);
		}
		
		buffer += "_<";
		for (AddressValuePair pair : buf.getAddressValuePairs())
		{
			buffer += "(" + addressValuePairToString(pair) + ")";
		}
		buffer += ">";
		return clean(buffer);
	}
	
	public static String addressValuePairToString(AddressValuePair pair)
	{
		String result = valueToString(pair.getAddress().getValue()) + " : ";
		Iterator<Parameter> i = pair.getValues().iterator();
		while(i.hasNext())
		{
			Parameter param = i.next();
			result += GraphUtility.valueToString(param.getValue());
			if(i.hasNext())
			{
				result+= ", ";
			}
		}
		return result;
	}
	
	
	/**
	 * @param cfgs
	 * @return "DIV" or "MUL" if CFG has multipication or divisions and null, otherwise.
	 */
	public static String hasMultiplicationOrDivision(List<ControlFlowDiagram> cfgs)
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			for (Transition t : cfg.getTransitions())
			{
				if (t.getInstruction() != null && t.getInstruction() instanceof ArithmeticOperation)
				{
					ArithmeticOperation op = (ArithmeticOperation) t.getInstruction();
					String operation = op.getOperation();
					if (operation.equalsIgnoreCase("udiv") || operation.equalsIgnoreCase("sdiv"))
					{
						return "DIV";
					}
					if (operation.equalsIgnoreCase("mul"))
					{
						return "MUL";
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Returns the pc of the given instruction in the given list of all instructions
	 * 
	 * @param instruction
	 * @param instructions
	 * @return
	 */
	public static int getPcOfInstruction(Instruction instruction, List<Instruction> instructions)
	{
		for (int i = 0; i < instructions.size(); i++)
		{
			Instruction inst = instructions.get(i);
			if (inst.equals(instruction))
			{
				return i;
			}
		}

		return -1;
	}
	
	/**
	 * Checks wether the given location is contained in the given list
	 * @param list
	 * @param location
	 * @return true if location in list, else false
	 */
	public static boolean isInList(List<ControlFlowLocation> list, ControlFlowLocation location)
	{
		for (ControlFlowLocation loc : list)
		{
			if (isRepresentedBy(location, loc.getPc(), loc.getBuffer()))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks wether the given pair is in the given list
	 * @param list
	 * @param pair
	 * @return true if pair is in list, else false
	 */
	public static boolean isAVPInList(List<AddressValuePair> list, AddressValuePair pair)
	{
		String pairString = addressValuePairToString(pair);

		for (AddressValuePair p : list)
		{
			if (pairString.equalsIgnoreCase(addressValuePairToString(p)))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Retruns a list of all nodes that are adjacent to the given location
	 * @param l
	 * @return
	 */
	public static ArrayList<ControlFlowLocation> getAdjacentNodes(ControlFlowLocation l)
	{
		ArrayList<ControlFlowLocation> adjacents = new ArrayList<ControlFlowLocation>();
		for (Transition t : l.getOutgoing())
		{
			adjacents.add(t.getTarget());
		}
		return adjacents;
	}

	public static boolean isSynch(Instruction instruction)
	{
		return (instruction instanceof Fence
				|| instruction instanceof CmpXchg 
				|| instruction instanceof Return);
	}
	
	/**
	 * Gets called to get a label for the given transition
	 * @param t transition that needs a label
	 * @return label for the transition
	 */
	public static String getNewTransitionLabel(Transition t) {
		String result = "";

		if(t instanceof FlushTransition){

			if(!t.getSource().getBuffer().getAddressValuePairs().isEmpty())
			{
				AddressValuePair p = t.getSource().getBuffer().getAddressValuePairs().get(0);
				//FIXME this is TSO specific as the whole pair
				String s = addressValuePairToString(p);
				return FLUSH + "(" + s + ")";
			}

			return FLUSH;
		}
		
		if(t instanceof EarlyReadTransition){
			String s = ((Load)t.getInstruction()).getResult().getName();
			s += ASSIGN;
			s += ((EarlyReadTransition) t).getAssignmentExpression();
			return s;
		}
		
		if(t instanceof WriteDefChainTransition){
			WriteDefChainTransition wdcTransition = (WriteDefChainTransition) t;
			Store store = (Store) t.getInstruction();
			if(wdcTransition.getCopyAddress() != null && wdcTransition.getCopyValue() != null){
				String s = "("+wdcTransition.getCopyAddress().getName()+" , "+wdcTransition.getCopyValue().getName()+")";
				s += ASSIGN;
				s += "("+parameterValueToString(store.getTargetAddress())+" , "+parameterValueToString(store.getValue())+")";
				result = STORE + WS;
				result += wdcTransition.getCopyValue().getName() + WS;
				result += wdcTransition.getCopyAddress().getName();
				return s + " , " + result;
			}
			else if (wdcTransition.getCopyValue() != null) {
				String s = wdcTransition.getCopyValue().getName() + ASSIGN;
				s += parameterValueToString(store.getValue());
				result = STORE + WS;
				result += wdcTransition.getCopyValue().getName() + WS;
				result += parameterValueToString(store.getTargetAddress());
				return s + " , " + result;
			}else{
				String s = wdcTransition.getCopyAddress().getName() + ASSIGN;
				s += parameterValueToString(store.getTargetAddress());
				result = STORE + WS;
				result += parameterValueToString(store.getValue());
				result += wdcTransition.getCopyAddress().getName();
				return s + " , " + result;
			}

		}

		if(t.getInstruction() == null){
			return TODO;
		}

		EClass type = t.getInstruction().eClass();

		// Load
		if (type.equals(LlvmPackage.eINSTANCE.getLoad())) {
			Load instr = (Load) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += LOAD + " ";
			result += parameterValueToString(instr.getAddress());
		}
		// Store
		else if (type.equals(LlvmPackage.eINSTANCE.getStore())) {
			Store instr = (Store) t.getInstruction();
			result += STORE + WS;
			result += parameterValueToString(instr.getValue());
			result += parameterValueToString(instr.getTargetAddress());
		}
		// Branch
		else if (type.equals(LlvmPackage.eINSTANCE.getBranch())) {
			if (t instanceof GuardedTransition) {
				result += "[" + (((GuardedTransition) t).getCondition().replace("[", ""));
			}else{
				Branch br = (Branch)t.getInstruction();
				result += BRANCH + WS + br.getDestination()+WS;
			}
		}
		// GetElementPtr
		else if (type.equals(LlvmPackage.eINSTANCE.getGetElementPtr())) {
			GetElementPtr instr = (GetElementPtr) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += type.getName() + WS;
			result += parameterValueToString(instr.getAggregate());
			for (int i = 0; i < instr.getIndices().size(); i++) {
				result += parameterValueToString(instr.getIndices().get(i));
			}
		}
		// CmpXchg
		else if (type.equals(LlvmPackage.eINSTANCE.getCmpXchg())) {

			CmpXchg instr = (CmpXchg) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += "CAS(";
			result += parameterValueToString(instr.getAddress()) +", ";
			result += parameterValueToString(instr.getValue()) + ", ";
			result += parameterValueToString(instr.getNewValue()) + ")";
		}
		// Call
		else if (type.equals(LlvmPackage.eINSTANCE.getCall())) {

			Call instr = (Call) t.getInstruction();
			if(instr.getResult() != null){
				result += instr.getResult().getName() + ASSIGN;
			}else{
				result += VOID + WS;
			}
			result += type.getName() + WS;
			result += parameterValueToString(instr.getFunction());
			result += parameterListToString(instr.getPList());
		}
		// Alloc
		else if (type.equals(LlvmPackage.eINSTANCE.getAlloc())) {
			Alloc instr = (Alloc) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += ALLOC + WS;
			result += typeUseToString(instr.getType());
		}
		// Arithmetic Operations
		else if (type.equals(LlvmPackage.eINSTANCE.getArithmeticOperation())) {
			ArithmeticOperation instr = (ArithmeticOperation) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			String operation = instr.getOperation();
			result += valueToString(instr.getValue1()) + WS;
			if (operation.equals("add") || operation.equals("fadd")) {
				result += "+ ";
			} else if (operation.equals("sub") || operation.equals("fsub")) {
				result += "- ";
			} else if (operation.equals("mul") || operation.equals("fmul")) {
				result += "* ";
			} else if (operation.equals("udiv") || operation.equals("sdiv") || operation.equals("fdiv")) {
				result += ": ";
			} else if (operation.equals("urem") || operation.equals("srem") || operation.equals("frem")) {
				result += "% ";
			}
			result += valueToString(instr.getValue2());
		}
		// Logical Operations
		else if (type.equals(LlvmPackage.eINSTANCE.getLogicOperation())) {
			LogicOperation instr = (LogicOperation) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			String operation = instr.getOperation();
			result += valueToString(instr.getValue1()) + WS;
			if (operation.equals("shl")) {
				result += "<< ";
			} else if (operation.equals("lshr")) {
				result += ">>[L] ";
			} else if (operation.equals("ashr")) {
				result += ">>[A] ";
			} else if (operation.equals("and")) {
				result += "& ";
			} else if (operation.equals("or")) {
				result += "| ";
			} else if (operation.equals("xor")) {
				result += "^ ";
			}
			result += valueToString(instr.getValue2());
		}
		// Compare
		else if (type.equals(LlvmPackage.eINSTANCE.getCompare())) {
			Compare instr = (Compare) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN + "(";
			String compare = instr.getCond();
			if (compare.equals(FALSE)) {
				result += FALSE;
				return result;
			} else if (compare.equals(TRUE)) {
				result += TRUE;
				return result;
			}
			result += valueToString(instr.getOperand1()) + WS;
			if (compare.equals("eq")) {
				result += "== ";
			} else if (compare.equals("ne")) {
				result += "!= ";
			} else if (compare.equals("ugt") || compare.equals("sgt")) {
				result += "> ";
			} else if (compare.equals("uge") || compare.equals("sge")) {
				result += ">= ";
			} else if (compare.equals("ult") || compare.equals("slt")) {
				result += "< ";
			} else if (compare.equals("ule") || compare.equals("sle")) {
				result += "<= ";
			} else if (compare.equals("oeq")) {
				result += "=[o] ";
			} else if (compare.equals("ogt")) {
				result += ">[o] ";
			} else if (compare.equals("oge")) {
				result += ">=[o] ";
			} else if (compare.equals("olt")) {
				result += "<[o] ";
			} else if (compare.equals("ole")) {
				result += "<=[o] ";
			} else if (compare.equals("one")) {
				result += "!=[o] ";
			} else if (compare.equals("ueq")) {
				result += "=[u] ";
			} else if (compare.equals("ugt")) {
				result += ">[u] ";
			} else if (compare.equals("uge")) {
				result += ">=[u] ";
			} else if (compare.equals("ult")) {
				result += "<[u] ";
			} else if (compare.equals("ule")) {
				result += "<=[u] ";
			} else if (compare.equals("une")) {
				result += "!=[u] ";
			} else if (compare.equals("ord")) {
				result += "orderd ";
			} else if (compare.equals("uno")) {
				result += "not orderd ";
			}
			result += valueToString(instr.getOperand2()) + ")";
		}
		// Return
		else if (type.equals(LlvmPackage.eINSTANCE.getReturn()))
		{
			result += RETURN + WS;
			EObject returnValue = ((Return) t.getInstruction()).getValue();
			Value value = null;
			if (returnValue instanceof Parameter)
			{
				value = ((Parameter)returnValue).getValue();
			}
			else if (returnValue instanceof PrimitiveValue)
			{
				value = (PrimitiveValue) returnValue;
			} 
			
			if (value != null)
			{
				result += valueToString(value);
			} else
			{
				result += WS + VOID;
			}
		}
		// Cast
		else if (type.equals(LlvmPackage.eINSTANCE.getCast())) {
			Cast instr = (Cast) t.getInstruction();
			result += (instr.getResult().getName() + ASSIGN + "(" + typeUseToString((TypeUse)instr.getFrom()) + "->" + typeUseToString(instr.getTo()) + ") " + valueToString(instr.getValue()));
		}
		// Invoke
		else if (type.equals(LlvmPackage.eINSTANCE.getInvoke())) {
			result += type.getName();
			Invoke instr = (Invoke) t.getInstruction();
			result += instr.getName().getName();
			result += parameterListToString(instr.getPList());
		}
		// Fence
		else if (type.equals(LlvmPackage.eINSTANCE.getFence())) {
			result += type.getName();
			Fence instr = (Fence) t.getInstruction();
			result += instr.getOrdering();
		}
		// AtomicRMW
		else if (type.equals(LlvmPackage.eINSTANCE.getAtomicRMW())) {
			result += "atomic( ";
			AtomicRMW instr = (AtomicRMW) t.getInstruction();
			String operation = instr.getOperation();
			if (operation.equals("xchg")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("add")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " + ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("sub")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " - ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("and")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " & ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("nand")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " !& ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("or")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " | ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("xor")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " ^ ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("max") || operation.equals("umax")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " > ";
				result += parameterValueToString(instr.getArgument());
				result += " ? ";
				result += parameterValueToString(instr.getAddress());
				result += " : ";
				result += parameterValueToString(instr.getArgument());
			} else if (operation.equals("min") || operation.equals("umin")) {
				result += parameterValueToString(instr.getAddress());
				result += " = ";
				result += parameterValueToString(instr.getAddress());
				result += " < ";
				result += parameterValueToString(instr.getArgument());
				result += " ? ";
				result += parameterValueToString(instr.getAddress());
				result += " : ";
				result += parameterValueToString(instr.getArgument());
			}
			result += " )";
			//phi
		}else if(type.equals(LlvmPackage.eINSTANCE.getPhi())){
			Phi phiInstruction = (Phi)t.getInstruction();
			result += "phi(";
			HashMap<String, Integer> incomingLabels = new HashMap<String, Integer>();
			for(Transition incoming: t.getSource().getIncoming()){
				if(incoming.getSource().getBlockLabel() != null){
					incomingLabels.put(incoming.getSource().getBlockLabel(), incoming.getSource().getPc());
				}
			}
			for(PhiCase phiCase: phiInstruction.getCases()){
				String phiLabel = phiCase.getLabel().replace("%", "");
				if(incomingLabels.containsKey(phiLabel)){
					phiLabel += "(PC:"+incomingLabels.get(phiLabel)+")";
				}
				result+= "[" + valueToString(phiCase.getValue()) + ", " + phiLabel + "], ";
			}
			result = result.substring(0,result.length()-2) + ")";

		}
		// not-implemented
		else {
			result += type.getName();
		}
		return result;
	}

	/**
	 * creates string representation of the parameter list 
	 * @param pList
	 * @return 
	 */
	public static String parameterListToString(ParameterList pList) {
		String result = "(";
		Iterator<Parameter> i = pList.getParams().iterator();
		while (i.hasNext())
		{
			Parameter p = i.next();
			if(i.hasNext())
			{
				result += parameterValueToString(p) + ", ";
			}
			else {
				result += parameterValueToString(p);
			}
		}
		result += ")";
		return result;
	}

	/**
	 * Adds a type
	 * @param type the type to add to the String.
	 * @return concatenated String
	 */
	public static String typeUseToString(TypeUse type)
	{
		String result;
		if (type instanceof Predefined)
		{
			result = ((Predefined) type).getType();
			if (((Predefined) type).getPointer() != null)
			{
				result += ((Predefined) type).getPointer();
			}
		} else if (type instanceof AddressUse)
		{
			result = ((AddressUse) type).getAddress().getName();
			if (((AddressUse) type).getPointer() != null)
			{
				result += ((AddressUse) type).getPointer();
			}
		} else if (type instanceof FunctionType)
		{
			FunctionType ftype = (FunctionType) type;
			result = typeToString(ftype.getReturnType()) + "(";
			Iterator<FunctionParameter> i = ftype.getParameter().getParams().iterator();
			while (i.hasNext())
			{
				result += typeToString(i.next());
				if (i.hasNext())
				{
					result += ", ";
				}
			}
			result += ")";
		} else
		{
			result = type.toString();
		}
		return result;
	}
	
	public static String aggregateTypeToString(Aggregate_Type type)
	{
		String result = null;
		if (type instanceof Array)
		{
			Array array = (Array) type;
			EObject arrayType = array.getType();
			result = "[" + array.getLength() + " x " + typeToString(arrayType)+"]"  ;
			if(array.getPointer() != null)
			{
				result+= array.getPointer();
			}
		} 
		else if (type instanceof Vector)
		{
			Vector vector = (Vector) type;
			EObject arrayType = vector.getType();
			
			result = "[" + vector.getLength() + " x " + typeToString(arrayType) +"]";
		} 
		else if (type instanceof Structure)
		{
			Structure struct = (Structure) type;
			result = "{";
			EList<EObject> types = struct.getTypes();
			Iterator<EObject> i = types.iterator();
			while (i.hasNext())
			{
				result += typeToString(i.next());
				if (i.hasNext())
				{
					result += ", ";
				} 
			}
			if(struct.getPointer() != null)
			{
				result+= struct.getPointer();
			}
			result += "}";
		} 
		
		return result;
	}
	
	public static String typeToString(EObject type)
	{
		if (type instanceof TypeUse)
		{
			return typeUseToString((TypeUse)type);
		}
		else if (type instanceof Aggregate_Type)
		{
			return aggregateTypeToString((Aggregate_Type)type);
		}
		else return null;
	}

	/**
	 * Add a value to the String
	 * @param value
	 * @return the concatenated String
	 */
	public static String valueToString(Value value)
	{
		String result = "";

		if (value instanceof AddressUse)
		{
			AddressUse aui = (AddressUse) value;
			result += aui.getAddress().getName();
		}
		else if (value instanceof IntegerConstant)
		{
			result += ((IntegerConstant) value).getValue();
		} else if (value instanceof DecimalConstant)
		{
			result += ((DecimalConstant) value).getValue();
		} else if (value instanceof PrimitiveValue)
		{
			result += ((PrimitiveValue) value).getValue();
		} else if (value instanceof NestedGetElementPtr)
		{
			// TODO indices are missing and actually a simple representation
			return "(GetElementPtr" + WS + parameterValueToString(((NestedGetElementPtr) value).getAggregate()) +")";
		} else if (value instanceof NestedCast)
		{
			NestedCast val = (NestedCast) value;
			result += "(" + typeToString(val.getFrom()) + "-->" + typeToString(val.getTo()) + ")" + valueToString(val.getValue());
		} else
		{
			result += TODO;
		}

		return (result + WS);
	}

	public static String parameterValueToString(Parameter val) {
		return valueToString(val.getValue());
	}
	
}
