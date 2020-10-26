package com.Vpay.Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;





public class Helper {
	
	
	
	public static String getCurrentDateTime()
	{
		DateFormat customeFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date(0);
		return customeFormat.format(currentDate);
	
	}

	

	public static String captureScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath = System.getProperty("user.dir")+"/Screen Shots/VPD_"+getCurrentDateTime()+".png";
		
		try
		{
			FileHandler.copy(src, new File(screenshotpath));
			System.out.println("screenshot captured");
		}catch(IOException e) {
			
			System.out.println("unable to capture screenshot"+e.getMessage());
		}
		
		return screenshotpath;
	}
	 
	}


