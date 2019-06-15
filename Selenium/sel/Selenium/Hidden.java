package Selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Hidden {
@Test
	public void hiddenelement()
	{
	WebDriver driver=new FirefoxDriver();
		driver.get("http://totalwine.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		/*int x=driver.findElement(By.xpath("//button[text()='Yes']")).getLocation().getX();
		int y=driver.findElement(By.xpath("//button[text()='Yes']")).getLocation().getY();
		System.out.println("x value" +x);
		System.out.println("y value" +y);*/
	//List<WebElement> element=driver.findElements(By.xpath("//button[text()='Yes']"))
	driver.findElement(By.xpath("//button[@id='btnYes']")).click();
	driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
	driver.get(driver.getCurrentUrl());
	
	}
	
}
