package tests.ProductTest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Constants.ArmadaConstants;
import base.TestBase;
import pages.LoginPage;
import pages.products.InventoryPage;
import pages.yourCart.CheckOutInformationPage;
import pages.yourCart.CheckOutOverviewPage;
import pages.yourCart.YourCartPage;

public class InventoryTest extends TestBase {

	public LoginPage login;
	public InventoryPage inventory;
	public YourCartPage cart;
	public CheckOutInformationPage checkOutInfo;
	public CheckOutOverviewPage checkOutOverviewPage;

	@BeforeClass
	public void beforeClass() {
		login = new LoginPage(driver);
		inventory = new InventoryPage(driver);
		cart = new YourCartPage(driver);
		checkOutInfo = new CheckOutInformationPage(driver);
		checkOutOverviewPage = new CheckOutOverviewPage(driver);

	}

	@Test(priority = 0)
	public void loginTest() {
		login.doLogin(ArmadaConstants.username, ArmadaConstants.password);
		
	}

	@Test(priority = 1)
	public void productTest() {

		List<WebElement> list = inventory.getAllProductList();

		for (WebElement li : list) {
			System.out.println(li.getText());
		}

		

	}

	@Test(priority = 2)
	public void addProductToCartTest() {

		inventory.getAddProduct("labs-backpack").click();
		inventory.getShoppingCart().click();
		cart.getCheckout().click();
		

	}

	@Test(priority = 3)
	public void checkOutInfo() {

		checkOutInfo.enterCheckOutInformation("User1", "Smth38483", "3943943");
		checkOutInfo.getContinueBtn().click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}
		

	}

	@Test(priority = 4)
	public void checkOutOverviewTest() {
		String totalItem = checkOutOverviewPage.getItemTotal().getText();
		System.out.println("Total item: " + totalItem);
		System.out.println("summary total: " + checkOutOverviewPage.getSummaryTotal().getText());
		checkOutOverviewPage.getFinishButton().click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}

		System.out.println("End to end test passed");
		test.log(Status.INFO, "End to End test got passed!!");
		

	}

}
