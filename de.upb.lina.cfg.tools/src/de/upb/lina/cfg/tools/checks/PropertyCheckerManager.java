package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;

public class PropertyCheckerManager {
	private List<AbstractPropertyChecker> checkerModules;
	
	private List<String> errorMessages;
	
	private List<String> warningMessages;
	
	private boolean foundError;
	private boolean foundWarning;
	
	public PropertyCheckerManager(){
		errorMessages = new ArrayList<String>();
		warningMessages = new ArrayList<String>();
		checkerModules = new ArrayList<AbstractPropertyChecker>();
		
		foundError = false;
		foundWarning = false;
	}
	
	public void registerPropertyChecker(AbstractPropertyChecker checker){
		checkerModules.add(checker);
	}
	
	public void performChecks(){
		for(AbstractPropertyChecker checker: checkerModules){
			checker.check();
			if(checker.getLevel() == CFGConstants.LEVEL_ERROR){
				foundError = foundError || checker.getCheckResult();
			}else if(checker.getLevel() == CFGConstants.LEVEL_WARNING){
				foundWarning = foundWarning || checker.getCheckResult();
			}
			
			this.errorMessages.addAll(checker.getErrorMessages());
			this.warningMessages.addAll(checker.getWarningMessages());
		}
	}
	
	public boolean foundWarning(){
		return foundWarning;
	}
	
	public boolean foundError(){
		return foundError;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public List<String> getWarningMessages() {
		return warningMessages;
	}
	
	
}
