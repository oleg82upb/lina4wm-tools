package de.upb.lina.cfg.tools.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.upb.lina.cfg.tools.tests.writedefchains.pso.LoopInLoopMultiplestoresPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.LoopInLoopRedefAddrEarlyReadPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.LoopInLoopRedefAddrPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.LoopInLoopRedefAddrValEarlyReadPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.LoopInLoopRedefAddrValPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.TestLoopInLoopPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.TestLoopInLoopRedefValEarlyReadPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.TestLoopInLoopRedefValPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.WcdRedefAddrPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.WdcRedefAddrEarlyReadPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.WdcRedefAddrValEarlyReadPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.WdcRedefAddrValPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.WdcRedefValEarlyReadPsoSBGTest;
import de.upb.lina.cfg.tools.tests.writedefchains.pso.WdcRedefValPsoSBGTest;


@RunWith(Suite.class)
@SuiteClasses({ LoopInLoopMultiplestoresPsoSBGTest.class, LoopInLoopRedefAddrEarlyReadPsoSBGTest.class,
      LoopInLoopRedefAddrPsoSBGTest.class, LoopInLoopRedefAddrValEarlyReadPsoSBGTest.class, LoopInLoopRedefAddrValPsoSBGTest.class,
      TestLoopInLoopRedefValEarlyReadPsoSBGTest.class, TestLoopInLoopRedefValPsoSBGTest.class, TestLoopInLoopPsoSBGTest.class,
      WcdRedefAddrPsoSBGTest.class, WdcRedefAddrEarlyReadPsoSBGTest.class, WdcRedefAddrValEarlyReadPsoSBGTest.class,
      WdcRedefAddrValPsoSBGTest.class, WdcRedefValEarlyReadPsoSBGTest.class, WdcRedefValPsoSBGTest.class })
public class RunAllPsoWriteDefChainTests {

}
