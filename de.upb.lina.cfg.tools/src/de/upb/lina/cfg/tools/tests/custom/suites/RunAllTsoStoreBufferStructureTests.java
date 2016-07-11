package de.upb.lina.cfg.tools.tests.custom.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.upb.lina.cfg.tools.tests.tso.custom.DepRFW_Loop;
import de.upb.lina.cfg.tools.tests.tso.custom.DepWR_12_bothLoop;
import de.upb.lina.cfg.tools.tests.tso.custom.DepWR_1_1_fencedLoop;
import de.upb.lina.cfg.tools.tests.tso.custom.DepWR_2_1_cmpxchLoop;
import de.upb.lina.cfg.tools.tests.tso.custom.Dependent_Write_Read_1_1_rev;
import de.upb.lina.cfg.tools.tests.tso.custom.IndWR_1_1_fencedLoop;
import de.upb.lina.cfg.tools.tests.tso.custom.IndWR_2_1_cmpxchLoop;
import de.upb.lina.cfg.tools.tests.tso.custom.Independent_Write_Read_1_1_rev;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_DepWR;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_DepWR_1;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_DepWR_12;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_DepWR_1_1;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_DepWR_2;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_DepWR_2_1;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_IndWR;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_IndWR_1;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_IndWR_1_1;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_IndWR_2;
import de.upb.lina.cfg.tools.tests.tso.custom.RU_T_IndWR_2_1;


@RunWith(Suite.class)
@SuiteClasses({ Dependent_Write_Read_1_1_rev.class, DepRFW_Loop.class, DepWR_1_1_fencedLoop.class, DepWR_12_bothLoop.class,
      DepWR_2_1_cmpxchLoop.class, Independent_Write_Read_1_1_rev.class, IndWR_1_1_fencedLoop.class, IndWR_2_1_cmpxchLoop.class,
      RU_T_DepWR_1.class, RU_T_DepWR_1_1.class, RU_T_DepWR_12.class, RU_T_DepWR_2_1.class, RU_T_DepWR_2.class, RU_T_DepWR.class,
      RU_T_IndWR_1_1.class, RU_T_IndWR_1.class, RU_T_IndWR_2_1.class, RU_T_IndWR_2.class, RU_T_IndWR.class })
public class RunAllTsoStoreBufferStructureTests {

}
