package com.innovationPortal.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class AssetNominationAdditional_InformationPage extends SeleniumBase {


	public AssetNominationAdditional_InformationPage chooseCountryofOrigin(String countryofOrigin) {
		pause(2000);
		moveToElement(locateElement(Locators.XPATH,"//b[text()='4- Additional Information']"));
		pause(2000);
		nonSelectDropDownUsingText(locateElement("P2_COUNTRY"), countryofOrigin);
		reportStep(countryofOrigin+" choosed from the dropdown", "pass");
		return this;
	}
	public AssetNominationAdditional_InformationPage chooseContributionlineofBusiness(String contributionlineofBusiness) {
		selectDropDownUsingText(locateElement("P2_CONTRIBUT_LINE_OF_BUSINESS"), contributionlineofBusiness);
		reportStep(contributionlineofBusiness+" choosed from the dropdown", "pass");
		return this;
	}
	public AssetNominationAdditional_InformationPage chooseIndustry(String industry) {
		nonSelectDropDownUsingText(locateElement("P2_INDUSTRY"), industry);
		reportStep(industry+" choosed from the dropdown", "pass");
		return this;
	}
	public AssetNominationAdditional_InformationPage chooseRole(String role) {
		selectDropDownUsingText(locateElement("P2_ASSET_APPLICABILITY"), role);
		reportStep(role+" choosed from the dropdown", "pass");
		return this;
	}
	public AssetNominationAdditional_InformationPage clickSubmit() {
		//pause(3000);
		click(Locators.XPATH, "//*[@id=\"B24834532594233194056\"]/span");
		//click(Locators.XPATH, "//*[@id=\"B26475394215679436064\"]/span");
		
	
		
		reportStep("Submit button clicked successfully", "pass");
		//pause(3000);
		return this;
	}
	
	
	
	
	public AssetNominationAdditional_InformationPage clickProceed() {
	//	pause(3000);
		click(Locators.XPATH, "//*[@id=\"B13528348351223177312\"]/span");
		//click(Locators.XPATH, "//*[@id=\"B15169209972669419320\"]/span");
		//*[@id="B13528348351223177312"]/span
		reportStep("Proceed button clicked successfully", "pass");
		pause(30000);
		return this;
	}
	
	
	
}
