package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarHelper {
public static void selectDateInCalendar(WebDriver driver,String selectDay, String selectMonth, String selectYear) {
		
		if(Integer.parseInt(selectDay)>31) {
			System.out.println("Invalid date was provided: "+selectDay);
			return; //return - Program will be stopped here itself and does not continue
		}
		
		if(selectMonth.equals("February")&& Integer.parseInt(selectDay)>29) {
			System.out.println("Invalid month is provided");
			return;
		}

		String monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		String[] my = monthYear.split(" ");
		String month = my[0];
		String year = my[1];

		while (!(month.equals(selectMonth) && year.equals(selectYear))) {

			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];

		}

		try {
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[contains(text(),\'"+selectDay+"\')]")).click();
		}
		catch (Exception e) {
			System.out.println("Invalid date is provided!!");
		}

		
		

	}
}


