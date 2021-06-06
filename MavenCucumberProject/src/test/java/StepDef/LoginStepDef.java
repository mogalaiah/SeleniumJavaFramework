package StepDef;

import Pages.LoginPage;
import Utility.BaseClass;
import io.cucumber.java.en.*;

public class LoginStepDef {
	
	public LoginPage _loginPage = new LoginPage(BaseClass.driver);;
	
	@Given("user Navigate to URL {string}")
	public void user_navigate_to_url(String URL) {
		_loginPage.navigateToURL(URL);
	}

	@When("user enter userName as {string} and passWord as {string}")
	public void user_enter_user_name_as_and_pass_word_as(String userName, String passWord) {
		_loginPage.enterUserNameAndPassword(userName, passWord);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		_loginPage.clickOnSubmitButton();
	}

	@Then("user verify home page as {string} is displayed")
	public void user_verify_home_page_as_is_displayed(String pageTitle) {
		_loginPage.verifyLoginPageTitle(pageTitle);
	}

	@When("user click on logOut from Application")
	public void user_click_on_log_out_from_application() {
		_loginPage.clickOnLogOutbutton();
	}

	@When("user close the browser")
	public void user_close_the_browser() {
		_loginPage.closebrowser();
	}

}
