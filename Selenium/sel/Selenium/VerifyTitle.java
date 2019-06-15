package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void Verifyapptitle()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		//Using get title
		//String MyTitle=driver.getTitle();
		//using pagesource
		String MyTitle=driver.getPageSource();
		System.out.println("My title is " +MyTitle);
		
		String Expected_title="Selenium Webdriver Tutorials-Free Selenium Tutorial";
		//Exact  match
		Assert.assertEquals(MyTitle, Expected_title); 
		
		//Not exact match
		//Assert.assertTrue(MyTitle.contains("Selenium WebDriver"));
		
		System.out.println("Test Completed");
		
		
		
	}
	
	

}
