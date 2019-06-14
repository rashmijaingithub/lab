package com.Helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("./TestData/TestData.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		System.out.println("Search" + sh.getRow(0).getCell(0).getStringCellValue());
		wb.close();
		fis.close();

		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Search']")).
		 * sendKeys("I am searching"); WebElement we =
		 * driver.findElement(By.xpath("(//*[@value='Google Search'])[1]"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click()", we);
		 */
	}

}
