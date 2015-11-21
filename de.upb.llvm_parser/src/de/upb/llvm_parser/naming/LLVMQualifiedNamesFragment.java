package de.upb.llvm_parser.naming;

import java.util.Set;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;
import org.eclipse.xtext.naming.IQualifiedNameConverter;

public class LLVMQualifiedNamesFragment extends DefaultGeneratorFragment {

	
	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		return new BindFactory().addTypeToType(IQualifiedNameConverter.class.getName(),
				LLVMQualifiedNameConverter.class.getName()).getBindings();
	}
	
	
}
