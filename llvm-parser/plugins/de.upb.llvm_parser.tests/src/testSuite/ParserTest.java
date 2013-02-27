package testSuite;


import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.ClasspathUriUtil;
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
		testFileNoSerializer("stack_S_llvm.s");
		testFile("burnsMutex.s");
		testFile("HWQueue.s");
		testFile("LazyList.s");
		testFile("LCList.s");
		testFile("multiset.s");
		testFile("rdcss.s");
		testFile("HWQueue_O3.s");
		testFile("LazyList_O3.s");
		testFile("LCList_O3.s");
		testFile("multiset_O3.s");
		testFile("rdcss_O3.s");
		testFile("msqueue.s");
		
	}

}
