package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrap {
	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://totalwine.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='btnYes']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='loggedin-not-title']/a/span[2]")).click();
		driver.switchTo().frame("iframe-signin-overlay");
		driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys("ranantharajaiah@sapient.com");
		driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("twm1234");
		driver.findElement(By.xpath("//button[text()='	Sign in']")).click();
	}	

}
