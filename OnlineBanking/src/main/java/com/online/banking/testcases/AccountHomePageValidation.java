package com.online.banking.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.online.banking.helper.Configurations;
import com.online.banking.pages.HomePage;
import com.online.banking.pages.LoginPage;

public class AccountHomePageValidation extends Configurations {


	
	  @Test
	  public void bankinghomevalidation() throws InterruptedException
	  {
		  HomePage Hpage = PageFactory.initElements(driver, HomePage.class);
	 
		  LoginPagevalidation login=new LoginPagevalidation();
		  login.validlogin();
		  Hpage.clickonGo();
		  Hpage.acctpage();
		  Hpage.acctnumberValidation();
		 Hpage.datevalidation();
		  Hpage.fundTransfer();
	    
	  }
	 
	
}
