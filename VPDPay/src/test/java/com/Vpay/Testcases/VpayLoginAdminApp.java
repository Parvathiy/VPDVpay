package com.Vpay.Testcases;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.Vpay.Utility.BaseClass;
import com.Vpay.Utility.ExcelDataProvider;
import com.Vpay.Utility.TestDataProvider;
import com.VpayAdminModules.LoginAdminModule;
import com.aventstack.extentreports.ExtentTest;



public class VpayLoginAdminApp extends BaseClass {
	
	

	@Test
	public static void loginaApp() throws Exception{
      
		logger= report.createTest("Login Vpay Application");
		ExcelDataProvider excel= new ExcelDataProvider();
	ExcelDataProvider.setExcelFile("Login");
	setUp(ExcelDataProvider.getCellData(1,0), ExcelDataProvider.getCellData(1,1));
	logger.pass("Login Sucess");
}

	
}
	
	
	
	
	
	
	
	
	
//---- Run The Test Case using Excel 
	
	
	/*@Test
	public static void loginaApp() throws Exception
	{
		ExcelDataProvider excel= new ExcelDataProvider();
		ExcelDataProvider.setExcelFile("Login");
		setUp(ExcelDataProvider.getCellData(1,0), ExcelDataProvider.getCellData(1,1));
	}*/

	
	
	
//----- Run The test cases Without Excel and using Module wise

//public void Adminloginapp() throws InterruptedException
//{
//	Thread.sleep(5000);
//	LoginAdminModule.adminlogin(driver);
//	return;
//	
//	//VpayLoginLocators vpayLoginLocators = new VpayLoginLocators();
//	//vpayLoginLocators.LogIn();
//	
//	
//		
//	}
	





	
	


