package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends ReusableMethods {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = driver;
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy (name ="uid")
	@CacheLookup
	WebElement user99GuruName;
	
	@FindBy (name ="password")
	@CacheLookup
	WebElement password99Guru;
	
	@FindBy (className ="barone")
	@CacheLookup
	WebElement titleText;
	
	@FindBy (name ="btnLogin")
	@CacheLookup
	WebElement login;
	

	
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

}
