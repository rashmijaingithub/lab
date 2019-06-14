package com.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	static WebDriver driver;

	public static void initialization()
	{
			driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	
	public void failed(WebDriver driver, String screenshotName)
	{
		try {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("./Screenshots/"+screenshotName+".png"));
		} 
		 catch (Exception e) {
			System.out.println("Exception while taking screen shot "  +e.getMessage());
		}
	}
	
}
