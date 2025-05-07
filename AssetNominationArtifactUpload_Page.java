package com.innovationPortal.pages;

import com.framework.selenium.api.design.Locators;

import com.framework.selenium.api.base.SeleniumBase;
public class AssetNominationArtifactUpload_Page extends SeleniumBase {

	public AssetNominationArtifactUpload_Page clickContinueButton() {
	//	WebDriver driver = new FirefoxDriver();
		//JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	//	jse.executeScript("window.scrollBy(0,250)");
		click(Locators.XPATH, "//*[@id=\"SAVE_NEXT_CONT_UPL\"]/span");
		reportStep("Continue button clicked successfully", "pass");
		return this;
	}
	public AssetNominationAdditional_InformationPage understandContinue() {
		click(Locators.XPATH, "//button[text()='I understand, continue']");
		reportStep("UnderstandContinue button clicked successfully", "pass");
		return new AssetNominationAdditional_InformationPage();
	}
}
