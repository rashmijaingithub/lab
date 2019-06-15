package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isselected {

	public static void main(String[] args) {
		
	WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		boolean bvalue=false;
		
		List Rb_sex= (List) driver.findElement(By.name("sex"));
		

	}

}
