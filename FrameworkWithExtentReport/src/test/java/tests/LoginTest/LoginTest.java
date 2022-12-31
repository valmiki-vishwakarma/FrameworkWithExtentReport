package tests.LoginTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.TestBase;
import pages.LoginPage;
import utilities.configReader;

public class LoginTest extends TestBase {

	public LoginPage login;

	@BeforeClass
	public void beforeClass() {
		login = new LoginPage(driver);
	}

	@Test
	public void login() {
		
		test.log(Status.INFO, "Executing login Test");
		login.doLogin(configReader.readValue("username"), configReader.readValue("password"));
	    Assert.fail();
	    
	}

}
