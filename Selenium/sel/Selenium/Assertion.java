package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void Assertionscript()
	{
		Assert.assertEquals(12, 13);
		
	}
	@Test
	public void Assertionscript1()
	{
		
		System.out.println("first tc started");
		Assert.assertEquals(12, 13,"dropdown count doesnt match");
		System.out.println("first tc completed");
	}
	
	@Test
	public void Assertionscript2()
	{
		System.out.println("2 tc started");
		Assert.assertEquals("Hello", "Hello","Word doesnt match");
		System.out.println(" 2 tc completed");
	}
}
