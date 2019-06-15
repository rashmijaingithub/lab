
	package Selenium;

	import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TWM_State {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("http://totalwine.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@id='btnYes']")).click();
			driver.navigate().refresh();
			driver.findElement(By.xpath("//a[@class=\"header-ship-a\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='itemval']")).click();
			Thread.sleep(3000);
			
			
			
			List<WebElement> stateListCount=driver.findElements(By.xpath("//li[@class='undefined undefined anOption']"));
            //List<String> stateList = new ArrayList<String>();
            System.out.println("Number of states "  + stateListCount.size());
            for(int i=1;i<stateListCount.size();i++) {
                   WebElement element = driver.findElement(By.xpath("//li[@class='undefined undefined anOption']["+i+"]"));
                   JavascriptExecutor	je= (JavascriptExecutor) driver;
                   je.executeScript("arguments[0].scrollIntoView(true);", element);
                   ///((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                   Thread.sleep(500); 
                    String State_list=element.getText();
        
                   System.out.println("State names "  + State_list);
                   Thread.sleep(10000);
                   
                   /*driver.findElement(By.xpath("(//li[@class='undefined undefined anOption'])[10]")).click();
                   Thread.sleep(3000);
                   driver.findElement(By.xpath("//button[text()='ship to me	']")).click();*/
            }
           // driver.quit();

		}}



	
