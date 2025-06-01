package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.e2etests.automation.utils.Setup;

public class AgencePage {


	/** @FindBy **/
	@FindBy(how = How.ID, using = "sidenav-title-agences")
	public static WebElement menuAgence;

	@FindBy(how = How.ID, using = "add")
	public static WebElement addAgence;

	@FindBy(how = How.ID, using = "name")
	public static WebElement nameAgence;

	@FindBy(how = How.ID, using = "add-agence-submit-button")
	public static WebElement btnAjout;

	

	@FindBy(how = How.ID, using = "swal2-title")
	public static WebElement succes;

	public AgencePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}

	public void clickOnMenuAgence() {
		menuAgence.click();
	}
	
	public void clickOnAddAgence() {
		addAgence.click();
	}
	
	public void FillNameAgence(String name) {
		nameAgence.sendKeys(name);
	}
	
	public void ClickAjout() {
		btnAjout.click();
	}
	
	public void ClickOk() {
		Actions actions = new Actions(Setup.getDriver());
		actions.moveByOffset(150, 500).click().perform();
	}


}
