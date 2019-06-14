package com.online.banking.testcases;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.online.banking.helper.Configurations;
import com.online.banking.pages.LoginPage;

public class LoginPagevalidation extends Configurations {

	

	
	  @Test(priority=0,description="valid login") 
	  public void validlogin() throws InterruptedException
	  {
		  LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	  login.loginpageValidations(); 
	  
	  login.setUsername(Configurations.readProperty("username"));
	 login.setPassword(Configurations.readProperty("password"));
  
	  Thread.sleep(4000);
	    login.clickSignIn();
	    Thread.sleep(4000);
	    login.takeScreenshot(driver,"Valid login"); 
	   login.loginSuccessValidation(driver);
	    
	  }
	 
	  @Test(priority=1,description="invalid login")
	  public void invalidLogin() throws InterruptedException
	  {
		  LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		  login.setUsername(Configurations.readProperty("username1"));
			 login.setPassword(Configurations.readProperty("password1"));
		  login.clickSignIn();
		  Thread.sleep(4000);
		    login.takeScreenshot(driver,"loginpage"); 
		    login.errormessageValidation();
	  }

	 
}
