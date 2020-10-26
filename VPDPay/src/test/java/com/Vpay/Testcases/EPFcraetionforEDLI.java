package com.Vpay.Testcases;

import com.Vpay.Utility.BaseClass;
import com.VpayAdminModules.EPFModule;

public class EPFcraetionforEDLI extends BaseClass {
	public void addEDLI() throws InterruptedException
	{
		Thread.sleep(5000);
		EPFModule.addEPFName(driver);
		return;
	}

}
