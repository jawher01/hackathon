package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.e2etests.automation.utils.Setup;

public class DepartementPage {


	/** @FindBy **/
	@FindBy(how = How.ID, using = "sidenav-title-departements")
	public static WebElement menuDepartement;

	@FindBy(how = How.ID, using = "add")
	public static WebElement addDepartement;

	@FindBy(how = How.ID, using = "name")
	public static WebElement nameDepartement;
	
	@FindBy(how = How.ID, using = "size-small-standard-0")
	public static WebElement selectAgence1;
	
	@FindBy(how = How.ID, using = "size-small-standard-0-option-2")
	public static WebElement selectAgence2;
	
	@FindBy(how = How.ID, using = "submit-add-department-button")
	public static WebElement btnAjout;

	@FindBy(how = How.ID, using = "swal2-title")
	public static WebElement succes;

	public DepartementPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}
	
	public void clickOnMenuDepartement() {
		menuDepartement.click();
	}
	
	public void clickOnAjoutDepartement() {
		addDepartement.click();
	}
	
	public void FillNameDepartement(String name) {
		nameDepartement.sendKeys(name);
	}
	
	public void clickOnAjoutAagence() {
		selectAgence1.click();
		selectAgence2.click();
	}
	
	public void clickOnBtnAjout() {
		btnAjout.click();
	}
	
	
}
