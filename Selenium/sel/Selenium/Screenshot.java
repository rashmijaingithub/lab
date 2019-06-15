package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	@Test
	public void capturescreenshot() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.totalwine.com");
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rashmi");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/Facebook.png"));
		System.out.println("Screenshot Capture taken");
		
		
	}

}
