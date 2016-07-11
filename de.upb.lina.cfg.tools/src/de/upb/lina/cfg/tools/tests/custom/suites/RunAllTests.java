package de.upb.lina.cfg.tools.tests.custom.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ RunAllTsoStoreBufferStructureTests.class, RunAllWriteDefChainTests.class })
public class RunAllTests {

}
