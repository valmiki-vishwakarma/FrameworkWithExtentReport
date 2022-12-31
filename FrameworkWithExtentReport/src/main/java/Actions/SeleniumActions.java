package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class SeleniumActions extends TestBase {

	public WebDriver driver;

	public SeleniumActions(WebDriver driver) {
		this.driver = driver;

	}

	public void click(String locator) {

		System.out.println("Clicked on the WebElement");

	}

	public void sendKeys(String locator, String value) {
		// Xpath,css,id,name

		if (locator.endsWith("xpath")) {
			driver.findElement(By.xpath(locator)).click();

		}

		else if (locator.endsWith("css")) {
			driver.findElement(By.xpath(locator)).click();

		}
//10,00,00,000
		else if (locator.endsWith("id")) {
			driver.findElement(By.xpath(locator)).click();

		} else if (locator.endsWith("name")) {
			driver.findElement(By.xpath(locator)).click();
		} else if (locator.endsWith("tagname")) {
			driver.findElement(By.xpath(locator)).click();
		} else if (locator.endsWith("classname")) {
			driver.findElement(By.xpath(locator)).click();
		}

	}

	public void isElementPresent(String locator) {
		try {
			// driver.findElement(By.)
		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}

	public boolean isEnabled(String element) {

		return driver.findElement(By.xpath(element)).isEnabled();

	}

	public boolean isDisplayed(String element) {

		return driver.findElement(By.xpath(element)).isDisplayed();

	}

	public String getText(String element) {

		return driver.findElement(By.xpath(element)).getText();

	}

	public void isDisplayed() {

	}

}
