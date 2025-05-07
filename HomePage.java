package com.innovationPortal.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public AssestNominationBasicInfoPage clickSubmitYourIdeas() {
		pause(10000);
	//	click(Locators.XPATH, "//*[@id=\"14497760622907236527\"]/li[2]/a/span[2]");
		
	//	click(Locators.XPATH, "//*[@id=\"16138622244353478535\"]/li[2]/a/span[2]");
		//ip 11545
		//click(Locators.XPATH, "//*[@id=\"14497760622907236527\"]/li[2]/a/span[2]");
		
		//click(Locators.XPATH, "//*[@id=\"8523312771577322177\"]/li[2]/a/span[2]\");
		//*[@id="14497760622907236527"]/li[2]/a/span[2]
	//	ip test
				//click(Locators.XPATH, "//*[@id=\"5486479340079884777\"]/li[2]/a/span[2]");
				
			//	ip 29421
				click(Locators.XPATH, "//*[@id=\"8523312771577322177\"]/li[2]/a/span[2]");
				
			
				
				
				
	//click(Locators.ID,"P151_USER_ACCEPTANCE");
		//input[@type='checkbox' and @id='p151 user' and @class='u-checkbox' and @aria-hidden='true']

		//*[@id="14497760622907236527"]/li[2]/a/span[2]
		reportStep("SUbmit Your Ideas link clicked successfully", "pass");
		pause(20000);
	//	switchToWindow(1);
		return new AssestNominationBasicInfoPage();
		//return new AssestNominationBasicInfoPage();
	}

	

	
	
}
//span[@class='quick-access-text']/ancestor::a


