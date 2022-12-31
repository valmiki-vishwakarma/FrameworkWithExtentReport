package rough;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);

		driver.findElement(By.cssSelector("input#datepicker")).click();
		String today = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).getText();
		System.out.println(today);

		String date = "November 2023";
		String[] dates = date.split(" ");
		String month = dates[0];
		String year = dates[1];

		String currentMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		while (currentMonth.equalsIgnoreCase(date)) {

			driver.findElement(By.cssSelector("a[title='Next']")).click();

		}

		System.out.println("Selected the given date");
	}

}
