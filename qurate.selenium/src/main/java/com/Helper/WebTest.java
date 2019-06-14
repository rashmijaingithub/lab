package com.Helper;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class WebTest {
                public static WebDriver driver;

                @BeforeMethod
                public WebDriver setup() {
                                Properties Config = new Properties();
                                FileInputStream fis = null;
                                try {
                                                fis = new FileInputStream("D:\\NewWorkspace\\qurate.selenium\\Config.properties");                                
                                                Config.load(fis);
                                } catch (Exception e) {e.printStackTrace();}
                                
                                if(Config.getProperty("browser").equalsIgnoreCase("chrome")) {
                                               System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
                                                driver = new ChromeDriver();     
                                                driver.manage().window().maximize();
                                                driver.get(Config.getProperty("url"));
                                }else if(Config.getProperty("browser").equalsIgnoreCase("firefox")) {
                                                System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
                                                driver = new FirefoxDriver();
                                                driver.get(Config.getProperty("url"));
                                }
                                return driver;
                }

                @AfterMethod
                public void cleanup()  {
                                driver.quit();
                           
                                
                }

}
