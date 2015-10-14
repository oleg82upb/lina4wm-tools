package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.llvm_parser.llvm.LLVM;

public abstract class AbstractPropertyChecker {
	
	private int numberOfMessages = 0;
	
	private List<String> messages;
	
	protected boolean isPropetyFulfilled;
	protected int errorLevel;
	
	protected LLVM ast;
	
	public AbstractPropertyChecker(LLVM ast){
		this.messages = new ArrayList<String>();
		this.isPropetyFulfilled = false;
		
		this.ast = ast;
		
		setErrorLevel();

	}
	
	public List<String> getMessages(){
		return messages;
	}

	
	public boolean isPropertyFulfilled(){
		return isPropetyFulfilled;
	}
	
	public int getLevel(){
		return errorLevel;
	}
	
	protected void addMessage(String m){
		numberOfMessages++;
		m = numberOfMessages +". " + m;
		for(String message : splitMessage(m)){
			messages.add(message);
		}
		
	}
	
	public List<String> splitMessage(String m){
		List<String> resultMessage = new ArrayList<String>();
		if(m.length() > 20){
			String result = "";
			String[] splittedM = m.split(" ");
			int size = 0;
			for(int i = 0; i<splittedM.length; i++){
				if(size > 70){
					resultMessage.add(result);
					result = "";
					size = 0;
				}
				result += " " +splittedM[i];
				size += splittedM[i].length();
			}
			if(!resultMessage.contains(result)){
				resultMessage.add(result);
			}
		}else{
			resultMessage.add(m);
		}
		return resultMessage;
	}

	public abstract boolean check();
	
	protected abstract void setErrorLevel();
}
