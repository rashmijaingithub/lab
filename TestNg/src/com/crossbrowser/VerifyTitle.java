package com.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void VerofyPageTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			// System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		
			driver=new FirefoxDriver();
			 
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Drivers\\IEDriverServer64.exe");
		}
			driver.manage().window().maximize();
			driver.get("http://google.com/");
			System.out.println(driver.getTitle());
			driver.quit();
		
	}
	
}
