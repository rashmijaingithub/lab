package qurate.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("I am searching");
        WebElement we =driver.findElement(By.xpath("(//*[@value='Google Search'])[1]"));
        //we.click();
        
        JavascriptExecutor js =  (JavascriptExecutor)driver;
       
        js.executeScript("arguments[0].click()", we);
        
        js.executeScript("window.scrollBy(0,100)");
        
        js.executeScript("window.history.go(-1)");  
	}

}
