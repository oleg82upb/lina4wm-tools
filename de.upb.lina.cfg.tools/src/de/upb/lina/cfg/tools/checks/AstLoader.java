package de.upb.lina.cfg.tools.checks;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;

import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class AstLoader {
	
	/**
	 * Tries to load the AST file at the given location. 
	 * 
	 * @param astLocation location of the AST file to load
	 * @return LLVM instance of the ast file, if load was successful, null if not
	 */
	public static LLVM loadAst(String astLocation){
		try {
			LlvmPackage.eINSTANCE.getNsURI();
			ResourceSet resourceSet = new ResourceSetImpl();
			Path astpath = new Path(astLocation);
			URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
			Resource llvmResource = resourceSet.getResource(uri, true);
			return (LLVM) llvmResource.getContents().get(0);
		} catch (Exception e) {
			CFGActivator.logError("Failed to load AST at " + astLocation + "." , e);
		}
		return null;
	}
	
	/**
	 * Tries to create an AST file from a LLVM file. 
	 * 
	 * @param llvmFileLocation location of the LLVM file.
	 * @return according AST file, if loading was successful, null if not
	 */
	public static LLVM createAstFromLLVM(String llvmFileLocation)
	{
		ResourceSetImpl xtextResourceSet = new ResourceSetImpl();
		Path llvmFilePath = new Path(llvmFileLocation);
		URI uri = URI.createPlatformResourceURI(llvmFilePath.toOSString(), true);
		Resource resource = xtextResourceSet.getResource(uri, true);
		if (resource instanceof LazyLinkingResource)
		{
			LazyLinkingResource llr = (LazyLinkingResource) resource;
			Iterator<INode> i = llr.getParseResult().getSyntaxErrors().iterator();
			if (i.hasNext())
			{
				CFGActivator.log(IStatus.ERROR, "Cannot load LLVM file due to syntax errors.", null);
				return null;
			}
		}

		EObject ast = resource.getContents().get(0);
		EcoreUtil.resolveAll(ast);
		if (!(ast instanceof LLVM))
		{
			CFGActivator.log(IStatus.ERROR, "Unexpected problem while creating AST file.", null);
			return null;
		}
		return (LLVM) ast;
	}
}
