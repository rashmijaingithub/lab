package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollintoview {
@Test
	public void Scrolltoview() throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
		 // maximize browser
		  driver.manage().window().maximize();
		  // Open Application
		  driver.get("http://totalwine.com"); 
		  // Wait for 5 second
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@id='btnYes']")).click();
			driver.navigate().refresh();
			//CReate instance of  java script executer
		JavascriptExecutor	je= (JavascriptExecutor) driver;
		//Identify the Webelement it will appear after the 	scroll down
		
		WebElement element=driver.findElement(By.xpath("html/body/footer/div[2]/div/div[4]/div[4]/ul/ul/li[1]/strong"));
		//Execute the querry to scroll until that element is not appear
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//exact the text and verify
		
		System.out.println("Text is" +element.getText());
			
	}
}
