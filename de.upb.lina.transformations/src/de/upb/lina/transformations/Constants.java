package de.upb.lina.transformations;

public abstract class Constants {

	/* Constants for variable list access via filteredAddresses in GeneratorData*/
	/**
	 * Constant used to obtain the list of all global variables via the filteredAddresses association
	 * in the GeneratorData.
	 */
	public static final String GLOBAL_VARS = "globals";
	/**
	 * Constant used to obtain the list of all function parameters for a specific function via the filteredAddresses association
	 * in the GeneratorData. Usage: FUNC_PARAMS+<cfgname> to obtain the list for the function with name <cfgname> 
	 */
	public static final String FUNC_PARAMS = "func-params:";
	/**
	 * Constant used to obtain the list of all local variables of a function via the filteredAddresses association
	 * in the GeneratorData. Usage: FUNC_DECLARE+<cfgname> to obtain the list for the function with name <cfgname> 
	 */
	public static final String FUNC_DECLARE = "func-declare:";
	/**
	 * Constant used to obtain the list of all used variables of a function via the filteredAddresses association
	 * in the GeneratorData. Usage: FUNC_ALL+<cfgname> to obtain the list for the function with name <cfgname> 
	 */
	public static final String FUNC_ALL = "func-all:";
	/**
	 * Constant used to obtain the list of all local variables and all function parameters via the filteredAddresses association
	 * in the GeneratorData.
	 */
	public static final String ALL_DECLARE_PARAMS = "all-declare-params";
	/* Constants used in transformationSpecificKey association in GeneratorData*/
	
	/**
	 * If NEEDSCAS is in the list of transformationSpecificKeys in GeneratorData, the analyzed code does make uses of a 
	 * cas instruction.
	 */
	public static final String NEEDSCAS = "cas";
	/**
	 * If GETELEMENTPTR is in the list of transformationSpecificKeys in GeneratorData, the analyzed code does make uses of a 
	 * getElementPtr instruction.
	 */
	public static final String NEEDSGETELEMENTPTR = "getelementptr";
	
	public final static String PROMELA_FILE_EXTENSION = "pml";
	public final static String KIV_FILE_EXTENSION = "";
	
	/* Memento keys for AllInOneConfigurationPage */
	public final static String ALL_IN_ONE_WIZARD_MEMENTO__KEY = "de.upb.lina.cfg.transformations.wizards.allinone.allinoneconfigurationpage";
	public final static String ALL_IN_ONE_WIZARD_INPUTFILE = "allinone_inputfile";
	public final static String ALL_IN_ONE_WIZARD_OUTPUT_FOLDER = "allinone_outputfolder";
	public final static String ALL_IN_ONE_WIZARD_OUTPUT_FILE = "allinone_outputfile";
	public final static String ALL_IN_ONE_WIZARD_SEMANTICS = "allinone_semantics";
	public final static String ALL_IN_ONE_WIZARD_TRANSFORMATION_TYPE = "allinone_transformationtype";
	public final static String ALL_IN_ONE_WIZARD_KIV_BASIS = "allinone_kivbasis";
	

	/* Memento keys for TransformationWizardPage*/
	public final static String TRANSFORMATION_WIZARD_MEMENTO__KEY = "de.upb.lina.cfg.transformations.transformationwizardpage";
	public final static String TRANSFORMATION_WIZARD_CFGLOC = "cfgloc";
	public final static String TRANSFORMATION_WIZARD_CONTAINER = "container";
	public final static String TRANSFORMATION_WIZARD_NEW_FILE = "newFile";
	public final static String TRANSFORMATION_WIZARD_MODEL_SELECTION = "modelSelection";
	
	/* Constants regarding settings for KIV transformation */
	public static final String KIV_BASIS_NAT = "nat";
	public static final String KIV_BASIS_INT = "int";
	public static final String KIV_BASIS_REF = "ref";
	public static final int NAT_INDEX = 0;
	public static final int INT_INDEX = 1;
	
	/* Constants to determine transformation type*/
	public static final int TRANSFORMATION_TYPE_PROMELA = 0;
	public static final int TRANSFORMATION_TYPE_KIV_LOCAL = 1;
	public static final int TRANSFORMATION_TYPE_KIV_GLOBAL = 2;
	public static final int TRANSFORMATION_TYPE_OPERATIONAL_PROMELA = 3;
	
	/* Generator constants determine which mtl file is used by each transformation*/
	public static final String GENERATOR_KIV_LOCAL = "/de/upb/lina/transformations/kiv/generateKIVspec";
	public static final String GENERATOR_KIV_GLOBAL = "/de/upb/lina/transformations/kiv/generateKIVspecGlobal";
	public static final String GENERATOR_PROMELA = "/de/upb/lina/transformations/promela/GeneratePromelaModel";
	public static final String GENERATOR_OPERATIONAL_PROMELA = "/de/upb/lina/transformations/promela/GenerateOperationalPromelaModel";
}
