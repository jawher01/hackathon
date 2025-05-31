package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AgencePage;
import com.e2etests.automation.page_objects.DepartementPage;

import io.cucumber.java.en.When;

public class DepartementStepDefinition {
	private DepartementPage departementPage;

	public DepartementStepDefinition() {
		this.departementPage = new DepartementPage();
	}

	@When("je navige vers le menu departement")
	public void jeNavigeVersLeMenuDepartement() throws InterruptedException {
		Thread.sleep(5000);
		departementPage.clickOnMenuDepartement();
	}
	
	@When("je click sur le button ajouter departement")
	public void jeClickSurLeButtonAjouterDepartement() throws InterruptedException {
		Thread.sleep(5000);
		departementPage.clickOnAjoutDepartement();
	}
	
	@When("ajouter le nom de le departement {string}")
	public void ajouterLeNomDeLeDepartement(String txt) {
		departementPage.FillNameAgence(txt);
	}
	
	@When("je choisir un agence")
	public void jeChoisirUnAgence() {
		departementPage.clickOnAjoutAagence();
	}

	@When("je click le button ajouter departement")
	public void jeClickLeButtonAjouterDepartement() {
		departementPage.clickOnBtnAjout();
	}


}
