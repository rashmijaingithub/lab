package com.flight.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Helper.WebTest;

import com.flight.pages.FlightPage;
import com.flight.pages.LoginPage;



public class Loginwithvalidusernameandpasswoed extends WebTest {
	//WebTest wt = new WebTest();
	
	
	
	@Test
	public void login()
	{
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		//LoginPage lp=new LoginPage();
		lp.setUserName("mercury");
		lp.setPassword("mercury");
		lp.clickSignIn();
		FlightPage fp=new FlightPage();
		Assert.assertEquals(fp.testmethod(), "SIGN-OFF");
		
	}

	/*
	 * @AfterMethod public void quitbrowser() { wt.cleanup(); }
	 */

	//@Test
	/*public void logoff() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		Thread.sleep(5000);
		lp.setUserName("mercury");
		Thread.sleep(2000);
		lp.setPassword("dsfjd");
		lp.clickSignIn();
		
	}*/
	
	


	
    
}
