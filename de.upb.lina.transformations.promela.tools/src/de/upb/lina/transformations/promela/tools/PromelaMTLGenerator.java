package de.upb.lina.transformations.promela.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.FunctionDefinition;

public class PromelaMTLGenerator extends AMTLGenerator {

	private static final String TRUELABEL = ":: true -> ";
	private static final String GOTO = "goto ";
	private static final String WS = " ";
	private static final String LB = "\n";
	private static final String SKIP = "skip;";

	private String finalResult = "";


	//	private HashMap <>
	private HashMap<Address, String> mapping = new HashMap<Address, String>();

	public PromelaMTLGenerator(List<ControlFlowDiagram> cfgs) {
		super(cfgs);
		
	}


	

	/**
	 * Returns the correct store buffer graph for the given function in the LLVM
	 * @param fd
	 * @return
	 */
	public ControlFlowDiagram getCFGForFunction(FunctionDefinition fd){
		for(ControlFlowDiagram g: cfgs){
			if(g.getName().equalsIgnoreCase(fd.getAddress().getName())){
				return g;
			}
		}

		return null;
	}


	public AddressMapping createAddressMapping(List<Address> addresses, String name){
		AddressMapping mapping = GendataFactory.eINSTANCE.createAddressMapping();
		mapping.setName(name);
		mapping.getAdresses().addAll(addresses);
		return mapping;
	}

	public AddressMapping createAddressMapping(Address address, String name){
		AddressMapping mapping = GendataFactory.eINSTANCE.createAddressMapping();
		mapping.setName(name);
		mapping.getAdresses().add(address);
		return mapping;
	}


	public String transformMultipleTransitions(List<Transition> outs){
		String result = "";
		boolean hasIf = false;
		if(outs.size() > 1){
			result = "if ";
			hasIf = true;
		}


		int numberOfIfCases = 0;
		for(int i = 0; i< outs.size(); i++){
			Transition t = outs.get(i);
			if(t.eClass().equals(ControlflowPackage.eINSTANCE.getFlushTransition())){
				if(hasIf){
					result += TRUELABEL; 
					numberOfIfCases++;
				}
				result += genAvpWrite(t.getSource().getBuffer().getAddressValuePairs().get(0)) + WS + GOTO + getBufferAsString(t.getTarget().getBuffer(), t.getTarget().getPc()) + ";" + LB;

			}else if(t.eClass().equals(ControlflowPackage.eINSTANCE.getGuardedTransition())){
				GuardedTransition gt = (GuardedTransition)t;
				String condition = gt.getCondition();

				if(condition.trim().replace(" ","").equals("else")){
					condition = "!" + clean(getCondition(outs));
				}

				if(numberOfIfCases > 0){
					result += "\t";
				}

				result += ":: " + condition + " -> " + GOTO + getBufferAsString(t.getTarget().getBuffer(), t.getTarget().getPc()) + ";" + LB;
				if(hasIf){
					numberOfIfCases++;
				}
			}else if(t.eClass().equals(ControlflowPackage.eINSTANCE.getTransition())){
				if(hasIf){
					if(numberOfIfCases > 0){
						result += "\t";
					}
					result +=  TRUELABEL;
					numberOfIfCases++;
				}

				result += getInstructionTransformation(t) + LB;
			}
		}

		if(outs.size() > 1){
			result += "fi;" + LB;
		}

		return result;

	}

	private String getInstructionTransformation(Transition t) {
		return PromelaLabelingUtil.getNewTransitionLabel(t);
	}


	private String getCondition(List<Transition> outs) {
		for(Transition t: outs){
			if(t instanceof GuardedTransition){
				GuardedTransition gt = (GuardedTransition)t;
				if(!gt.getCondition().trim().replace(" ", "").equals("else")){
					return gt.getCondition().trim().replace(" ", "");
				}
			}
		}
		return "ERROR";
	}

	public String cleanFunctionName(String string){
		return string.replaceAll("@_", "");
	}


	public void produceTransformation(){
		for(ControlFlowDiagram cfg: cfgs){
			ArrayList<ControlFlowLocation> workedOn = new ArrayList<ControlFlowLocation>();
			ArrayList<ControlFlowLocation> toWorkOn = new ArrayList<ControlFlowLocation>();

			toWorkOn.add(cfg.getStart());
			String result = "inline " + cleanFunctionName(clean(cfg.getName())) + "(){ " + LB;

			while(!toWorkOn.isEmpty()){
				String line = "";
				ControlFlowLocation currentLoc = toWorkOn.remove(0);
				workedOn.add(currentLoc);
				//label
				line +=  getBufferAsString(currentLoc.getBuffer(), currentLoc.getPc()) + ": ";

				List<Transition> outgoing = currentLoc.getOutgoing();

				String transformResult = transformMultipleTransitions(outgoing);

				//not end node
				if(transformResult.length()>0){
					line  += transformResult;

					for(Transition t: outgoing){
						if(!workedOn.contains(t.getTarget()) && !toWorkOn.contains(t.getTarget())){
							toWorkOn.add(t.getTarget());
						}
					}
				}else{
					line += SKIP;
				}
				result += line;
			}
			result += LB + "}" + LB;


			finalResult += result + LB;
		}
	}


	public String genAvpWrite(AddressValuePair avp){
		return "memory[" + produceStringFromValue(avp.getAddress().getValue()) + "] = " + produceStringFromValue(avp.getValue().getValue()) + ";";
	}


	public String getResult(){
		return finalResult;
	}




}
