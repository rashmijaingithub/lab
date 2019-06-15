package Selenium;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TWM_Validate_selection_Payment_type {
	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("http://qa.totalwine.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			//Thread.sleep(8000);
			driver.findElement(By.xpath("//button[@id='btnYes']")).click();
			driver.navigate().refresh();
			driver.findElement(By.xpath("//input[@id='header-search-text']")).sendKeys("chardonnay");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[@class='search-right-cont-mini-search-logo analyticsSearch']")).click();
			driver.findElement(By.xpath("(//a[@class='analyticsProductName'])[1]")).click();
			driver.findElement(By.xpath("(//button[text()='	Add to cart'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='cart-popup']")).click();
			checkCreditcardtype(driver);
		}


		private static void checkCreditcardtype(WebDriver driver) {
			String Estimate_total=driver.findElement(By.xpath("//span[@id='estimTotal']")).getText().trim();
			System.out.println(Estimate_total);	
			Float F_Estimate_total=Float.parseFloat(Estimate_total);
			System.out.println("Estimated value "   +F_Estimate_total );
			BigDecimal total_bd = new BigDecimal(F_Estimate_total - Math.floor(F_Estimate_total));	
			total_bd = total_bd.setScale(2, RoundingMode.HALF_DOWN);
			System.out.println("Decimal value " +total_bd);
			String Value=total_bd.toString();
			String expeced_value= Value.substring(Value.indexOf('.') + 1) + "";
			String Decimal_value=expeced_value.substring(0, 2);
			int decimal=Integer.valueOf(Decimal_value);
			System.out.println(decimal);
			
			int[] VISA = {0,8,11,16,17,18,20,22,24,26,27,29,31,32,34,35,36,37,38,39,40,44,45,46,47,48,49,50,56,59,60,64,66,67,69,70,72,79,85};
			List<int[]> visa_List = Arrays.asList(VISA);
						
				if (visa_List.contains(decimal))
				{
					Card_type();
					
				}
				else {
					update_qty();	
			}
		}
			

			//update qty
	public static void update_qty()
	{
		String str_qty =driver.findElement(By.xpath("//input[@id='quantity0']")).getAttribute("value");
			
			//System.out.println("QTY is " +str_qty);			
		     int i_qty=Integer.parseInt(str_qty);
			 System.out.println("Current Qty is "  +i_qty);
			 int New_qty=i_qty+1;
			 driver.findElement(By.xpath(".//*[@id='qty'][@name='qty']")).clear();
			 driver.findElement(By.xpath(".//*[@id='qty'][@name='qty']")).sendKeys(New_qty+"");
			 String Estimate_total=driver.findElement(By.xpath("//span[@id='estimTotal']")).getText().trim();
			 checkCreditcardtype(driver);
		}
	
	public static void Card_type()
	{
		String card="4124939999999990";	
		driver.findElement(By.xpath("//button[@class='btn btn-red posRelative anCheckout chkout-btn']")).click();
		System.out.println("Click checkout");
	}

			
			
		

		
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		//Checkout	
		/*	driver.findElement(By.xpath("//button[@id='checkout']")).click();
			driver.findElement(By.xpath("//button[text()='Continue']")).click();*/
			
			
			
			
			
			
			
			
			
	}
	
	

