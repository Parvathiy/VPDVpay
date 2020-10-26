package com.Vpay.Testcases;

import org.testng.annotations.Test;

import com.Vpay.Utility.BaseClass;
import com.VpayAdminModules.EPFModule;

public class EPFcretaionforMonthly extends BaseClass{
	@Test
	public void addEPFMonthly() throws InterruptedException
	{
		Thread.sleep(5000);
	EPFModule.addEPFName(driver);
	EPFModule.epfPFMonthlyName(driver);
	return;
	}
}
