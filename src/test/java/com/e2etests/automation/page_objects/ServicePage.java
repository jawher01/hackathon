package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.e2etests.automation.utils.Setup;




public class ServicePage {

	


	/** @FindBy **/
	@FindBy(how = How.ID, using = "sidenav-title-services")
	public static WebElement menuService;

	@FindBy(how = How.ID, using = "add")
	public static WebElement addService;

	@FindBy(how = How.ID, using = "name")
	public static WebElement nameService;
	
	@FindBy(how = How.ID, using = "size-small-standard-0")
	public static WebElement selectAgence1;
	
	@FindBy(how = How.ID, using = "size-small-standard-0-option-2")
	public static WebElement selectAgence2;
	
	@FindBy(how = How.ID, using = "confirm-add-service-button")
	public static WebElement btnAjout;

	@FindBy(how = How.ID, using = "swal2-title")
	public static WebElement succes;
	
	public ServicePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}
	
	public void clickOnMenuService() {
		menuService.click();
	}
	
	public void clickOnAjoutService() {
		addService.click();
	}
	
	public void FillNameService(String name) {
		nameService.sendKeys(name);
	}
	
	public void clickOnAjoutAagence() {
		selectAgence1.click();
		selectAgence2.click();
	}
	
	public void clickOnBtnAjout() {
		btnAjout.click();
	}
	
}
