package de.upb.lina.transformations.plugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.ConstraintMapping;
import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.LocationLabel;
import de.upb.lina.cfg.gendata.PhiMapping;
import de.upb.lina.cfg.gendata.TransitionLabel;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.DecimalConstant;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.FunctionParameter;
import de.upb.llvm_parser.llvm.FunctionParameterList;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.GlobalDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.PhiCase;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Unreachable;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;

public class GendataPrecomputer {

	private List<ControlFlowDiagram> cfgs;
	private int basis;
	private GeneratorData helperModel;

	private HashMap <Address, String> addressLookup = new HashMap<Address, String>();
	private HashMap <ControlFlowDiagram, String> cfgToLabelPrefix = new HashMap <ControlFlowDiagram, String>();

	private HashMap<FunctionDefinition, List<String>> usedVarsInFunctions = new HashMap<FunctionDefinition, List<String>>();

	public GendataPrecomputer(List<ControlFlowDiagram> cfgs, int basis){
		this.cfgs = cfgs;
		this.basis = basis;
	}

	public GeneratorData computeGeneratorData(){
		precomputeHelperModel();
		return helperModel;
	}

	private void precomputeHelperModel(){
		helperModel = GendataFactory.eINSTANCE.createGeneratorData();

		for(ControlFlowDiagram cfg: cfgs){
			try{
				EObject motherObject = cfg.getStart().getOutgoing().get(0).getInstruction().eContainer();
				BasicBlock basicBlock = (BasicBlock) motherObject;
				FunctionBody fb = (FunctionBody)basicBlock.eContainer();
				FunctionDefinition fd = (FunctionDefinition)fb.eContainer();
				usedVarsInFunctions.put(fd, new ArrayList<String>());
			}catch(NullPointerException ex){

			}
		}

		//set the program
		try{
			//llvm
			EObject motherObject = cfgs.get(0).getStart().getOutgoing().get(0).getInstruction().eContainer();
			BasicBlock basicBlock = (BasicBlock) motherObject;
			FunctionBody fb = (FunctionBody)basicBlock.eContainer();
			FunctionDefinition fd = (FunctionDefinition)fb.eContainer();
			LLVM program = (LLVM)fd.eContainer();
			helperModel.setProgram(program);
			helperModel.getCfgs().addAll(cfgs);

			//local vars
			computeLocalVariables(program);

			//labels
			computeLabelPrefixesPerFunction();
			computeLocationLabels();
			computeTransitionLabels();

			//conditions
			computeTransitionConditionMapping();

			//TransformationSpecificKeys
			computeTransformationSpecificKeys();
			
			//filteredAddresses
			computeFilteredAddresses();

			//phi mappings
			computePhiMapping();
			
			//KIV transformation basis
			addBasis();
			checkForMulOrDiv();


		}catch(ClassCastException ex){
			Activator.logError("Could not link LLVM program to this transformation.", ex);
		}
	}

	private void addBasis() {
		if(basis == Constants.INT){
			helperModel.getTransformationSpecificKeys().add("INT");
		}else if(basis == Constants.NAT){
			helperModel.getTransformationSpecificKeys().add("NAT");
		}
	}
	
	private void checkForMulOrDiv(){
		String s = GraphUtility.hasMultiplicationOrDivision(cfgs);
		if(s != null)
			helperModel.getTransformationSpecificKeys().add(s);
	}

