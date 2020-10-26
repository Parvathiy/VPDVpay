package com.VapyStatutoryTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Vpay.Testcases.WFAdminLogin;

public class VpayProfessionalTaxConfiguration {
	@Test
	public void LogIn() throws InterruptedException
	{
		//WebDriver driver = new ChromeDriver();
		WFAdminLogin wfaAdminLogin = new WFAdminLogin();
		wfaAdminLogin.LogIn();
		
		By driver = null;
				// Click Statutory 
				driver.findElement((SearchContext) By.xpath("//span[contains(text(),'Statutory')]")).click();
				Thread.sleep(5000);
				driver.findElement((SearchContext) By.xpath("//span[contains(text(),'Professional Tax')]")).click();
				//clcik on add Professional Tax option under PT LAB
				Thread.sleep(5000);
				driver.findElement((SearchContext) By.xpath("//button[@id='ptEditPopUp']//i")).click();
		
	}
}
