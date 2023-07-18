package com.vtiger.qasa6.genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class fileUtils {
	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/vtiget_campaignCreation.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
}
