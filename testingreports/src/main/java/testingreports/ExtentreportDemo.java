package testingreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportDemo {

	@BeforeMethod
	public void setup()
	{
		//System.out.println("login");
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/example.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test=extent.createTest("LoginTest");
	
	
	

		
		
		test.log(Status.INFO, "google");
		test.log(Status.PASS, "title verified");
		test.log(Status.FAIL, "google");
		extent.flush();
		 
		WebDriver  driver=new ChromeDriver();
			driver.get("http://www.google.com");
			System.out.println("title is "+driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("rashmi"));
			driver.quit();
		
	}
	
}
