package com.banking.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.helper.BaseClass;

import cucumber.api.java.After;

public class HomePage extends BaseClass {
	
	
	  @FindBy(xpath=("//input[@id='btnGetAccount']")) private static WebElement
	  gobutton ;
	  
	  @FindBy(xpath=(" //select[@id='listAccounts']")) private static WebElement
	  Acct_selected ;
	  
	  @FindBy(xpath=(" //select[@id='listAccounts']")) private static WebElement
	  Acct_history ;
	  
	  @FindBy(xpath=("//h1[contains(text(),'Account History')]")) private static WebElement
	  Accounthistorypage ;
	  
	  @FindBy(xpath=("//td[contains(text(),'Ending balance')]")) private
	  static WebElement Act_date;
	  
	  @FindBy(xpath=("//font[contains(text(),'Sign Off')]")) private
	  static WebElement SignOff;
	  @FindBy(xpath=("//font[contains(text(),'Sign In')]")) private
	  static WebElement Signin;
	  
	  public HomePage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void clickonGo() { 
		  gobutton.click(); }
	  
	  public void acctHistorypage()
	  {
		  Assert.assertTrue(Accounthistorypage.isDisplayed());
	  }
	  public static void acctpageValidation() { 
	  
	      Assert.assertEquals(Acct_selected.getText(), Acct_history.getText());    
	  } 	  
	  public static void datevalidation() {
	  
		  DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
		  Date date=new Date();
		  String systemcurrentdate=dateFormat.format(date);
		  String Actualdate=Act_date.getText();
		  if(systemcurrentdate.contains(Actualdate))
		  Assert.assertEquals(Actualdate, systemcurrentdate); 
		  
	  } 
	  
	
	  public void Signoff() throws InterruptedException
	  {
		  SignOff.click();
		  Thread.sleep(1000);
		  Assert.assertTrue(Signin.isDisplayed());
	  }
	  public static void clickLogin() {
		  Signin.click();
			
		}
		
	  
	
	 
}
