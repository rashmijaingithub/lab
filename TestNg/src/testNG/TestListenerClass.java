package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListenerClass extends ScreenShotTest implements ITestListener
	
{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test cases Started "  +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(" Text case sucessfull "   +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" Failed Text case  "   +result.getName());
      failed();
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Skipped Text case  "   +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}


