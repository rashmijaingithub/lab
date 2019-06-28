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

public class FundTransferPageSteps extends BaseClass  {
	
  
	  @Then("Click on Transfer Funds link in left hand navigation section") 
	  public void click_on_Transfer_Funds_link_in_left_hand_navigation_section() {
	  TransferFunds TF=new TransferFunds(driver); TF.clickonfundtransfer(); 
	  }
	  
	  @Then("Verify that Transfer Funds page is displayed") 
	  public void verify_that_Transfer_Funds_page_is_displayed() throws InterruptedException {
	  TransferFunds TF=new TransferFunds(driver); Thread.sleep(4000);
	  TF.TransferFundsText(); }
	 	
	  @Then("Select From Account, To Account and {int} to Transfer and click on Transfer Money button")
	  public void select_From_Account_To_Account_and_to_Transfer_and_click_on_Transfer_Money_button(int amt) throws InterruptedException 
	  {
		  TransferFunds TF=new TransferFunds(driver);
			TF.amounttransfer(amt); 
	  }
	  
	  
	  @Then("Verify that a message is displayed with correct amount and from\\/to account details") 
	  public void verify_that_a_message_is_displayed_with_correct_amount_and_from_to_account_details() 
	  { TransferFunds TF=new TransferFunds(driver);
	  TF.verifyfundsucessMessage(); }
	  
	  
	  @After
		 public void tearDown()
		 	 {
		 		 driver.quit();
		 	 }
	  
}
