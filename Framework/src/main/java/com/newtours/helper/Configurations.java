package com.newtours.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configurations {
	
	public static WebDriver driver;

	static FileInputStream fis;
	Properties config=new Properties();
	@BeforeMethod
	public  WebDriver setup()
	{
		Properties config=new Properties();
		
		
			try {
				fis = new FileInputStream("./Configuration\\Config.properties");
				config.load(fis);
				
			} catch (FileNotFoundException e) {
				System.out.println("file not found "  +e.getMessage());
			
			} catch (IOException e) {
				System.out.println("Input is incorrect "  +e.getMessage());
				
			}	
		
		//System.out.println(config.getProperty("browser"));
		if(config.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get(config.getProperty("url"));
			 driver.manage().window().maximize();
		}else if (config.getProperty("browser").equalsIgnoreCase("firefox"))
				{
			 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get(config.getProperty("url"));
			 driver.manage().window().maximize();
				}
		else  if(config.getProperty("browser").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Drivers\\IEDriverServer64.exe");
			 driver=new InternetExplorerDriver();
			 driver.get(config.getProperty("url"));
			 driver.manage().window().maximize();
		}
	
		return driver;
		
		
		
		
	}
	
	public String username()
	{
		String username=config.getProperty("username");
		return username;
		
	}
	
	public String password()
	{
		String password=config.getProperty("password");
		return password;
		
	}
	
	
	  @AfterMethod 
	  public void cleanUp() { driver.quit(); }
	 
	
}
