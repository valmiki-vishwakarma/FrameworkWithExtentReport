package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

	private WebDriver driver;

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(String nameOrID) {
		driver.switchTo().frame(nameOrID);

	}

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public int getAllFrames() {
		return driver.findElements(By.tagName("iframe")).size();
	}

	
}
