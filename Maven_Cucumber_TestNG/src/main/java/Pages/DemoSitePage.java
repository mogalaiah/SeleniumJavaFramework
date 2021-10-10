package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Logs.LogClass;
import Utility.BaseClass;

public class DemoSitePage {
	public WebDriver driver;
	BaseClass baseClass = new BaseClass();

	public DemoSitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='site-name']//a")
	@CacheLookup
	private WebElement labelLitleText;

	@FindBy(xpath = "//a[@href='MiniStatementInput.php']")
	@CacheLookup
	private WebElement linkMiniStatement;

	@FindBy(name = "accountno")
	@CacheLookup
	private WebElement selectAccountNo;

	@FindBy(name = "AccSubmit")
	@CacheLookup
	private WebElement buttonAccSubmit;

	@FindBy(name = "res")
	@CacheLookup
	private WebElement buttonReset;

	@FindBy(xpath = "//p[text()='Mini Statement Form']")
	@CacheLookup
	private WebElement labelMinistementform;

	@FindBy(xpath = "//p[contains(text(),'Last Three Transaction Details for Account No:')]")
	@CacheLookup
	private WebElement labelTransactionList;

	public void clickOnMinistatementLink() {
		linkMiniStatement.click();
		LogClass.logger.info("Mini Statement Link Was Clicked Successfully");
	}

	public Boolean verifyMiniStatementFormDislayed() {
		Boolean flag;
		if (labelMinistementform.isDisplayed()) {
			flag = true;
			LogClass.logger.info("Mini Statement Form Is Displayed Successfully");
			baseClass.highlightWebElement(driver, labelMinistementform);
		} else {
			flag = false;
			LogClass.logger.info("Mini Statement Form Not Is Displayed Successfully");
		}
		return flag;
	}

	public void selectAccountNumberFromDropdown(String accountnmber) {
		new Select(selectAccountNo).selectByVisibleText(accountnmber);
		LogClass.logger.info("Selected " + accountnmber + " from dropdown Successfully: ");
	}

	public void clickOnSubmitButton() {
		buttonAccSubmit.click();
		LogClass.logger.info("Account Submit Button Was Clicked Successfully");
	}

	public Boolean verifyTrasactionListIsDisplayed() {
		Boolean flag;
		if (labelTransactionList.isDisplayed()) {
			flag = true;
			LogClass.logger.info("Verified Trasaction List is displayed Successfully:");
			baseClass.highlightWebElement(driver, labelTransactionList);
		} else {
			flag = false;
			LogClass.logger.info("Verified Trasaction List is not displayed Successfully:");
		}
		return flag;
	}

}
