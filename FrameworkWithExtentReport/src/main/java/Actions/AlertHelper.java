package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import base.TestBase;

public class AlertHelper extends TestBase {

	// private WebDriver driver;

	public Alert getAlert() {
		test.log(Status.INFO, "Getting the Alert");

		return driver.switchTo().alert();
	}

	public void acceptAlert() {

		test.log(Status.INFO, "Accepting the Alert");
		getAlert().accept();
	}

	public void dismissAlert() {
		test.log(Status.INFO, "Dismiss the Alert");
		getAlert().dismiss();
	}

	public String getAlertText() {
		test.log(Status.INFO, "getAlertText message");
		return getAlert().getText();
	}

}
