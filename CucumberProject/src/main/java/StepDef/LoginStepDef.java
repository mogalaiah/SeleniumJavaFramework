package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.ReusableMethods;
import cucumber.api.java.en.*;


public class LoginStepDef {
	public WebDriver driver;
	ReusableMethods _reusable = new ReusableMethods();
	LoginPage _loginPage;
	
	@Given("^user lunch chrome browser$")
	public void user_lunch_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		_loginPage = new LoginPage(driver);
	}
	
	
	@Given("^user Navigate to URL \"([^\"]*)\"$")
	public void user_Navigate_to_URL(String URL) throws Throwable {
		driver.get(URL);		
	}

	@When("^user enter userName as (\\d+) and password as Guru(\\d+)$")
	public void user_enter_userName_as_and_password_as_Guru(String userName, String passWord) throws Throwable {
		_loginPage.enterUserNameAndPassword(userName, passWord);
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		_loginPage.clickOnSubmitButton();
	}

	@Then("^user verify home page as \"([^\"]*)\" is displayed$")
	public void user_verify_home_page_as_is_displayed(String pageTitle) throws Throwable {
		_loginPage.verifyHomePage(pageTitle);
	}
}
