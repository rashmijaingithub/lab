package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiplewindow {
@Test
	public void Multiplewindowdemo() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.learn-automation.com");
		Thread.sleep(5000);
		String parentwindow=driver.getWindowHandle();
		System.out.println(" Parent window " +parentwindow);
		Set<String> Allwindow=driver.getWindowHandles();
		int count=Allwindow.size();
		System.out.println("Count " +Allwindow);
		for(String child:Allwindow)
		{
			if(!parentwindow.equals(child))
				driver.switchTo().window(child);
			System.out.println("Child window title is  " +driver.getTitle());
			Thread.sleep(3000);
			driver.close();
		}
	}}


	


