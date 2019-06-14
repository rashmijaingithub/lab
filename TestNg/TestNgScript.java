package com.testingtutorial;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgScript {

	@Test(priority=0, description="starting of the application")
	public void startApplication()
	{
		System.out.println("Starting");
		Assert.assertEquals(12,13);
		
		
	}
	
	@Test(priority=1, description="this TC will execute login to application")
	public void loginapp()
	{
		System.out.println("Hello World");
		
	}
	
	@Test(priority=2, description="this tc will stop the execution")
	public void stopapplication()
	{
		System.out.println("Stop the application");
		
	}
		
	

	

}
