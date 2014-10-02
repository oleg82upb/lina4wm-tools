package de.upb.lina.cfg.tools;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.llvm_parser.llvm.Instruction;

public class WarningLogger {

	private ArrayList<String> unflushedBuffersAfterReturn = new ArrayList<String>();
	private ArrayList<String> placesInLoopWithoutFence = new ArrayList<String>();
	private GraphUtility util = new GraphUtility();

	public WarningLogger(){

	}

	public void logUnflushedBuffer(String methodName){
		if(!unflushedBuffersAfterReturn.contains(methodName)){
			unflushedBuffersAfterReturn.add(methodName);
		}
	}

	public void logPlaceInLoopWithoutFence(String functionName, ControlFlowLocation locBeforeLatesFence, 
			ControlFlowLocation nextLocAfterWrite, Instruction instruction){
		String error = functionName + " - between " + util.getBufferAsString(locBeforeLatesFence) + " and "+util.getBufferAsString(nextLocAfterWrite)
				+ " caused by " + instruction.toString();
		if(!placesInLoopWithoutFence.contains(error)){
			placesInLoopWithoutFence.add(error);
		}
		
	}

	public boolean displayWarning(){
		String error = "Several problems have been encountered while parsing the llvm-file: \n";
		if(!unflushedBuffersAfterReturn.isEmpty()){
			error += "Locations in following methods can contain non emptpy buffers after a return: \n";
			for(String s: unflushedBuffersAfterReturn){
				error += s+"\n";
			}
			error += "\n";
		}
		if(!placesInLoopWithoutFence.isEmpty()){
			error += "One or more writing loops without fence have been found at: \n";
			for(String s: placesInLoopWithoutFence){
				error += s+"\n";
			}
			error += "\n";
		}
		return createWarning(error);
	}
	
	public boolean createWarning(String text){
		Object[] options = { "Show Graph anyway", "Abort" };
		int result = JOptionPane.showOptionDialog(null, text, "Warning",
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		null, options, options[0]);
		
		if(result == 1){
			return true;
		}
		return false;
	}
}
