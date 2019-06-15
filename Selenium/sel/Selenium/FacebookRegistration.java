package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
   WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test Selenium");
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		
		Select sel1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel1.selectByIndex(4);
		Select sel2=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sel2.selectByVisibleText("Mar");
		Select sel3=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByIndex(6);
		

		driver.findElement(By.xpath("//*[text()='Create Account']")).click();
		driver.findElement(By.xpath("//*[text()='Create a Page']")).click();
		driver.navigate().back();
		driver.quit();
	
		
	}

}
