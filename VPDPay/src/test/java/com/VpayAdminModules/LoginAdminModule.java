package com.VpayAdminModules;

import org.openqa.selenium.WebDriver;

import com.Vpay.Locators.VpayLoginLocators;

public class LoginAdminModule  {
	
	public static void adminlogin(WebDriver driver) throws InterruptedException
	{
		
		VpayLoginLocators.SignIn(driver).click();
		Thread.sleep(2000);
		VpayLoginLocators.UserName(driver, "username").sendKeys("VPAYADMIN");
		Thread.sleep(5000);
		VpayLoginLocators.Password(driver, "password").sendKeys("Venkat@123");
		Thread.sleep(5000);
		VpayLoginLocators.Loginbutton(driver).click();
		//Thread.sleep(2000);
		System.out.println("Admin login sucessfully");
	}

}
