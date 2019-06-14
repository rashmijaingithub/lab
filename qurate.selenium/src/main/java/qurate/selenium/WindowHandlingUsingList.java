package qurate.selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingUsingList {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
	
		Set<String>allwindows=driver.getWindowHandles();
		ArrayList<String>tabs= new ArrayList<String>(allwindows);
		driver.switchTo().window(tabs.get(2));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
	System.out.println("title of parent window is "    +driver.getTitle());
driver.quit();
	}

}
