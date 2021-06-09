package StepDefination;

import Pages.DemoSitePage;
import Utility.BaseClass;
import cucumber.api.java.en.*;

public class DemoSiteStepDef {

	DemoSitePage _demoSitePage = new DemoSitePage(BaseClass.driver);

	@When("^user click on Ministatement link$")
	public void user_click_on_Ministatement_link() {
		_demoSitePage.clickOnMinistatementLink();
	}

	@Then("^user verify Ministatement Form is displayed$")
	public void user_verify_Ministatement_Form_is_displayed() {
		_demoSitePage.verifyMiniStatementFormDislayed();
	}

	@When("^user select account number from account dropdown list$")
	public void user_select_account_number_from_account_dropdown_list() {
		_demoSitePage.selectAccountNumberFromDropdown("3308");
	}

	@Then("^user click on submit$")
	public void user_click_on_submit() throws Throwable {
		_demoSitePage.clickOnSubmitButton();
	}

	@Then("^user verify transaction list is displayed$")
	public void user_verify_transaction_list_is_displayed() {
		_demoSitePage.verifyTrasactionListIsDisplayed();
	}

}
