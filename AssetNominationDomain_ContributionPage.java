package com.innovationPortal.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class AssetNominationDomain_ContributionPage extends SeleniumBase{

	public AssetNominationDomain_ContributionPage choosePrimaryDomain(String primaryDomain) {
		pause(5000);
		moveToElement(locateElement(Locators.XPATH, "//b[text()='2- Domains & Contributors']"));
		pause(5000);
		selectDropDownUsingText(locateElement(Locators.ID,"P2_PRIMARY_DOMAIN"), primaryDomain);
		//nonSelectDropDownUsingText(locateElement(Locators.XPATH,"//li[text()='Option Text']"), primaryDomain);
		//click(Locators.XPATH, "//*[@id=\"P2_PRIMARY_DOMAIN\"]");
		//pause(3000);
		reportStep(primaryDomain+" Choosed from the dropdown", "pass");
		return this;
	}
	
	
	public AssetNominationDomain_ContributionPage choosePrimarySubDomain(String primarySubDomain) {
	//	pause(3000);
		nonSelectDropDownUsingText(locateElement(Locators.ID,"P2_PRIMARY_SUB_DOMAIN"), primarySubDomain);
		reportStep(primarySubDomain+" Choosed from the dropdown", "pass");
		return this;
	}
	
	public AssetNominationDomain_ContributionPage chooseSecondaryDomain(String secondaryDomain) {
	//	pause(3000);
		nonSelectDropDownUsingText(locateElement(Locators.ID,"P2_SELECT_ASSET_DOMAIN"), secondaryDomain);
		reportStep(secondaryDomain+" Choosed from the dropdown", "pass");
		
		return this;
	}
	
	
	public AssetNominationDomain_ContributionPage chooseSecondarySubDomain(String secondarySubDomain) {
	//	pause(3000);
		nonSelectDropDownUsingText(locateElement(Locators.ID,"P2_SECONDARY_SUB_DOMAIN"), secondarySubDomain);
		reportStep(secondarySubDomain+" Choosed from the dropdown", "pass");
		return this;
	}
	
	public AssetNominationDomain_ContributionPage enterPrimarycontributor(String primaryContributor) {
		clearAndType(locateElement(Locators.ID,"P2_EMAIL"), primaryContributor);
		reportStep(primaryContributor+" asset name entered successfully", "pass");
		return this;
	}
	public AssetNominationArtifactUpload_Page clickContinueBtn() {
		moveToElement(locateElement(Locators.XPATH,"(//span[text()='Continue'])[2]/parent::button"));
		click(Locators.XPATH, "(//span[text()='Continue'])[2]/parent::button");
		reportStep("Continue button clicked successfully", "pass");
		return new AssetNominationArtifactUpload_Page();
	}
	
}
