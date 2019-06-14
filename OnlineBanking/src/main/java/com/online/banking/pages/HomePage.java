package com.online.banking.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.online.banking.helper.BaseClass;

public class HomePage extends BaseClass {

	  @FindBy(xpath=("//input[@id='btnGetAccount']")) private static WebElement gobutton ;
	  
	  @FindBy(xpath=(" //select[@id='listAccounts']")) private static WebElement Acct_selected ;
	  @FindBy(xpath=(" //select[@id='listAccounts']")) 
	  private static WebElement Acct_history ;
	  @FindBy(xpath=("//td[contains(text(),'Ending balance as of 6/13/19 3:15 AM')]")) 
	  private static WebElement Act_date; 
	  @FindBy(xpath=("//a[@id='MenuHyperLink3']")) 
	  private static WebElement TransferFunds; 
	  @FindBy(xpath=("//h1[contains(text(),'Transfer Funds')]")) 
	  private static WebElement TransferFundsText; 
	  
	  @FindBy(xpath=("//select[@id='toAccount']")) 
	  private static WebElement ToAcct; 
	  
	  @FindBy(xpath=("//input[@id='transferAmount']")) 
	  private static WebElement Amountbox; 
	  @FindBy(xpath=("//input[@id='transfer']")) 
	  private static WebElement TMoneyButton; 
	  @FindBy(xpath=("//span[contains(text(),'100.0 was successfully transferred from Account 80')] ")) 
	  private static WebElement Sucessmessage; 
	
	  public static void clickonGo()
	  {
		  gobutton.click();	    	
	  }
	  
	  public static void acctpage()
	  {
	  	
		  //System.out.println(getdriver().getTitle());
		  Assert.assertTrue(getdriver().getTitle().contains("Altoro Mutual"));
	  	
	  }

	  public static void acctnumberValidation()
	  {
		
		  Assert.assertEquals(Acct_selected.getText(), Acct_history.getText());
	  	
	  }
	  public static void datevalidation()
	  {
		
		  Assert.assertEquals(  Acct_selected.getText(), Acct_history.getText());
	  	
	  }
	  public static void fundTransfer() throws InterruptedException
	  {
		
		   getdriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  TransferFunds.click();
		 String heading =TransferFundsText.getText();
		 Assert.assertEquals(  heading, "Transfer Funds");
		  Select select=new Select(ToAcct);
		  Thread.sleep(1000);
		  select.selectByIndex(2);
		 Amountbox.sendKeys("100");
		 TMoneyButton.click();
		 Thread.sleep(2000);
		 Assert.assertTrue(Sucessmessage.isDisplayed());
		 
	  }
}
