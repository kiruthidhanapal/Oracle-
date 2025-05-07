package com.innovationPortal.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class AssestNominationBasicInfoPage extends SeleniumBase {
	
	
	public AssestNominationBasicInfoPage enterAssertName(String assetName) {
		pause(4000);
//	WebElement ele = locateElement("P2_ASSET_NAME");
	//clearAndType(ele,assetName);
		clearAndType(locateElement(Locators.ID,"P2_ASSET_NAME"), assetName);
        reportStep(assetName+" asset name entered successfully", "pass");
      //  pause(3000);
		return this;
		
		 
	}
	
	public AssestNominationBasicInfoPage chooseAssetCategory(String assetCategory) {
	//	pause(3000);
		selectDropDownUsingText(locateElement(Locators.ID,"P2_ASSET_CATEGORY"), assetCategory);
		reportStep(assetCategory+" choosed in asset category dropdown", "pass");
		return this;
	}
	
	//public AssestNominationBasicInfoPage chooseAssertSatus(String assetStatus) {
	//	selectDropDownUsingText(locateElement("P2_ASSET_STATUS"), assetStatus);
		//reportStep(assetStatus+" choosed in asset status dropdown", "pass");
		//return this;
	//}
	
	public AssestNominationBasicInfoPage enterAssertDeploymentEffort(String deploymentEffort) {
		//pause(3000);
		clearAndType(locateElement(Locators.ID,"P2_DEPLOYMENT_EFFORT"), deploymentEffort);
		reportStep(deploymentEffort+" deploment effort entered successfully", "pass");
		return this;
	}
	
	public AssestNominationBasicInfoPage enterAssertValue(String assetValue) {
		clearAndType(locateElement(Locators.ID,"P2_ASSET_VALUE"), assetValue);
		reportStep(assetValue+" asset value entered successfully", "pass");
		return this;
	}
	
	public AssestNominationBasicInfoPage enterAssertShortDesc(String shortDesc) {
		pause(3000);
		//clearAndType();
		clearAndType(locateElement(Locators.ID,"P2_ASSET_DESCRIPTION"), shortDesc);
		reportStep(shortDesc+"short description entered successfully", "pass");
		//pause(3000);
		return this;
	}
	
	public AssestNominationBasicInfoPage chooseSearchTag(String checkBoxName, String inputForDropdown) {
		pause(6000);
		click(Locators.XPATH, "//div[@class='apex-item-comboselect']");
		type(locateElement(Locators.XPATH,"//input[@aria-labelledby='P2_KEYWORD_LABEL']"), checkBoxName);
		click(Locators.XPATH,"//span[text()='"+checkBoxName+"']/ancestor::li/span");
		typeAndEnter(locateElement(Locators.XPATH,"//input[@aria-labelledby='P2_KEYWORD_LABEL']"), inputForDropdown);
	
		return this;
	}
	public AssestNominationBasicInfoPage enterSearchTag(String searchTag) {
		pause(6000);
		
		clearAndType(locateElement(Locators.XPATH,"//*[@id=\"CS_2_P2_KEYWORD\"]"), searchTag);
	nonSelectDropDownUsingText(locateElement(Locators.ID,"P2_KEYWORD"), searchTag);
		reportStep(searchTag+"search tag entered successfully", "pass");
		pause(6000);
	return this;
	}
	public AssetNominationDomain_ContributionPage clickContinueBtn() {
		pause(3000);
	
		click(Locators.XPATH, "//span[text()='Continue']/parent::button");
		reportStep("Continue button clicked successfully", "pass");
		return new AssetNominationDomain_ContributionPage();
	}
	
}
