package com.e2etests.automation.step_definitions;


import com.e2etests.automation.page_objects.TicketPage;

import io.cucumber.java.en.When;

public class TicketStepDefinition {

	

	private TicketPage ticketPage;

	public TicketStepDefinition() {
		this.ticketPage = new TicketPage();
	}
	
	@When("je click sur le bouton ajout ticket")
	public void jeClickSurLeBoutonAjoutTicket() throws InterruptedException   {
		Thread.sleep(5000);
		ticketPage.goToAddTicket();
         //ticketPage.clickOnAddTicket();
	}
	
	@When("je choisir une agence apartir de input agence")
	public void jeChoisirUneAgenceApartirDeInputAgence() throws InterruptedException {
		Thread.sleep(2000);
	     ticketPage.addAgence();
	}
	
	@When("je choisir un departement")
	public void jeChoisirUnDepartement() {
	   ticketPage.addDepartement();
	}
	
	@When("je saisie le titre {string}")
	public void jeSaisieLeTitre(String txt) {
	    ticketPage.fillTitre(txt);
	}
	
	@When("je saisie le description {string}")
	public void jeSaisieLeDescription(String txt) {
         ticketPage.fillDesciption(txt);
	}
	
	@When("je choisi le responsable")
	public void jeChoisiLeResponsable() {
         ticketPage.addResponsable();
	}
	
	@When("je click sur le bouton creation")
	public void jeClickSurBoutonCreation() {
         ticketPage.clickBtnCreation();
	}
	
	
	
	
	
	
}
	