	private void computePhiMapping(){
		for(ControlFlowDiagram cfg: cfgs){
			HashMap<String, ArrayList<Phi>> blockLabelToPhiInstructions = new HashMap<String, ArrayList<Phi>>();
			try{
				EObject motherObject = cfg.getStart().getOutgoing().get(0).getInstruction().eContainer();
				BasicBlock basicBlock = (BasicBlock) motherObject;
				FunctionBody fb = (FunctionBody)basicBlock.eContainer();
				FunctionDefinition fd = (FunctionDefinition)fb.eContainer();
				for(BasicBlock b: fd.getBody().getBlocks()){
					blockLabelToPhiInstructions.put(b.getLabel(), new ArrayList<Phi>());
					for(Instruction i: b.getInstructions()){
						if(i instanceof Phi){
							if(!blockLabelToPhiInstructions.get(b.getLabel()).contains(i)){
								blockLabelToPhiInstructions.get(b.getLabel()).add((Phi)i);
							}
						}
					}
				}
			}catch(NullPointerException ex){
				//nothing to do here
			}

			for (Transition t : cfg.getTransitions())
			{
				// block change
				if (!t.getSource().getBlockLabel().equals(t.getTarget().getBlockLabel()))
				{
					for (Transition inc : t.getSource().getIncoming())
					{
						if (!blockLabelToPhiInstructions.get(t.getTarget().getBlockLabel()).isEmpty())
						{
							PhiMapping mapping = createPhiMapping(inc,
									blockLabelToPhiInstructions.get(t.getTarget().getBlockLabel()), "%"
											+ inc.getSource().getBlockLabel());
							helperModel.getPhiMappings().add(mapping);
						}
					}
				}

			}
		}
	}

