package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	
	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}
	


	@Given("je me connecte sur lapplication proservice")
	public void jeMeConnecteSurLapplicationProservice() {
		authenticationPage.goToUrl();
	}
	@When("je saisi le Email {string}")
	public void jeSaisiLeUsername(String email) {
		authenticationPage.fillEmail(email);
	}
	@When("je sasi le Password {string}")
	public void jeSasiLePassword(String psw) {
		authenticationPage.fillPassword(psw);
	}
	@When("je click sur le bouton se connecter")
	public void jeClickSurLeBoutonSeConnecter() {
		authenticationPage.clickOnBtnSubmit();
	}
	@Then("je me redirige vers la page dashboard {string}")
	public void jeMeRedirigeVersLaPageDashboard(String text) throws InterruptedException {
		 Thread.sleep(5000);
		 String url = Setup.getDriver().getCurrentUrl();
         Assert.assertEquals(text,url);
	}



}
