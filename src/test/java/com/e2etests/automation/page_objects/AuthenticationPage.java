package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthenticationPage {
	
	private ConfigFileReader configFileReader ; 
	
	/**@FindBy**/
	@FindBy(how = How.ID,using = "sign-in-email-input")
	public static WebElement email;
	
	@FindBy(how = How.ID,using = "sign-in-password-input")
	public static WebElement password;
	
	@FindBy(how = How.ID,using = "button-container-softbox")
	public static WebElement btnSubmit;
	
	@FindBy(how = How.ID,using = "SoftButton1")
	public static WebElement buttonAjout;
	
	
	public AuthenticationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	
	/**Create methods**/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	
	public void fillEmail(String name) {
		email.sendKeys(name);
	}
	
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void clickOnBtnSubmit() {
		btnSubmit.click();
	}
	
}
