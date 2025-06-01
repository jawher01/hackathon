package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class TicketPage {
	private ConfigFileReader configFileReader ; 
	
	/** @FindBy **/
	@FindBy(how = How.ID, using = "SoftButton1")
	public static WebElement addTicket;
	
	@FindBy(how = How.ID, using = "Select-SoftSelect")
	public static WebElement addAgence1;
	
	@FindBy(how = How.ID, using = "Select-SoftSelect-option-0")
	public static WebElement addAgence2;
	
	@FindBy(how = How.ID, using = "Select-SoftSelect")
	public static WebElement addDepartement1;
	
	@FindBy(how = How.ID, using = "react-select-190-option-0")
	public static WebElement addDepartement2;
	
	@FindBy(how = How.ID, using = "right-SoftInputRoot-SoftInput")
	public static WebElement titre;
	
	@FindBy(how = How.ID, using = "right-SoftInputRoot-SoftInput")
	public static WebElement description;
	
	@FindBy(how = How.ID, using = "react-select-194-input")
	public static WebElement addResponsable1;
	
	@FindBy(how = How.ID, using = "react-select-194-option-0")
	public static WebElement addResponsable2;
	
	@FindBy(how = How.ID, using = "SoftButtonRoot-softButton")
	public static WebElement btnCreation;
	
	public TicketPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	public void goToAddTicket() {
		Setup.getDriver().get(configFileReader.getProperties("addticket.url"));
	}
	
	public void clickOnAddTicket() {
		addTicket.click();
	}
	
	public void addAgence() {
		addAgence1.click();
		addAgence2.click();
	}
	
	public void addDepartement() {
		addDepartement1.click();
		addDepartement2.click();
	}
	
	public void fillTitre(String txt) {
		titre.sendKeys(txt);
	}
	
	public void fillDesciption(String txt) {
		description.sendKeys(txt);
	}
	
	public void addResponsable() {
		addResponsable1.click();
		addResponsable2.click();
	}
	
	public void clickBtnCreation() {
		btnCreation.click();
	}
	
}
