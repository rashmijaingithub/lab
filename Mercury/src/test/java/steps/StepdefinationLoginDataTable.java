package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class StepdefinationLoginDataTable {
	/*
	 * WebDriver driver;
	 * 
	 * @Given("user loads application") public void user_loads_application() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\WorkSpace\\Drivers\\chromedriver.exe");
	 * //WebDriverManager.chromedriver().setup();
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * driver.get("http://newtours.demoaut.com");
	 * driver.manage().window().maximize();
	 * 
	 * 
	 * }
	 * 
	 * 
	 * //hooks //class in which hook is declared can't be extended. //@before @after
	 * will run after each and every scenario
	 * //@Before("@smoke")@after("tagname")--will run for the scenrio in which
	 * tagname is specified/ //@before(order =1 ),@before(order=10),@after(order=10)
	 * 
	 * @When("enter username and password") public void enter_and(DataTable
	 * credentials) {
	 * 
	 * List<String> data=credentials.row(0);
	 * 
	 * driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(data.get(0
	 * ));
	 * 
	 * 
	 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(1
	 * ));
	 * 
	 * 
	 * driver.findElement(By.xpath("//input[@name='login']")).click(); }
	 * 
	 * @Then("User should be logged in") public void user_should_be_logged_in() {
	 * Assert.assertTrue(true); driver.quit();
	 * 
	 * }
	 */
}