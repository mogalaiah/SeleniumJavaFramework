package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoSitePage extends ReusableMethods {
	By labelLitleText = By.xpath("//div[@id='site-name']//a");
	By linkMiniStatement = By.xpath("//a[@href='MiniStatementInput.php']");
	By linkLogOut = By.xpath("//a[@href='Logout.php']");
	By selectAccountNo = By.name("accountno");
	By buttonAccSubmit = By.name("AccSubmit");
	By buttonReset = By.name("res");
	By labelMinistementform = By.xpath("//p[text()='Mini Statement Form']");
	By labelTransactionList = By.xpath("//p[contains(text(),'Last Three Transaction Details for Account No:')]");

	
	public void verifyHomePageTitle(String expectedTitle) {
		String actualTitle = driver.findElement(labelLitleText).getText();
		System.out.println(expectedTitle+"  "+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public void clickOnMinistatementLink() {
		driver.findElement(linkMiniStatement).click();
	}

	public void verifyMiniStatementFormDislayed() {
		if (driver.findElement(labelMinistementform).isDisplayed()) {
			System.out.println("Mini Statement Form Is Displayed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Mini Statement Form Is Not Displayed");
			Assert.assertTrue(false);
		}
	}

	public void selectAccountNumberFromDropdown(String accountnmber) {
		new Select(driver.findElement(selectAccountNo)).selectByVisibleText(accountnmber);
	}

	public void clickOnSubmitButton() {
		driver.findElement(buttonAccSubmit).click();
	}
	
	public void verifyTrasactionListIsDisplayed() {
		if (driver.findElement(labelTransactionList).isDisplayed()) {
			System.out.println("Transaction List Is Displayed");
			Assert.assertTrue(true);	
		} else {
			System.out.println("Transaction List Is Not Displayed");
			Assert.assertTrue(false);
		}
	}
	
	public void clickOnLogOutbutton() {
		driver.findElement(linkLogOut).click();
		System.out.println("LogOut Successfully From Application");
		driver.switchTo().alert().accept();
	}
}
