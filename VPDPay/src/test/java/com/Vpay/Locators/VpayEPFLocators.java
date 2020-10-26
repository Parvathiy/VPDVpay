package com.Vpay.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.ExpectedExceptionsHolder;

public class VpayEPFLocators {
	
	public static WebElement expandStatutory(WebDriver driver)
	{
		WebElement expandStatutory = driver.findElement(By.xpath("//span[contains(text(),'Statutory')]"));
		return expandStatutory;
	}
	public static WebElement employeeProvidentFund(WebDriver driver)
	{
		WebElement employeeProvidentFund = driver.findElement(By.xpath("//span[contains(text(),'Employee Provident Fund')]"));
		return employeeProvidentFund;
	}

	public static WebElement conFiguration(WebDriver driver)
	{
		WebElement conFiguration = driver.findElement(By.xpath("//div[contains(text(),'Configuration')]"));
		return conFiguration;
	}
	public static WebElement addConfigurationbutton(WebDriver driver)
	{
		WebElement addConfigurationbutton = driver.findElement(By.xpath("//i[@class='lni-plus']"));
		return addConfigurationbutton;	
		
	}
	public static void selectEPFName(WebDriver driver)
	{
	Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	drpEPF.selectByIndex(1);
	}
	public static WebElement addValue(WebDriver driver, String FieldName)
	{
		WebElement addValue = driver.findElement(By.xpath("//input[@placeholder='Enter Value']"));
		return addValue;
	}	
	public static WebElement clickDateFormat (WebDriver driver)
	{
		WebElement clickDateFormat = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//*[local-name()='svg']"));
		return clickDateFormat;
	}
	public static WebElement selectDate(WebDriver driver)
	{
		WebElement selectDate = driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']"));
		return selectDate;
	
	}
	public static WebElement clickSave(WebDriver driver)
	{
		WebElement clickSave = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		return clickSave;
		
	}
	public static WebElement clcikCancelbutton(WebDriver driver)
	{
		WebElement cancelButton = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[5]/button[1]"));
		return cancelButton;
	}
	public static WebElement clcikRefreshbutton(WebDriver driver)
	{
		WebElement refreshButton = driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
		return refreshButton;
	}
	//..2.----Create "Additional voluntary PF contribution maximum by the Employee" in percentage File------ under STATUTORY
	
	public static void selectEPFAddtional(WebDriver driver)
	{   
	Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	drpEPF.selectByIndex(2);
	}
	
	////..3.----Create "EPS contribution by Employer" in percentage File------ under STATUTORY
	
	public static void selectEPFEPS(WebDriver driver)
	{   
	Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	drpEPF.selectByIndex(3);
	}
   //4---Create EPF for EPS salary statutory limit-----
    public static void selectEPFSalary(WebDriver driver)
   {   
    Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
    drpEPF.selectByIndex(4);
  }

  //5---Create EDLI statutory limit limit-----
   public static void selectEPFEDLI(WebDriver driver)
  {   
   Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
   drpEPF.selectByIndex(5);
  }

  //6---Create EPF contribution by Employer limit-----
   public static void selectEPFContri(WebDriver driver)
   {   
    Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
    drpEPF.selectByIndex(6);
    }
//---7-- Add PF Monthly Basic Salary Statutory Limit for Regular Employee
    public static void selectEPFMonthly(WebDriver driver)
    {   
       Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
       drpEPF.selectByIndex(7);
     }
	//---8. EDLI contribution by Employer
	 public static void selectEPFEDLIContri(WebDriver driver)
	   {   
	    Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	    drpEPF.selectByIndex(8);
	   }   
      //--9-- EPF EDLI Inspection Charges---
	public static void selectEPFEDLIInspection(WebDriver driver)
	   {   
	    Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	    drpEPF.selectByIndex(9);
	   }   
     //--10-- Add EPF contribution by employer---
    public static void selectEPFEmployer(WebDriver driver)
{   
 Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
 drpEPF.selectByIndex(10);
}
//11---
    public static void selectEPFMonthlyDisabled(WebDriver driver)
    {   
     Select drpEPF = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/select[1]")));
     drpEPF.selectByIndex(11);
    }
    //Edit with existing record
    //Right click
    public static void rightClickEdit(WebDriver driver,String FieldName)
    {
    Actions actions = new Actions(driver);
    WebElement elementLocator= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-epf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-epf-config[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
    actions.contextClick(elementLocator).perform();
    }
    public static WebElement editRecord(WebDriver driver)
	{
		WebElement editExistRecord = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
		return editExistRecord;
	}
}
//pivot mode filter ---------------------------------------FOR PIVOT MODE 
   /*   public static WebElement clickPovitTable(WebDriver driver)
      { 
	//Click Table Column
    	  WebElement clickPovitTable = driver.findElement(By.xpath("")); //Pending Xpath
  		    return clickPovitTable;
      }
   
      public static WebElement checkFilter(WebDriver driver) {
		//Check and 
    	  WebElement checkFilter = driver.findElement(By.xpath(""));
  		return checkFilter;
       }
      //Uncheck States
      public static WebElement unCheckFilter(WebDriver driver)
      {
    	  WebElement unCheckFilter= driver.findElement(By.xpath(""));
    	  return unCheckFilter;
		
      }
    //Check States
 public static WebElement checkStates(WebDriver driver) {
	 WebElement checkState = driver.findElement(By.xpath(""));
	 return checkState;
 }
    
 public static WebElement checkStates1(WebDriver driver)
{
	 WebElement checkState1 = driver.findElement(By.xpath(""));
	 return checkState1;
		
}
 //Enter value for Employee Contribution 
 public static WebElement clickValuetab(WebDriver driver) {
	 WebElement valuetab = driver.findElement(By.xpath("")); //Old values is open sendKeys("50.0");
	 return valuetab;
 }
 
 public static WebElement openValuetab(WebDriver driver) {
	 WebElement valuetab = driver.findElement(By.xpath("")); //Old values is open 
	 return valuetab;
 }
 //Click on Old value
 public static WebElement clickOnValue1(WebDriver driver, String FiledName) {
	 WebElement valuetab = driver.findElement(By.xpath("")); //Click on Value click();
	 return valuetab;
 }
//Clear old value
public static WebElement clearOldValue(WebDriver driver) {
	 WebElement valuetab = driver.findElement(By.xpath("")); //Clear old value clear();
	 return valuetab;
}
	// Edit new value
public static WebElement editNewValue(WebDriver driver) {
	 WebElement editNewValue = driver.findElement(By.xpath("")); //Clear old value clear();sendKeys("50.0");
	 return editNewValue;
}
public static WebElement clickSave1(WebDriver driver) {
	 WebElement clickSave = driver.findElement(By.xpath("")); //click on Save
	 return clickSave;
}
public static WebElement clickOnValue(WebDriver driver, String filedName) {
	// TODO Auto-generated method stub
	return null;
}
		
}*/




