package pages.yourCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInformationPage {

	private WebDriver driver;

	public CheckOutInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "input#first-name")
	private WebElement firstName;

	@FindBy(css = "input#last-name")
	private WebElement lastName;

	@FindBy(css = "#postal-code")
	private WebElement postCode;

	@FindBy(css = "#cancel")
	private WebElement cancel;

	@FindBy(css = "input#continue")
	private WebElement continueBtn;

	public void enterCheckOutInformation(String fName, String lName, String code) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		postCode.sendKeys(code);

	}

	public WebElement getCancel() {

		return cancel;
	}

	public WebElement getContinueBtn() {

		return continueBtn;
	}

}
