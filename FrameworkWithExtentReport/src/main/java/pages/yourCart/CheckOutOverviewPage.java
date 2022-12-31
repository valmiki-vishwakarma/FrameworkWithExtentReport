package pages.yourCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage {

	private WebDriver driver;

	public CheckOutOverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.summary_subtotal_label")
	private WebElement itemTotal;

	@FindBy(css = ".summary_total_label")
	private WebElement summaryTotal;

	@FindBy(css = "#finish")
	private WebElement finishButton;

	public WebElement getItemTotal() {
		return itemTotal;
	}

	public WebElement getSummaryTotal() {
		return summaryTotal;
	}

	public WebElement getFinishButton() {
		return finishButton;
	}

}
