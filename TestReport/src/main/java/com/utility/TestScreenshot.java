package com.utility;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.utility.ListenerClass.class)
public class TestScreenshot extends BaseClass {
	
@BeforeMethod
	public void setup()
	{
		initialization();
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeScreenshot()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void takeScreenshot1()
	{
		Assert.assertTrue(false);
	}
	
}
