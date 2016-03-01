package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;

public class PropertyCheckerManager {
	
	public static final int STATUS_OK = 0;
	public static final int STATUS_WARNING_FOUND = 1;
	public static final int STATUS_ERROR_FOUND = 2;
	
	private List<AbstractPropertyChecker> checkerModules;
	
	private List<String> errorMessages;
	
	private List<String> warningMessages;
	
	private boolean foundError;
	private boolean foundWarning;
	
	//this is the semantic we want to perform the checks on
	private int semanticToPerformChecksFor;
	
	public PropertyCheckerManager(int semanticToPerformChecksFor){
		this.semanticToPerformChecksFor = semanticToPerformChecksFor;
		
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
		errorMessages.clear();
		warningMessages.clear();
		foundError = false;
		foundWarning = false;
		
		for(AbstractPropertyChecker propertyChecker: checkerModules){
			if(propertyChecker.shouldPerformChecksForSemantic(semanticToPerformChecksFor)){
				propertyChecker.check();
				if(propertyChecker.getLevel() == CFGConstants.LEVEL_ERROR){
					foundError = foundError || propertyChecker.isPropertyFulfilled();
					this.errorMessages.addAll(propertyChecker.getMessages());
				}else if(propertyChecker.getLevel() == CFGConstants.LEVEL_WARNING){
					foundWarning = foundWarning || propertyChecker.isPropertyFulfilled();
					this.warningMessages.addAll(propertyChecker.getMessages());
				}
			}
		}
	}
	
	/**
	 * Returns the status of the check which describes if warnings
	 * and/ or errors were found.
	 * 
	 * @return {@link PropertyCheckerManager#STATUS_OK}, if no error was found ,
	 * 			{@link PropertyCheckerManager#STATUS_ERROR_FOUND}, if an error was found
	 * 			{@link PropertyCheckerManager#STATUS_WARNING_FOUND}, if a warning was found ,
	 * 			if both an error and a warning were found, the error is rated higher and therefore the
	 * 			error case is returned
	 */
	public int getStatus(){
		if(foundError){
			return PropertyCheckerManager.STATUS_ERROR_FOUND;
		}else if(foundWarning){
			return PropertyCheckerManager.STATUS_WARNING_FOUND;
		}
		else{
			return PropertyCheckerManager.STATUS_OK;
		}
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public List<String> getWarningMessages() {
		return warningMessages;
	}
	
	
}
