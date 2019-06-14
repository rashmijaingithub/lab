package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.TestListenerClass.class)
public class MytestcaseListner extends ScreenShotTest {
	WebDriver driver;
	@Test
	public void testNGListner()
	{
		 driver=new ChromeDriver();
		
		driver.get("http://google.com/");
		//System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test()
	public void testfail()
	{
		
	
	Assert.assertEquals(12, 13);
		
		
	}
	
	@Test(dependsOnMethods="testfail")
	public void testdepends()
	{
		System.out.println("Depends on testfail");
		
		
	}
	
}
