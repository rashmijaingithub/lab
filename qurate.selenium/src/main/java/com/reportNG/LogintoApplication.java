package com.reportNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogintoApplication {
	
	@Test
	public void logintoApp()
	{
		System.out.println("Login to application ");
	}

	@Test
	//(enabled=false)
	public void cartpage()
	{
		
		Assert.assertTrue(false);
		System.out.println("Cart page ");
	}
	
	  @Test(dependsOnMethods = "cartpage")
		public void logout()
		{
			System.out.println("logout");
		}
	
}
