package com.vtiger.qasa6.genericutils;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allElements {
WebDriver driver;

public allElements(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement userNameTextField;
@FindBy(id="password")
private WebElement passwordTextField;
@FindBy(xpath = "//button[text()='Sign in']")
private WebElement LoginButton;
@FindBy(xpath = "//a[@role='button']")
private WebElement profileIcon;
@FindBy(id="menubar_item_right_LBL_SIGN_OUT")
private WebElement signoutPtion;
@FindBy(id="menubar_quickCreate")
private WebElement quickCreateButton;
@FindBy(xpath = "//span[text()='Campaign']")
private WebElement campaignOption;
@FindBy(id="Campaigns_editView_fieldName_campaignname")
private WebElement campaignNameTextField;
@FindBy(id="select2-chosen-12")
private WebElement campaignStatus;
@FindBy(id="s2id_autogen12_search")
private WebElement campaignStatusTextField;
@FindBy(id="select2-chosen-14")
private WebElement campaignType;
@FindBy(id="s2id_autogen14_search")
private WebElement campaignTypeTextField;
@FindBy(id="product_id_display")
private WebElement product;
@FindBy(id="Campaigns_editView_fieldName_closingdate")
private WebElement expectedCloseDate;
@FindBy(id="select2-chosen-16")
private WebElement expectedResponse;
@FindBy(id="s2id_autogen16_search")
private WebElement expectedResponseTextField;
@FindBy(name="saveButton")
private WebElement saveButton;

@FindBy(id="appnavigator")
private WebElement appNavigateButton;
@FindBy(xpath = "//span[text()=' MARKETING']")
private WebElement marketingButton;
@FindBy(xpath = "//span[text()=' Campaigns']")
private WebElement capmaignButton;


public WebElement getAppNavigateButton() {
	return appNavigateButton;
}

public WebElement getMarketingButton() {
	return marketingButton;
}

public WebElement getCapmaignButton() {
	return capmaignButton;
}

public WebElement getSaveButton() {
	return saveButton;
}

public WebElement getCampaignNameTextField() {
	return campaignNameTextField;
}

public WebElement getCampaignStatus() {
	return campaignStatus;
}

public WebElement getCampaignStatusTextField() {
	return campaignStatusTextField;
}

public WebElement getCampaignType() {
	return campaignType;
}

public WebElement getCampaignTypeTextField() {
	return campaignTypeTextField;
}

public WebElement getProduct() {
	return product;
}

public WebElement getExpectedCloseDate() {
	return expectedCloseDate;
}

public WebElement getExpectedResponse() {
	return expectedResponse;
}

public WebElement getExpectedResponseTextField() {
	return expectedResponseTextField;
}

public WebElement getQuickCreateButton() {
	return quickCreateButton;
}

public WebElement getCampaignOption() {
	return campaignOption;
}

public WebElement getProfileIcon() {
	return profileIcon;
}

public WebElement getSignoutPtion() {
	return signoutPtion;
}

public WebElement getUserNameTextField() {
	return userNameTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}
}
