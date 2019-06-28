package com.mercury.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.config.BaseClass;


public class LoginPage extends BaseClass

{  
	static WebDriver driver;
		 
	  @FindBy(xpath = ("//input[@name='userName']")) private static WebElement
	  username;	  
	  @FindBy(xpath = "//input[@name='password']") private static WebElement
	  password;
	   @FindBy(xpath = "//input[@name='login']") private static WebElement
	  signinbutton;	  
	  //Methods
	   
	   public LoginPage(WebDriver driver) {
			  PageFactory.initElements(driver, this);
		  }
	   
	  public void  loginPageTitle(WebDriver driver) {		  
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("Mercury Tours")); 
		 
	  } 
	  	  
	  public void setUsername() 
	  { 	  
		  username.sendKeys(readProperty("username")); }	  
	  public void setPassword() 
	  { password.sendKeys(readProperty("password")); }
	  
	  public void clickSignIn()
	  { signinbutton.click(); }
	  
	  public void loginSuccessValidation(WebDriver driver) throws
	  InterruptedException { Thread.sleep(4000);
	  Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	  
	  }
	  
	  
	 
}
