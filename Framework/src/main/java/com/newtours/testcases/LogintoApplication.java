package com.newtours.testcases;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.newtours.helper.Configurations;
import com.newtours.pages.LoginPage;

public class LogintoApplication extends Configurations {
	
	Properties config=new Properties();
	  @Test(priority=0) 
	  public void Login() 
	  { 
		
	  LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	  lp.setUsername("mercury"); LoginPage.setPassword("mercury");
	  lp.takeScreenshot(driver,"loginpage");
	  LoginPage.clickSignIn(); 
	

	
	  }
	 

	
	
}
