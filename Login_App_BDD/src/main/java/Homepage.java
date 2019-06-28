import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	static WebDriver driver;
	
	
	public static void username_andPassword()
	{
		
	
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		  
		  
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		  
		  
		  driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	public static void Validation()
	{
		Assert.assertTrue(true);
	}

}
