package com.vtiger.qasa6.genericutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public fileUtils fileUtils=new fileUtils();
	public webdriderUtility wait=new webdriderUtility();
	@BeforeMethod
	public void configuration() throws Throwable {
		String browser=fileUtils.readDataFromPropertyFile("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtils.readDataFromPropertyFile("URL"));
	}
	@AfterMethod
	public void afterConfiguration() {
		driver.manage().window().minimize();
		driver.quit();
	
	}
}
