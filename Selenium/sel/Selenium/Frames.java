package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		 List<WebElement> frames = driver.findElements(By.tagName("iframe")); 
		// System.out.println(frames);
	int total_list= driver.findElements(By.tagName("iframe")).size();
	System.out.println("total number of frames :"  +total_list);
	
	   for(WebElement list : frames)
	   {
		   System.out.println(list.getText()+" id" +list.getAttribute("id"));
	
	   }
	   
		
		  driver.switchTo().frame("_mN_main_224278574_0_n");
		  driver.findElement(By.xpath("//a[@id='dk2']")).click();
		  driver.switchTo().defaultContent(); WebElement ele=
		  driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
		  driver.switchTo().frame(ele);
		  driver.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay']")).
		  click();
		 
	   
	
		
}
}