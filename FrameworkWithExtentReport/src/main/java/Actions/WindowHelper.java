package Actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHelper {

	private WebDriver driver;

	/**
	 * @author Valmiki Vishwakarma
	 * 
	 *  This methods is for switching to parent window
	 */
	public void switchToParentWindow() {
		driver.switchTo().defaultContent();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public String getParentWindow() {
		return driver.getWindowHandle();
	}

	public void switchToParentWindowAndClose() {

		String parentWindow = getParentWindow();
		Set<String> handles = getWindowHandles();

		for (String handle : handles) {
			if (handle != parentWindow) {
				driver.close();
			}

		}
	}

}
