package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.ServicePage;


import io.cucumber.java.en.When;

public class ServieStepDefinition {

	
	private ServicePage servicePage;

	public ServieStepDefinition() {
		this.servicePage = new ServicePage();
	}


	@When("je navige vers le menu service")
	public void jeNavigeVersLeMenuService() throws InterruptedException {
		Thread.sleep(5000);
		servicePage.clickOnMenuService();
	}
	
	@When("je click sur le button ajouter service")
	public void jeClickSurLeButtonAjouterService() throws InterruptedException {
		Thread.sleep(2000);
		servicePage.clickOnAjoutService();
	}
	@When("ajouter le nom de le service {string}")
	public void ajouterLeNomDeLeService(String txt) {
		servicePage.FillNameService(txt);
	}
	@When("je click le button ajouter service")
	public void jeClickLeButtonAjouterService() {
		servicePage.clickOnBtnAjout();
	}



}
