package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static XSSFWorkbook wb;
	XSSFSheet sheet1;
	public static void main(String[] args) throws IOException {
		ExcelReader excelReader = new ExcelReader();
		excelReader.getFile();
		readWB();
	}
	@SuppressWarnings("deprecation")
	private static void readWB() {
		wb.getNumberOfSheets();
		
		//for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            XSSFSheet sheet = wb.getSheetAt(0);
            for (Row myrow : sheet) {
            	if(myrow.getRowNum()==0){
         		   continue; //just skip the rows if row number is 0 or 1
         		  }
                for (Cell mycell : myrow) {
                	System.out.println("rows : "+mycell.getRowIndex());
                    switch (mycell.getCellType()) { 
                    case Cell.CELL_TYPE_NUMERIC: 
                        //System.out.println(mycell.getNumericCellValue()); 
                        break; 
                    case Cell.CELL_TYPE_STRING: 
                    	String prodCode = mycell.getStringCellValue();
                        findProdDetailsInOtherSheet(prodCode); 
                        //break; 
                    }
                    
                }
            }}
            
       // }
		
	
	private static void findProdDetailsInOtherSheet(String prodCode) {
		System.out.println("loop test");
		for (int i = 1; i < wb.getNumberOfSheets(); i++) {
        XSSFSheet sheet = wb.getSheetAt(i);
        for (Row myrow : sheet) {
        	boolean prodFound = false;
        	if(myrow.getRowNum()==0){
     		   continue; //just skip the rows if row number is 0 or 1
     		  }
            for (Cell mycell : myrow) {
                switch (mycell.getCellType()) { 
                case Cell.CELL_TYPE_NUMERIC: 
                    System.out.println(mycell.getNumericCellValue()); 
                    break; 
                case Cell.CELL_TYPE_STRING: 
                	String productCode = mycell.getStringCellValue();
                    if (prodCode.equalsIgnoreCase(productCode)) {
                    	prodFound = true;
                    }
                    System.out.println(productCode);
                    break; 
                }
                
            }
           if (prodFound) {
        	   break;
           }
        }
        
   }
		
	}
	private  void getFile() throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("Book1.xlsx").getFile());
		System.out.println(file.getPath());
		FileInputStream fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
	}

}
