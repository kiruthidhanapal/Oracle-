package com.innovationPortal.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods1;

public class LoginPage1 extends ProjectSpecificMethods1 {

	
	public LoginPage1 enterEmail() {
		clearAndType(locateElement("idcs-signin-basic-signin-form-username"), "kiruthiga.dhanapal@oracle.com");
	//	clearAndType(locateElement("idcs-signin-basic-signin-form-username"));
		reportStep("kiruthiga.dhanapal@oracle.com Emaill entered successfully", "pass");
		return this;
	}
	
	
	public LoginPage1 clickNext() {
		click(Locators.XPATH, "//span[text()='Next']/ancestor::button");
		reportStep("Next button clicked successfully", "pass");
		return this;
	}
	
	public LoginPage1 enterPassword() {
		clearAndType(locateElement("idcs-auth-pwd-input|input"), "Aarushpappu@123654");
		//clearAndType(locateElement("idcs-auth-pwd-input|input"));
		reportStep("Password entered successfully", "pass");
		return this;
	}
	
	public HomePage1 clickSignIn() {
		pause(10000);
		click(locateElement(Locators.XPATH, "//span[text()='Sign In']/ancestor::button"));
		reportStep("Sign in button clicked successfully", "pass");
		pause(10000);
		return new HomePage1();
	}
	
}
