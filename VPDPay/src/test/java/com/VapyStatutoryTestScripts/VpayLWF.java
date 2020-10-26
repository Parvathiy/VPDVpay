package com.VapyStatutoryTestScripts;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vpay.Locators.AdminLogInpage;
import com.Vpay.Testcases.AdminLogIn;
import com.Vpay.Testcases.WFAdminLogin;

public class VpayLWF  {
	@Test
	public void LogIn() throws InterruptedException
	{
		WFAdminLogin wfaAdminLogin = new WFAdminLogin();
		wfaAdminLogin.LogIn();
		
	}
}
		
//		Select select = new Select(driver.findElements(By.xpath("//mat-tab-body[@id='mat-tab-content-3-1']//div//app-contribution-period//div//div//select")));
//		ArrayList<> list = new ArrayList<>();
//		int a =list.size();
//		int b = random(a);
//		select.selectByIndex(b);
		
//		By driver;
//		Select dropdown = new Select(driver.findElement(By.id("id")));
//
//		//Get all options
//		List<WebElement> dd = dropdown.getOptions();
//		int index = 0;//if list contains only one element it will take that element
//		if(dd.size()>1){
//		   //Get a random number between 1, size of dd
//		    Random rand = new Random();
//		    index = rand.nextInt(dd.size()-1);
//		 }else if(dd.size()<1){
//		    //print error message
//		     int = -1;
//		 }
//		 if (index >= 0){
//		     dropdown.selectByIndex(index);
//		 }
		
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		//driver.get("https://vpay-admin-dev.ingwalabs.com/#/login");
		
		//AdminLogIn adminLogin = new AdminLogIn();
		//adminLogin.loginApp();
		
		//AdminLogInpage  adminLoginPage = new AdminLogInpage();
		//adminLoginPage.loginToAdmin("VPDADMIN","Venkat@123");
		
		/*Click on SignIn button
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-width-120 btn-lg']")).click();
		
		//Login Details
	
		driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']")).sendKeys("VPDADMIN");
		driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']")).sendKeys("Venkat@123");
		
		//Click Login button
		driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']")).click();
		Thread.sleep(5000);*/
		// Click Statutory 
//		//driver.findElement(By.xpath("//body[@class='skin-blue-light sidebar-mini fixed sidebar-mini-expand-feature']/app-root/app-vpd[@class='ng-star-inserted']/div[@class='wrapper']/app-left-side-menu/aside[@class='main-sidebar']/section[@class='sidebar']/ul[@class='sidebar-menu my-menu tree']/li[4]/a[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Statutory')]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Labour Welfare Fund')]")).click();
//		Thread.sleep(5000);
		//----------------Select state-------------------------
		
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).click();
//		//Click on Contribution
//	    // click drop down
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).click();
//		//Select state
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).sendKeys("Andhra Pradesh");
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).click();
//		//WebElement bonusDropDown = driver.findElement(By.xpath("//select[@name='setupConfigValue']")).click();
//			//Select dropdown = new Select(driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-0']//div//div//div//select")));
//			//dropdown.selectByVisibleText("All");
//			//Thread.sleep(5000);
//			//Select dropdowns = new Select(driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-0']//div//div//div//select")));
//			//dropdowns.selectByVisibleText("Telangana");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).sendKeys("Telangana");
//		//Return back click and select all States
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/select[1]")).sendKeys("All");
//
//						//Click on Contribution Period----
//		 driver.findElement(By.xpath("//div[contains(text(),'Contribution Period')]")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-contribution-period[1]/div[1]/div[1]/select[1]")).click();
// 		 Thread.sleep(2000);
// 		 //Select Dropdown states
// 		//Select dropdowna = new Select(driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-1']//div//app-contribution-period//div//div//select")));
//		//dropdowna.selectByVisibleText("Andhra Pradesh");
//		//Thread.sleep(5000);
//		//Select dropdownt = new Select(driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-1']//div//app-contribution-period//div//div//select")));
//		//dropdownt.selectByVisibleText("Telangana");
//		//Select dropdownp = new Select(driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-1']//div//app-contribution-period//div//div//select")));
//		//dropdownp.selectByVisibleText("All");
//		Thread.sleep(2000);
// 	    	//select state
// 		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-contribution-period[1]/div[1]/div[1]/select[1]")).click();
//         Thread.sleep(2000);
// 		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-contribution-period[1]/div[1]/div[1]/select[1]")).sendKeys("Telangana");
//	    //Select Back all states
// 		 Thread.sleep(2000);
// 		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-contribution-period[1]/div[1]/div[1]/select[1]")).click();
// 		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-contribution-period[1]/div[1]/div[1]/select[1]")).sendKeys("All");
// 		 
//	    // select Payment Due Date 
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[2]/div[1]/div[1]/div[3]/div[1]")).click();
//	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[3]/div[1]/app-payment-due-date[1]/div[1]/div[1]/select[1]")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[3]/div[1]/app-payment-due-date[1]/div[1]/div[1]/select[1]")).sendKeys("Telangana");
//	    Thread.sleep(2000);
//	   //Select all states
//	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[3]/div[1]/app-payment-due-date[1]/div[1]/div[1]/select[1]")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[3]/div[1]/app-payment-due-date[1]/div[1]/div[1]/select[1]")).sendKeys("All");
//	 
//	 // We need to edit the exiting record using Actions
//	       Thread.sleep(5000);
//			Actions actions = new Actions(driver);
//	      WebElement elementLocator= driver.findElement(By.xpath("//span[contains(text(),'CG')]"));
//	      actions.contextClick(elementLocator).perform();
//	      Thread.sleep(5000);
//	      driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
//	      Thread.sleep(5000);
//	      driver.findElement(By.xpath("//body//div[@id='paymentDueModal']//div//div//div//div[2]//div[1]//select[1]")).click();
//	      Select dropdownm = new Select(driver.findElement(By.xpath("//body//div[@id='paymentDueModal']//div//div//div//div[2]//div[1]//select[1]")));
//			dropdownm.selectByVisibleText("Quarterly");
//			driver.findElement(By.xpath("//div[@id='paymentDueModal']//div//div//div//button[contains(text(),'Save')]")).click();
//			
//			//
//			//Thread.sleep(5000);
//	      //driver.findElement(By.xpath("//input[@placeholder='Value']")).clear();
//	     // Thread.sleep(5000);
//	     // driver.findElement(By.xpath("//input[@placeholder='Value']")).sendKeys("40");
//	      //driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//	     
//
//    		//Click Table Column
//    		Thread.sleep(5000);
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]")).click();
//    		//Check and uncheck all
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/span[1]")).click();
//    		Thread.sleep(5000);
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/span[2]")).click();
//    		// Check and Uncheck States
//    		Thread.sleep(5000);
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
//    		//Check States
//    		Thread.sleep(5000);
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[3]/ag-grid-angular[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
//    		//Enter value for Employee Contribution 
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/textarea[1]")).sendKeys("50.0");
//    		//2nd value Enter
//    		
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/textarea[1]")).click();
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/textarea[1]")).clear();
//    		Thread.sleep(5000);
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/textarea[1]")).sendKeys("50.0");
//    		//Click on save button
//    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-lwf[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[2]")).click();
//    		

	
	
	



