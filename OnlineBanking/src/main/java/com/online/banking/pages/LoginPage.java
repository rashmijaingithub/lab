package com.online.banking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.online.banking.helper.BaseClass;

public class LoginPage extends BaseClass {

	// Login page

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

	public static void setUsername(String value) {
		sendKeys(username, value);
	}

	public static void setPassword(String pwd) {
		sendKeys(password, pwd);
	}

	public static void clickSignIn() {
		signIn.click();
	}

	public void loginSuccessValidation(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(driver.getTitle().contains("Altoro Mutual"));

	}

	public static void loginpageValidations() throws InterruptedException {

		Thread.sleep(4000);

		Assert.assertTrue(logo.isDisplayed(), "Logo not displaing");

		Assert.assertTrue(ONLINEBANKINGTAB.isDisplayed(), "ONLINEBanking tab displayed");
		Assert.assertTrue(Persnaltab.isDisplayed(), "Persnaltab is displayed");
		Assert.assertTrue(smallbusiness.isDisplayed(), "small business tab is displayed");
		Assert.assertTrue(INSIDEALTO.isDisplayed(), "INSIDEALTO tab is displayed");

	}

	public static void errormessageValidation() {

		Assert.assertTrue(ErrorMessage.isDisplayed());

	}

}
