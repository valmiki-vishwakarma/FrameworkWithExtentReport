package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Constants.ArmadaConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentManager;
import utilities.configReader;

public class TestBase {

	public static WebDriver driver;
	public static String browser = "chrome";
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeSuite
	public void setUp() {

		if (driver == null) {

			if (configReader.readValue("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (configReader.readValue("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			}

			else if (configReader.readValue("browser").equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();

			} else {
				System.err.println("Invalid browser name is provided");
			}

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ArmadaConstants.IMPLICIT_WAIT));
		driver.get(configReader.readValue("url"));
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {

			driver.close();
			driver.quit();
		}
	}

}
