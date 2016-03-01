package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;

public class UnsupportedInstructionPropertyChecker extends AbstractPropertyChecker{
	
	private List<Class<?>> unsupportedInstructions;
	
	public UnsupportedInstructionPropertyChecker(LLVM ast) {
		super(ast);
		
		addUnsupportedInstructions();
	}
	
	@Override
	public boolean check() {
		checkForUnsupportedInstructions();
		return isPropetyFulfilled;
	}
	
	private void checkForUnsupportedInstructions(){
		for(AbstractElement elem: ast.getElements()){
			if(elem instanceof FunctionDefinition){
				FunctionDefinition fDef = (FunctionDefinition) elem;
				if(fDef.getBody() != null){
					for(BasicBlock b: fDef.getBody().getBlocks()){
						for(Instruction i: b.getInstructions()){
							String instructionName = getNameIfUnsupported(i);
							if(instructionName != null){
								generateUnsupportedString(instructionName, fDef);
								isPropetyFulfilled = true;
							}
						}
					}
				}
			}
		}
	}
	
	private void generateUnsupportedString(String instructionName, FunctionDefinition functionDefinition){
		String result =  "Instruction of type " + instructionName
				+ " in function " + functionDefinition.getAddress().getName()
				+ " is unsupported.";
		addMessage(result);
	}
	
	/**
	 * Returns the name of the class that is used for implementation of the instruction if unsupported, else null.
	 * @param instruction
	 * @return
	 */
	private String getNameIfUnsupported(Instruction instruction){
		for(Class<?> c: unsupportedInstructions){
			if(c.isAssignableFrom(instruction.getClass())){
				return c.getSimpleName();
			}
		}
		return null;
	}
	
	/**
	 * Additional instructions have to be added in this method
	 */
	private void addUnsupportedInstructions(){
		unsupportedInstructions = new ArrayList<Class<?>>();
		//forbid vector operations
		unsupportedInstructions.add(ExtractValue.class);
		unsupportedInstructions.add(InsertValue.class);
		unsupportedInstructions.add(ExtractElement.class);
		unsupportedInstructions.add(InsertElement.class);
		unsupportedInstructions.add(ShuffleVector.class);
		unsupportedInstructions.add(VariableAttributeAccess.class);
		
		unsupportedInstructions.add(IndirectBranch.class);
		
		//forbid exception handling
		unsupportedInstructions.add(Resume.class);
		unsupportedInstructions.add(LandingPad.class);
	}

	@Override
	protected void setErrorLevel() {
		errorLevel = CFGConstants.LEVEL_WARNING;
		
	}
	
	@Override
	protected void setSemanticsToPerformChecksFor() {
		addSemanticToPerformChecksFor(CFGConstants.SC);
		addSemanticToPerformChecksFor(CFGConstants.TSO);
		addSemanticToPerformChecksFor(CFGConstants.PSO);
	}

}
