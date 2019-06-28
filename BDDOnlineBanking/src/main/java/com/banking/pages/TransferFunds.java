package com.banking.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.banking.helper.BaseClass;

import cucumber.api.java.After;

public class TransferFunds extends BaseClass { 

  
  @FindBy(xpath=("//a[@id='MenuHyperLink3']")) private static WebElement
  TransferFunds;
  
  @FindBy(xpath=("//h1[contains(text(),'Transfer Funds')]")) private static
  WebElement TransferFundsText;
  
  @FindBy(xpath=("//select[@id='toAccount']")) private static WebElement
  ToAcct;
  
  @FindBy(xpath=("//input[@id='transferAmount']")) private static WebElement
  Amountbox;
  
  @FindBy(xpath=("//input[@id='transfer']")) private static WebElement
  TMoneyButton;
  
  @FindBy(xpath=
  ("//span[contains(text(),'100.0 was successfully transferred from Account 80')] "
  )) private static WebElement Sucessmessage;
  
  //Methods 
  public TransferFunds(WebDriver driver) {
  PageFactory.initElements(driver, this); 
  }
  
  public void clickonfundtransfer() { TransferFunds.click(); }
  
  public void TransferFundsText() {
  Assert.assertTrue(TransferFundsText.isDisplayed()); } 
  public void amounttransfer(int amt) throws InterruptedException 
  { 
	Thread.sleep(3000);
	  TransferFunds.click();
	 String heading =TransferFundsText.getText();
	 Assert.assertEquals(  heading, "Transfer Funds");
	  Select select=new Select(ToAcct);
	  Thread.sleep(1000);
	  select.selectByIndex(1);
	  String i=Integer.toString(amt);
	 Amountbox.sendKeys(i);
	 Thread.sleep(3000);
	 TMoneyButton.click();
	 Thread.sleep(2000);
	 Assert.assertTrue(Sucessmessage.isDisplayed());
	 
  }
  public void verifyfundsucessMessage() {
  Assert.assertTrue(Sucessmessage.isDisplayed()); }
  
}
	