package steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.banking.helper.BaseClass;
import com.banking.pages.HomePage;
import com.banking.pages.LoginPage;
import com.banking.pages.TransferFunds;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps  extends BaseClass {

	

	@Given("user loadsApplication")
	public void user_loadsApplication() 
	{
		driver=BaseClass.intialization();	
	}	
	
	 @When("User enter valid {string} and {string}")
	 public void user_enter_valid_username_and_password(String un, String pw) throws InterruptedException {
		 LoginPage login=new LoginPage(driver);
	login.logintoApp(un, pw);
	    
	 }
	 @Then("Logoff from the System")
	 public void logoff_from_the_System() throws InterruptedException {
		 HomePage Hp=new HomePage(driver);
		 Hp.Signoff();
		 Hp.clickLogin();
	 }
	
	  @Then("Verify AltoroMutual logo image is displayed in top left") 
	  public void verify_AltoroMutual_logo_image_is_displayed_in_top_left() throws
	  InterruptedException { LoginPage login=new LoginPage(driver);
	  LoginPage.logoValidation(); }
	  
	  @Then("Verify that following four tabs are displayed at the top") public void
	  verify_that_following_four_tabs_are_displayed_at_the_top(io.cucumber.
	  datatable.DataTable dataTable) { LoginPage login=new LoginPage(driver);
	  List<String> tabs=dataTable.asList(String.class); login.listoftabs(tabs); }
	 
	 
	

	 @Then("Validate the message {string}")
	 public void validate_the_message(String msg) throws InterruptedException {
		 LoginPage login=new LoginPage(driver);
		 LoginPage.validateMessage(msg);
	 }
	
	  
	  @After
		 public void tearDown()
		 	 {
		 		 driver.quit();
		 	 }
	  
	  }
