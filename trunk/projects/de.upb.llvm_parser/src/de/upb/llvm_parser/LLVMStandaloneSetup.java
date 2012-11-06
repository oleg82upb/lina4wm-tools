
package de.upb.llvm_parser;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LLVMStandaloneSetup extends LLVMStandaloneSetupGenerated{

	public static void doSetup() {
		new LLVMStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

