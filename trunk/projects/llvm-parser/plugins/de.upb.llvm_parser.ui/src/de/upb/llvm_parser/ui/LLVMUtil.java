package de.upb.llvm_parser.ui;

import org.eclipse.xtext.parser.IParser;

import de.upb.llvm_parser.ui.internal.LLVMActivator;

public class LLVMUtil {

	public static IParser getLLVMParser()
	{
		return LLVMActivator.getInstance().getInjector(LLVMActivator.DE_UPB_LLVM_PARSER_LLVM).getInstance(IParser.class);
	}

}
