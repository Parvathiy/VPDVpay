package com.VpayAdminModules;

import org.openqa.selenium.WebDriver;

import com.Vpay.Locators.VpayEPFLocators;
import com.Vpay.Locators.VpayLoginLocators;

public class EPFModule {
	public static void addEPFName(WebDriver driver) throws InterruptedException
	{
		VpayEPFLocators.expandStatutory(driver).click();
		Thread.sleep(2000);
		VpayEPFLocators.employeeProvidentFund(driver).click();
		Thread.sleep(3000);
		VpayEPFLocators.conFiguration(driver).click();
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000);  
		VpayEPFLocators.selectEPFName(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("15");// EPF Administartion Charges 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		//VpayStatutoryLocators.clcikCancelbutton(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EPF Administration charges created successfully"); //Percentage
	   }
	   public static void ePFCancel(WebDriver driver) throws InterruptedException
	   {
	
	   VpayEPFLocators.expandStatutory(driver).click();
	   Thread.sleep(2000);
	   VpayEPFLocators.employeeProvidentFund(driver).click();
	   Thread.sleep(3000);
	   VpayEPFLocators.conFiguration(driver).click();
	   VpayEPFLocators.addConfigurationbutton(driver).click();
	   Thread.sleep(5000);  
	   VpayEPFLocators.selectEPFName(driver);
	   VpayEPFLocators.addValue(driver, "Enter value").sendKeys("15");// EPF Administartion Charges 
	   VpayEPFLocators.clickDateFormat(driver).click();
	   Thread.sleep(5000);
	   VpayEPFLocators.selectDate(driver).click();
	   Thread.sleep(5000);
	  // VpayStatutoryLocators.clcikCancelbutton(driver).click();
	   System.out.println(" Select EPFName Canceld Successfully");
	  }
	 public static void EpfEditRecordMe(WebDriver driver) throws InterruptedException
			{
		 VpayEPFLocators.rightClickEdit(driver, "Edit Exist Record");
	     VpayEPFLocators.editRecord(driver).click();
	     VpayEPFLocators.addValue(driver, "Enter value").clear();
	     VpayEPFLocators.addValue(driver, "Enter value").sendKeys("15");
		 VpayEPFLocators.clickDateFormat(driver).click();
		 Thread.sleep(5000);
		 VpayEPFLocators.selectDate(driver).click();
		 Thread.sleep(5000);
		 VpayEPFLocators.clickSave(driver).click();
		 Thread.sleep(5000);
		 VpayEPFLocators.clcikRefreshbutton(driver).click();
		 System.out.println(" Record edit Successfully");
			}
		
		public static void EpfAdditionalName(WebDriver driver) throws InterruptedException
		{
			
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000);  
		VpayEPFLocators.selectEPFAddtional(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("12"); 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikCancelbutton(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("Additional voluntary PF contribution maximum by the Employee created Successfully");
		}
		
		public static void EpfEPSName(WebDriver driver) throws InterruptedException
		{
	
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFEPS(driver);//Pending exe
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("12");
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikCancelbutton(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EPS contribution by Employer created Successfully");
		}
		public static void epfEPSSalaryName(WebDriver driver) throws InterruptedException
		{
		//
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFSalary(driver); // amount
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("9500");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EPS salary statutory limit Created Successfully");
		}
		
		public static void EDLIStatutoryNameName(WebDriver driver) throws InterruptedException
		{
			
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFEDLI(driver); // Amount
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("9000");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EDLI statutory limit Created Successfully");
		}
		
		public static void ePFContriEmployeeName(WebDriver driver) throws InterruptedException
		{
		
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFContri(driver); 
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("12");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EPF contribution by Employee limit Created Successfully"); //Percentage
		}
		
		public static void epfPFMonthlyName(WebDriver driver) throws InterruptedException
		{
		//
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFMonthly(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("2000");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("PF Monthly Basic Salary Statutory Limit for Regular Employee Created Successfully");
		}
		
		public static void ePFEDLIContriEmployerName(WebDriver driver) throws InterruptedException
		{
		
		
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFEDLIContri(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("12");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EDLI contribution by Employer Created successfully");
		}
		public static void epfEDLIInspectionName(WebDriver driver) throws InterruptedException
		{
			
		//
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFEDLIInspection(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("12");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println("EPF EDLI Inspection Charges Created Successfully");
		}
		public static void epfContriEmployerName(WebDriver driver) throws InterruptedException
		{
			
		//
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFEmployer(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("12");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println(" EPF contribution by employer Created Successfully");
		}
		public static void epFPFMonthlyDisabled(WebDriver driver) throws InterruptedException
		{
			
		VpayEPFLocators.addConfigurationbutton(driver).click();
		Thread.sleep(5000); 
		VpayEPFLocators.selectEPFMonthlyDisabled(driver);
		VpayEPFLocators.addValue(driver, "Enter value").sendKeys("1200");// 
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
		System.out.println(" PF Monthly Basic Salary Statutory limit for Disabled Employee Created Successfully");
		}
		
		//Edit
		public static void epfEdit(WebDriver driver) throws InterruptedException
		{
	
       VpayEPFLocators.rightClickEdit(driver, "Edit Exist Record");
        VpayEPFLocators.editRecord(driver).click();
        VpayEPFLocators.addValue(driver, "Enter value").clear();
        VpayEPFLocators.addValue(driver, "Enter value").sendKeys("15");
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.selectDate(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickSave(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clcikRefreshbutton(driver).click();
	    System.out.println(" Record edit Successfully");
       
		}	
}
		//Pivot column
		/*public static void pivotClumn(WebDriver driver) throws InterruptedException
		{
	
        VpayEPFLocators.clickPovitTable(driver).click();
        VpayEPFLocators.checkFilter(driver).click();
        VpayEPFLocators.unCheckFilter(driver).click();
		VpayEPFLocators.clickDateFormat(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.checkStates(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.checkStates1(driver).click();
		Thread.sleep(5000);
		VpayEPFLocators.clickValuetab(driver).click();
	    VpayEPFLocators.clickOnValue(driver, null).click();
	    Thread.sleep(3000);
	    VpayEPFLocators.clickOnValue(driver, "Enter value").clear();
        VpayEPFLocators.addValue(driver, "Enter value").sendKeys("15");
		}
       
		
	}*/


