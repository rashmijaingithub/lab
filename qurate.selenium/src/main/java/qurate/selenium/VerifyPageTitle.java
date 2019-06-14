package qurate.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;*/

public class VerifyPageTitle {
	
	WebDriver driver;
	@Test
	public void pagetitle()
	{
		/*
		 * ExtentReports reports= ExtentReports.get(VerifyPageTitle.class);
		 * reports.init("./ExtendReports\\advanceReport.html", true);
		 * reports.startTest("Verify Page title"); driver=new ChromeDriver();
		 * 
		 * driver.get("https://www.google.com/"); reports.log(LogStatus.INFO,
		 * "Application started"); String title=driver.getTitle();
		 * System.out.println(title); reports.log(LogStatus.INFO, "Title captured");
		 * Assert.assertTrue(title.contains("Google")); reports.log(LogStatus.PASS,
		 * "Title verified ");
		 * reports.attachScreenshot("C:\\Users\\ranant\\Downloads\\TestCase02.png");
		 * reports.endTest();
		 */
	}

}
