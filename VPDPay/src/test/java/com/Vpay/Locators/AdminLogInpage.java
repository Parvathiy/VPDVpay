package com.Vpay.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogInpage {
	WebDriver driver;
	public void Loginpage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	//Click SignIn button
	

	@FindBy(xpath="//button[contains(text(),'Sign in')]") WebElement SignInButton;
	//button[contains(text(),'Sign in')]
	@FindBy(xpath="//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']") WebElement uname;
	@FindBy(xpath="//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']") WebElement pword;
	@FindBy(xpath="//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']") WebElement loginButton;
	
	
	public void loginToAdmin(String usernameApp, String passwordApp) throws InterruptedException
	{
		
//		try 
//		{
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//		}
		Thread.sleep(7000);
	System.out.println("SignInButton"+SignInButton);
		SignInButton.click();
		uname.sendKeys(usernameApp);
		pword.sendKeys(passwordApp);
		loginButton.click();
		
		
	}

}
