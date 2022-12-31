package pages.yourCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

	private WebDriver driver;

	public YourCartPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "span.title")
	private WebElement title;

	@FindBy(css = "button#continue-shopping")
	private WebElement continueShopping;

	@FindBy(css = "#checkout")
	private WebElement checkOut;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getContinueShopping() {

		return continueShopping;
	}

	public WebElement getCheckout() {

		return checkOut;
	}
}
