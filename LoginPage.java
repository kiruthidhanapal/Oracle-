package com.innovationPortal.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	
	public LoginPage enterEmail() {
		clearAndType(locateElement("idcs-signin-basic-signin-form-username"), "kiruthiga.dhanapal@oracle.com");
	//	clearAndType(locateElement("idcs-signin-basic-signin-form-username"));
		reportStep("kiruthiga.dhanapal@oracle.com Emaill entered successfully", "pass");
		return this;
	}
	
	
	public HomePage clickNext() {
		click(Locators.XPATH, "//span[text()='Next']/ancestor::button");
		reportStep("Next button clicked successfully", "pass");
		pause(40000);
		//return this;
		return new HomePage();
	}
	
	
	
}
