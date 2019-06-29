package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
	
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		Select sel1=new Select(driver.findElement(By.id("continents")));
		
		sel1.selectByIndex(1);
		System.out.println("asdsda"+sel1);
	Thread.sleep(2000);
	sel1.selectByVisibleText("Africa");
	
		

	}

}
