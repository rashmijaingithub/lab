package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TaggedHooks {
	
	
	  WebDriver driver;
	  //Global hooks
	  @Before 
	  public void setUp() {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\WorkSpace\\Drivers\\chromedriver.exe");
		 * //WebDriverManager.chromedriver().setup();
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.get("http://newtours.demoaut.com");
		 * driver.manage().window().maximize();
		 */
		  
		  System.out.println("setup");
	
	  
	  }
	  //@Before("@First")
	  @Given("Before first")
	  public void before_first() {
	    
	  }
	  //@After("@First")
	  @When("After first")
	  public void after_first() {
	     
	  }
	  //@Before("@Second")
	  @Given("Before Second")
	  public void before_Second() {
	      
	  }
	 // @After("@Second")
	  @When("After Second")
	  public void after_Second() 
	  {
	      
	  }
	  
	
	  @After public void tearDown() {
		  //driver.quit();
		  System.out.println("close");
	  
	  }
	 

	 
}