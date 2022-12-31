package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadHelper {
	public WebDriver driver;

	public UploadHelper(WebDriver driver) {
		this.driver = driver;
	}
	

	public void upload(WebElement element, String path) {

		driver.findElement(By.cssSelector("input[type='file']")).sendKeys(path);

	}

	
	
}
