package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

	
	@Test(priority=0)
	public void passTc()
	{
		SoftAssert assertion=new SoftAssert();

		System.out.println("Test case started ");
		assertion.assertEquals(12, 13);
	
		System.out.println("first Test case ended ");
		assertion.assertAll();
	}
	

	
	
}
