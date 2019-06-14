package com.online.banking.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.online.banking.helper.Configurations;
import com.online.banking.pages.LoginPage;

public class InValidLoginValidation extends Configurations{
	
	
	 @Test(priority=0,description="Invalid page validation:") 
	  public void invalidLogin() throws InterruptedException
	  {
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	 
	 
	  login.setUsername("dds");
	  LoginPage.setPassword("sddsds");
	  login.clickSignIn();
	  Thread.sleep(4000);
	    login.takeScreenshot(driver,"loginpage"); 
	    login.errormessageValidation();
	  }
	 

}
