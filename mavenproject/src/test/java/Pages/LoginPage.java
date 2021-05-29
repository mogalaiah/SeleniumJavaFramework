package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends ReusableMethods {
	By user99GuruName = By.name("uid");
	By password99Guru = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");

	public void verifyLoginPageTitle(String expectedTitle) {
		String actualTitle = driver.findElement(titleText).getText();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public void loginIntoApplication(String userName, String passWord) {
		driver.findElement(user99GuruName).sendKeys(userName);
		driver.findElement(password99Guru).sendKeys(passWord);
		driver.findElement(login).click();
	}
	
	public void closeBrowsers() {
		driver.close();
	}

}
