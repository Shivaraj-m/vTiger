package com.vtiger.qasa6.genericUtils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.qasa6.genericutils.BaseClass;
import com.vtiger.qasa6.genericutils.allElements;

public class vtiger_CampaignCreationTest extends BaseClass {
	@Test
public void loginPage() throws Throwable {
		wait.implicitWait(driver);
		driver.getTitle().equals(fileUtils.readDataFromPropertyFile("loginPageTitle"));
		System.out.println(fileUtils.readDataFromPropertyFile("loginPageTitle")+" : "+"Vtiger Login page title is found correct and is verified.");
		driver.getCurrentUrl().equals(fileUtils.readDataFromPropertyFile("URL"));
		System.out.println(fileUtils.readDataFromPropertyFile("URL")+" : "+"Vtiger Login page URL is found correct and is verified.");
	allElements elements=new allElements(driver);
	if (elements.getUserNameTextField().getAttribute("value").isEmpty()) {
		elements.getUserNameTextField().sendKeys(fileUtils.readDataFromPropertyFile("userName"));
		if (elements.getPasswordTextField().getAttribute("value").isEmpty()) {
			elements.getPasswordTextField().sendKeys(fileUtils.readDataFromPropertyFile("password"));
		}else {
			elements.getPasswordTextField().clear();
			elements.getPasswordTextField().sendKeys(fileUtils.readDataFromPropertyFile("password"));
		}
	}else {
		elements.getUserNameTextField().clear();
		elements.getUserNameTextField().sendKeys(fileUtils.readDataFromPropertyFile("userName"));
	}
	elements.getLoginButton().submit();
}
	@Test(dependsOnMethods ="loginPage" )
	public void homePage() throws Throwable {
		driver.getTitle().equals(fileUtils.readDataFromPropertyFile("HomePageTitle"));
		System.out.println(fileUtils.readDataFromPropertyFile("HomePageTitle")+" : "+"Vtiger Home page title is found correct and is verified.");
		driver.getCurrentUrl().equals(fileUtils.readDataFromPropertyFile("HomePageURL"));
		System.out.println(fileUtils.readDataFromPropertyFile("HomePageURL")+" : "+"Vtiger Home page URL is found correct and is verified.");
		allElements elements=new allElements(driver);
		elements.getProfileIcon().click();
		if (elements.getSignoutPtion().isDisplayed()) {
			System.out.println("PASS: SignOut option is displayed.");
		}
	}
	@Test(dependsOnMethods ="homePage" )
	public void campaignCreate() throws Throwable {
		allElements elements=new allElements(driver);
		elements.getQuickCreateButton().click();
		System.out.println("Quick create window pop-up is displayed.");
		elements.getCampaignOption().click();
		System.out.println("create campaign window pop-up is displayed.");
		Actions actions = new Actions(driver);
		elements.getCampaignNameTextField().sendKeys(fileUtils.readDataFromPropertyFile("CampaignName"));
		actions.click(elements.getCampaignStatus()).sendKeys(elements.getCampaignStatusTextField(), fileUtils.readDataFromPropertyFile("CampaignStatusField")).sendKeys(Keys.ENTER).build().perform();
		actions.click(elements.getExpectedResponse()).sendKeys(elements.getExpectedResponseTextField(), fileUtils.readDataFromPropertyFile("ExpectedResponseField")).sendKeys(Keys.ENTER).build().perform();
		actions.click(elements.getCampaignType()).sendKeys(elements.getCampaignTypeTextField(), fileUtils.readDataFromPropertyFile("CampaignTypeField")).sendKeys(Keys.ENTER).build().perform();
		actions.click(elements.getExpectedCloseDate()).sendKeys(fileUtils.readDataFromPropertyFile("ExpectedCloseDateField")).sendKeys(Keys.ENTER).build().perform();
		elements.getSaveButton().click();
		elements.getAppNavigateButton().click();
		elements.getMarketingButton().click();
		elements.getCapmaignButton().click();
	}
}
