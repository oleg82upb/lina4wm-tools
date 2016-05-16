package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class ResourceIOUtil {

	/**
	 * Saves a given EObject as resource to the hard drive.
	 * 
	 * @param pathToOutputFile
	 *            path to the file which should store the object to be saved
	 * @param contentType
	 *            the content type of the resource, see also
	 *            {@link org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#createResource(URI, String)}
	 * @param objectToSave
	 *            the EObject that should be saved in the created resource
	 * @return true, if the saving process was successful, false if an error
	 *         occurred
	 */
	public static boolean saveResourceToDisk(String pathToOutputFile, String contentType, EObject objectToSave) {
		ResourceSetImpl rset = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(pathToOutputFile, true);
		Resource newResource = rset.createResource(uri, contentType);
		rset.getResources().add(newResource);
		newResource.getContents().add(objectToSave);

		try {
			newResource.save(Collections.EMPTY_MAP);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			return true;
		} catch (Exception e) {
			CFGActivator.logError("An error occured while saving " + objectToSave + " to file " + pathToOutputFile, e);
		}

		return false;
	}

	/**
	 * Loads a store buffer graph file from the disk and checks its contents for
	 * valid control flow diagram instances. These ones are aggregated and
	 * returned
	 * 
	 * @param pathToFile
	 *            path to the file to load
	 * @return list of valid cfg instances in the store buffer graph file
	 */
	public static List<ControlFlowDiagram> loadStoreBufferGraphFile(String pathToFile) {
		ensureCFGPackageIsRegistered();
		Resource storeBufferGraphResource = loadResourceFromFile(pathToFile);

		List<EObject> resourceContents = storeBufferGraphResource.getContents();
		List<ControlFlowDiagram> loadedStoreBufferGraphs = new ArrayList<ControlFlowDiagram>();
		for (EObject resourceContent : resourceContents) {
			if (resourceContent instanceof ControlFlowDiagram) {
				loadedStoreBufferGraphs.add((ControlFlowDiagram) resourceContent);
			}
		}
		return loadedStoreBufferGraphs;
	}

	/**
	 * Tries to load the AST file at the given location.
	 * 
	 * @param astLocation
	 *            location of the AST file to load
	 * @return LLVM instance of the ast file, if load was successful, null if
	 *         not
	 */
	public static LLVM loadAst(String astLocation) {
		try {
			ensureLLVMPackageIsRegistered();
			Resource llvmResource = loadResourceFromFile(astLocation);
			return (LLVM) llvmResource.getContents().get(0);
		} catch (Exception e) {
			CFGActivator.logError("Failed to load AST at " + astLocation + ".", e);
		}
		return null;
	}

	/**
	 * Loads a resource from a file.
	 * 
	 * @param pathToFile
	 *            path to the file
	 * @return loaded resource or null if loading failed
	 */
	protected static Resource loadResourceFromFile(String pathToFile) {
		Resource loadedResource = null;
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Path resourcePath = new Path(pathToFile);
			URI uri = URI.createPlatformResourceURI(resourcePath.toOSString(), true);
			loadedResource = resourceSet.getResource(uri, true);
			EcoreUtil.resolveAll(loadedResource);
		} catch (Exception ex) {
			CFGActivator.logError("Failed to load resource at " + pathToFile, ex);
		}
		return loadedResource;
	}

	/**
	 * Tries to create an AST file from a LLVM file.
	 * 
	 * @param pathToLLVMFile
	 *            location of the LLVM file.
	 * @return according AST file, if loading was successful, null if not
	 */
	public static LLVM createAstFromLLVM(String pathToLLVMFile) {
		ensureLLVMPackageIsRegistered();
		ResourceSetImpl xtextResourceSet = new ResourceSetImpl();
		Path llvmFilePath = new Path(pathToLLVMFile);
		URI uriForPathToLLVMFile = URI.createPlatformResourceURI(llvmFilePath.toOSString(), true);
		Resource resource = xtextResourceSet.getResource(uriForPathToLLVMFile, true);

		// checks for unresolved references - make sure to call resolveAll
		// before trying to access the errors!
		EcoreUtil.resolveAll(resource);
		if (!resource.getErrors().isEmpty()) {
			CFGActivator.log(IStatus.ERROR, "Cannot load LLVM file due to unresolved errors.", null);
			return null;
		}

		// checks for general syntax errors
		if (resource instanceof LazyLinkingResource) {
			LazyLinkingResource llr = (LazyLinkingResource) resource;
			IParseResult parseResult = llr.getParseResult();
			if (parseResult.hasSyntaxErrors()) {
				CFGActivator.log(IStatus.ERROR, "Cannot load LLVM file due to syntax errors.", null);
				return null;
			}
		}

		EObject ast = resource.getContents().get(0);
		EcoreUtil.resolveAll(ast);
		if (!(ast instanceof LLVM)) {
			CFGActivator.log(IStatus.ERROR, "Unexpected problem while creating AST file.", null);
			return null;
		}
		return (LLVM) ast;
	}

	/**
	 * Ensures that the LLVM package is registered.
	 */
	public static void ensureLLVMPackageIsRegistered() {
		LlvmPackage.eINSTANCE.getNsURI();
		LlvmPackage.eINSTANCE.eClass();
	}

	/**
	 * Ensures that the CFG package is registered.
	 */
	public static void ensureCFGPackageIsRegistered() {
		ControlflowPackage.eINSTANCE.eClass();
	}
}
