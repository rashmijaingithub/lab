package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNgdataprovioder {
	
	
	WebDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setup()
	{
		driver.get("https://uat.totalwine.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider="logincredentials")

	public void logintoapplication(String username, String password)
	{
		driver.findElement(By.xpath("//div[@id='userNameGreeting']")).click();
		driver.switchTo().frame("iframe-signin-overlay");
		driver.findElement(By.id("j_username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='	Sign in']")).click();
	}
	
	@DataProvider(name="logincredentials")
	public Object[][] getDatafromDataProvioder()
	{
	return new Object[][]
	{
		{"ranantharajaiah@sapient.com","twm1234"},
		{"test@gmail.com","twm1234"}
	};
		
	}
}

