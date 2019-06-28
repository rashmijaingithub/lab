package steps;

import org.openqa.selenium.WebDriver;

import com.banking.helper.BaseClass;
import com.banking.pages.HomePage;
import com.banking.pages.LoginPage;
import com.banking.pages.TransferFunds;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends BaseClass {
		  
	 
	  @Then("Select bank account in View Account Details dropdown and click on GO button") 
	  public void select_bank_account_in_View_Account_Details_dropdown_and_click_on_GO_button() throws InterruptedException
	  { HomePage Hpage=new HomePage(driver); 
	  Thread.sleep(3000);
	     Hpage.clickonGo(); }
	  
	  @Then("Verify Account Information page is displayed") 
	  public void verify_Account_Information_page_is_displayed() 
	  { HomePage Hpage=new
	   HomePage(driver); Hpage.acctHistorypage(); }
	
	  @Then("Account number displayed in heading Account History acct number is same as bank account selected in above") 
	  public void account_number_displayed_in_heading_Account_History_acct_number_is_same_as_bank_account_selected_in_above() 
	  { HomePage Hpage=new HomePage(driver); Hpage.acctpageValidation(); }
	  
	  @Then("Verify that current date is displayed in Balance Detail table \\(Ending balance as of <Date>)"
	  ) public void
	  verify_that_current_date_is_displayed_in_Balance_Detail_table_Ending_balance_as_of_Date
	  () { HomePage Hpage=new HomePage(driver); Hpage.datevalidation(); }
	  
	
	  
	  @After
		 public void tearDown()
		 	 {
		 		 driver.quit();
		 	 }
	  
	 
}
