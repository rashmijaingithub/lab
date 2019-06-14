package qurate.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {
 static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS)
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("total number of windows "  +count);
		for(String child :allwindows )
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("child window title "  +driver.getTitle());
				//Thread.sleep(5000);
				driver.close();
			}
		}
			driver.switchTo().window(parent);
			System.out.println("Parent window title "  +driver.getTitle());
			driver.quit();
		}

}
