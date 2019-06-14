package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenShotTest {
	static WebDriver driver;
	
	@Test
	public static void failed()
	{
		
		
		try {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("./Screenshot/facebook.png"));
		} 
		 catch (Exception e) {
			System.out.println("Exception while taking screen shot "  +e.getMessage());
		}
	}

}
