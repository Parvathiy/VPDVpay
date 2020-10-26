package com.Vpay.Testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Vpay.Locators.AdminLogInpage;
import com.Vpay.Utility.BaseClass;
import com.Vpay.Utility.ExcelDataProvider;
import com.Vpay.Utility.TestDataProvider;
import com.google.gson.internal.Excluder;

public class AdminLogIn extends BaseClass {
	

	//WebDriver driver;
	
	/*public void loginApp() throws InterruptedException
		{		
		
		AdminLogInpage loginpage=PageFactory.initElements(driver, AdminLogInpage.class);	
		
			loginpage.loginToAdmin("VPDADMIN", "Venkat@123");
		}*/

	@Test
	public void LoginApp() throws InterruptedException
	{
		TestDataProvider excel= new TestDataProvider();
		
		//excel.getStringData("Login",0,0);
		
		AdminLogInpage loginpage=PageFactory.initElements(driver, AdminLogInpage.class);
		
		loginpage.loginToAdmin(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
		
	}
	
	
		}

	
	
	
