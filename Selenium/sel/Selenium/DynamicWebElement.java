package Selenium;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicWebElement {

	public static void main(String[] args) throws ParseException {
		double r=0;
		double m=0;
   WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	
		//Coln
		
	List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("size of the col "  +col.size());
		//rows
		List<WebElement> row=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("no of rows "   +row.size());
		
		//to find 3rd row of table
		String tablerow=driver.findElement(By.xpath("(//div[@id='leftcontainer']/table/tbody/tr)[3]")).getText();
		System.out.println("3rd row text row  "  +tablerow);
		
		//to find 2nd table cell		
		String cellneed=driver.findElement(By.xpath("((//div[@id='leftcontainer']/table/tbody/tr)[3]/td)[2]")).getText();
		System.out.println("cell needed "  +cellneed);	
		
		//to get Max value from table 
		for(int i=1;i<row.size();i++)
		{
			String max=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
			NumberFormat f=NumberFormat.getNumberInstance();
			Number num=f.parse(max);
			max=num.toString();
			m=Double.parseDouble(max);
			//System.out.println("value of m " +m);		
			  if(m>r) {
				  r=m;
			  }}
			  System.out.println("max cell size "  +r);
			  
		
			driver.close();
		}}
		
		
		


