package qurate.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DragandDrop implements ISuiteListener,ITestListener  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
	
           driver.get("http://demo.guru99.com/test/drag_drop.html");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           
           WebElement from=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
           WebElement to=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
           
           Actions act=new Actions(driver);
           act.dragAndDrop(from, to).build().perform();
         
           //act.dragAndDrop(from, to).perform();
           
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Started");
		
	}

	public void onFinish(ISuite suite) {
		System.out.println("Ended");
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("TC failure ");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
