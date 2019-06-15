package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import sun.applet.Main;

public class Assertion2 {
	@Test
	public void Assertionscript()
	{
		String mystr="Rashmi Jain";
		Assert.assertTrue(mystr.contains("Rashmi"), "Names are not matching");
	}
	
	@Test
	public void Assertionscript1()
	{
		Assert.assertTrue(false);
	
		
	}
}