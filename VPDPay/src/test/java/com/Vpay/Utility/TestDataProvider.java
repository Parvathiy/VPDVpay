package com.Vpay.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestDataProvider {
	
	static XSSFWorkbook workbook;
	static FileInputStream file;	
	static XSSFSheet sheet;
	public static Object[][] excelReader(String Execlfilepath, String sheetName) throws Exception{
		System.out.println(Execlfilepath);
		System.out.println(sheetName);
		try {
			 file = new FileInputStream(new File(Execlfilepath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
		 workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("before sheet reader");
		sheet =workbook.getSheet(sheetName);
		System.out.println(sheet);
		System.out.println(sheet.getRow(0).getLastCellNum());
		System.out.println("row Count: "+ sheet.getLastRowNum());
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++){
			System.out.println("inside outerloop");
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
				System.out.println("inside inner loop");
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		return data;
	}
	
public static void main(String[] args) throws Exception {
	TestDataProvider.excelReader("C:\\Users\\A8IN\\eclipse-workspace\\VPDPay\\src\\TestData\\Data.xlsx", "Sheet1");
}
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

public String getStringData(String string, int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
}
	


