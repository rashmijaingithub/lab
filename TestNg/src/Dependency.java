import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependency {

	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		driver = new ChromeDriver();
		System.out.println("Browser started ");
	}
	
	@Test
	public void  startApp(){

        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );	
		  String currentURL=driver.getCurrentUrl();
		  String cuttentTitle=driver.getTitle();
		
		 // System.out.println(  driver.getPageSource());
		/*
		 * String exepectedTitle="Welcome: Mercury Tours";
		 * Assert.assertEquals(cuttentTitle, exepectedTitle);
		 */
		  Assert.assertTrue(cuttentTitle.contains("Mercury Tours"));
		  Assert.assertTrue(currentURL.contains("newtours"));
		  System.out.println("Application started ");
		
		 
		
	}
   @Test(dependsOnMethods = "startApp")
	public void loginApp()
	{
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
         driver.findElement(By.xpath("//input[@type='image']")).click();
         boolean staus=driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).isDisplayed();
         Assert.assertTrue(staus);
         System.out.println("Login sucessfull ");
	}
	
  @Test(dependsOnMethods = ("loginApp"))
	public void logoutApp()
	{
	  driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//a[text()='SIGN-ON']")).isDisplayed());
	  System.out.println("Logout sucessfully ");
	}
	
  @AfterClass
  public void closeApp()
  {
	  driver.quit();
	  System.out.println("Browser closed");
  }

	}


