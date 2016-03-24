package de.upb.llvm_parser.ui;

import org.eclipse.ui.IStartup;

import de.upb.llvm_parser.llvm.LlvmPackage;

public class Startup implements IStartup {


	public void earlyStartup() {
		//just make sure the package is registered on startup
		LlvmPackage.eINSTANCE.getLLVM();
	}

}
