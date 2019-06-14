package com.flight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightPage extends BasePage {

	

		 
		 
		 public String testmethod()
		 {
			 WebElement Signout=driver.findElement(By.xpath("//a[text()='SIGN-OFF']"));
			 String Actual = Signout.getText();
			return Actual;
		 }
		
}