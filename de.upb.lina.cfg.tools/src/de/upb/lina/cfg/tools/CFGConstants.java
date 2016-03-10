package de.upb.lina.cfg.tools;

public class CFGConstants {

	
	public static final boolean IN_DEBUG_MODE = false;
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
	
	
	public static final String ASSIGN = " := ";
	public static final String STORE = "STORE";
	public static final String LOAD = "LOAD";
	public static final String FLUSH = "FLUSH";
	public static final String ALLOC = "alloc";
	public static final String TRUE = "true";
	public static final String FALSE = "false";
	public static final String RETURN = "RET";
	public static final String BRANCH = "GOTO";
	public static final String FENCE = "FENCE";
	public static final String CALL = "CALL";
	public static final String INVOKE = "INVOKE";
	public static final String TODO = "TODO";
	public static final String WS = " ";
	public static final String PC_PREF = "L";
	public static final String PHI = '\u03A6' + "";
	public static final String VEE = '\u02C5' + "";
	public static final String WEDGE = '\u02C4' + "";
	public static final String GETELEMENENTPTR = "getElementPtr";
	
	//file extensions
	public final static String LLVM_FILE_EXTENSION = "llvm";
	public static final String CFG_FILE_EXTENSION = "cfg";
	public static final String S_FILE_EXTENSION = "s";
	
}
