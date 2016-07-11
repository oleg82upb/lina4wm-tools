package de.upb.lina.cfg.tools.tests.custom.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.LoopInLoopMultiplestoresTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.LoopInLoopRedefAddrEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.LoopInLoopRedefAddrTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.LoopInLoopRedefAddrValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.LoopInLoopRedefAddrValTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.TestLoopInLoopRedefValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.TestLoopInLoopRedefValTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.TestLoopInLoopTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.WcdRedefAddrTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.WdcRedefAddrEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.WdcRedefAddrValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.WdcRedefAddrValTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.WdcRedefValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.custom.writedefchains.tso.WdcRedefValTsoSBGTest;


@RunWith(Suite.class)
@SuiteClasses({ LoopInLoopMultiplestoresTsoSBGTest.class, LoopInLoopRedefAddrEarlyReadTsoSBGTest.class, LoopInLoopRedefAddrTsoSBGTest.class,
      LoopInLoopRedefAddrValEarlyReadTsoSBGTest.class, LoopInLoopRedefAddrValTsoSBGTest.class, TestLoopInLoopRedefValEarlyReadTsoSBGTest.class,
      TestLoopInLoopRedefValTsoSBGTest.class, TestLoopInLoopTsoSBGTest.class, WcdRedefAddrTsoSBGTest.class, WdcRedefAddrEarlyReadTsoSBGTest.class,
      WdcRedefAddrValEarlyReadTsoSBGTest.class, WdcRedefAddrValTsoSBGTest.class, WdcRedefValEarlyReadTsoSBGTest.class, WdcRedefValTsoSBGTest.class })
public class RunAllTsoWriteDefChainTests {

}
