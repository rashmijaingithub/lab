package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void softassert()
	{
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test 1 started");
		assertion.assertEquals(20, 30);
		System.out.println("Test 1 completed ");
		assertion.assertAll();
	}
	@Test
	public void Hardassert()
	{
		
		System.out.println("Test 2 started");
		Assert.assertEquals(20, 30);
		
		System.out.println("Test 2 completed ");
	}

}
