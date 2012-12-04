package testSuite;


import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.upb.llvm_parser.LLVMInjectorProvider;

@RunWith(XtextRunner2.class)
@InjectWith(LLVMInjectorProvider.class)
public class ParserTest extends XtextTest {

	@Test
	public void TestModelFile() {
		testFileNoSerializer("stack/stack_S_llvm.llp");
	}

}
