package com.banking.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


import com.banking.helper.BaseClass;

import cucumber.api.java.After;

public class LoginPage extends BaseClass {



	@FindBy(xpath = ("//*[@id='HyperLink1']/img"))
	private static WebElement logo;

	@FindBy(xpath = "//a[@id='AccountLink']")
	private static WebElement ONLINEBANKINGTAB;

	@FindBy(xpath = "//a[@id='LinkHeader2']")
	private static WebElement Persnaltab;

	@FindBy(xpath = "//a[@id='LinkHeader3']")
	private static WebElement smallbusiness;

	@FindBy(xpath = "//a[@id='LinkHeader4']")
	private static WebElement INSIDEALTO;

	@FindBy(xpath = "//input[@id='uid']")
	private static WebElement username;

	@FindBy(xpath = "//input[@id='passw']")
	private static WebElement password;

	@FindBy(xpath = "//*[@value='Login']")
	private static WebElement signIn;

	@FindBy(xpath = "//span[@id='_ctl0__ctl0_Content_Main_message']")
	private static WebElement ErrorMessage;
	@FindBy(xpath = "//*[text()='Sign Off']")
	private static WebElement LoginSucessfully;

	public LoginPage(WebDriver driver) 
	{
		  PageFactory.initElements(driver, this);
	  }
	
	public void logintoApp(String us,String pw) throws InterruptedException
	{
		username.sendKeys(us);
		password.sendKeys(pw);
		signIn.click();
		Thread.sleep(4000);	
	}

	public static void logoValidation() throws InterruptedException {
		Thread.sleep(4000);
		
		Assert.assertTrue(logo.isDisplayed());
	}

		
		public void listoftabs(List<String> inputList)
		{
			for(String input:inputList )
			{
				String tabs = input;
			}
		
	       Assert.assertTrue(ONLINEBANKINGTAB.isDisplayed());
           Assert.assertTrue(Persnaltab.isDisplayed()); 
           Assert.assertTrue(smallbusiness.isDisplayed());
	        Assert.assertTrue(INSIDEALTO.isDisplayed());
	 
		}
		
	
	public static void validateMessage(String message) {
		if(message.equalsIgnoreCase("valid"))
			Assert.assertTrue(LoginSucessfully.isDisplayed());
		else if(message.equalsIgnoreCase("invalid"))
			Assert.assertTrue(ErrorMessage.isDisplayed());
		
 
	}

	

	

}
