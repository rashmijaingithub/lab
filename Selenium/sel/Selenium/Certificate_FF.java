package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Certificate_FF {
	@Test
	public void certificate_ff()
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new FirefoxDriver(cap);
		//WebDriver driver =new ChromeDriver(cap);
		driver.get("https://www.cacert.org/");
	}

}
