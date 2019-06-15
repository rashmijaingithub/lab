package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
	public static void main(String arg[])
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://totalwine.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='btnYes']")).click();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id='loggedin-not-title']/a/span[2]")).click();
	driver.switchTo().frame("iframe-signin-overlay");
	WebElement username= driver.findElement(By.xpath("//input[@id='j_username']"));
	Helper.highlightelement(driver, username);
	username.sendKeys("ranantharajaiah@sapient.com");
	WebElement password=driver.findElement(By.xpath("//input[@id='j_password']"));
	Helper.highlightelement(driver, password);
	password.sendKeys("twm1234");
	WebElement button=driver.findElement(By.xpath("//button[text()='	Sign in']"));
	Helper.highlightelement(driver, button);
	button.click();
	
}}
