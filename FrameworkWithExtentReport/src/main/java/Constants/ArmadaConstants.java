package Constants;

public class ArmadaConstants {

	public static final String baseDir = "F:\\My Framework VV\\Nov2022\\MyFramework1";
	public static final long IMPLICIT_WAIT = 10;
	public static final String username = "standard_user";
	public static final String password = "secret_sauce";
	

	//Sample data for Data driven testing Automation 
	public static final String SUITE1_XL_PATH = System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";
	public static final String SUITE2_XL_PATH = System.getProperty("user.dir")+"\\src\\test\\resources\\data\\Suite2.xlsx";
	public static final String TEST_SUITE_XLS_PATH = System.getProperty("user.dir")+"\\src\\test\\resources\\data\\TestSuite.xlsx";
	public static final String TEST_SUITE_SHEET = "TestSuite";
	public static final String TEST_SUITE_COL = "SuiteName";
	public static final String SUITE_RUNMODE_COL = "Runmode";
	public static final String RUNMODE_YES = "Y";
	public static final String TEST_CASE_SHEET = "TestCase";
	public static final String TEST_CASE_COL = "TCID";
	public static final String TEST_RUNMODE_COL = "Runmode";
	public static final String RUNMODE_NO = "N";
	

}
