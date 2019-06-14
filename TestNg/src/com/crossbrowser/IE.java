package com.crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IE {
	
	@Test
	public void testIE()
	{
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Drivers\\IEDriverServer64.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("rashmi");

	}

}
