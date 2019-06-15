package Selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Mousehover {
	@Test
	public void mouseover() throws InterruptedException
	{
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		  //driver.manage().window().maximize();
		  driver.get("http://totalwine.com"); 
		  //driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@id='btnYes']")).click();
			//driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.navigate().refresh();
			driver.findElement(By.xpath("//a[text()='Shipping'][@class='header-ship-a']")).click();
			WebElement ele=driver.findElement(By.xpath("//span[@class='itemval']"));
			Actions act=new Actions(driver);
			act.moveToElement(ele).perform();
			driver.findElement(By.xpath("//span[@class='itemval']//span")).click();
			List<WebElement> links=driver.findElements(By.xpath("//div[@class='jspContainer']//div//ul//li"));
			int total_count=links.size();
			System.out.println("Count of States" +total_count);
			for(int i=0;i<total_count;i++)
			{
				WebElement element=links.get(i);
				String text=element.getAttribute("innerHTML");
				 boolean status=element.isEnabled();
				System.out.println("LInks name " +text);	
				System.out.println("Sttaus of webelement " +status);
			if(text.equalsIgnoreCase("Delaware"))
					{
				      element.click();
				      break;
				      
					}}}}
			
			
			

