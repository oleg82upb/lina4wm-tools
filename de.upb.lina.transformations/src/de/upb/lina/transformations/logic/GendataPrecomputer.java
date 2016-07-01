package de.upb.lina.transformations.logic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.PhiAssignment;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.Variable;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.MemorySizeMapping;
import de.upb.lina.cfg.tools.stringrepresentation.StringConversionManager;
import de.upb.lina.transformations.Constants;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.Address;
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
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
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
import de.upb.llvm_parser.llvm.NestedCast;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
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
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Unreachable;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;
import de.upb.llvm_parser.llvm.Vector;


public class GendataPrecomputer {

	private List<ControlFlowDiagram> cfgs;
	private String kivBaseType;
	private Map<String, String> oldToNewCfgName;
	private GeneratorData helperModel;
	private TransformationConfiguration config;
	private final static String DUMMY_TYPE = "DUMMY";

	private ArrayList<TypeDefinition> typeDefinitions = new ArrayList<TypeDefinition>();

	private StringConversionManager stringConversionManager;

	public GendataPrecomputer(TransformationConfiguration config)
	{
		this.config = config;
		this.cfgs = config.getStoreBufferGraphs();
		this.kivBaseType = config.getKIVBasis();
		this.oldToNewCfgName = config.getOldToNewCfgName();
		this.stringConversionManager = new StringConversionManager();
	}


	public GeneratorData computeGeneratorData()
	{
		execute();
		return helperModel;
	}


	private void execute()
	{
		helperModel = GendataFactory.eINSTANCE.createGeneratorData();

		// set the program
		FunctionDefinition fd = cfgs.get(0).getFunctionDefinition();
		LLVM program = (LLVM) fd.eContainer();
		helperModel.setProgram(program);

		// set list of cfgs
		helperModel.getCfgs().addAll(cfgs);

		// variables. These must be computed before various of the later steps
		// here.
		computeGlobalVariables();
		computeFunctionParametersVariables();
		computeReturnVariablesIfNecessary();
		computeLocalVariablesAndAttachUsedVariablesToTransition();

		// labels
		setFunctionLabelPrefixes();
		computeLocationLabels();
		if (ETransformationType.KIV_GLOBAL.equals(this.config.getTransformationType()) || ETransformationType.KIV_LOCAL
				.equals(this.config.getTransformationType()))
		{
			computeTransitionLabels();
		}

		// conditions, requires variable being already computed
		computeTransitionConditionMapping();

		// TransformationSpecificKeys
		computeTransformationSpecificKeys();

		// getElementPtrMapping
		computeGetElementPtrMapping();

		// phi mappings
		computePhiAssignments();

		// new CFG names
		replaceCfgNamesWithProvidedNames();
	}

	private void computeTransformationSpecificKeys()
	{
		determineWhetherCasAndGepNesessary();
		
		if (ETransformationType.KIV_GLOBAL.equals(this.config.getTransformationType())
	    		  || ETransformationType.KIV_LOCAL.equals(this.config.getTransformationType()))
		{
			computeKIVSpecificKeys();
		}
	}

	private void determineWhetherCasAndGepNesessary()
	{
		boolean needsCas = false, needsGep = false;
		Iterator<ControlFlowDiagram> c = cfgs.iterator();
		
		while (c.hasNext() && (!needsCas || !needsGep))
		{
			ControlFlowDiagram cfg = c.next();
			Iterator<Transition> i = cfg.getTransitions().iterator();
			
			while (i.hasNext() && (!needsCas || !needsGep))
			{
				Transition t = i.next();
				if(t.getInstruction() instanceof CmpXchg)
				{
					needsCas = true;
				}
				else if (t.getInstruction() instanceof GetElementPtr)
				{
					needsGep = true;
				}
			}
		}
		
		if(needsCas)
		{
			helperModel.getTransformationSpecificKeys().add(Constants.NEEDSCAS);
		}
		
		if(needsGep)
		{
			helperModel.getTransformationSpecificKeys().add(Constants.NEEDSGETELEMENTPTR);
		}
	}

	private void computeKIVSpecificKeys()
	{
		// add basis(int or nat) to helperModel
		helperModel.getTransformationSpecificKeys().add(kivBaseType);

		determineWhetherMultOrDivIsNecessary();

		determineKivFunctionInput();
	}


	/**
	 * Checks all FunctionDefinitions for their input, in order to determine whether KIV
	 * needs a parameter tuple instead of a simple parameter representing one single value. 
	 */
	private void determineKivFunctionInput()
	{
		boolean hasParams = false, refInput = false;
		
		for (ControlFlowDiagram cfg : cfgs)
		{
			Iterator<Variable> i = cfg.getParameterVariables().iterator();
			while (i.hasNext())
			{
				hasParams = true;
				
				Variable v = i.next();
				if (Constants.KIV_BASIS_REF.equals(v.getType()))
				{
					refInput = true;
				}
			}
		}
		
		
		if (hasParams)
		{
			helperModel.getTransformationSpecificKeys().add("INPUT_NEEDED");
		}

		if (refInput)
		{
			helperModel.getTransformationSpecificKeys().add("INPUT_REF");
		}
	}


