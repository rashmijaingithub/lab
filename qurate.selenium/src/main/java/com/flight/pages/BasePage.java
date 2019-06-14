package com.flight.pages;


import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Helper.WebTest;
import com.flight.*;

public class BasePage {
	static WebDriver driver = WebTest.driver;
	public static WebDriver getDriver() {
		return driver;		
	}

	protected static void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	static void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}

	protected static void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	protected static String screenShotasString() {
		String screenShot;
		screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		return screenShot;
	}

	public static void waitVisibilityOf(WebElement w, int secs) {
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.visibilityOf(w));
	}

	public static void sendKeys(WebElement element, String sequence) {
		waitVisibilityOf(element, 20);
		
		element.sendKeys(sequence);
	}

	protected static void clickbutton(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	
	
/*	public static void takeScreenShot(String methodName, WebDriver driver) {
		String file = null;
		String snapshotPath = "C:\\SnapShots\\" + System.currentTimeMillis() + ".jpeg";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(snapshotPath));
		} catch (IOException e) {
		}*/
	}

