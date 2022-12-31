package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FocusOnElementUtils {

	public void clickWebElement(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

	public void clickWebElement(WebDriver driver, WebElement element, String value) {

		Actions act = new Actions(driver);
		act.moveToElement(element).sendKeys(value).build().perform();
	}

}
