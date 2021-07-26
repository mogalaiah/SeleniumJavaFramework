package StepDefination;

import Pages.LoginPage;
import Utility.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class LoginStepDef {

	LoginPage _loginPage = new LoginPage(BaseClass.driver);
	BaseClass baseClass = new BaseClass();

	@Given("^user Navigate to URL \"([^\"]*)\"$")
	public void user_Navigate_to_URL(String URL) {
		baseClass.incilizeBrowser();
		_loginPage.openURL(URL);
	}

	@When("^user enter userName as \"([^\"]*)\" and passWord as \"([^\"]*)\"$")
	public void user_enter_userName_as_and_passWord_as(String userName, String passWord) {
		_loginPage.enterUserNameAndPassword(userName, passWord);
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() {
		_loginPage.clickOnSubmitButton();
	}

	@Then("^user verify home page as \"([^\"]*)\" is displayed$")
	public void user_verify_home_page_as_is_displayed(String pageTitle) {
		_loginPage.verifyLoginPageTitle(pageTitle);
	}

	@When("^user click on logOut from Application$")
	public void user_click_on_logOut_from_Application() {
		_loginPage.clickOnLogOutbutton();
	}

	@When("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		_loginPage.closebrowser();
		baseClass.quiteDriver();

	}

}
