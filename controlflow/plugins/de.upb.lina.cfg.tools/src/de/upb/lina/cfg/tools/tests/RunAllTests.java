package de.upb.lina.cfg.tools.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.upb.lina.cfg.tools.tests.loops.DepRFW_Loop;
import de.upb.lina.cfg.tools.tests.loops.DepWR_12_boothLoop;
import de.upb.lina.cfg.tools.tests.loops.DepWR_1_1_fencedLoop;
import de.upb.lina.cfg.tools.tests.loops.DepWR_2_1_cmpxchLoop;
import de.upb.lina.cfg.tools.tests.loops.IndWR_1_1_fencedLoop;
import de.upb.lina.cfg.tools.tests.loops.IndWR_2_1_cmpxchLoop;
import de.upb.lina.cfg.tools.tests.reverseLS.Dependent_Write_Read_1_1_rev;
import de.upb.lina.cfg.tools.tests.reverseLS.Independent_Write_Read_1_1_rev;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_DepWR;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_DepWR_1;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_DepWR_12;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_DepWR_1_1;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_DepWR_2;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_DepWR_2_1;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_IndWR;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_IndWR_1;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_IndWR_1_1;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_IndWR_2;
import de.upb.lina.cfg.tools.tests.write_read.RU_T_IndWR_2_1;

@RunWith(Suite.class)
@SuiteClasses({ RU_T_DepWR.class, RU_T_IndWR.class, RU_T_DepWR_1.class,  RU_T_DepWR_1_1.class, RU_T_DepWR_12.class, RU_T_DepWR_2.class , RU_T_DepWR_2_1.class, RU_T_IndWR_1.class, RU_T_IndWR_1_1.class, RU_T_IndWR_2_1.class, RU_T_IndWR_2.class,
	Dependent_Write_Read_1_1_rev.class, Independent_Write_Read_1_1_rev.class, DepWR_12_boothLoop.class, DepWR_1_1_fencedLoop.class, DepWR_2_1_cmpxchLoop.class, IndWR_2_1_cmpxchLoop.class, IndWR_1_1_fencedLoop.class, DepRFW_Loop.class})
public class RunAllTests {

}
