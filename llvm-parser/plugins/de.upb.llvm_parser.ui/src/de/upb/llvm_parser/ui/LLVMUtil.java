package de.upb.llvm_parser.ui;

import org.eclipse.core.runtime.Status;
import org.eclipse.xtext.parser.IParser;

import de.upb.llvm_parser.ui.internal.LLVMActivator;

public class LLVMUtil {

	public static IParser getLLVMParser()
	{
		return LLVMActivator.getInstance().getInjector(LLVMActivator.DE_UPB_LLVM_PARSER_LLVM).getInstance(IParser.class);
	}

	
	public static void logError(Exception e, String message)
	{
		LLVMActivator.getInstance().getLog().log(new Status(Status.ERROR, LLVMActivator.DE_UPB_LLVM_PARSER_LLVM, message, e));
	}
}