	private PhiMapping createPhiMapping(Transition transition, List<Phi> phis, String blockLabel)
	{
		PhiMapping mapping = GendataFactory.eINSTANCE.createPhiMapping();
		mapping.setTransition(transition);
		mapping.getPhi().addAll(phis);
		mapping.setBlockLabelToUse(blockLabel);
		return mapping;
	}

	
	private void computeTransformationSpecificKeys()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			if (cfg.getStart() != null && !cfg.getStart().getOutgoing().isEmpty())
			{
				for (Transition t : cfg.getTransitions())
				{
					if (t.getInstruction() instanceof CmpXchg)
					{
						if (!helperModel.getTransformationSpecificKeys().contains(Constants.NEEDSCAS))
						{
							helperModel.getTransformationSpecificKeys().add(Constants.NEEDSCAS);
						}
					}
					if (t.getInstruction() instanceof GetElementPtr)
					{
						if (!helperModel.getTransformationSpecificKeys().contains(Constants.NEEDSGETELEMENTPTR))
						{
							helperModel.getTransformationSpecificKeys().add(Constants.NEEDSGETELEMENTPTR);
						}
					}
				}
			}
		}
	}

	private void computeFilteredAddresses(){
		
		for(ControlFlowDiagram cfg: cfgs){
			if(cfg.getStart() != null && !cfg.getStart().getOutgoing().isEmpty()){
				EObject motherObject = cfg.getStart().getOutgoing().get(0).getInstruction().eContainer();
				BasicBlock basicBlock = (BasicBlock) motherObject;
				FunctionBody fb = (FunctionBody)basicBlock.eContainer();
				FunctionDefinition fd = (FunctionDefinition)fb.eContainer();

				for(Transition t: cfg.getTransitions()){
					if(t.getInstruction() instanceof Return){
						Return ret = (Return) t.getInstruction();
						if(ret.getValue() != null){

							//add a dummy mapping for a return value
							Address returnAddress = LlvmFactory.eINSTANCE.createAddress();
							returnAddress.setName("returnvalue");
							AddressMapping returnMapping = createAddressMapping(returnAddress, "returnvalue");
							returnMapping.setGeneratorData(helperModel);
							returnMapping.setType("ref");
							helperModel.getFilteredAddresses(Constants.FUNC_PARAMS+cfg.getName()).add(returnMapping);
						}
					}
				}
				
				//save used vars per function in filteredAddresses
				List<AddressMapping> allVars = helperModel.getFilteredAddresses(Constants.FUNC_ALL+cfg.getName());
				for(String a: usedVarsInFunctions.get(fd)){
					AddressMapping mapping = getMappingForAddress(a, helperModel.getAddressMappings());
					if(mapping != null){
						allVars.add(mapping);
					}
				}
				

				//Remove params from list of vars to declare
				if(fd.getParameter() != null){
					for(FunctionParameter param: fd.getParameter().getParams()){
						usedVarsInFunctions.get(fd).remove(addressLookup.get(param.getValue()));
					}
				}
				
				//save vars to declare per function in filteredAddresses
				List<AddressMapping> declareVars = helperModel.getFilteredAddresses(Constants.FUNC_DECLARE+cfg.getName());
				for(String a: usedVarsInFunctions.get(fd)){
					AddressMapping mapping = getMappingForAddress(a, helperModel.getAddressMappings());
					if(mapping != null){
						declareVars.add(mapping);
					}
				}	
				
			}

		}
		computeGlobalLists();
	}
	
	private void computeGlobalLists(){
		
		EMap<String,EList<AddressMapping>> filteredAddresses = helperModel.getFilteredAddresses();
		
		// compute global list of parameters
		EList<AddressMapping> allParamMappings = new BasicEList<AddressMapping>();
		boolean returnvalueAdded = false;
		
		// compute global list of local variables
		EList<AddressMapping> allLocalVariables = new BasicEList<AddressMapping>();
		
		for(ControlFlowDiagram cfg : cfgs){
			
			String name = cfg.getName();
			EList<AddressMapping> funcParamMapping = helperModel.getFilteredAddresses(Constants.FUNC_PARAMS+name);
			EList<AddressMapping> funcLocalVarsMapping = helperModel.getFilteredAddresses(Constants.FUNC_DECLARE+name);
			
			for(AddressMapping mapping : funcParamMapping){
				if(!allParamMappings.contains(mapping)){
					if(mapping.getName().equals("returnvalue")){
						if(!returnvalueAdded){
							returnvalueAdded = true;
							allParamMappings.add(mapping);
						}
					}else{
						allParamMappings.add(mapping);
					}
				}
			}
			
			for(AddressMapping mapping : funcLocalVarsMapping){
				if(!allLocalVariables.contains(mapping)){
					allLocalVariables.add(mapping);
				}
			}
		}
		filteredAddresses.put(Constants.ALL_PARAMS, allParamMappings);
		filteredAddresses.put(Constants.ALL_DECLARE, allLocalVariables);
	}

	private void computeTransitionLabels() {
		for(ControlFlowDiagram cfg : cfgs){
			int size = 1;
			for(Transition t : cfg.getTransitions()){
				String labelName = generateTransitionLabel(t, size);
				List<TransitionLabel> labels = helperModel.getTransitionLabels();
				TransitionLabel transitionLabel = GendataFactory.eINSTANCE.createTransitionLabel();
				transitionLabel.setName(labelName);
				transitionLabel.setTransition(t);
				labels.add(transitionLabel);
				size++;
			}
		}
	}
	
	private String generateTransitionLabel(Transition transition, int size){
		String sizeString = String.valueOf(size);
		String transitionLabel = cfgToLabelPrefix.get(transition.getDiagram()).toLowerCase()+sizeString;		
		return transitionLabel;
	}

	private void computeLocationLabels(){
		for(ControlFlowDiagram cfg: cfgs){
			List<LocationLabel> labels = helperModel.getLocationLabels();
			//prepare for check if we can use short buffer labels
			List<ControlFlowLocation> conflictingLocs = new ArrayList<ControlFlowLocation>();
			List<String> iteratedBuffers = new ArrayList<String>();
			for(ControlFlowLocation l: cfg.getLocations()){
				String bufferRep = generateShortLabel(l, cfg.getLocations().size());
				if(iteratedBuffers.contains(bufferRep)){
					conflictingLocs.add(l);
				}
				else{
					iteratedBuffers.add(bufferRep);
				}
			}

			for(ControlFlowLocation l: cfg.getLocations()){
				String bufferRepresentation;
				//use long buffer labels if needed as of conflict, short if not needed
				if(conflictingLocs.contains(l)){
					bufferRepresentation = generateLabel(l, cfg.getLocations().size());
				}else{
					bufferRepresentation = generateShortLabel(l, cfg.getLocations().size());
				}
				LocationLabel label = GendataFactory.eINSTANCE.createLocationLabel();
				label.setName(bufferRepresentation);
				label.setControlFlowLocation(l);
				labels.add(label);
			}
		}
	}

	private void computeTransitionConditionMapping()
	{
		EList<ConstraintMapping> constraints = helperModel.getConstraints();
		for (ControlFlowDiagram cfg : cfgs)
		{
			ArrayList<ControlFlowLocation> workedOn = new ArrayList<ControlFlowLocation>();
			ArrayList<ControlFlowLocation> toWorkOn = new ArrayList<ControlFlowLocation>();

			toWorkOn.add(cfg.getStart());

			while (!toWorkOn.isEmpty())
			{
				ControlFlowLocation currentLoc = toWorkOn.remove(0);
				workedOn.add(currentLoc);

				List<Transition> outgoing = currentLoc.getOutgoing();

				if (outgoing.size() > 1)
				{
					GuardedTransition ifTransition = null;
					for (Transition t : outgoing)
					{
						if (t instanceof GuardedTransition)
						{
							// deal with the if case
							GuardedTransition gt = (GuardedTransition) t;
							if (ifTransition == null && !gt.getCondition().contains("else"))
							{
								ifTransition = gt;
								constraints.add(computeConstraintMapping(gt, gt.getCondition()));
							}
						} else
						{
							// flushes and normal transitions that need a
							// condition
							constraints.add(computeConstraintMapping(t, "true"));
						}

					}

					// get the else case
					for (Transition t : outgoing)
					{
						if (t instanceof GuardedTransition && !t.equals(ifTransition) && ifTransition != null)
						{
							GuardedTransition gt = (GuardedTransition) t;
							constraints.add(computeConstraintMapping(gt, "!" + ifTransition.getCondition()));
						}
						// Add rest to work on
						if (!workedOn.contains(t.getTarget()) && !toWorkOn.contains(t.getTarget()))
						{
							toWorkOn.add(t.getTarget());
						}
					}
				}

				// Add rest to work on
				for (Transition t : outgoing)
				{
					if (!workedOn.contains(t.getTarget()) && !toWorkOn.contains(t.getTarget()))
					{
						toWorkOn.add(t.getTarget());
					}
				}
			}
		}
	}

	private ConstraintMapping computeConstraintMapping(Transition t, String condition){
		//manipulate condition
		condition = condition.replaceAll("[\\[\\]]", "");

		if(!condition.equalsIgnoreCase("true")){
			for(AddressMapping addressMapping: helperModel.getAddressMappings()){
				for(String oldName: addressMapping.getOldNames()){
					if(oldName.equals(condition.replaceAll("!",""))){
						if(condition.startsWith("!")){
							condition = "!" + addressMapping.getName();
						}else{
							condition = addressMapping.getName();
						}
					}
				}
			}

		}

		//construct mapping
		ConstraintMapping mapping = GendataFactory.eINSTANCE.createConstraintMapping();
		mapping.setTransition(t);
		mapping.setCondition(condition);
		return mapping;
	}

	private void computeLabelPrefixesPerFunction(){
		char currentChar = 'A';
		for(int i = 0; i< cfgs.size();i++){
			ControlFlowDiagram cfg = cfgs.get(i);
			cfgToLabelPrefix.put(cfg, ""+currentChar);
			currentChar++;
		}
	}

	private String generateShortLabel(ControlFlowLocation loc, int size){
		int sizeString = String.valueOf(size).length();
		String bufferLabel = cfgToLabelPrefix.get(loc.getDiagram()) + String.format("%0"+sizeString+"d", loc.getPc());

		for(AddressValuePair avp: loc.getBuffer().getAddressValuePairs()){
			bufferLabel += valueToString(avp.getAddress().getValue());
		}
		return bufferLabel;
	}

	private String generateLabel(ControlFlowLocation loc, int size){
		int sizeString = String.valueOf(size).length();
		String bufferLabel = cfgToLabelPrefix.get(loc.getDiagram()) + String.format("%0"+sizeString+"d", loc.getPc());

		for(AddressValuePair avp: loc.getBuffer().getAddressValuePairs()){
			bufferLabel += valueToString(avp.getAddress().getValue()) + valueToString(avp.getValue().getValue());
		}

		return bufferLabel;
	}

	private String valueToString(Value value){
		if (value instanceof IntegerConstant) {
			return ""+((IntegerConstant)value).getValue();
		}
		if (value instanceof DecimalConstant) {
			return ((DecimalConstant)value).getValue().toString();
		}

		if (value instanceof AddressUseImpl) {
			return addressLookup.get(((AddressUseImpl) value).getAddress());
		}

		if(value instanceof PrimitiveValue){
			PrimitiveValue val = (PrimitiveValue)value;
			return val.getValue();
		}
		return value.toString();
	}

	private Address extractAddressFromValue(Value v){
		if(v instanceof AddressUse){
			return ((AddressUse) v).getAddress();
		}

		return null;
	}

	/**
	 * Constructs the actual variable mapping
	 * @param localVars
	 * @param program
	 */
	private void computeLocalVariables(LLVM program) throws IllegalArgumentException{

		List<AddressMapping> allVariables = helperModel.getAddressMappings();
		
		//map local variables of cfgs
		for(ControlFlowDiagram cfg : cfgs){
			for(Transition t : cfg.getTransitions()){
				
				Instruction i = t.getInstruction();
				if(i != null){
					addInstructionVariablesToMapping(allVariables, cfg, i);
				}
				
				//map copyVars from writeDefChain
				if(t instanceof WriteDefChainTransition){
					WriteDefChainTransition wdcTransition = (WriteDefChainTransition) t;
					Store store = (Store)wdcTransition.getInstruction();
					if(wdcTransition.getCopyAddress() != null){
						Address copyAddress = wdcTransition.getCopyAddress();
						Address originalAddress = ((AddressUse)store.getTargetAddress().getValue()).getAddress();
						AddressMapping m = addToMapping(allVariables, cfg, copyAddress);
						setType(m, originalAddress);
					}
					if(wdcTransition.getCopyValue() != null){
						Address copyValue = wdcTransition.getCopyValue();
						Address originalValue = ((AddressUse)store.getValue().getValue()).getAddress();
						AddressMapping m = addToMapping(allVariables, cfg, copyValue);
						setType(m, originalValue);
					}
				}
			}
		}
		
		//collect all addresses
		EList<AddressMapping> globals = new BasicEList<AddressMapping>();
		for(AbstractElement ele: program.getElements()){
			if(ele instanceof FunctionDefinition){
				FunctionDefinition fDef = (FunctionDefinition)ele;
				ControlFlowDiagram matchingCfg = getCFGForFunction(fDef);

				//map params
				if(matchingCfg != null && matchingCfg.getStart() != null && !matchingCfg.getStart().getOutgoing().isEmpty()){		
					EObject motherObject = matchingCfg.getStart().getOutgoing().get(0).getInstruction().eContainer();
					BasicBlock basicBlock = (BasicBlock) motherObject;
					FunctionBody fb = (FunctionBody)basicBlock.eContainer();
					FunctionDefinition fd = (FunctionDefinition)fb.eContainer();
					FunctionParameterList params = fd.getParameter();
					
					//make sure we store all of the params as such
					EList<AddressMapping> paramsMapping = new BasicEList<AddressMapping>();
					if(params!= null){
						for(FunctionParameter param: params.getParams()){
							AddressMapping paramMapping = addToMapping(allVariables, matchingCfg, param.getValue());
							setType(paramMapping, param.getType());
							
							//Add to params mapping
							paramsMapping.add(paramMapping);
						}
						
						
					}
					helperModel.getFilteredAddresses(Constants.FUNC_PARAMS+matchingCfg.getName()).addAll(paramsMapping);
				}

				
				
			}else if(ele instanceof GlobalDefinition){
				GlobalDefinition gDef = (GlobalDefinition)ele;
				AddressMapping defAddress = addToMapping(allVariables, null, gDef.getAddress());
				setType(defAddress, gDef.getValue());
				if(defAddress != null){
					globals.add(defAddress);
				}
				
				EObject type = null;
				AddressMapping defValue = null;
				if(gDef.getValue() instanceof Parameter)
				{
					Parameter param = (Parameter)gDef.getValue(); 
					type = param.getType();
					
					Address address = extractAddressFromValue(param.getValue());
					defValue = addToMapping(allVariables, null, address);
				}
				else if (gDef.getValue() instanceof Predefined)
				{
					type  = gDef.getValue();
				}
				else {
					throw new RuntimeException("Unexpected type " + type + " detected for globale definition");
				}
				
				setType(defValue, type);
				if(defValue != null){	
					globals.add(defValue);
				}
			}
			
		}
		helperModel.getFilteredAddresses(Constants.GLOBAL_VARS).addAll(globals);
	}

	private void addInstructionVariablesToMapping(List<AddressMapping> allVariables, ControlFlowDiagram cfg,
			Instruction i) {
		AddressMapping m;
		if(i instanceof ArithmeticOperation){
			ArithmeticOperation op = (ArithmeticOperation)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue1()));
			setType(m,op.getOptype());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue2()));
			setType(m,op.getOptype());

		}else if(i instanceof LogicOperation){
			LogicOperation op = (LogicOperation)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue1()));
			setType(m,op.getOptype());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue2()));
			setType(m,op.getOptype());
			
		}else if(i instanceof Cast){
			Cast op = (Cast)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue()));
			setType(m, op.getFrom());

		}else if(i instanceof GetElementPtr){
			GetElementPtr op = (GetElementPtr)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getAggregate().getValue()));
			setType(m,op.getAggregate().getType());

		}else if(i instanceof Fence){
			//nothing to do here
		}else if(i instanceof CmpXchg){
			CmpXchg op = (CmpXchg)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getAddress().getValue()));
			setType(m, op.getAddress().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getNewValue().getValue()));
			setType(m, op.getNewValue().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());
			
		}else if(i instanceof AtomicRMW){
			AtomicRMW op = (AtomicRMW) i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getAddress().getValue()));
			setType(m, op.getAddress().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getArgument().getValue()));
			setType(m, op.getArgument().getType());

		}else if(i instanceof Load){
			Load op = (Load) i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getAddress().getValue()));
			setType(m, op.getAddress().getType());

		}else if(i instanceof Store){
			Store op = (Store)i;
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getTargetAddress().getValue()));
			setType(m, op.getTargetAddress().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());

		}else if(i instanceof Call){
			Call op = (Call)i;
			addToMapping(allVariables, cfg, extractAddressFromValue(op.getFunction().getValue()));
			m = addToMapping(allVariables, cfg, op.getResult());
			setType(m, op.getFunction().getType());

		}else if(i instanceof Alloc){
			Alloc op = (Alloc)i;
			addToMapping(allVariables, cfg, op.getResult());
			if(op.getNumOfElements()!=null){
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getNumOfElements().getValue()));
			setType(m, op.getNumOfElements().getType());
			}
		}else if(i instanceof Phi){
			Phi op = (Phi)i;
			addToMapping(allVariables, cfg, op.getResult());
			for( PhiCase c : op.getCases()){
				m = addToMapping(allVariables, cfg, extractAddressFromValue(c.getValue()));
				setType(m, op.getType());
			}

		}else if(i instanceof LandingPad){
			LandingPad op = (LandingPad)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getPersonalityvalue()));
			setType(m, op.getPersonalitytype());

		}else if(i instanceof Select){
			Select op = (Select)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getCondition().getValue()));
			setType(m, op.getCondition().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getElseValue().getValue()));
			setType(m, op.getElseValue().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getTrueValue().getValue()));
			setType(m, op.getTrueValue().getType());

		}else if(i instanceof VariableAttributeAccess){
			VariableAttributeAccess op = (VariableAttributeAccess) i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getVaList().getValue()));
			setType(m, op.getVaList().getType());

		}else if(i instanceof ExtractValue){
			ExtractValue op = (ExtractValue)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getAggerate().getValue()));
			setType(m, op.getAggerate().getType());

		}else if(i instanceof InsertValue){
			InsertValue op = (InsertValue)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getAggerate().getValue()));
			setType(m, op.getAggerate().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());
			
		}else if(i instanceof ExtractElement){
			ExtractElement op = (ExtractElement)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getVector().getValue()));
			setType(m, op.getVector().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getIndex().getValue()));
			setType(m, op.getIndex().getType());

		}else if(i instanceof InsertElement){
			InsertElement op = (InsertElement)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getVector().getValue()));
			setType(m, op.getVector().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getIndex().getValue()));
			setType(m, op.getIndex().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());

		}else if(i instanceof ShuffleVector){
			ShuffleVector op = (ShuffleVector)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue1().getValue()));
			setType(m, op.getValue1().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getValue2().getValue()));
			setType(m, op.getValue2().getType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getMask().getValue()));
			setType(m, op.getMask().getType());
		}else if(i instanceof Compare){
			Compare op = (Compare)i;
			addToMapping(allVariables, cfg, op.getResult());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getOperand1()));
			setType(m, op.getOpType());
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getOperand2()));
			setType(m, op.getOpType());
		}else if(i instanceof IndirectBranch){
			//nothing to do here
		}else if(i instanceof Switch){
			//nothing to do here
		}else if(i instanceof Invoke){
			Invoke op = (Invoke)i;
			m = addToMapping(allVariables, cfg, op.getName());
			setType(m, op.getReturnType());
		}else if(i instanceof Resume){
			//nothing to do here
		}else if(i instanceof Unreachable){
			//nothing to do here
		}else if(i instanceof Return){
			Return op = (Return) i;
			if(op.getValue() instanceof Parameter)
			{
				Parameter param = (Parameter)op.getValue();
				m = addToMapping(allVariables, cfg, extractAddressFromValue(param.getValue()));
				setType(m, param.getType());
			}
			else if (op.getValue() instanceof PrimitiveValue){
				m = addToMapping(allVariables, cfg, extractAddressFromValue((PrimitiveValue)op.getValue()));
			}

		}else if(i instanceof Branch){
			Branch op = (Branch)i;
			m = addToMapping(allVariables, cfg, extractAddressFromValue(op.getCondition()));
			setType(m, op.getCondition());
		}	
		
	}

	private AddressMapping addToMapping(List<AddressMapping> mapping, ControlFlowDiagram cfg, Address address){
		if(address == null){
			return null;
		}
		
		AddressMapping correspondingMapping = getMappingForAddress(address, mapping);
		//if corresponding mapping found
		if(correspondingMapping != null){
			//if that address is not yet contained
			if(!doesContainAddress(address, correspondingMapping)){
				correspondingMapping.getAdresses().add(address);
				addressLookup.put(address, correspondingMapping.getName());	
			}
		//no mapping found, create new one
		}else{
			//create new addressmapping
			AddressMapping addressMapping = createAddressMapping(address, GraphUtility.clean(address.getName()));
			setType(addressMapping,address);

			mapping.add(addressMapping);
			addressLookup.put(address, addressMapping.getName());	
			
			correspondingMapping = addressMapping;
		}

		if(cfg != null){
			// add used vars to the list
			FunctionDefinition fun = getFunctionForCfg(cfg);
			if(!address.getName().startsWith("@") && !usedVarsInFunctions.get(fun).contains(addressLookup.get(address))){
				usedVarsInFunctions.get(fun).add(addressLookup.get(address));
			}
		}
		
		return correspondingMapping;
	}
	
	private void setType(AddressMapping addressMapping, TypeUse type) {
		if (addressMapping == null)
			return;
		String t = "";
		if (type.getPointer() != null) {
			t = "ref";
		} else if (type instanceof Predefined && ((Predefined) type).getType().contains("*")) {
			t = "ref";
		} else {
			if (basis == Constants.INT) {
				t = "int";
			} else {
				t = "nat";
			}
		}
		if (addressMapping.getType() == null || !addressMapping.getType().equals("ref"))
			addressMapping.setType(t);
	}
	
	private void setType(AddressMapping addressMapping, EObject type) {
		if (addressMapping == null)
			return;
		if (type instanceof TypeUse) {
			if (addressMapping.getType() == null || !addressMapping.getType().equals("ref"))
				setType(addressMapping, (TypeUse) type);
		} else if (type instanceof Aggregate_Type) {
			addressMapping.setType("ref");
		} else if (type instanceof Parameter) {
			setType(addressMapping, ((Parameter) type).getType());
		}
	}

	private void setType(AddressMapping addressMapping, Address address) {
		if (addressMapping == null)
			return;

		String t = "";

		AddressMapping m = getMappingForAddress(address, helperModel.getAddressMappings());
		if (m != null && m.getType() != null && m.getType().equals("ref")) {
			t = "ref";
		} else if (basis == Constants.INT) {
			t = "int";
		} else {
			t = "nat";
		}

		if (addressMapping.getType() == null || !addressMapping.getType().equals("ref"))
			addressMapping.setType(t);
	}

	/**
	 * Returns the mapping for the given address if there already exists a mapping
	 * that corresponds to the same varname. If no such mapping is yet constructed, it returns null.
	 * @param address
	 * @param mapping
	 * @return
	 */
	private AddressMapping getMappingForAddress(Address address,
			List<AddressMapping> mapping) {
		for(AddressMapping am: mapping){
			for(Address a: am.getAdresses()){
				if(a.getName().equals(address.getName())){
					return am;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Returns the mapping for the given address if there already exists a mapping
	 * that corresponds to the same varname. If no such mapping is yet constructed, it returns null.
	 * @param address
	 * @param mapping
	 * @return
	 */
	private AddressMapping getMappingForAddress(String address,
			List<AddressMapping> mapping) {
		for(AddressMapping am: mapping){
			if(am.getName().equals(address)){
				return am;
			}
		}
		return null;
	}
	
	/**
	 * Returns true if the given mapping does have an entry for the address to search.
	 * @param toSearch
	 * @param mapping
	 * @return
	 */
	private boolean doesContainAddress(Address toSearch, AddressMapping mapping){
		for(Address a: mapping.getAdresses()){
			if(a.equals(toSearch)){
				return true;
			}
		}
		return false;
	}

	private FunctionDefinition getFunctionForCfg(ControlFlowDiagram cfg){
		EObject motherObject = cfg.getStart().getOutgoing().get(0).getInstruction().eContainer();
		BasicBlock basicBlock = (BasicBlock) motherObject;
		FunctionBody fb = (FunctionBody)basicBlock.eContainer();
		FunctionDefinition fd = (FunctionDefinition)fb.eContainer();
		return fd;
	}

	/**
	 * Returns the correct store buffer graph for the given function in the LLVM
	 * @param fd
	 * @return
	 */
	private ControlFlowDiagram getCFGForFunction(FunctionDefinition fd){
		for(ControlFlowDiagram g: cfgs){
			if(g.getName().equalsIgnoreCase(fd.getAddress().getName())){
				return g;
			}
		}

		return null;
	}

	private AddressMapping createAddressMapping(Address address, String name){
		AddressMapping mapping = GendataFactory.eINSTANCE.createAddressMapping();
		mapping.setName(name);
		mapping.getAdresses().add(address);
		mapping.getOldNames().add(address.getName());
		return mapping;
	}
}
