package Parallel;

import java.util.List;
import java.util.Map;

import Pages.LoginPage;
import Utility.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;


public class LoginStepDef{
	
	LoginPage _loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("^user Navigate to URL \"([^\"]*)\"$")
	public void user_Navigate_to_URL(String URL) {
		DriverFactory.getDriver().get(URL);
	}

	@When("^user enter userName as \"([^\"]*)\" and passWord as \"([^\"]*)\"$")
	public void user_enter_userName_as_and_passWord_as(String userName, String passWord) {
		_loginPage.enterUserNameAndPassword(userName, passWord);
	}
	
	@When("user enter userName and passWord")
	public void user_enter_user_name_and_pass_word(DataTable dataTable) {
		 List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
	    
	    for (Map<String, String> columns : rows) {
	    	if(columns.get("UserName")!="") {
	    		_loginPage.userEnterUserName(columns.get("UserName"));
	    	}
	    	if(columns.get("PassWord")!="") {
	    		_loginPage.userEnterPassWord(columns.get("PassWord"));
	    	}
	    }
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() {
		_loginPage.clickOnSubmitButton();
	}

	@Then("^user verify home page as \"([^\"]*)\" is displayed$")
	public void user_verify_home_page_as_is_displayed(String actualTitle) {
		String expectedTitle= _loginPage.verifyHomePageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user click on logOut from Application$")
	public void user_click_on_logOut_from_Application() {
		_loginPage.clickOnLogOutbutton();
	}

	@When("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		_loginPage.closebrowser();
		
	}
	
	
}
