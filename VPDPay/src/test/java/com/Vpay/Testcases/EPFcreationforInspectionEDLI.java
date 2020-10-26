package com.Vpay.Testcases;

import org.testng.annotations.Test;

import com.Vpay.Utility.BaseClass;
import com.VpayAdminModules.EPFModule;

public class EPFcreationforInspectionEDLI extends BaseClass {
	@Test
	public void addInspection() throws InterruptedException
	{
		Thread.sleep(5000);
		EPFModule.addEPFName(driver);
		return;
	}

}
