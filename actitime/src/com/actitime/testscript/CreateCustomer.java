package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TasksPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws IOException{
		HomePage h= new HomePage(driver);
		h.clickTasksTab();

		TasksPage t= new TasksPage(driver);
		t.setCustomer("DemoCust_02", "This is a Demo Customer");
		
		String eTitle= "DemoCust_02";
		String aTitle=t.getActualCustomerTitle();
		
		Assert.assertEquals(eTitle, aTitle);
		
		
}

}
