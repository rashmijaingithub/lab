import java.util.Map;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToApplication {
	// static WebDriver driver;
	
/*
	@Then("user login using following info:")
	public void user_login_using_following_info(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		

		 Map<String, String>map=dataTable.asMap(String.class, String.class);
		 for(String key: map.keySet())
				 {
			  //System.out.println("KEY : "  +key+" value:" +map.get(key));
			 
		   
		
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		  
		  
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		  
		  
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		 
	   
	}}

	
	 * @Given("user loads {string}") public void user_loads(String url) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\WorkSpace\\Drivers\\chromedriver.exe"); WebDriver driver=new
	 * ChromeDriver(); driver.get(url); driver.manage().window().maximize();
	 * 
	 * }
	 
	@Given("user loads application")
	public void user_loads_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.get("http://newtours.demoaut.com/");
	   driver.manage().window().maximize();
	}

	@When("enter username and password")
	public void enter_username_and_password() {
		 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		  
		  
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		
		
		  
		  driver.findElement(By.xpath("//input[@name='login']")).click();

					driver.findElement(by.tag)
}

	@Then("User should be logged in")
	
	 * public void user_should_be_logged_in() { Assert.assertEquals();
	 * 
	 * }
	 

}

}
*/
	
	
	@Given("user loads application")
	public void user_loads_application() {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\WorkSpace\\Drivers\\chromedriver.exe");
		WebDriver driver=new
				  ChromeDriver(); driver.get("http://newtours.demoaut.com"); driver.manage().window().maximize();
				 
	
	}

	@When("enter username and password")
	public void enter_username_and_password() {
		Homepage.username_andPassword();
	   
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		Homepage.Validation();
	  
	}

}