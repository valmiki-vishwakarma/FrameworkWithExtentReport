package pages.products;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	private WebDriver driver;

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(css = "div.inventory_item_name")
	private List<WebElement> allProductList;

	@FindBy(css = "a.shopping_cart_link")
	private WebElement shoppingCartLink;

	
	
	public WebElement getShoppingCart() {

		return shoppingCartLink;
	}

	public List<WebElement> getAllProductList() {
		return allProductList;
	}

	public WebElement getAddProduct(String name) {

		return driver.findElement(By.xpath("//button[contains(@name,'" + name + "')]"));
	}

	public WebElement removeProduct(String name) {
		return driver.findElement(By.xpath("//button[contains(@name,'remove-" + name + "')]"));
	}

	

	
}
