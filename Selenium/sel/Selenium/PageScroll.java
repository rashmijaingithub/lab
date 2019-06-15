package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageScroll{
 @Test
public void scroll() throws InterruptedException
{ 
 // load browser
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
 // This  will scroll page 400 pixel vertical
  ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
  ((JavascriptExecutor)driver).executeScript("scroll(2000,0)"); 
  
 }
 
}