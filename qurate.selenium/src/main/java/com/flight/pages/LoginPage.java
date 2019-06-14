package com.flight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
	//@FindAll(xpath"""",xpath="")
	//WebElment ele ;
	//@FindBys()
	@FindBy(xpath="//input[@type='text']")
	private static WebElement username;
	@FindBy(xpath="//input[@type='password']")
	static WebElement password;
	@FindBy(xpath="//input[@type='image']")
	static WebElement signIN;
	
	//static WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
	//static WebElement password=driver.findElement(By.xp	ath("//input[@type='password']"));
	
	public LoginPage()
	{
		this.driver=driver;
		//LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	}
	public static void setUserName(String usr)
	{
		
		sendKeys(username,usr);
	}
	
	public static void setPassword(String psw)
	{
		
       sendKeys(password,psw);	
     }
	
	public static void clickSignIn()
			{
		
		//WebElement signIN=driver.findElement(By.xpath("//input[@type='image']"));
		    signIN.click();
			}
}
