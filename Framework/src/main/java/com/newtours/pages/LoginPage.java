package com.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.newtours.helper.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@name='userName']")
	private static WebElement username ; 
	
	@FindBy(xpath="//input[@name='password']")
	private static WebElement password ; 
	
	@FindBy(xpath="//input[@name='login']")
	private static WebElement signIn ;
	
	
public static void setUsername(String value)
{
	sendKeys(username,value);
}

public static void setPassword(String pwd)
{
	sendKeys(password,pwd);
}

public static void clickSignIn()
{
	clickbutton(signIn);
	//Assert.assertEquals(getdriver().getTitle(), "Find a Flight: Mercury Tours:");
	Assert.assertTrue(getdriver().getTitle().contains("Welcome: Mercury Tours"));
}



}






