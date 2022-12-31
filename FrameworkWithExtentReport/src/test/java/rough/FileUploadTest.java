package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {

	@Test
	public void uploadTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys("D://a.txt");

	}

}
