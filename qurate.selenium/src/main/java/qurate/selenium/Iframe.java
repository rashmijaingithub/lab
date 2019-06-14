package qurate.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {
	
	
public static void main (String ars[])
{
	ChromeDriver driver=new ChromeDriver();
	
	WebDriverWait  wt=new WebDriverWait(driver,5);
	//wt.until(ExpectedConditions.is)
       driver.get("https://www.toolsqa.com/");
       driver.manage().window().maximize();

Actions act= new Actions(driver);

            
       //System.out.println("NUmber of frames in page ="  +driver.findElement(By.tagName("iframe")));
       
       int counter=0;
       
       if (driver.findElements(By.tagName("iframe")).size() > 0) {
			 List<WebElement> frames = driver.findElements(By.tagName("iframe")); 
			 System.out.println( frames);
			 for(WebElement frm :frames)
			 {
				System.out.println(frm.getText()+" id" +frm.getAttribute("id"));
				driver.switchTo().frame(counter);
				driver.switchTo().defaultContent();
				{
					counter++;
				}
			 }
       }
       }}
	
			

				 
    	   
       



