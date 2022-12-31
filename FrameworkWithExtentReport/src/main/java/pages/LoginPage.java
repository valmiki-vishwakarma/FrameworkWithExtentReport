package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "input#user-name")
	private WebElement username;

	@FindBy(css = "input#password")
	private WebElement password;

	@FindBy(css = "input#login-button")
	private WebElement loginBtn;

	public void doLogin(String userName, String Password) {
		username.sendKeys(userName);
		password.sendKeys(Password);
		loginBtn.click();
	}

}
