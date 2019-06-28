package steps;

import org.openqa.selenium.WebDriver;
import com.mercury.config.BaseClass;

import com.mercury.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass
{

	  WebDriver driver;
	 
	  @Given("user loads application") 
	  public void user_loads_application() {
		
		  LoginPage login=new LoginPage(driver);
	
		  driver=BaseClass.intialization();
		 login.loginPageTitle(driver);
		  
	  }
	  	 
	 	  @When("user enters username and password") 
	  public void enter_and_password() { 
	 		  
	 		 LoginPage login=new LoginPage(driver);
	
	 		 login.setUsername();
	 		 login.setPassword();
	 		 login.clickSignIn();
	  }
	  
	  @Then("user login to the application") 
	  public void user_should_be_logged_in() throws InterruptedException {
			 LoginPage login=new LoginPage(driver);
			 login.loginSuccessValidation(driver);
	  
	  }
	  @Then("user clases the Application")
	  public void user_clases_the_Application() {
		  BaseClass.Close();
		  
	  }
	
	



}
