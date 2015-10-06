package de.upb.lina.cfg.tools;

public class CFGConstants {

	
	public static final boolean DEBUG = false;
	//memory models
	public static final int SC = 0;
	public static final int TSO = 1;
	public static final int PSO = 2;
	public static final int RMO = 3;
	public static final int ARM = 4;
	public static final int POWER = 5;
	
	//types of write def chain
	public static final int WDC_NONE = -1;
	public static final int WDC_VALUE = 0;
	public static final int WDC_ADDRESS = 1;
	public static final int WDC_BOTH = 2;
	
	public static final String WDC_SUFFIX = "'";
	
	public static int LEVEL_ERROR = 1;
	public static int LEVEL_WARNING = 2;
}
