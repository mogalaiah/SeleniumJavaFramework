package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Logs.LogClass;
import Utility.BaseClass;

public class LoginPage {

	public WebDriver driver;
	BaseClass baseClass = new BaseClass();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	private WebElement user99GuruName;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement password99Guru;

	@FindBy(className = "barone")
	@CacheLookup
	private WebElement titleText;

	@FindBy(name = "btnLogin")
	@CacheLookup
	private WebElement login;

	@FindBy(xpath = "//a[@href='Logout.php']")
	@CacheLookup
	private WebElement linkLogOut;

	public void enterUserNameAndPassword(String userName, String passWord) {
		user99GuruName.sendKeys(userName);
		password99Guru.sendKeys(passWord);
	}

	public void userEnterUserName(String userName) {
		user99GuruName.sendKeys(userName);
	}

	public void userEnterPassWord(String passWord) {
		password99Guru.sendKeys(passWord);
	}
 
	public void clickOnSubmitButton() {		
		login.click();
		LogClass.logger.info("Clicked On Submit Button Successfully: ");
	}

	public String verifyHomePageTitle() {
		String actualTitle = titleText.getText();
		baseClass.highlightWebElement(driver, titleText);
		return actualTitle;		
	}

	public void clickOnLogOutbutton() {
		linkLogOut.click();
		LogClass.logger.warn("Pop-Up is Displayed");
		driver.switchTo().alert().accept();
		LogClass.logger.info("LogOut From Application Successfully: ");		
	}

	public void closebrowser() {
		driver.close();
		LogClass.logger.info("Browser Is Closed Successfully: ");
	}

}