	/**
	 * Adds key to TransformationSpecificKeys, if multiplication or division is involved in the program.
	 */
	private void determineWhetherMultOrDivIsNecessary()
	{
		// check for mul or div
		String s = null;
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
						s = "DIV";
					} else if (operation.equalsIgnoreCase("mul"))
					{
						s = "MUL";
					}
				}
			}
		}

		if (s != null)
		{
			helperModel.getTransformationSpecificKeys().add(s);
		}
	}


	/**
	 * Each transition that moves from one block to another, has to do some
	 * assignments according to the phi instructions in the target block. 
	 * Must be called after the condition of GuardedTransition have been set
	 * to new values.
	 */
	private void computePhiAssignments()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			// create a mapping of block labels to phi instructions, if instructions is contained in the block
			HashMap<String, ArrayList<Phi>> blockLabelToPhiInstructions = new HashMap<String, ArrayList<Phi>>();
			FunctionDefinition fd = cfg.getFunctionDefinition();
			for (BasicBlock b : fd.getBody().getBlocks())
			{
				blockLabelToPhiInstructions.put(b.getLabel(), new ArrayList<Phi>());

				for (Instruction i : b.getInstructions())
				{
					if (i instanceof Phi)
					{
						if (!blockLabelToPhiInstructions.get(b.getLabel()).contains(i))
						{
							blockLabelToPhiInstructions.get(b.getLabel()).add((Phi) i);
						}
					}
				}
			}

			// assign a phiMapping to each transition that changes the block
			for (Transition t : cfg.getTransitions())
			{
				if (t.getInstruction() instanceof Branch)
				{
					Branch branch = (Branch) t.getInstruction();
					String sourceLabel = ((BasicBlock) branch.eContainer()).getLabel();
					if (t instanceof GuardedTransition)
					{
						GuardedTransition gt = (GuardedTransition) t;

						// modified since gt.conditions are now a side effect
						// ConstraintMapping computation
						// if (gt.getCondition().startsWith("[not"))
						if (gt.getCondition().startsWith("!"))
						{
							String dest = branch.getElseDestination().replace("%", "");
							ArrayList<Phi> phiInstructionsInTargetBlock = blockLabelToPhiInstructions.get(dest);

							if (!phiInstructionsInTargetBlock.isEmpty())
							{
								createPhiAssignmentsForBranchingTransition(t, sourceLabel, phiInstructionsInTargetBlock);
							}

						} else
						{
							String dest = branch.getDestination().replace("%", "");
							ArrayList<Phi> phiInstructionsInTargetBlock = blockLabelToPhiInstructions.get(dest);

							if (!phiInstructionsInTargetBlock.isEmpty())
							{
								createPhiAssignmentsForBranchingTransition(t, sourceLabel, phiInstructionsInTargetBlock);
							}
						}
					} else
					{
						String dest = branch.getDestination().replace("%", "");
						ArrayList<Phi> phiInstructionsInTargetBlock = blockLabelToPhiInstructions.get(dest);

						if (!phiInstructionsInTargetBlock.isEmpty())
						{
							createPhiAssignmentsForBranchingTransition(t, sourceLabel, phiInstructionsInTargetBlock);
						}
					}
				}

				if (t.getInstruction() instanceof IndirectBranch)
				{
					IndirectBranch branch = (IndirectBranch) t.getInstruction();
					String sourceLabel = ((BasicBlock) branch.eContainer()).getLabel();
					if (!branch.getPotTargetLabels().isEmpty())
					{

						for (String dest : branch.getPotTargetLabels())
						{
							String destPureLabel = dest.replace("%", "");
							ArrayList<Phi> phiInstructionsInTargetBlock = blockLabelToPhiInstructions
									.get(destPureLabel);

							if (!phiInstructionsInTargetBlock.isEmpty())
							{
								createPhiAssignmentsForBranchingTransition(t, sourceLabel, phiInstructionsInTargetBlock);
							}
						}
					}
				}
			}
		}
	}

	/**
	 * creates assignments for each phiInstrInTargetBlock and attaches them to the transition
	 * @param t
	 * @param dest
	 * @param phiInstrInTargetBlock
	 */
	protected void createPhiAssignmentsForBranchingTransition(Transition t, String dest,
			ArrayList<Phi> phiInstrInTargetBlock)
	{
		for (Iterator<Phi> i = phiInstrInTargetBlock.iterator(); i.hasNext();)
		{
			Phi phi = i.next();
			PhiAssignment assignment = ControlflowFactory.eINSTANCE.createPhiAssignment();
			Variable v = getOrCreateLocalVariableAndAttachToCfg(phi.getResult(), null, t.getDiagram());
			assignment.setVariable(v);
			
			for (Iterator<PhiCase> cases = phi.getCases().iterator(); cases.hasNext();)
			{
				PhiCase pc = cases.next();
				if (dest.equals(pc.getLabel().replace("%", "")))
				{
					assignment.setValue(pc.getValue());
					fetchOrCreateVariableForValueAndAttachToTransition(t, pc.getValue(), null);
					break;
				}
			}
			
			t.getPhiAssignments().add(assignment);
		}
	}



	


	/**
	 * Replaces the name of the CFGs with their new names
	 */
	private void replaceCfgNamesWithProvidedNames()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			String newName = oldToNewCfgName.get(cfg.getName());
			cfg.setName(newName);
		}
	}
	
	/**
	 * Creates variables for all GlobalDefinitions.
	 */
	private void computeGlobalVariables()
	{
		// collect all addresses
		LLVM program = helperModel.getProgram();
		for (AbstractElement ele : program.getElements())
		{
			if (ele instanceof GlobalDefinition)
			{
				GlobalDefinition gDef = (GlobalDefinition) ele;
				Variable var = getOrCreateVariable(gDef.getAddress(), getVariableTypeAsString(gDef.getValue()));
				this.helperModel.getGlobalVariables().add(var);
			} else if (ele instanceof TypeDefinition)
			{
				// TODO: is this ever used?
				TypeDefinition tDef = (TypeDefinition) ele;
				typeDefinitions.add(tDef);
			}
		}
	}
	
	private void computeFunctionParametersVariables()
	{
		// collect all addresses
		for (ControlFlowDiagram cfg: this.cfgs)
		{
			FunctionDefinition function = cfg.getFunctionDefinition();
			FunctionParameterList params = function.getParameter();

			if (params != null)
			{
				for (FunctionParameter param : params.getParams())
				{
					String type = getVariableTypeAsString(param.getType());
					Variable var = getOrCreateVariable(param.getValue(), type);
					cfg.getParameterVariables().add(var);
				}
			}
		}
	}
	
	private void computeReturnVariablesIfNecessary()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			FunctionDefinition fd = cfg.getFunctionDefinition();
			TypeUse type = fd.getReturnType();
			if(type instanceof Predefined)
			{
				Predefined pt = (Predefined) type;
				if ("void".equals(pt.getType()))
				{
					continue;
				}
			}
			
			//this address is contained nowhere, beware
			Address retAdr = LlvmFactory.eINSTANCE.createAddress();
			retAdr.setName("returnvalue");
			String t = getVariableTypeAsString(type);
			
			Variable var = getOrCreateVariable(retAdr, t);
			cfg.setReturnVariable(var);
		}
	}



	/**
	 * Necessary for KIV transformations only.
	 */
	private void computeTransitionLabels()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			int size = 1;
			for (Transition t : cfg.getTransitions())
			{
				String sizeString = String.valueOf(size);
				String newCfgName = oldToNewCfgName.get(t.getDiagram().getName());
				String labelName = newCfgName + sizeString;
				t.setLabel(labelName);
				size++;
			}
		}
	}


   /**
    * Computes unique labels for each node in the store buffer graph.
    */
	private void computeLocationLabels()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			// prepare for check if we can use short buffer labels
			List<String> generatedLabels = new ArrayList<String>();
			int numberOfNodes = cfg.getLocations().size();
			for (ControlFlowLocation location : cfg.getLocations())
			{
				String labelString = generateLabel(location, numberOfNodes, true);
				if (generatedLabels.contains(labelString))
				{
					// label already used, fall back to long label version
					labelString = generateLabel(location, numberOfNodes, false);

					if (generatedLabels.contains(labelString))
					{
						// append index until it is unique
						int i = 0;
						String newLabelString = labelString;
						do
						{
							newLabelString = labelString + i;
							i++;
						} while (generatedLabels.contains(newLabelString));

						// finally, this label is also unique
						labelString = newLabelString;
					}
					// else: label is unique, we are good

					generatedLabels.add(labelString);

				} else
				{
					generatedLabels.add(labelString);
				}

				location.setLabel(labelString);
			}
		}
	}


	private void computeTransitionConditionMapping()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			for (Transition t : cfg.getTransitions())
			{
				if(t instanceof GuardedTransition)
				{
					GuardedTransition gt = (GuardedTransition) t;
					String transitionGuard = null;
					
					if (gt.getCondition().startsWith("[not "))
					{
						//negative condition case
						transitionGuard = getGuardedTransitionGuard(gt, false);
					} else
					{
						transitionGuard = getGuardedTransitionGuard(gt, true);
					}
					
					//TODO: this should even fit for switch cases, but does not deal with 
					//the default case, which must be a negation of all other cases.
					
					gt.setCondition(transitionGuard);
				}
			}
		}	
	}


	/**
	 * Creates the new string representation of the Guards
	 * @param t
	 * @param positiveCase
	 * @return
	 */
	private String getGuardedTransitionGuard(GuardedTransition t, boolean positiveCase)
	{
		// manipulate condition
		String condition = null;
		Branch br = (Branch) t.getInstruction();
		String actualCondition = this.stringConversionManager.valueToLLVMString(br.getCondition()).trim();
		// make sure we use the new representation of the variable here
		Variable v = getVariableFromAllVariablesByOldName(actualCondition);

		if (v != null)
		{
			if (!positiveCase)
			{
				condition = "!" + v.getNewName();
			} else
			{
				condition = v.getNewName();
			}
		} else
		{
			// condition seems to be a constant value and not a variable
			condition = this.stringConversionManager.valueToString(br.getCondition());
		}

		return condition;
	}


	private void setFunctionLabelPrefixes()
	{
		char currentChar = 'A';
		for (int i = 0; i < cfgs.size(); i++)
		{
			ControlFlowDiagram cfg = cfgs.get(i);
			cfg.setLabelPrefix("" + currentChar);
			currentChar++;
		}
	}


   /**
    * Generates labels for the given location. A label combines program location with the store
    * buffer entries, e.g. line 37 with store buffer entries (x,1),(y,2) of the second method will
    * result in: B37x1y2 or if shortLabel is true, then B37xy.
    * 
    * @param loc the location
    * @param size of the graph, i.e., number of nodes determines the number digits necessary
    * @param shortLabel true for short labels
    * @return the label
    */
	private String generateLabel(ControlFlowLocation loc, int size, boolean shortLabel)
	{
		int sizeString = String.valueOf(size).length();
		String bufferLabel = loc.getDiagram().getLabelPrefix()
				+ String.format("%0" + sizeString + "d", loc.getPc());

		for (AddressValuePair avp : loc.getBuffer().getAddressValuePairs())
		{
			bufferLabel += stringConversionManager.valueToString(avp.getAddress().getValue());

			if (!shortLabel)
			{
				for (int i = 0; i < avp.getValues().size(); i++)
				{
					bufferLabel += stringConversionManager.valueToString(avp.getValues().get(i).getValue());
				}
			}
		}

		return bufferLabel;
	}


   private void computeGetElementPtrMapping() {
      for (ControlFlowDiagram cfg : cfgs) {
         for (Transition t : cfg.getTransitions()) {
            Instruction i = t.getInstruction();
            if (i != null) {
               if (i instanceof GetElementPtr) {
                  GetElementPtr op = (GetElementPtr) i;
                  setSize(op);
               }
            }
         }

         if (cfg.getFunctionDefinition() == null) {
            throw new RuntimeException("You are likely using an outdated AST model. Please parse and derive all models again.");
         }
         TreeIterator<EObject> iter = cfg.getFunctionDefinition().eAllContents();
         while (iter.hasNext()) {
            EObject i = iter.next();
            if (i instanceof NestedGetElementPtr) {
               NestedGetElementPtr op = (NestedGetElementPtr) i;
               setSize(op);
            }
         }
      }
   }


   /**
	 * Gathers all local variables except for function parameters and attaches them to the cfg.
	 */
	private void computeLocalVariablesAndAttachUsedVariablesToTransition()
	{
		// map local variables of cfgs
		for (ControlFlowDiagram cfg : cfgs)
		{
			for (Transition t : cfg.getTransitions())
			{
				// map copyVars from writeDefChain
				if (t instanceof WriteDefChainTransition)
				{
					createVariablesIntroducedByWriteDefChainTransition(t, cfg);
				} else if (t instanceof FlushTransition)
				{
					FlushTransition ft = (FlushTransition) t;
					fetchOrCreateVariableForValueAndAttachToTransition(ft, ft.getFlushedEntry().getAddress().getValue(), null);
					fetchOrCreateVariableForValueAndAttachToTransition(ft, ft.getFlushedEntry().getValues().get(0).getValue(), null);
				} else
				{
					createVariableIntroducedByThisTransition(t, cfg);
				}
			}
		}
	}

	private void createVariablesIntroducedByWriteDefChainTransition(Transition t, ControlFlowDiagram cfg)
	{
		WriteDefChainTransition wdcTransition = (WriteDefChainTransition) t;
		Store store = (Store) wdcTransition.getInstruction();

		if (wdcTransition.getCopyAddress() != null)
		{
			Address copyAddress = wdcTransition.getCopyAddress();
			String type = getVariableTypeAsString(store.getTargetAddress().getType());
			Variable cpyAdrVar = getOrCreateLocalVariableAndAttachToCfg(copyAddress, type, cfg);
			wdcTransition.getUsedVariables().add(cpyAdrVar);

		}

		if (wdcTransition.getCopyValue() != null)
		{
			Address copyValue = wdcTransition.getCopyValue();
			String type = getVariableTypeAsString(store.getValue().getType());
			Variable cpyValVar = getOrCreateLocalVariableAndAttachToCfg(copyValue, type, cfg);
			wdcTransition.getUsedVariables().add(cpyValVar);
		}
		
		Value adr = store.getTargetAddress().getValue();
		fetchOrCreateVariableForValueAndAttachToTransition(wdcTransition, adr, null);
		
		Value val = store.getValue().getValue();
		fetchOrCreateVariableForValueAndAttachToTransition(wdcTransition, val, null);
	}

	protected Variable getOrCreateVariable(Address originalVariable, String type)
	{
		String newName = this.stringConversionManager.clean(originalVariable.getName());
		Variable existingVariable = getVariableFromAllVariablesByNewName(newName);
		
		if(existingVariable != null)
		{
			existingVariable.getOriginalAddresses().add(originalVariable);
			String typeOfExistingVariable = existingVariable.getType();
			
			//determine greatest common type
			if (Constants.KIV_BASIS_REF.equals(typeOfExistingVariable)
					|| Constants.KIV_BASIS_REF.equals(type))
			{
				//variable is treated as a value possibly being null at some point
				//so, we need to set it everywhere to extended REF type
				existingVariable.setType(Constants.KIV_BASIS_REF);
			} else if (DUMMY_TYPE.equals(typeOfExistingVariable) && type != null)
			{
				//Variable must have been created before the defining transition  
				existingVariable.setType(type);
			} 
			
			return existingVariable;
		}
		
		//create a fresh variable
		Variable var = ControlflowFactory.eINSTANCE.createVariable();
		var.getOriginalAddresses().add(originalVariable);
		var.setNewName(newName);
		if (type == null)
		{
			var.setType(DUMMY_TYPE);
		} else
		{
			var.setType(type);
		}
		this.helperModel.getAllVariables().add(var);
		return var;
	}
	
	private Variable getVariableFromAllVariablesByNewName(String name)
	{
		Iterator<Variable> i = this.helperModel.getAllVariables().iterator();
		while(i.hasNext())
		{
			Variable v = i.next();
			if(v.getNewName().equals(name))
			{
				return v;
			}
		}
		return null;
	}
	
	
	private Variable getVariableFromAllVariablesByOldName(String name)
	{
		Iterator<Variable> i = this.helperModel.getAllVariables().iterator();
		while(i.hasNext())
		{
			Variable v = i.next();
			Iterator<Address> ai = v.getOriginalAddresses().iterator();
			while(ai.hasNext())
			{
				Address org = ai.next();
				if(org.getName().equals(name))
				{
					return v;
				}
			}
		}
		return null;
	}
	

	
	/**
	 * Convenience method, creates and attaches variable to the cfg as a local variable. 
	 * @param originalVariable
	 * @param type
	 * @param cfg
	 * @return
	 */
	protected Variable getOrCreateLocalVariableAndAttachToCfg(Address originalVariable, String type, ControlFlowDiagram cfg)
	{
		Variable var = getOrCreateVariable(originalVariable, type);
		cfg.getLocalVariables().add(var);
		return var;
	}
	
	/**
	 * Fetches a variable for the address if there exists one. Otherwise, it is created. However, the type 
	 * of the new variable is a dummy type and is supposed to be set, when the transition defining the 
	 * variable is handled.  The new variable is attached to the transition as being used by the transition.   
	 * @param t
	 * @param v
	 * @param type being null, will result in dummy type 
	 */
	private void fetchOrCreateVariableForValueAndAttachToTransition(Transition t, Value v, String type)
	{
		if(v instanceof AddressUse)
		{
			AddressUse au = (AddressUse) v;
			Address a = au.getAddress();
			Variable var = null;
			if(type != null)
			{
				var = getOrCreateVariable(a, type);
			} else
			{
				var = getOrCreateVariable(a, DUMMY_TYPE);
			}
			t.getUsedVariables().add(var);
		} else if (v instanceof NestedGetElementPtr) 
		{
			NestedGetElementPtr nGEP = (NestedGetElementPtr) v;
			Parameter aggregate = nGEP.getAggregate();
			String agrType = getVariableTypeAsString(aggregate.getType());
			fetchOrCreateVariableForValueAndAttachToTransition(t, aggregate.getValue(), agrType);
			
			Iterator<Parameter> i = nGEP.getIndices().iterator();
			while(i.hasNext())
			{
				Parameter p = i.next();
				String pType = getVariableTypeAsString(p.getType());
				fetchOrCreateVariableForValueAndAttachToTransition(t, p.getValue(), pType);
			}
			
		} else if (v instanceof NestedCast) 
		{
			NestedCast nc = (NestedCast) v;
			fetchOrCreateVariableForValueAndAttachToTransition(t, nc.getValue(), this.kivBaseType);
		}
		
		//else it is likely an actual value and we don't do anything here
	}

	/**
	 * Does not deal with different types of Transition, but instructions only. EarlyRead, Flush, 
	 * WriteDefChains must be handled outside. 
	 * @param i
	 * @param cfg
	 */

	private void createVariableIntroducedByThisTransition(Transition t, ControlFlowDiagram cfg)
	{
		Instruction i = t.getInstruction();
		if(i == null)
		{
			return;
		}
		
		Variable createdVariable = null;
		if (i instanceof ArithmeticOperation)
		{
			ArithmeticOperation op = (ArithmeticOperation) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), this.kivBaseType, cfg);
			
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getValue1(), this.kivBaseType);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getValue2(), this.kivBaseType);
		} else if (i instanceof LogicOperation)
		{
			LogicOperation op = (LogicOperation) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), this.kivBaseType, cfg);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getValue1(), this.kivBaseType);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getValue2(), this.kivBaseType);

		} else if (i instanceof Cast)
		{
			Cast op = (Cast) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), this.kivBaseType, cfg);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getValue(), this.kivBaseType);

		} else if (i instanceof GetElementPtr)
		{
			GetElementPtr op = (GetElementPtr) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), this.kivBaseType, cfg);
			Iterator<Parameter> iter = op.getIndices().iterator();
			while (iter.hasNext())
			{
				Parameter p = iter.next();
				fetchOrCreateVariableForValueAndAttachToTransition(t, p.getValue(), this.kivBaseType);
			}
		} else if (i instanceof Fence)
		{
			// nothing to do here
		} else if (i instanceof CmpXchg)
		{
			CmpXchg op = (CmpXchg) i;
			//TODO: check what type is the results of cmpxchg instructions
			String type = getVariableTypeAsString(op.getNewValue().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getAddress().getValue(), Constants.KIV_BASIS_REF);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getNewValue().getValue(), null);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getValue().getValue(), null);

		} else if (i instanceof AtomicRMW)
		{
			//TODO: check what type is the results of rmw instructions
			AtomicRMW op = (AtomicRMW) i;
			String type = getVariableTypeAsString(op.getArgument().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getAddress().getValue(), Constants.KIV_BASIS_REF);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getArgument().getValue(), null);
		} else if (i instanceof Load)
		{
			Load op = (Load) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), null, cfg);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getAddress().getValue(), null);

		} else if (i instanceof Call)
		{
			Call op = (Call) i;
			if(op.getResult() != null)
			{
				String type = getVariableTypeAsString(op.getFunction().getType());
				createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			}
			
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getFunction().getValue(), null);
			Iterator<Parameter> iter = op.getPList().getParams().iterator();
			while(iter.hasNext())
			{
				Parameter p = iter.next();
				fetchOrCreateVariableForValueAndAttachToTransition(t, p.getValue(), null);
			}
			
		} else if (i instanceof Alloc)
		{
			Alloc op = (Alloc) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), Constants.KIV_BASIS_REF, cfg);
		} else if (i instanceof Phi)
		{
			Phi op = (Phi) i;
			String type = getVariableTypeAsString(op.getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			
			Iterator<PhiCase> iter = op.getCases().iterator();
			while(iter.hasNext())
			{
				PhiCase pc = iter.next();
				fetchOrCreateVariableForValueAndAttachToTransition(t, pc.getValue(), null);
			}

		} else if (i instanceof LandingPad)
		{
//			LandingPad op = (LandingPad) i;
//			String type = getVariableTypeAsString(op.getPersonalitytype());
//			createLocalVariableAndAttachToCfg(op.getResult(), type, cfg);

		} else if (i instanceof Select)
		{
			Select op = (Select) i;
			String type = getVariableTypeAsString(op.getTrueValue().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getCondition().getValue(), this.kivBaseType);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getElseValue().getValue(), this.kivBaseType);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getTrueValue().getValue(), this.kivBaseType);

		} else if (i instanceof VariableAttributeAccess)
		{
			VariableAttributeAccess op = (VariableAttributeAccess) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), Constants.KIV_BASIS_REF, cfg);
			
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getVaList().getValue(), null);

		} else if (i instanceof ExtractValue)
		{
			ExtractValue op = (ExtractValue) i;
			String type = getVariableTypeAsString(op.getAggerate().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			//TODO: check at some point whether we need to attach variables from here

		} else if (i instanceof InsertValue)
		{
			InsertValue op = (InsertValue) i;
			String type = getVariableTypeAsString(op.getAggerate().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			//TODO: check at some point whether we need to attach variables from here

		} else if (i instanceof ExtractElement)
		{
			ExtractElement op = (ExtractElement) i;
			String type = getVariableTypeAsString(op.getVector().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			//TODO: check at some point whether we need to attach variables from here

		} else if (i instanceof InsertElement)
		{
			InsertElement op = (InsertElement) i;
			String type = getVariableTypeAsString(op.getVector().getType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), type, cfg);
			//TODO: check at some point whether we need to attach variables from here

		} else if (i instanceof ShuffleVector)
		{
			ShuffleVector op = (ShuffleVector) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), null, cfg);
			//TODO: check at some point whether we need to attach variables from here
		} else if (i instanceof Compare)
		{
			Compare op = (Compare) i;
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getResult(), this.kivBaseType, cfg);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getOperand1(), null);
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getOperand2(), null);
		} else if (i instanceof IndirectBranch)
		{
			//TODO: check at some point whether we need to attach variables from here
		} else if (i instanceof Switch)
		{
			//TODO: check at some point whether we need to attach variables from here
		} else if (i instanceof Invoke)
		{
			Invoke op = (Invoke) i;
			String type = getVariableTypeAsString(op.getReturnType());
			createdVariable = getOrCreateLocalVariableAndAttachToCfg(op.getName(), type, cfg);
			Iterator<Parameter> iter = op.getPList().getParams().iterator();
			while(iter.hasNext())
			{
				Parameter p = iter.next();
				type = getVariableTypeAsString(p.getType());
				fetchOrCreateVariableForValueAndAttachToTransition(t, p.getValue(), type);
			}
			
		} else if (i instanceof Resume)
		{
			// nothing to do here
		} else if (i instanceof Unreachable)
		{
			// nothing to do here
		} else if (i instanceof Return)
		{
			Return op = (Return) i;
			if(op.getValue() instanceof Value)
			{
				fetchOrCreateVariableForValueAndAttachToTransition(t, (Value) op.getValue(), null);
			}
		} else if (i instanceof Branch)
		{
			Branch op = (Branch) i;
			fetchOrCreateVariableForValueAndAttachToTransition(t, op.getCondition(), null);
		}
		
		if(createdVariable != null)
		{
			t.getUsedVariables().add(createdVariable);
		}
	}
	
	
   
	/**
	 * This method determines whether the value represented by the variable can represent a null value.
	 * In KIV, there are different types: "nat" for positive integer, "int" includes negative values and 
	 * "Ref" being used as a type that can also represent a null value. 
	 * 
	 * @param object
	 * @return
	 */
	private String getVariableTypeAsString(EObject object)
	{
		String t = Constants.KIV_BASIS_REF;
		if (object instanceof TypeUse)
		{
			if (((TypeUse) object).getPointer() != null)
			{
				return Constants.KIV_BASIS_REF;
			} else
			{
				t = kivBaseType;
			}
		}
		else if (object instanceof Parameter)
		{
			t = getVariableTypeAsString(((Parameter) object).getType());
		}
		else if (object instanceof PrimitiveValue)
		{
			PrimitiveValue val = (PrimitiveValue) object;
			if (val.getValue().equals("void") || val.getValue().equals("true") || val.getValue().equals("false"))
			{
				t = kivBaseType;
			}
		}
		else if (object instanceof Address)
		{
			Address a = (Address) object;
			Variable v = getVariableFromAllVariablesByOldName(a.getName());
			if (v != null && v.getType() != null)
			{
				t = Constants.KIV_BASIS_REF;
			} else
			{
				t = kivBaseType;
				throw new RuntimeException("Found a variable without type: " + v.getNewName()); 
			}
		}

		return t;
	}


