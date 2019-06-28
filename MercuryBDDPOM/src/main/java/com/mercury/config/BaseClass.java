package com.mercury.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	static FileInputStream fis;
	static Properties config ;
	static WebDriver driver;
	
	
	public BaseClass()
	{
		config=new Properties();
	try {
		fis = new FileInputStream("./Configuration\\Config.properties");
		config.load(fis);
		
	} catch (FileNotFoundException e) {
		System.out.println("file not found "  +e.getMessage());
	
	} catch (IOException e) {
		System.out.println("Input is incorrect "  +e.getMessage());				
	}	}
	
	public static WebDriver intialization()
	{
		String browsername=config.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{ System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();	}
		else if (config.getProperty("browser").equalsIgnoreCase("firefox"))
		{
	      System.setProperty("webdriver.gecko.driver", "C:\\WorkSpace\\Drivers\\geckodriver.exe");
	       driver=new FirefoxDriver();}
		else  if(config.getProperty("browser").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\WorkSpace\\Drivers\\IEDriverServer64.exe");
			 driver=new InternetExplorerDriver();}
		 driver.manage().window().maximize();
		 driver.get(config.getProperty("url"));
		 
		 return driver;
		
	}
	public static String readProperty(String key){
		return config.getProperty(key);
	}
public static void Close()
{
	driver.quit();	
	
}

		
}