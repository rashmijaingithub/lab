package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_challenges {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Drivers\\IEDriverServer32.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("rashmi");

	}

}
