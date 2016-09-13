package de.upb.lina.cfg.tools.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.upb.lina.cfg.tools.tests.writedefchains.tso.LoopInLoopMultiplestoresTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.LoopInLoopRedefAddrEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.LoopInLoopRedefAddrTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.LoopInLoopRedefAddrValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.LoopInLoopRedefAddrValTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.TestLoopInLoopRedefValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.TestLoopInLoopRedefValTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.TestLoopInLoopTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.WcdRedefAddrTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.WdcRedefAddrEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.WdcRedefAddrValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.WdcRedefAddrValTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.WdcRedefValEarlyReadTsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.tso.WdcRedefValTsoSBGTest;


@RunWith(Suite.class)
@SuiteClasses({ LoopInLoopMultiplestoresTsoSBGTest.class, LoopInLoopRedefAddrEarlyReadTsoSBGTest.class, LoopInLoopRedefAddrTsoSBGTest.class,
      LoopInLoopRedefAddrValEarlyReadTsoSBGTest.class, LoopInLoopRedefAddrValTsoSBGTest.class, TestLoopInLoopRedefValEarlyReadTsoSBGTest.class,
      TestLoopInLoopRedefValTsoSBGTest.class, TestLoopInLoopTsoSBGTest.class, WcdRedefAddrTsoSBGTest.class, WdcRedefAddrEarlyReadTsoSBGTest.class,
      WdcRedefAddrValEarlyReadTsoSBGTest.class, WdcRedefAddrValTsoSBGTest.class, WdcRedefValEarlyReadTsoSBGTest.class, WdcRedefValTsoSBGTest.class })
public class RunAllTsoWriteDefChainTests {

}
