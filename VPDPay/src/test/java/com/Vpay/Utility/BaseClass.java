package com.Vpay.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Vpay.Locators.AdminLogInpage;
import com.Vpay.Locators.VpayLoginLocators;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExcelDataProvider excel;
	
	public static WebDriver getDriverInstance() {
		return driver;
	}
	 	
	@BeforeSuite
	public void setUpSuite()
	{
		  excel = new ExcelDataProvider();
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/VPD_"+Helper.getCurrentDateTime()+".html"));
	    report = new ExtentReports();
		report.attachReporter(extent);
	}
	
	@BeforeTest
	public static WebDriver InitilizeBrowser12()
	{
	
	driver=BrowserFactory.startApplication(driver, "Chrome", Constants.URL);
	driver.manage().window().maximize();
	return driver;
	}
	public static void setUp(String p_username, String p_password) throws InterruptedException
	{
		Thread.sleep(5000);
		VpayLoginLocators.SignIn(driver).click();
		Thread.sleep(5000);
		VpayLoginLocators.UserName(driver, "username").sendKeys(p_username);
		Thread.sleep(5000);
		VpayLoginLocators.Password(driver, "password").sendKeys(p_password);
		Thread.sleep(5000);
		VpayLoginLocators.Loginbutton(driver).click();
	}
	
	
	@AfterTest
	public void teardown()
	{
	BrowserFactory.quitBrowser(driver);
	}
	
	
@AfterMethod
public void tearDownMethod(ITestResult result) throws IOException //ITestResult is suppate interface
{
	if (result.getStatus()==ITestResult.FAILURE) 
	{
		
		logger.fail("Test Failed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	
	{
		logger.pass("Test passed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());

	}
	
	report.flush();
	}
}










//---Catpure screen shots

	/*@AfterMethod
	public void getResult(ITestResult result) throws Exception{
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver).build());
			
		}
		else if(result.getStatus() == ITestResult.SUCCESS) 
		{
			logger.fail("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver).build());
		}
		report.flush();
	}
}
	
	
	
	
	
}
	

	//------------Create Base Class Using Excel format--------------

	
public  static WebDriver driver;

public static WebDriver getDriverInstance()
{
	return driver;
	
}
@BeforeTest
public static WebDriver InitilizeBrowser12()
{
//	//String urlValue = TestDataProvider.readPropertyFile("qaURL");
//	//String urlVlaue = null;
//	//driver=BrowserFactory.startApplication(driver, "Chrome", urlVlaue);
//	driver=BrowserFactory.startApplication(driver, "Chrome", "Constants.URL");
//	driver.manage().window().maximize();
//	return driver;
	
{
		
		String urlValue = TestDataProvider.readPropertyFile("qaURL");
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://vpay-admin-dev.ingwalabs.com/#/login");
	}
return driver;
}

public static void setUp(String p_username, String p_password) throws InterruptedException
{
	Thread.sleep(5000);
	VpayLoginLocators.SignIn(driver).click();
	Thread.sleep(5000);
	VpayLoginLocators.UserName(driver, "username").sendKeys(p_username);
	Thread.sleep(5000);
	VpayLoginLocators.Password(driver, "password").sendKeys(p_password);
	Thread.sleep(5000);
	VpayLoginLocators.Loginbutton(driver).click();
	
	
}
}






//------ //Create BaseClass Without Excel// --------------------

	//@BeforeClass
	/*public void setup() throws InterruptedException
	{
		
		String urlValue = TestDataProvider.readPropertyFile("qaURL");
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://www.facebook.com/");
	}


		
		//driver.get("https://www.facebook.com/");
		
			
	/*	VpayLoginLocators.SignIn(driver).click();
		Thread.sleep(2000);
		VpayLoginLocators.UserName(driver, "username").sendKeys("VPDADMIN");
		Thread.sleep(5000);
		VpayLoginLocators.Password(driver, "password").sendKeys("Venkat@123");
		Thread.sleep(5000);
		VpayLoginLocators.Loginbutton(driver).click();
		//Thread.sleep(2000);
		System.out.println("Admin login sucessfully");*/
	
	
	
	/*@AfterClass
	public void teardown()
	{
	BrowserFactory.quitBrowser(driver);
	}
}*/

