package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoqa.com/");
		
		driver.findElement(By.xpath("//*[@id='menu-item-374']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("http://demoqa.com/");
		driver.close();

	}

}
