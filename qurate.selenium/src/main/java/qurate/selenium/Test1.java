package qurate.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		WebDriverWait  wt=new WebDriverWait(driver,5);
		//wt.until(ExpectedConditions.is)
           driver.get("http://newtours.demoaut.com/");
           driver.manage().window().maximize();
          driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
          driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
          driver.findElement(By.xpath("//input[@type='image']")).click();
          
          //book  ticket
          
          WebElement rboneway=driver.findElement(By.xpath("//input[@value='oneway']"));
          if(!(rboneway.isSelected()))
          {
        	  rboneway.click();
          }
          //System.out.println(driver.findElement(By.xpath("//input[@value='oneway']")).isSelected());
          //driver.findElement(By.xpath("//input[@value='oneway']")).click();
                
         driver.findElement(By.xpath("//select[@name='fromPort']")).click();
          Select select_dep= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
          
          select_dep.selectByIndex(3);
          
         driver.findElement(By.xpath("//*[@value='First']")).click();
         
          driver.findElement(By.xpath("//input[@name='findFlights']")).click();
          
          
		/*
		 * driver.findElement(By.xpath("(//input[@name='outFlight'])[4]")).click();
		 * 
		 * driver.findElement(By.
		 * xpath("(//*[@name='results']/table)[2]//*[contains(@value,'Unified Airlines')]"
		 * )).click();
		 * driver.findElement(By.xpath("//*[@name='reserveFlights']")).click();
		 */
          
          
          WebElement tbflight =driver.findElement(By.xpath("(//*[@name='results']/table)[1]"));
          
          List<WebElement> row =tbflight.findElements(By.xpath("(//*[@name='results']/table)[1]//tr"));
          //System.out.println("rows "    +row.get(0).getText());
          
          List< WebElement> colo=row.get(0).findElements(By.xpath("//*[@name='results']/table)[1]//tr/td"));
          for(WebElement ele: colo)
          {
        	 
        	  System.out.println( ele.getText());
          }
	}
          
          
          
          
		//driver.close();
	}


