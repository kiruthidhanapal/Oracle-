package com.innovationPortal.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods1;

public class HomePage1 extends ProjectSpecificMethods1{
	
	
	public HomePage1 clickWelcomemenu()
	{
		pause(10000);
	//click(Locators.XPATH, "//*[@id=\\\"L156662660199117986943\\\"]/span[2]");
	click(Locators.XPATH, "//*[@id=\"L156662660199117986943\"]/span[2]");    
	reportStep("welcome menu clicked successfully", "pass");
	pause(10000);
	return this;
	
    }
	public AssetProcessingPage clickAssetProcessingPage()
	{
		pause(10000);
	click(Locators.XPATH, "//*[@id=\"menu_L156662660199117986943_2i\"]");
	reportStep("Asset Processing page clicked successfully", "pass");
	return new AssetProcessingPage();
	
    }
}

