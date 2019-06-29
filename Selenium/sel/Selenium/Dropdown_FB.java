package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_FB {


	///public static void main (String[]arg) throws InterruptedException
	@Test
	public void dropdown() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\Drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	WebElement month_dd=driver.findElement(By.id("month"));
	Select sel1=new Select(month_dd);
	WebElement selected_value= sel1.getFirstSelectedOption();
	System.out.println("Selected value before selecting " +selected_value.getText());
	Thread.sleep(3000);
	sel1.selectByIndex(3);
	Thread.sleep(3000);
	sel1.selectByValue("6");
	Thread.sleep(3000);
	//sel1.deselectByIndex(6);
    sel1.selectByVisibleText("Oct");
	WebElement selected_value1= sel1.getFirstSelectedOption();
	
	System.out.println("Selected value after selecting  " +selected_value1.getText());
	
	List<WebElement>month_list=sel1.getOptions();
	
	int total_month=month_list.size();
	System.out.println("total month " +total_month);
	
	for(WebElement ele:month_list)
	{
		String month_name=ele.getText();
		//System.out.println("Months are==== " +month_name);
		if(month_name.equalsIgnoreCase("Aug")|month_name.equalsIgnoreCase("Oct")| month_name.equalsIgnoreCase("ddd") )
		{
			System.out.println("aug/Oct exists");
		}
		
	}
	driver.quit();
		
	}
	

}
