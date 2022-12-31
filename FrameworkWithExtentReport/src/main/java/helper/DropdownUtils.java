package helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtils {

	public void selectValueByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void selectValueByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public void selectValueByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	public void selectValue(List<WebElement> elementList, String value) {

		for (WebElement element : elementList) {
			if (element.getText().equalsIgnoreCase(value)) {
				element.click();
			}
		}

	}

	
	
}
