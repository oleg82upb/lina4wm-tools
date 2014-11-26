package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;

public class PreComputationChecker {

	private LLVM ast = null;
	private String astLocation;
	private int reordering;
	
	public PreComputationChecker(String astLocation, int reordering) {
		this.astLocation = astLocation;
		this.reordering = reordering;

	}

	private LLVM loadAst() {
		if (ast != null) {
			return ast;
		}

		LlvmPackage.eINSTANCE.getNsURI();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path astpath = new Path(astLocation);
		URI uri = URI.createPlatformResourceURI(astpath.toOSString(), true);
		Resource llvmResource = resourceSet.getResource(uri, true);
		this.ast = (LLVM) llvmResource.getContents().get(0);
		return ast;
	}

	public boolean checkforEarlyReads() throws InterruptedException {

		if (loadAst() == null) {
			throw new InterruptedException(
					"Now specified LLVM Object inside the ast.");
		}

		int a_elem = ast.getElements().size();
		List<Transition> earlyReads = new ArrayList<Transition>();
		List<Transition> earlyReadsInFunction = new ArrayList<Transition>();
		
		for (int i = 0; i < a_elem; i++) {

			if (ast.getElements().get(i) instanceof FunctionDefinitionImpl) {
				FunctionDefinition func = (FunctionDefinition) ast.getElements().get(i);
				if (func.getBody() != null)
					if (reordering == 1) {
						ReorderingUtil reord = new ReorderingUtil();
						earlyReadsInFunction = EarlyReadDetection.collectEarlyReadsinTSOGraph(reord.createReachibilityGraph(func));
						
					} else {
						SCUtil sc = new SCUtil();
						earlyReadsInFunction = EarlyReadDetection.collectEarlyReadsinSCGraph(sc.createCFG(func));
					}

				if (earlyReadsInFunction.isEmpty()) {
					System.out.println("No early reads found in function "+ func.getAddress().getName());
				} else {
					System.out.println("Early reads found in function "+ func.getAddress().getName() + " at transition:");
					for (Transition t : earlyReadsInFunction)
						System.out.print(t.getSource().getPc() + " to "+ t.getTarget().getPc() + "  ");
				}
				System.out.println();
			}
			earlyReads.addAll(earlyReadsInFunction);
		}
		return !earlyReads.isEmpty();
	}

}
