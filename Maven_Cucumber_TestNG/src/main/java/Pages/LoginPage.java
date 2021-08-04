package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DriverFactory;
import junit.framework.Assert;

public class LoginPage {

	public WebDriver driver;

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
	}

	public String verifyHomePageTitle() {
		String actualTitle = titleText.getText();
		return actualTitle;		
	}

	public void clickOnLogOutbutton() {
		linkLogOut.click();
		driver.switchTo().alert().accept();
	}

	public void closebrowser() {
		driver.close();
	}

}
