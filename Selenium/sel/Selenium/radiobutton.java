package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");
		
		WebElement male_radio_button=driver.findElement(By.xpath("//input[@value='2'][@type='radio']"));
		
		boolean status=male_radio_button.isDisplayed();
		System.out.println("male radio button is displayed "+status);
		
		boolean enablestatus=male_radio_button.isEnabled();
		System.out.println("Male radio button is enabled" +enablestatus);
		boolean selectedstatus=male_radio_button.isSelected();
		System.out.println("Male radio button is selected" +selectedstatus);
		male_radio_button.click();
		boolean selectedstatus_new=male_radio_button.isSelected();
		System.out.println("Male radio button is selected " +selectedstatus_new);
		

	}

}
