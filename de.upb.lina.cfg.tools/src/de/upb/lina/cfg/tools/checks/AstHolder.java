package de.upb.lina.cfg.tools.checks;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class AstHolder {
	private static LLVM ast;
	
	
	public static LLVM getAst(){
		return ast;
	}
	
	public static void setAst(String astLocation){	
		loadAst(astLocation);
		if(ast == null){
			throw new RuntimeException("Failed to load ast: " + astLocation);
		}
	}
	
	public static LLVM loadAst(String astLocation){
		try {
			LlvmPackage.eINSTANCE.getNsURI();
			ResourceSet resourceSet = new ResourceSetImpl();
			Path astpath = new Path(astLocation);
			URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
			Resource llvmResource = resourceSet.getResource(uri, true);
			ast = (LLVM) llvmResource.getContents().get(0);
			return ast;
		} catch (WrappedException e) {
			CFGActivator.logError("Failed to load ast at " + astLocation + "." , e);
		}
		return null;
	}
}
