package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTC {

	public static void main(String[] args) {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		//ChromeOptions opts = new ChromeOptions();
		//opts.addArguments("–disable-extensions");
		driver = new ChromeDriver(); 

		//WebDriver driver= new ChromeDriver();
		 
		String url="http://www.store.demoqa.com";
		driver.get(url);
		String title=driver.getTitle();
		int titlelength=driver.getTitle().length();
		System.out.println(" Title of the page " +title);
		System.out.println("Title length of the page " +titlelength);
		
		String currenturl=driver.getCurrentUrl();
		
		if(currenturl.equals(url))
		{
			System.out.println("Verifcation is sucess - The correct URL is opened ");}
			
			else
			{
				System.out.println(" Verification is failed- Incorrect URL is opened");
		}
		
		String sourcecode=driver.getPageSource();
		int sourcecodelength=driver.getPageSource().length();
		//System.out.println(" Currentpage " +currenturl);
		System.out.println("source code " +sourcecode);
		System.out.println("Total leanght of the page source " +sourcecodelength);
		driver.close();
		
		//driver.getCurrentUrl();
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.close();
		
	}

}