// THE REST MUST BE REVISED. It mainly deals with space allocation and sizes of types, allocated memory etc.

   private int computeCompleteSize(EObject obj, boolean countAsPointer) {
      if (obj instanceof Aggregate_Type) {
         if (obj instanceof Structure) {
            Structure struct = (Structure) obj;
            int result = 0;
            for (int i = 0; i < struct.getTypes().size(); i++) {
               result += computeCompleteSize(struct.getTypes().get(i), false);
            }
            return result;
         } else if (obj instanceof Array) {
            Array arr = ((Array) obj);
            return arr.getLength() * computeCompleteSize(arr.getType(), true);
         } else if (obj instanceof Vector) {
            Vector vector = (Vector) obj;
            return vector.getLength() * computeCompleteSize(vector.getType(), true);
         }
      } else if (obj instanceof AddressUse) {
         if (!countAsPointer) {
            AddressUse aU = (AddressUse) obj;
            TypeDefinition def = getTypeDefinedForAddress(aU.getAddress());
            if (def != null) {
               Structure struct = def.getStruct();
               int result = 0;
               for (int i = 0; i < struct.getTypes().size(); i++) {
                  result += computeCompleteSize(struct.getTypes().get(i), true);
               }
               return result;
            }
         } else {
            return 1;
         }
      } else if (obj instanceof Predefined) {
         Predefined predefined = (Predefined) obj;
         if (!predefined.getType().contains("*")) {
            return Math.max(1, Integer.parseInt(predefined.getType().replace("i", "")) / 32);
         }
         return 1;
      } else if (obj == null) {
         return 1;
      }

      return -100;
   }


   private int computeSize(EObject obj, int upToPos, boolean countAsPointer) {
      upToPos = upToPos - 1;
      if (upToPos < 0) {
         return 0;
      }

      if (obj instanceof Aggregate_Type) {
         if (obj instanceof Structure) {
            Structure struct = (Structure) obj;
            int result = 0;
            for (int i = 0; i <= upToPos; i++) {
               result += computeCompleteSize(struct.getTypes().get(i), false);
            }
            return result;
         } else if (obj instanceof Array) {
            Array arr = ((Array) obj);
            return (upToPos + 1) * computeCompleteSize(arr.getType(), true);
         } else if (obj instanceof Vector) {
            Vector vector = (Vector) obj;
            return (upToPos + 1) * computeCompleteSize(vector.getType(), true);
         }
      } else if (obj instanceof AddressUse) {
         if (!countAsPointer) {
            AddressUse aU = (AddressUse) obj;
            TypeDefinition def = getTypeDefinedForAddress(aU.getAddress());
            if (def != null) {
               Structure struct = def.getStruct();
               int result = 0;
               for (int i = 0; i <= upToPos; i++) {
                  result += computeCompleteSize(struct.getTypes().get(i), true);
               }
               return result;
            }
         } else {
            return 1;
         }
      } else if (obj instanceof Predefined) {
         Predefined predefined = (Predefined) obj;
         if (!predefined.getType().contains("*")) {
            return Math.max(1, Integer.parseInt(predefined.getType().replace("i", "")) / 32);
         }
         return 1;
      } else if (obj == null) {
         return 1;
      }

      return -100;
   }


   private EObject getPartOfAggregate(EObject obj, int index) {
      if (obj instanceof Aggregate_Type) {
         if (obj instanceof Structure) {
            Structure struct = (Structure) obj;
            return struct.getTypes().get(index);
         } else if (obj instanceof Array) {
            Array arr = ((Array) obj);
            return arr.getType();
         } else if (obj instanceof Vector) {
            Vector vector = (Vector) obj;
            return vector.getType();
         }
      } else if (obj instanceof TypeUse) {
         if (obj instanceof Predefined) {
            return null;
         } else if (obj instanceof AddressUse) {
            AddressUse aU = (AddressUse) obj;
            TypeDefinition def = getTypeDefinedForAddress(aU.getAddress());
            if (def != null) {
               return def.getStruct().getTypes().get(index);
            }
         }
      }
      return null;
   }


   private String getGetElementPtrValue(EObject object, MemorySizeMapping mapping) {
      EList<Parameter> indices;
      EObject aggregateType;

      int result = 0;
      if (object instanceof GetElementPtr) {
         aggregateType = ((GetElementPtr) object).getAggregate().getType();
         indices = ((GetElementPtr) object).getIndices();
      } else {
         aggregateType = ((NestedGetElementPtr) object).getAggregate().getType();
         indices = ((NestedGetElementPtr) object).getIndices();
      }

      try {
         // first index
         int firstIndexValue = Integer.parseInt(stringConversionManager.valueToString(indices.get(0).getValue()));
         if (firstIndexValue != 0) {
            mapping.setWarning(mapping.getWarning() + "Needs attention as first index is not 0!");
         }
      } catch (NumberFormatException ex) {
         // do nothing, not all parameters are constants
      }

      Iterator<Parameter> iter = indices.iterator();
      boolean allConstants = true;
      while (iter.hasNext()) {
         Parameter p = iter.next();
         if (!(p.getValue() instanceof IntegerConstant)) {
            allConstants = false;
            break;
         }
      }

      if (allConstants) {
         EObject partOfAggregate = aggregateType;
         // following indices
         for (int i = 0; i < indices.size(); i++) {

            int indexVal = Integer.parseInt(stringConversionManager.valueToString(indices.get(i).getValue()));

            int intermediateResult = computeSize(partOfAggregate, indexVal, false);
            result += intermediateResult;

            partOfAggregate = getPartOfAggregate(partOfAggregate, indexVal);
         }
         return String.valueOf(result);
      } else
      // dynamic computation
      {
         EObject partOfAggregate = aggregateType;
         String sResult = "";
         // following indices
         for (int i = 0; i < indices.size(); i++) {

            Value index = indices.get(i).getValue();

            if (!"".equals(sResult)) {
               sResult += " + ";
            }

            if (index instanceof IntegerConstant) {
               // constant
               sResult += computeSize(partOfAggregate, ((IntegerConstant) index).getValue(), false);
            } else {
               // must be a variable
               int size = computeCompleteSize(getPartOfAggregate(partOfAggregate, i), false);
               if (size != 1) {
                  // 2*value or 3*value...
                  sResult += size + "*" + stringConversionManager.valueToString(index);
               } else {
                  // 1*value = value
                  sResult += stringConversionManager.valueToString(index);
               }
            }

            partOfAggregate = getPartOfAggregate(partOfAggregate, i);
         }
         return sResult;
      }
   }


   public TypeDefinition getTypeDefinedForAddress(Address address) {
      for (TypeDefinition def : typeDefinitions) {
         if (def.getAddress().equals(address)) {
            return def;
         }
      }
      return null;
   }


   public void setSize(EObject ptr) {
      if ((ptr instanceof GetElementPtr || ptr instanceof NestedGetElementPtr)) {
         if (!mappedInstructionToMemoryMapping(ptr)) {
            helperModel.getMemorySizeMappings().add(createMemorySizeMapping(ptr)); // Create memory
                                                                                   // size mapping
         }
      } else {
         throw new RuntimeException("Trying to map a non getElementPtr object");
      }
   }


   public boolean mappedInstructionToMemoryMapping(EObject i) {
      for (MemorySizeMapping m : helperModel.getMemorySizeMappings()) {
         if (m.getInstruction().equals(i)) {
            return true;
         }
      }
      return false;
   }


   public MemorySizeMapping createMemorySizeMapping(EObject ptr) {
      if ((ptr instanceof GetElementPtr || ptr instanceof NestedGetElementPtr)) {
         MemorySizeMapping mapping = GendataFactory.eINSTANCE.createMemorySizeMapping();
         mapping.setWarning("");
         mapping.setGeneratorData(helperModel);
         mapping.setInstruction(ptr);
         int completeSize = 0;
         if (ptr instanceof GetElementPtr) {
            GetElementPtr ePtr = (GetElementPtr) ptr;
            mapping.setOffset(getGetElementPtrValue(ePtr, mapping));
            completeSize = computeCompleteSize(ePtr.getAggregate().getType(), false);

         } else {
            NestedGetElementPtr nPtr = (NestedGetElementPtr) ptr;
            mapping.setOffset(getGetElementPtrValue(nPtr, mapping));
            completeSize = computeCompleteSize(nPtr.getAggregate().getType(), false);
         }
         mapping.setCompleteTypeSize(completeSize);
         return mapping;
      } else {
         throw new RuntimeException("Trying to map a non getElementPtr object");
      }
   }


   // invoked in generateKIVspec(...).mtl
   public static AddressMapping getCorrespondingAddressMapping(Address inputAddress, GeneratorData genData, String keyForListOfMappings) {
      List<AddressMapping> addressMappings = null;
      if (keyForListOfMappings != null) {
         addressMappings = genData.getFilteredAddresses(keyForListOfMappings);
      } else {
         addressMappings = genData.getAddressMappings();
      }
      for (AddressMapping am : addressMappings) {
         for (Address address : am.getAdresses()) {
            if (inputAddress.equals(address)) {
               return am;
            }
         }
      }
      return null;
   }
}