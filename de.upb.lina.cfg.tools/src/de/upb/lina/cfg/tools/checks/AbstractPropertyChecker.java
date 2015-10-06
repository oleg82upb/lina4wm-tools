package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public abstract class AbstractPropertyChecker {
	
	protected List<String> errorMessages;
	protected List<String> warningMessages;
	
	protected boolean checkResult;
	protected int level;
	
	protected LLVM ast;
	
	public AbstractPropertyChecker(LLVM ast, PropertyCheckerManager manager){
		this.errorMessages = new ArrayList<String>();
		this.warningMessages = new ArrayList<String>();
		this.checkResult = false;
		
		this.ast = ast;
		
		level = CFGConstants.LEVEL_WARNING;
		if(manager != null){
			manager.registerPropertyChecker(this);
		}
	}
	
	public List<String> getErrorMessages(){
		return errorMessages;
	}
	
	public List<String> getWarningMessages(){
		return warningMessages;
	}
	
	public boolean getCheckResult(){
		return checkResult;
	}
	
	public int getLevel(){
		return level;
	}

	public abstract void check();
}
