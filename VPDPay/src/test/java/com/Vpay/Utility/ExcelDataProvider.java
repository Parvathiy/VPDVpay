package com.Vpay.Utility;

	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {	
		
		private static XSSFSheet ExcelWSheet;

		private static XSSFWorkbook ExcelWBook;

		private static XSSFCell Cell;

		private static XSSFRow Row;

	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

		public static void setExcelFile(String SheetName) throws Exception {

			try {

				// Open the Excel file

				//FileInputStream ExcelFile = new FileInputStream(com.Vpay.Utility.Constants.Path_TestData + com.Vpay.Utility.Constants.File_Data);
				FileInputStream ExcelFile = new FileInputStream("C:\\Users\\A8IN\\eclipse-workspace\\VPDPay\\src\\TestData\\Data.xlsx");
	// Access the required test data sheet

				ExcelWBook = new XSSFWorkbook(ExcelFile);

				ExcelWSheet = ExcelWBook.getSheet(SheetName);

			} catch (Exception e) {

				throw (e);

			}

		}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

		public static String getCellData(int RowNum, int ColNum) throws Exception {

			try {

				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

				String CellData = Cell.getStringCellValue();

				return CellData;

			} catch (Exception e) {

				return "";

			}

		}

	//This method is to write in the Excel cell, Row num and Col num are the parameters

		public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

			try {

				Row = ExcelWSheet.getRow(RowNum);

				Cell = Row.getCell(ColNum);

				if (Cell == null) {

					Cell = Row.createCell(ColNum);

					Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}

				// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(com.Vpay.Utility.Constants.Path_TestData + com.Vpay.Utility.Constants.File_Data);

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			} catch (Exception e) {

				throw (e);

			}

		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*static XSSFWorkbook wb;
	
	public  ExcelDataProvider()
	{
		File src= new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		}
		
		catch(Exception e) {
			System.out.println("Unable to read Excel File"+e.getMessage());
		}
	}
    public String getStringData(int sheetIndex,int row,int column)
    {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
    	
    }
    
    public String getStringData(String sheetName,int row,int column)
    {
    	return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    	
    }
    public String getNumuricData(String sheetName,int row,int column)
    {
    	return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    	
    }*/
    
    //
   public static String readPropertyFile(String key){
    	String value = null;
   	try{
   	Properties prop = new Properties();          
   	File configFile = new File("Config\\Config.properties");
   	InputStream stream = new FileInputStream(configFile);
   	prop.load(stream);
   	value = prop.getProperty(key);
    	}
    	catch(Exception e){
    	System.out.println(e.toString());
    	return value;
    	}

    	return value;

    	}
    }
	

