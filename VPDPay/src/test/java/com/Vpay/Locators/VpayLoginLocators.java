package com.Vpay.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VpayLoginLocators {
	public static WebElement SignIn(WebDriver driver)
	{
		WebElement SignIn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-width-120 btn-lg']"));
		return SignIn;
	}
	public static WebElement UserName(WebDriver driver, String FileName)
	{
		WebElement UserName = driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']"));
		return UserName;
	}
	public static WebElement Password(WebDriver driver, String FileName)
	{
		WebElement Password= driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']"));
		return Password;
	}
	public static WebElement Loginbutton(WebDriver driver)
	{
		WebElement Loginbutton= driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']"));
		return Loginbutton;
	
	}
	public void LogIn() {
		// TODO Auto-generated method stub
		
	}
		
	}


