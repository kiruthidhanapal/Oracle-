package com.innovationPortal.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class AssetProcessingPage extends SeleniumBase{
	
	
	
	public AssetProcessingPage clickInreviewarrow()
	{
		switchToWindow(1);
		pause(10000);        
	click(Locators.XPATH, "(//td[text()='In Review']/following-sibling::td[@headers='ASSET_ID'])/a");
	//click(Locators.XPATH, "//*[@id=\"report_table_R133311888155107335369\"]/tbody/tr[1]/td[11]/a/span");
	reportStep("Inreview arrow  clicked successfully", "pass");
	pause(10000);
	return this;
	
    }
	public AssetProcessingPage clickAssetbadge()
	{
		//pause(10000);
	click(Locators.XPATH, "(//label[text()='Asset Badge  ']/following::input[@name='P8_ASSET_BADGE'])[1]");
	reportStep("Badge selected successfully", "pass");
	//pause(10000);
	return this;
	
}
	public AssetProcessingPage clickApprove()
	{
	//	pause(10000);
	click(Locators.XPATH, "//span[text()='Approve']/..");
	reportStep("Approve button clicked successfully", "pass");
	pause(10000);
	return this;
	
}
	
	public AssetProcessingPage clickIndevarrow()
	{
	//	pause(10000);
		
	//	switchToWindow(0);
	click(Locators.XPATH, "(//td[text()='In Development']/following-sibling::td[@headers='ASSET_ID'])/a");
	reportStep("Indev button clicked successfully", "pass");
	pause(10000);
	return this;
	
}
	public AssetProcessingPage clickAddmedia()
	{
	pause(10000);
	
	
	//	switchToWindow(0);
//	click(Locators.XPATH, "//*[@id=\\\"B24835145122594215914\\\"]/span");
	click(Locators.XPATH, "//*[@id=\"B24835145122594215914\"]/span");
	
                           	
	pause(10000);
	reportStep("Add media button clicked successfully", "pass");
	click(Locators.XPATH,"//*[@id=\"P47_IMAGE_BLOB_DROPZONE\"]/div[2]/span[1]");
	click(Locators.XPATH, "C:\\\\Users\\\\Kiruthiga Dhanapal\\\\Pictures\\\\Screenshots\\\\Screenshot (1).png");
	//pause(10000);
	//return this;
	

	//public AssetProcessingPage clickSave()
	//{
	//	pause(10000);
		
	//	switchToWindow(2);
//	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Kiruthiga Dhanapal\\Pictures\\Screenshots\\Screenshot (1).png");

	//clearAndType(locateElement(Locators.ID,"//input[@type='file']"), C:\\Users\\Kiruthiga Dhanapal\\Pictures\\Screenshots\\Screenshot (1).png);
	
	
	click(Locators.XPATH, "//span[text()='Save']/..");
	reportStep("Save button clicked successfully", "pass");
	//switchToWindow(0);
	pause(10000);
	return this;
	
}
	public AssetProcessingPage clickSubitforqareview()
	{
	//	pause(10000);
		
		switchToWindow(0);
	click(Locators.XPATH, "//*[@id=\\\"B24835145122594215914\\\"]/span");
	reportStep("Subitforqareview button clicked successfully", "pass");
	
	pause(10000);
	return this;
	
}
	public AssetProcessingPage clickQAreviewarrow()
	{
	//	pause(10000);
		
		switchToWindow(0);
	click(Locators.XPATH, "(//td[text()='In QA Review']/following-sibling::td[@headers='ASSET_ID'])/a");
	reportStep("QA arrow clicked successfully", "pass");
	
	pause(10000);
	return this;
	
}
	public AssetProcessingPage clickReadytopublish()
	{
	//	pause(10000);
		
	//	switchToWindow(0);
	click(Locators.XPATH, "//*[@id=\\\"B24834903925982215865\\\"]/span");
	reportStep("Add media button clicked successfully", "pass");
	
	pause(10000);
	return this;
	
}
	public AssetProcessingPage clickReadytopublisharrow()
	{
	//	pause(10000);
		
		switchToWindow(0);
	click(Locators.XPATH, "(//td[text()='Ready To Publish']/following-sibling::td[@headers='ASSET_ID'])/a");
	reportStep("QA arrow clicked successfully", "pass");
	
	pause(10000);
	return this;
	
}
	public AssetProcessingPage clickPublish()
	{
	//	pause(10000);
		
	//	switchToWindow(0);
	click(Locators.XPATH, "//*[@id=\\\"B24834904322132215865\\\"]/span");
	reportStep("QA arrow clicked successfully", "pass");
	
	pause(10000);
	return this;
	
}
	
}