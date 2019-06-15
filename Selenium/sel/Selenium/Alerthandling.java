package Selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerthandling {
	@Test
	public void handlealert() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		Thread.sleep(3000);
		/*Alert alt=driver.switchTo().alert();
		alt.accept();*/
		String actual_msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Msg is  " +actual_msg);
		String Expected_msg="Please select start place Plese select";
		Assert.assertEquals(actual_msg, Expected_msg);
		driver.quit();
		
	}

}
