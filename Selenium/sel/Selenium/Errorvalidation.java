package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Errorvalidation {
   @Test
	public void Errorvalidation() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2000);
		String Actual_Error=driver.findElement(By.xpath(".//*[@id='view_container']/div/div[2]/div/form/div[1]/div/div[2]/div[2]")).getText();
		String Expected_Error="Enter an email or phone number";
		
		System.out.println("Acatul error " +Actual_Error);
		Assert.assertEquals(Actual_Error, Expected_Error);
	}
   
   
}
