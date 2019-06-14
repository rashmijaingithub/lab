package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test(priority=0)
	public void passTc()
	{
		
		System.out.println("Test case started ");
		Assert.assertEquals(12, 13);
		System.out.println("first Test case ended ");
	}
	
	@Test
	public void failedTc()
	{
		
		System.out.println("Test case started ");
		Assert.assertEquals("Hello", "Hello", "test case to match ");
		System.out.println("Test case ended ");
	}
	
	
	
}
