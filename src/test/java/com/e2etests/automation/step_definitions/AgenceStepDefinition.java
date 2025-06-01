package com.e2etests.automation.step_definitions;

import org.junit.Assert;


import com.e2etests.automation.page_objects.AgencePage;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgenceStepDefinition {

	
	
	private AgencePage agencePage;

	public AgenceStepDefinition() {
		this.agencePage = new AgencePage();
	}

	@When("je navige vers le menu agence")
	public void jeNavigeVersLeMenuAgence() throws InterruptedException {
		Thread.sleep(5000);
		agencePage.clickOnMenuAgence();
	}
	@When("je click sur le button ajouter agence")
	public void jeClickSurLeButtonAjouterAgence() throws InterruptedException {
		Thread.sleep(5000);
	    agencePage.clickOnAddAgence();
	}
	@When("ajouter le nom de l agence {string}")
	public void ajouterLeNomDeLAgence(String txt) {
		agencePage.FillNameAgence(txt);
	}
	@When("je click le button ajouter")
	public void jeClickLeButtonAjouter() {
		agencePage.ClickAjout();
	}
	@When("je click ok")
	public void jeClickOk() {
		agencePage.ClickOk();
	}
	@Then("je me redirige vers la page agences {string}")
	public void jeMeRedirigeVersLaPageAgences(String text) throws InterruptedException {
		Thread.sleep(5000);
		String txt = AgencePage.succes.getText();
		
		Assert.assertEquals(text,txt);
	}



}
