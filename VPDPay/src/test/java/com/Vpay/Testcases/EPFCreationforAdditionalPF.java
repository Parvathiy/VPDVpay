package com.Vpay.Testcases;

import org.testng.annotations.Test;

import com.Vpay.Utility.BaseClass;
import com.VpayAdminModules.EPFModule;

public class EPFCreationforAdditionalPF extends BaseClass {
	
	@Test
	public void addEPFAdmin() throws InterruptedException
	{
		Thread.sleep(5000);
		EPFModule.addEPFName(driver);
		return;
	}
	

}

