package com.vtiger.qasa6.genericutils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class webdriderUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
