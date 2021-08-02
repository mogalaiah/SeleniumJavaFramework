package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Utility.DriverFactory;
import junit.framework.Assert;

public class DemoSitePage {
	public WebDriver driver;

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
	}

	public Boolean verifyMiniStatementFormDislayed() {
		Boolean flag;
		if (labelMinistementform.isDisplayed()) {
			flag=true;
		} else {
			flag=false;
		}
		return flag;
	}

	public void selectAccountNumberFromDropdown(String accountnmber) {
		new Select(selectAccountNo).selectByVisibleText(accountnmber);
	}

	public void clickOnSubmitButton() {
		buttonAccSubmit.click();
	}

	public Boolean verifyTrasactionListIsDisplayed() {
		Boolean flag;
		if (labelTransactionList.isDisplayed()) {
			flag=true;
		} else {
			flag=false;
		}
		return flag;		
	}

}
