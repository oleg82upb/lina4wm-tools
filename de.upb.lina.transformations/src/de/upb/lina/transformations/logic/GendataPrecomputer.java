package de.upb.lina.transformations.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
import de.upb.lina.cfg.gendata.InputTypeList;
import de.upb.lina.cfg.gendata.LocationLabel;
import de.upb.lina.cfg.gendata.MemorySizeMapping;
import de.upb.lina.cfg.gendata.PhiMapping;
import de.upb.lina.cfg.gendata.TransitionLabel;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.transformations.Activator;
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
	private String kivTransformationBasis;
	private Map<String, String> oldToNewCfgName;
	private GeneratorData helperModel;

	private HashMap<Address, String> addressLookup = new HashMap<Address, String>();
	private HashMap<ControlFlowDiagram, String> cfgToLabelPrefix = new HashMap<ControlFlowDiagram, String>();

	private ArrayList<TypeDefinition> typeDefinitions = new ArrayList<TypeDefinition>();

	private HashMap<FunctionDefinition, List<String>> usedVarsInFunctions = new HashMap<FunctionDefinition, List<String>>();

	public GendataPrecomputer(TransformationConfiguration config) {
		this.cfgs = config.getCfgs();
		this.kivTransformationBasis = config.getKIVBasis();
		this.oldToNewCfgName = config.getOldToNewCfgName();
	}

	public GeneratorData computeGeneratorData()
	{
		precomputeHelperModel();
		return helperModel;
	}

	private void precomputeHelperModel()
	{
		helperModel = GendataFactory.eINSTANCE.createGeneratorData();

		// set the program
		FunctionDefinition fd = getFunctionForCfg(cfgs.get(0));
		LLVM program = (LLVM) fd.eContainer();
		helperModel.setProgram(program);

		// set list of cfgs
		helperModel.getCfgs().addAll(cfgs);

		// local vars
		computeLocalVariables();


		// labels
		computeLabelPrefixesPerFunction();
		computeLocationLabels();
		computeTransitionLabels();

		// conditions
		computeTransitionConditionMapping();

		// TransformationSpecificKeys
		computeTransformationSpecificKeys();

		// filteredAddresses
		computeFilteredAddresses();

		// getElementPtrMapping
		computeGetElementPtrMapping();

		// phi mappings
		computePhiMapping();

		// KIVSpecificKeys
		computeInputTypes();
		computeKIVSpecificKeys();

		// new CFG names
		computeNewCfgNames();
	}

	private void computeKIVSpecificKeys()
	{
		// add basis(int or nat) to helperModel
		helperModel.getTransformationSpecificKeys().add(kivTransformationBasis);

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
			helperModel.getTransformationSpecificKeys().add(s);

		// checks if a function with more than one parameter exists
		boolean hasParams = false;
		for (ControlFlowDiagram cfg : cfgs)
		{
			EList<AddressMapping> mappings = helperModel.getFilteredAddresses(Constants.FUNC_PARAMS + cfg.getName());
			if (mappings.size() > 2)// one element in the list of mappings is
									// always the dummy-returnmapping
			{
				hasParams = true;
			}
			if (mappings.size() == 2
					&& !(mappings.get(0).getName().equals("returnvalue") || mappings.get(1).getName()
							.equals("returnvalue")))
			{
				hasParams = true;
			}
		}
		if (hasParams)
			helperModel.getTransformationSpecificKeys().add("INPUT_NEEDED");
		else if (helperModel.getInputTypes().size() > 1)
		{
			helperModel.getTransformationSpecificKeys().add("INPUT_NEEDED");
		}

		boolean refInput = false;
		for (InputTypeList inputTypeList : helperModel.getInputTypes())
		{
			for (String inputType : inputTypeList.getInputType())
			{
				if (inputType.equals(Constants.KIV_BASIS_REF))
				{
					refInput = true;
				}
			}
		}

		if (refInput)
		{
			helperModel.getTransformationSpecificKeys().add("INPUT_REF");
		}
	}

	private void computePhiMapping()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			//create a mapping of block labels to phi instructions, if instructions is contained in the block
			HashMap<String, ArrayList<Phi>> blockLabelToPhiInstructions = new HashMap<String, ArrayList<Phi>>();
			FunctionDefinition fd = getFunctionForCfg(cfg);
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

			//assign a phiMapping to each transition that changes the block
			for (Transition t : cfg.getTransitions())
			{
				if (t.getInstruction() instanceof Branch)
				{
					Branch branch = (Branch) t.getInstruction();
					if (t instanceof GuardedTransition)
					{
						GuardedTransition gt = (GuardedTransition) t;
						if (gt.getCondition().startsWith("[not"))
						{

							String dest = branch.getElseDestination().replace("%", "");
							ArrayList<Phi> list = blockLabelToPhiInstructions.get(dest);

							if (!list.isEmpty())
							{
								createPhiMapping(t, list, ((BasicBlock) branch.eContainer()).getLabel());
							}
						} else
						{
							String dest = branch.getDestination().replace("%", "");
							ArrayList<Phi> list = blockLabelToPhiInstructions.get(dest);

							if (!list.isEmpty())
							{
								createPhiMapping(t, list, ((BasicBlock) branch.eContainer()).getLabel());
							}
						}
					} else
					{
						String dest = branch.getDestination().replace("%", "");
						ArrayList<Phi> list = blockLabelToPhiInstructions.get(dest);

						if (!list.isEmpty())
						{
							createPhiMapping(t, list, ((BasicBlock) branch.eContainer()).getLabel());
						}
					}
				}

				if (t.getInstruction() instanceof IndirectBranch)
				{
					IndirectBranch branch = (IndirectBranch) t.getInstruction();
					if (!branch.getPotTargetLabels().isEmpty())
					{

						for (String dest : branch.getPotTargetLabels())
						{
							String destPureLabel = dest.replace("%", "");
							ArrayList<Phi> list = blockLabelToPhiInstructions.get(destPureLabel);

							if (!list.isEmpty())
							{
								createPhiMapping(t, list, ((BasicBlock) branch.eContainer()).getLabel());
							}
						}
					}
				}
			}
		}
	}

	private void createPhiMapping(Transition transition, List<Phi> phis, String blockLabel)
	{
		PhiMapping mapping = GendataFactory.eINSTANCE.createPhiMapping();
		mapping.setTransition(transition);
		mapping.getPhi().addAll(phis);
		mapping.setBlockLabelToUse(blockLabel);
		this.helperModel.getPhiMappings().add(mapping);
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

	private void computeNewCfgNames()
	{
		for (Map.Entry<String, String> entry : oldToNewCfgName.entrySet())
		{
			helperModel.getOldToNewCfgName().put(entry.getKey(), entry.getValue());
		}
	}

	private void computeFilteredAddresses()
	{
		// collect all addresses
		EList<AddressMapping> globals = new BasicEList<AddressMapping>();
		LLVM program = helperModel.getProgram();
		for (AbstractElement ele : program.getElements())
		{
			// compute list of function parameter
			if (ele instanceof FunctionDefinition)
			{
				FunctionDefinition fDef = (FunctionDefinition) ele;
				ControlFlowDiagram matchingCfg = getCFGForFunction(fDef);
				if (matchingCfg != null)
				{
					FunctionParameterList params = fDef.getParameter();

					// make sure we store all of the params as such
					EList<AddressMapping> paramsMapping = new BasicEList<AddressMapping>();
					if (params != null)
					{
						for (FunctionParameter param : params.getParams())
						{
							AddressMapping paramMapping = addToMapping(fDef, param.getValue());
							setType(paramMapping, param.getType());

							// Add to params mapping
							paramsMapping.add(paramMapping);
						}

						helperModel.getFilteredAddresses(Constants.FUNC_PARAMS + matchingCfg.getName()).addAll(
								paramsMapping);
					}
				}
				// compute list of global variables
			} else if (ele instanceof GlobalDefinition)
			{
				GlobalDefinition gDef = (GlobalDefinition) ele;
				AddressMapping defAddress = addToMapping(null, gDef.getAddress());
				setType(defAddress, gDef.getValue());
				if (defAddress != null)
				{
					globals.add(defAddress);
				}

				EObject type = null;
				AddressMapping defValue = null;
				if (gDef.getValue() instanceof Parameter)
				{
					Parameter param = (Parameter) gDef.getValue();
					type = param.getType();

					Address address = extractAddressFromValue(param.getValue());
					defValue = addToMapping(null, address);
				} else if (gDef.getValue() instanceof Predefined)
				{
					type = gDef.getValue();
				} else
				{
					throw new RuntimeException("Unexpected type " + type + " detected for global definition");
				}

				setType(defValue, type);
				if (defValue != null)
				{
					globals.add(defValue);
				}
			} else if (ele instanceof TypeDefinition)
			{
				TypeDefinition tDef = (TypeDefinition) ele;
				typeDefinitions.add(tDef);
			}
		}
		helperModel.getFilteredAddresses(Constants.GLOBAL_VARS).addAll(globals);

		HashMap<AddressMapping, Return> returnMappings = new HashMap<AddressMapping, Return>();
		for (ControlFlowDiagram cfg : cfgs)
		{
			FunctionDefinition fd = getFunctionForCfg(cfg);

			for (Transition t : cfg.getTransitions())
			{
				if (t.getInstruction() instanceof Return)
				{
					Return ret = (Return) t.getInstruction();
					if (ret.getValue() != null)
					{
						// make sure we do not generate void
						if (!(ret.getValue() instanceof PrimitiveValue)
								|| (ret.getValue() instanceof PrimitiveValue && !((PrimitiveValue) ret.getValue())
										.getValue().equals("void")))
						{
							// add a dummy mapping for a return value
							Address returnAddress = LlvmFactory.eINSTANCE.createAddress();
							returnAddress.setName("returnvalue");
							AddressMapping returnMapping = createAddressMapping(returnAddress, "returnvalue");
							setType(returnMapping, ret.getValue());
							returnMappings.put(returnMapping, ret);
							helperModel.getFilteredAddresses(Constants.FUNC_PARAMS + cfg.getName()).add(returnMapping);
						}
					}
				}
			}

			// save used vars per function in filteredAddresses
			List<AddressMapping> allVars = helperModel.getFilteredAddresses(Constants.FUNC_ALL + cfg.getName());
			for (String a : usedVarsInFunctions.get(fd))
			{
				AddressMapping mapping = getMappingForAddress(a);
				if (mapping != null)
				{
					allVars.add(mapping);
				}
			}

			// Remove params from list of vars to declare
			if (fd.getParameter() != null)
			{
				for (FunctionParameter param : fd.getParameter().getParams())
				{
					usedVarsInFunctions.get(fd).remove(addressLookup.get(param.getValue()));
				}
			}

			// save vars to declare per function in filteredAddresses
			List<AddressMapping> declareVars = helperModel.getFilteredAddresses(Constants.FUNC_DECLARE + cfg.getName());
			for (String a : usedVarsInFunctions.get(fd))
			{
				AddressMapping mapping = getMappingForAddress(a);
				if (mapping != null)
				{
					declareVars.add(mapping);
				}
			}
		}
		
		setTypeOfReturnMappings(returnMappings);
		
		// compute global list of parameters
		EList<AddressMapping> allParamMappings = new BasicEList<AddressMapping>();
		boolean returnvalueAdded = false;

		// compute global list of local variables
		EList<AddressMapping> allLocalVariables = new BasicEList<AddressMapping>();

		for (ControlFlowDiagram cfg : cfgs)
		{
			String name = cfg.getName();
			EList<AddressMapping> funcParamMapping = helperModel.getFilteredAddresses(Constants.FUNC_PARAMS + name);
			EList<AddressMapping> funcLocalVarsMapping = helperModel
					.getFilteredAddresses(Constants.FUNC_DECLARE + name);

			for (AddressMapping mapping : funcParamMapping)
			{
				if (!allParamMappings.contains(mapping))
				{
					if (mapping.getName().equals("returnvalue"))
					{
						if (!returnvalueAdded)
						{
							returnvalueAdded = true;
							allParamMappings.add(mapping);
						}
					} else
					{
						allParamMappings.add(mapping);
					}
				}
			}

			for (AddressMapping mapping : funcLocalVarsMapping)
			{
				if (!allLocalVariables.contains(mapping))
				{
					allLocalVariables.add(mapping);
				}
			}
		}

		// compute global list of local variables and parameter
		EList<AddressMapping> allLocalsAndParams = new BasicEList<AddressMapping>();
		allLocalsAndParams.addAll(allLocalVariables);
		for (AddressMapping am : allParamMappings)
		{
			if (!allLocalsAndParams.contains(am))
			{
				allLocalsAndParams.add(am);
			}
		}
		helperModel.getFilteredAddresses().put(Constants.ALL_DECLARE_PARAMS, allLocalsAndParams);
	}
	
	private void setTypeOfReturnMappings(Map<AddressMapping, Return> returnMappings)
	{
		// set Type of all returnMapings to the same value
		boolean refExists = false;
		for (AddressMapping mapping : returnMappings.keySet())
		{
			if (mapping.getType().equals(Constants.KIV_BASIS_REF))
			{
				refExists = true;
			} else
			{
				Return ret = returnMappings.get(mapping);
				if (ret.getValue() instanceof Parameter)
				{
					Parameter p = (Parameter) ret.getValue();
					if (p.getValue() instanceof AddressUse)
					{
						AddressUse au = (AddressUse) p.getValue();
						AddressMapping am = getMappingForAddress(au.getAddress());
						if (am.getType().equals(Constants.KIV_BASIS_REF))
						{
							refExists = true;
						}
					}
				}
			}
		}
		if (refExists)
		{
			for (AddressMapping mapping : returnMappings.keySet())
			{
				mapping.setType(Constants.KIV_BASIS_REF);
				Return ret = returnMappings.get(mapping);
				if (ret.getValue() instanceof Parameter)
				{
					Parameter p = (Parameter) ret.getValue();
					if (p.getValue() instanceof AddressUse)
					{
						AddressUse au = (AddressUse) p.getValue();
						AddressMapping am = getMappingForAddress(au.getAddress());
						am.setType(Constants.KIV_BASIS_REF);
					}
				}
			}
		} else
		{
			for (AddressMapping mapping : returnMappings.keySet())
			{
				mapping.setType(kivTransformationBasis);
			}
		}
	}

	private void computeInputTypes()
	{
		EList<InputTypeList> input = helperModel.getInputTypes();

		for (ControlFlowDiagram cfg : cfgs)
		{
			List<String> functionInputTypes = new ArrayList<>();
			EList<AddressMapping> funcParamMappings = helperModel.getFilteredAddresses(Constants.FUNC_PARAMS
					+ cfg.getName());
			for (AddressMapping functionParameterMapping : funcParamMappings)
			{
				if (!functionParameterMapping.getName().equals("returnvalue"))
				{
					functionInputTypes.add(functionParameterMapping.getType());
				}
			}

			boolean duplicate = false;
			for (InputTypeList list : input)
			{
				if (list.getInputType().size() == functionInputTypes.size())
				{
					List<String> copyFuncInput = new ArrayList<String>(functionInputTypes);

					for (String s : list.getInputType())
					{
						copyFuncInput.remove(s);
					}
					if (copyFuncInput.isEmpty())
					{
						duplicate = true;
						break;
					}
				}
			}
			if (!duplicate && !functionInputTypes.isEmpty())
			{
				InputTypeList inputTypeList = GendataFactory.eINSTANCE.createInputTypeList();
				inputTypeList.getInputType().addAll(functionInputTypes);
				input.add(inputTypeList);
			}
		}
	}

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
				List<TransitionLabel> labels = helperModel.getTransitionLabels();
				TransitionLabel transitionLabel = GendataFactory.eINSTANCE.createTransitionLabel();
				transitionLabel.setName(labelName);
				transitionLabel.setTransition(t);
				labels.add(transitionLabel);
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
					//else: label is unique, we are good
					
					generatedLabels.add(labelString);
					
				} else
				{
					generatedLabels.add(labelString);
				}

				LocationLabel label = GendataFactory.eINSTANCE.createLocationLabel();
				label.setName(labelString);
				label.setControlFlowLocation(location);
				helperModel.getLocationLabels().add(label);
			}
		}
	}

	private void computeTransitionConditionMapping()
	{
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
								createConstraintMapping(gt, gt.getCondition());
							}
						} else
						{
							// flushes and normal transitions that need a
							// condition
							createConstraintMapping(t, "true");
						}

					}

					// get the else case
					for (Transition t : outgoing)
					{
						if (t instanceof GuardedTransition && !t.equals(ifTransition) && ifTransition != null)
						{
							GuardedTransition gt = (GuardedTransition) t;
							createConstraintMapping(gt, "!" + ifTransition.getCondition());
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

	private void createConstraintMapping(Transition t, String condition)
	{
		// manipulate condition
		condition = condition.replaceAll("[\\[\\]]", "");

		if (!condition.equalsIgnoreCase("true"))
		{
			for (AddressMapping addressMapping : helperModel.getAddressMappings())
			{
				for (String oldName : addressMapping.getOldNames())
				{
					if (oldName.trim().equals(condition.replaceAll("!", "").trim()))
					{
						if (condition.startsWith("!"))
						{
							condition = "!" + addressMapping.getName();
						} else
						{
							condition = addressMapping.getName();
						}
					}
				}
			}
		}

		// construct mapping
		ConstraintMapping mapping = GendataFactory.eINSTANCE.createConstraintMapping();
		mapping.setTransition(t);
		mapping.setCondition(condition);
		helperModel.getConstraints().add(mapping);
	}

	private void computeLabelPrefixesPerFunction()
	{
		char currentChar = 'A';
		for (int i = 0; i < cfgs.size(); i++)
		{
			ControlFlowDiagram cfg = cfgs.get(i);
			cfgToLabelPrefix.put(cfg, "" + currentChar);
			currentChar++;
		}
	}

	/**
	 * Generates labels for the given location. A label combines program location with 
	 * the store buffer entries, e.g. line 37 with store buffer entries (x,1),(y,2) of the second method will result in:
	 * B37x1y2 or if shortLabel is true, then B37xy.   
	 * 
	 * @param loc the location 
	 * @param size of the graph, i.e., number of nodes determines the number digits necessary
	 * @param shortLabel true for short labels
	 * @return the label
	 */
	private String generateLabel(ControlFlowLocation loc, int size, boolean shortLabel)
	{
		int sizeString = String.valueOf(size).length();
		String bufferLabel = cfgToLabelPrefix.get(loc.getDiagram())
				+ String.format("%0" + sizeString + "d", loc.getPc());

		for (AddressValuePair avp : loc.getBuffer().getAddressValuePairs())
		{
			bufferLabel += GraphUtility.valueToString(avp.getAddress().getValue());

			if (!shortLabel)
			{
				for (int i = 0; i < avp.getValues().size(); i++)
				{
					bufferLabel += GraphUtility.valueToString(avp.getValues().get(i).getValue());
				}
			}
		}

		return bufferLabel;
	}

	private Address extractAddressFromValue(Value v)
	{
		if (v instanceof AddressUse)
		{
			return ((AddressUse) v).getAddress();
		}

		return null;
	}

	private void computeGetElementPtrMapping()
	{
		for (ControlFlowDiagram cfg : cfgs)
		{
			for (Transition t : cfg.getTransitions())
			{
				Instruction i = t.getInstruction();
				if (i != null)
				{
					if (i instanceof GetElementPtr)
					{
						GetElementPtr op = (GetElementPtr) i;
						setSize(op);
					} 
				}
			}
			
			if(cfg.getFunctionDefinition() == null)
			{
				throw new RuntimeException("You are likely using an outdated AST model. Please parse and derive all models again.");
			}
			TreeIterator<EObject> iter = cfg.getFunctionDefinition().eAllContents();
			while(iter.hasNext())
			{
				EObject i = iter.next();
				if (i instanceof NestedGetElementPtr)
				{
					NestedGetElementPtr op = (NestedGetElementPtr) i;
					setSize(op);
				}
			}
		}
	}

	/**
	 * Constructs the actual variable mapping
	 */
	private void computeLocalVariables()
	{
		// map local variables of cfgs
		for (ControlFlowDiagram cfg : cfgs)
		{
			FunctionDefinition function = getFunctionForCfg(cfg);
			usedVarsInFunctions.put(function, new ArrayList<String>());
			for (Transition t : cfg.getTransitions())
			{

				Instruction i = t.getInstruction();
				if (i != null)
				{
					addInstructionVariablesToMapping(function, i);
				}

				// map copyVars from writeDefChain
				if (t instanceof WriteDefChainTransition)
				{
					WriteDefChainTransition wdcTransition = (WriteDefChainTransition) t;
					Store store = (Store) wdcTransition.getInstruction();
					if (wdcTransition.getCopyAddress() != null)
					{
						Address copyAddress = wdcTransition.getCopyAddress();
						Address originalAddress = ((AddressUse) store.getTargetAddress().getValue()).getAddress();
						AddressMapping m = addToMapping(function, copyAddress);
						setType(m, originalAddress);
					}
					if (wdcTransition.getCopyValue() != null)
					{
						Address copyValue = wdcTransition.getCopyValue();
						Address originalValue = ((AddressUse) store.getValue().getValue()).getAddress();
						AddressMapping m = addToMapping(function, copyValue);
						setType(m, originalValue);
					}
				}
			}
		}
	}

	private void addInstructionVariablesToMapping(FunctionDefinition function, Instruction i)
	{
		AddressMapping m;
		if (i instanceof ArithmeticOperation)
		{
			ArithmeticOperation op = (ArithmeticOperation) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getValue1()));
			setType(m, op.getOptype());
			m = addToMapping(function, extractAddressFromValue(op.getValue2()));
			setType(m, op.getOptype());

		} else if (i instanceof LogicOperation)
		{
			LogicOperation op = (LogicOperation) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getValue1()));
			setType(m, op.getOptype());
			m = addToMapping(function, extractAddressFromValue(op.getValue2()));
			setType(m, op.getOptype());

		} else if (i instanceof Cast)
		{
			Cast op = (Cast) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getValue()));
			setType(m, op.getFrom());

		} else if (i instanceof GetElementPtr)
		{
			GetElementPtr op = (GetElementPtr) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getAggregate().getValue()));
			setType(m, op.getAggregate().getType());
		} else if (i instanceof Fence)
		{
			// nothing to do here
		} else if (i instanceof CmpXchg)
		{
			CmpXchg op = (CmpXchg) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getAddress().getValue()));
			setType(m, op.getAddress().getType());
			m = addToMapping(function, extractAddressFromValue(op.getNewValue().getValue()));
			setType(m, op.getNewValue().getType());
			m = addToMapping(function, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());

		} else if (i instanceof AtomicRMW)
		{
			AtomicRMW op = (AtomicRMW) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getAddress().getValue()));
			setType(m, op.getAddress().getType());
			m = addToMapping(function, extractAddressFromValue(op.getArgument().getValue()));
			setType(m, op.getArgument().getType());

		} else if (i instanceof Load)
		{
			Load op = (Load) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getAddress().getValue()));
			setType(m, op.getAddress().getType());

		} else if (i instanceof Store)
		{
			Store op = (Store) i;
			m = addToMapping(function, extractAddressFromValue(op.getTargetAddress().getValue()));
			setType(m, op.getTargetAddress().getType());
			m = addToMapping(function, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());

		} else if (i instanceof Call)
		{
			Call op = (Call) i;
			addToMapping(function, extractAddressFromValue(op.getFunction().getValue()));
			m = addToMapping(function, op.getResult());
			setType(m, op.getFunction().getType());

		} else if (i instanceof Alloc)
		{
			Alloc op = (Alloc) i;
			addToMapping(function, op.getResult());
			if (op.getNumOfElements() != null)
			{
				m = addToMapping(function, extractAddressFromValue(op.getNumOfElements().getValue()));
				setType(m, op.getNumOfElements().getType());
			}
		} else if (i instanceof Phi)
		{
			Phi op = (Phi) i;
			addToMapping(function, op.getResult());
			for (PhiCase c : op.getCases())
			{
				m = addToMapping(function, extractAddressFromValue(c.getValue()));
				setType(m, op.getType());
			}

		} else if (i instanceof LandingPad)
		{
			LandingPad op = (LandingPad) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getPersonalityvalue()));
			setType(m, op.getPersonalitytype());

		} else if (i instanceof Select)
		{
			Select op = (Select) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getCondition().getValue()));
			setType(m, op.getCondition().getType());
			m = addToMapping(function, extractAddressFromValue(op.getElseValue().getValue()));
			setType(m, op.getElseValue().getType());
			m = addToMapping(function, extractAddressFromValue(op.getTrueValue().getValue()));
			setType(m, op.getTrueValue().getType());

		} else if (i instanceof VariableAttributeAccess)
		{
			VariableAttributeAccess op = (VariableAttributeAccess) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getVaList().getValue()));
			setType(m, op.getVaList().getType());

		} else if (i instanceof ExtractValue)
		{
			ExtractValue op = (ExtractValue) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getAggerate().getValue()));
			setType(m, op.getAggerate().getType());

		} else if (i instanceof InsertValue)
		{
			InsertValue op = (InsertValue) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getAggerate().getValue()));
			setType(m, op.getAggerate().getType());
			m = addToMapping(function, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());

		} else if (i instanceof ExtractElement)
		{
			ExtractElement op = (ExtractElement) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getVector().getValue()));
			setType(m, op.getVector().getType());
			m = addToMapping(function, extractAddressFromValue(op.getIndex().getValue()));
			setType(m, op.getIndex().getType());

		} else if (i instanceof InsertElement)
		{
			InsertElement op = (InsertElement) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getVector().getValue()));
			setType(m, op.getVector().getType());
			m = addToMapping(function, extractAddressFromValue(op.getIndex().getValue()));
			setType(m, op.getIndex().getType());
			m = addToMapping(function, extractAddressFromValue(op.getValue().getValue()));
			setType(m, op.getValue().getType());

		} else if (i instanceof ShuffleVector)
		{
			ShuffleVector op = (ShuffleVector) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getValue1().getValue()));
			setType(m, op.getValue1().getType());
			m = addToMapping(function, extractAddressFromValue(op.getValue2().getValue()));
			setType(m, op.getValue2().getType());
			m = addToMapping(function, extractAddressFromValue(op.getMask().getValue()));
			setType(m, op.getMask().getType());
		} else if (i instanceof Compare)
		{
			Compare op = (Compare) i;
			addToMapping(function, op.getResult());
			m = addToMapping(function, extractAddressFromValue(op.getOperand1()));
			setType(m, op.getOpType());
			m = addToMapping(function, extractAddressFromValue(op.getOperand2()));
			setType(m, op.getOpType());
		} else if (i instanceof IndirectBranch)
		{
			// nothing to do here
		} else if (i instanceof Switch)
		{
			// nothing to do here
		} else if (i instanceof Invoke)
		{
			Invoke op = (Invoke) i;
			m = addToMapping(function, op.getName());
			setType(m, op.getReturnType());
		} else if (i instanceof Resume)
		{
			// nothing to do here
		} else if (i instanceof Unreachable)
		{
			// nothing to do here
		} else if (i instanceof Return)
		{
			Return op = (Return) i;
			if (op.getValue() instanceof Parameter)
			{
				Parameter param = (Parameter) op.getValue();
				m = addToMapping(function, extractAddressFromValue(param.getValue()));
				setType(m, param.getType());
			} else if (op.getValue() instanceof PrimitiveValue)
			{
				m = addToMapping(function, extractAddressFromValue((PrimitiveValue) op.getValue()));
			}

		} else if (i instanceof Branch)
		{
			Branch op = (Branch) i;
			m = addToMapping(function, extractAddressFromValue(op.getCondition()));
			setType(m, op.getCondition());
		}

	}

	private AddressMapping addToMapping(FunctionDefinition function, Address address)
	{
		if (address == null)
		{
			return null;
		}

		AddressMapping correspondingMapping = getMappingForAddress(address);

		// if corresponding mapping found
		if (correspondingMapping != null)
		{
			// if that address is not yet contained
			if (!doesContainAddress(address, correspondingMapping))
			{
				correspondingMapping.getAdresses().add(address);
				addressLookup.put(address, correspondingMapping.getName());
			}

			// no mapping found, create new one
		} else
		{
			// create new addressmapping
			AddressMapping addressMapping = createAddressMapping(address, GraphUtility.clean(address.getName()));
			setType(addressMapping, address);
			
			addressLookup.put(address, addressMapping.getName());

			correspondingMapping = addressMapping;
		}

		if (function != null)
		{
			// add used vars to the list
			if (!address.getName().startsWith("@")
					&& !usedVarsInFunctions.get(function).contains(addressLookup.get(address)))
			{
				usedVarsInFunctions.get(function).add(addressLookup.get(address));
			}
		}
		return correspondingMapping;
	}

	private void setType(AddressMapping addressMapping, EObject object)
	{

		if (addressMapping == null)
			return;

		String t = Constants.KIV_BASIS_REF;
		if (object instanceof TypeUse)
		{
			if (((TypeUse) object).getPointer() != null)
			{
				t = Constants.KIV_BASIS_REF;
			} else
			{
				t = kivTransformationBasis;
			}
		}

		else if (object instanceof Parameter)
		{
			setType(addressMapping, ((Parameter) object).getType());
			return;
		}

		else if (object instanceof PrimitiveValue)
		{
			PrimitiveValue val = (PrimitiveValue) object;
			if (val.getValue().equals("void") || val.getValue().equals("true") || val.getValue().equals("false"))
			{
				t = kivTransformationBasis;
			}
		}

		else if (object instanceof Address)
		{
			AddressMapping m = getMappingForAddress((Address) object);
			if (m != null && m.getType() != null && m.getType().equals(Constants.KIV_BASIS_REF))
			{
				t = Constants.KIV_BASIS_REF;
			} else
			{
				t = kivTransformationBasis;
			}
		}

		if (addressMapping.getType() == null || !addressMapping.getType().equals(Constants.KIV_BASIS_REF))
			addressMapping.setType(t);
	}

	/**
	 * Returns the mapping for the given address if there already exists a
	 * mapping that corresponds to the same varname. If no such mapping is yet
	 * constructed, it returns null.
	 * 
	 * @param address
	 * @param mapping
	 * @return
	 */
	private AddressMapping getMappingForAddress(Address address)
	{
		for (AddressMapping am : helperModel.getAddressMappings())
		{
			for (Address a : am.getAdresses())
			{
				if (a.getName().equals(address.getName()))
				{
					return am;
				}
			}
		}
		return null;
	}

	/**
	 * Returns the mapping for the given address if there already exists a
	 * mapping that corresponds to the same varname. If no such mapping is yet
	 * constructed, it returns null.
	 * 
	 * @param address
	 * @return
	 */
	private AddressMapping getMappingForAddress(String address)
	{
		for (AddressMapping am : helperModel.getAddressMappings())
		{
			if (am.getName().equals(address))
			{
				return am;
			}
		}
		return null;
	}

	/**
	 * Returns true if the given mapping does have an entry for the address to
	 * search.
	 * 
	 * @param toSearch
	 * @param mapping
	 * @return
	 */
	private boolean doesContainAddress(Address toSearch, AddressMapping mapping)
	{
		for (Address a : mapping.getAdresses())
		{
			if (a.equals(toSearch))
			{
				return true;
			}
		}
		return false;
	}

	private FunctionDefinition getFunctionForCfg(ControlFlowDiagram cfg)
	{
		try
		{
			if (cfg.getStart() != null && !cfg.getStart().getOutgoing().isEmpty()
					&& cfg.getStart().getOutgoing().get(0).getInstruction() != null)
			{
				EObject motherObject = cfg.getStart().getOutgoing().get(0).getInstruction().eContainer();
				BasicBlock basicBlock = (BasicBlock) motherObject;
				FunctionBody fb = (FunctionBody) basicBlock.eContainer();
				FunctionDefinition fd = (FunctionDefinition) fb.eContainer();
				return fd;
			}
		} catch (ClassCastException ex)
		{
			Activator.logError("Could not link LLVM program to this transformation.", ex);
		}
		return null;
	}

	/**
	 * Returns the correct store buffer graph for the given function in the LLVM
	 * 
	 * @param fd
	 * @return
	 */
	private ControlFlowDiagram getCFGForFunction(FunctionDefinition fd)
	{
		for (ControlFlowDiagram g : cfgs)
		{
			if (g.getName().equalsIgnoreCase(fd.getAddress().getName()))
			{
				return g;
			}
		}
		return null;
	}

	private AddressMapping createAddressMapping(Address address, String name)
	{
		AddressMapping mapping = GendataFactory.eINSTANCE.createAddressMapping();
		mapping.setName(name);
		mapping.getAdresses().add(address);
		mapping.getOldNames().add(address.getName());
		mapping.setGeneratorData(helperModel);
		helperModel.getAddressMappings().add(mapping);
		return mapping;
	}

	private int computeCompleteSize(EObject obj, boolean countAsPointer)
	{
		if (obj instanceof Aggregate_Type)
		{
			if (obj instanceof Structure)
			{
				Structure struct = (Structure) obj;
				int result = 0;
				for (int i = 0; i < struct.getTypes().size(); i++)
				{
					result += computeCompleteSize(struct.getTypes().get(i), false);
				}
				return result;
			} else if (obj instanceof Array)
			{
				Array arr = ((Array) obj);
				return arr.getLength() * computeCompleteSize(arr.getType(), true);
			} else if (obj instanceof Vector)
			{
				Vector vector = (Vector) obj;
				return vector.getLength() * computeCompleteSize(vector.getType(), true);
			}
		} else if (obj instanceof AddressUse)
		{
			if (!countAsPointer)
			{
				AddressUse aU = (AddressUse) obj;
				TypeDefinition def = getTypeDefinedForAddress(aU.getAddress());
				if (def != null)
				{
					Structure struct = def.getStruct();
					int result = 0;
					for (int i = 0; i < struct.getTypes().size(); i++)
					{
						result += computeCompleteSize(struct.getTypes().get(i), true);
					}
					return result;
				}
			} else
			{
				return 1;
			}
		} else if (obj instanceof Predefined)
		{
			Predefined predefined = (Predefined) obj;
			if (!predefined.getType().contains("*"))
			{
				return Math.max(1, Integer.parseInt(predefined.getType().replace("i", "")) / 32);
			}
			return 1;
		} else if (obj == null)
		{
			return 1;
		}

		return -100;
	}

	private int computeSize(EObject obj, int upToPos, boolean countAsPointer)
	{
		upToPos = upToPos - 1;
		if (upToPos < 0)
		{
			return 0;
		}

		if (obj instanceof Aggregate_Type)
		{
			if (obj instanceof Structure)
			{
				Structure struct = (Structure) obj;
				int result = 0;
				for (int i = 0; i <= upToPos; i++)
				{
					result += computeCompleteSize(struct.getTypes().get(i), false);
				}
				return result;
			} else if (obj instanceof Array)
			{
				Array arr = ((Array) obj);
				return (upToPos + 1) * computeCompleteSize(arr.getType(), true);
			} else if (obj instanceof Vector)
			{
				Vector vector = (Vector) obj;
				return (upToPos + 1) * computeCompleteSize(vector.getType(), true);
			}
		} else if (obj instanceof AddressUse)
		{
			if (!countAsPointer)
			{
				AddressUse aU = (AddressUse) obj;
				TypeDefinition def = getTypeDefinedForAddress(aU.getAddress());
				if (def != null)
				{
					Structure struct = def.getStruct();
					int result = 0;
					for (int i = 0; i <= upToPos; i++)
					{
						result += computeCompleteSize(struct.getTypes().get(i), true);
					}
					return result;
				}
			} else
			{
				return 1;
			}
		} else if (obj instanceof Predefined)
		{
			Predefined predefined = (Predefined) obj;
			if (!predefined.getType().contains("*"))
			{
				return Math.max(1, Integer.parseInt(predefined.getType().replace("i", "")) / 32);
			}
			return 1;
		} else if (obj == null)
		{
			return 1;
		}

		return -100;
	}

	private EObject getPartOfAggregate(EObject obj, int index)
	{
		if (obj instanceof Aggregate_Type)
		{
			if (obj instanceof Structure)
			{
				Structure struct = (Structure) obj;
				return struct.getTypes().get(index);
			} else if (obj instanceof Array)
			{
				Array arr = ((Array) obj);
				return arr.getType();
			} else if (obj instanceof Vector)
			{
				Vector vector = (Vector) obj;
				return vector.getType();
			}
		} else if (obj instanceof TypeUse)
		{
			if (obj instanceof Predefined)
			{
				return null;
			} else if (obj instanceof AddressUse)
			{
				AddressUse aU = (AddressUse) obj;
				TypeDefinition def = getTypeDefinedForAddress(aU.getAddress());
				if (def != null)
				{
					return def.getStruct().getTypes().get(index);
				}
			}
		}
		return null;
	}

	private String getGetElementPtrValue(EObject object, MemorySizeMapping mapping)
	{
		EList<Parameter> indices;
		EObject aggregateType;

		int result = 0;
		if (object instanceof GetElementPtr)
		{
			aggregateType = ((GetElementPtr) object).getAggregate().getType();
			indices = ((GetElementPtr) object).getIndices();
		} else
		{
			aggregateType = ((NestedGetElementPtr) object).getAggregate().getType();
			indices = ((NestedGetElementPtr) object).getIndices();
		}

		try
		{
			// first index
			int firstIndexValue = Integer.parseInt(GraphUtility.valueToString(indices.get(0).getValue()));
			if (firstIndexValue != 0)
			{
				mapping.setWarning(mapping.getWarning() + "Needs attention as first index is not 0!");
			}
		} catch (NumberFormatException ex)
		{
			// do nothing, not all parameters are constants
		}

		Iterator<Parameter> iter = indices.iterator();
		boolean allConstants = true;
		while (iter.hasNext())
		{
			Parameter p = iter.next();
			if (!(p.getValue() instanceof IntegerConstant))
			{
				allConstants = false;
				break;
			}
		}

		if (allConstants)
		{
			EObject partOfAggregate = aggregateType;
			// following indices
			for (int i = 0; i < indices.size(); i++)
			{

				int indexVal = Integer.parseInt(GraphUtility.valueToString(indices.get(i).getValue()));

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
			for (int i = 0; i < indices.size(); i++)
			{

				Value index = indices.get(i).getValue();

				if (!"".equals(sResult))
				{
					sResult += " + ";
				}

				if (index instanceof IntegerConstant)
				{
					// constant
					sResult += computeSize(partOfAggregate, ((IntegerConstant) index).getValue(), false);
				} else
				{
					// must be a variable
					int size = computeCompleteSize(getPartOfAggregate(partOfAggregate, i), false);
					if (size != 1)
					{
						// 2*value or 3*value...
						sResult += size + "*" + GraphUtility.valueToString(index);  
					} else
					{
						//1*value = value
						sResult += GraphUtility.valueToString(index); 
					}
				}
				
				partOfAggregate = getPartOfAggregate(partOfAggregate, i);
			}
			return sResult;
		}
	}

	public TypeDefinition getTypeDefinedForAddress(Address address)
	{
		for (TypeDefinition def : typeDefinitions)
		{
			if (def.getAddress().equals(address))
			{
				return def;
			}
		}
		return null;
	}

	public void setSize(EObject ptr)
	{
		if((ptr instanceof GetElementPtr || ptr instanceof NestedGetElementPtr)){
		if (!mappedInstructionToMemoryMapping(ptr))
		{
			helperModel.getMemorySizeMappings().add(createMemorySizeMapping(ptr)); // Create memory size mapping
		}
		}else{
			throw new RuntimeException("Trying to map a non getElementPtr object");
		}
	}

	public boolean mappedInstructionToMemoryMapping(EObject i)
	{
		for (MemorySizeMapping m : helperModel.getMemorySizeMappings())
		{
			if (m.getInstruction().equals(i))
			{
				return true;
			}
		}
		return false;
	}

	public MemorySizeMapping createMemorySizeMapping(EObject ptr)
	{
		if((ptr instanceof GetElementPtr || ptr instanceof NestedGetElementPtr)){
		MemorySizeMapping mapping = GendataFactory.eINSTANCE.createMemorySizeMapping();
		mapping.setWarning("");
		mapping.setGeneratorData(helperModel);
		mapping.setInstruction(ptr);
			int completeSize = 0;
			if(ptr instanceof GetElementPtr){
				GetElementPtr ePtr = (GetElementPtr)ptr;
				mapping.setOffset(getGetElementPtrValue(ePtr, mapping));
				completeSize = computeCompleteSize(ePtr.getAggregate().getType(), false);
				
			}else{
				ptr = (NestedGetElementPtr)ptr;
				NestedGetElementPtr nPtr = (NestedGetElementPtr)ptr;
				mapping.setOffset(getGetElementPtrValue(nPtr, mapping));
				completeSize = computeCompleteSize(nPtr.getAggregate().getType(), false);
			}
		mapping.setCompleteTypeSize(completeSize);
		return mapping;
		}else{
			throw new RuntimeException("Trying to map a non getElementPtr object");
		}
	}
	
	//invoked in generateKIVspec(...).mtl
	public static AddressMapping getCorrespondingAddressMapping(Address inputAddress, GeneratorData genData, String keyForListOfMappings){
		List<AddressMapping> addressMappings = null;
		if(keyForListOfMappings != null){
			addressMappings = genData.getFilteredAddresses(keyForListOfMappings);
		}else{
			addressMappings = genData.getAddressMappings();
		}
		for(AddressMapping am : addressMappings){
			for(Address address : am.getAdresses()){
				if(inputAddress.equals(address)){
					return am;
				}
			}
		}
		return null;
	}
}