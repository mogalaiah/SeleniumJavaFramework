package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.BaseClass;

public class LoginPage{

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement user99GuruName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement password99Guru;

	@FindBy(className = "barone")
	@CacheLookup
	WebElement titleText;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement login;

	@FindBy(xpath = "//a[@href='Logout.php']")
	@CacheLookup
	WebElement linkLogOut;

	public void enterUserNameAndPassword(String userName, String passWord) {
		user99GuruName.sendKeys(userName);
		password99Guru.sendKeys(passWord);
	}

	public void clickOnSubmitButton() {
		login.click();
	}

	public void verifyLoginPageTitle(String expectedTitle) {
		String actualTitle = titleText.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public void clickOnLogOutbutton() {
		linkLogOut.click();
		System.out.println("LogOut Successfully From Application");
		driver.switchTo().alert().accept();
	}

	public void closebrowser() {
		driver.close();
	}

}
