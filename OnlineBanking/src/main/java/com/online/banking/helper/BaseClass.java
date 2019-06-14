package com.online.banking.helper;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseClass {
	
static WebDriver driver = Configurations.driver;
	
public static WebDriver getdriver()
{
	return driver;	
}

public static void sendKeys(WebElement element, String value)
{
	waitVisibilityOf(element, 20);
	element.sendKeys(value);		
}

public static void waitVisibilityOf(WebElement w, int secs) {
	WebDriverWait wait = new WebDriverWait(driver, secs);
	wait.until(ExpectedConditions.visibilityOf(w));
}

public static  void takeScreenshot(WebDriver driver, String screenshotName)
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
