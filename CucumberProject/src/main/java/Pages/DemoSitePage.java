package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoSitePage {
	public WebDriver driver;

	public DemoSitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='site-name']//a")
	@CacheLookup
	WebElement labelLitleText;

	@FindBy(xpath = "//a[@href='MiniStatementInput.php']")
	@CacheLookup
	WebElement linkMiniStatement;

	@FindBy(name = "accountno")
	@CacheLookup
	WebElement selectAccountNo;

	@FindBy(name = "AccSubmit")
	@CacheLookup
	WebElement buttonAccSubmit;

	@FindBy(name = "res")
	@CacheLookup
	WebElement buttonReset;

	@FindBy(xpath = "//p[text()='Mini Statement Form']")
	@CacheLookup
	WebElement labelMinistementform;

	@FindBy(xpath = "//p[contains(text(),'Last Three Transaction Details for Account No:')]")
	@CacheLookup
	WebElement labelTransactionList;

	public void verifyHomePageTitle(String expectedTitle) {
		String actualTitle = labelLitleText.getText();
		System.out.println(expectedTitle + "  " + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public void clickOnMinistatementLink() {
		linkMiniStatement.click();
	}

	public void verifyMiniStatementFormDislayed() {
		if (labelMinistementform.isDisplayed()) {
			System.out.println("Mini Statement Form Is Displayed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Mini Statement Form Is Not Displayed");
			Assert.assertTrue(false);
		}
	}

	public void selectAccountNumberFromDropdown(String accountnmber) {
		new Select(selectAccountNo).selectByVisibleText(accountnmber);
	}

	public void clickOnSubmitButton() {
		buttonAccSubmit.click();
	}

	public void verifyTrasactionListIsDisplayed() {
		if (labelTransactionList.isDisplayed()) {
			System.out.println("Transaction List Is Displayed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Transaction List Is Not Displayed");
			Assert.assertTrue(false);
		}
	}

}
