package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinks {
@Test
	public  void verifybrokenlink()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.totalwine.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links " +links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			VerifyLinkActive(url);
		}}
	
	public void VerifyLinkActive(String linksurl)
	{
		try {
			URL url=new URL(linksurl);
			HttpURLConnection httpsconnection=(HttpURLConnection)url.openConnection();
			httpsconnection.setConnectTimeout(3000);
			httpsconnection.connect();
			if(httpsconnection.getResponseCode()==200)
			{
				System.out.println(linksurl+" "+httpsconnection.getResponseMessage());
			}
			
			Assert.assertTrue(httpsconnection.getResponseCode()==200);
			System.out.println("Test case pass");
			
			if(httpsconnection.getResponseCode()==httpsconnection.HTTP_NOT_FOUND)
			{
				System.out.println(linksurl+" "+httpsconnection.getResponseMessage()+" "+httpsconnection.HTTP_NOT_FOUND);
			}
		    Assert.assertTrue(httpsconnection.getResponseCode()==httpsconnection.HTTP_NOT_FOUND);
			System.out.println("Test case fail");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
		
}
