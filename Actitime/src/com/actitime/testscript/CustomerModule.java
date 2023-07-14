package com.actitime.testscript;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.genric.BaseClass;
import com.actitime.genric.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.genric.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void TestCreateCustomer() throws IOException, InterruptedException {
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String expcustname = f.getexceldata("CreateCustomer", 1, 2);
		String custdecp = f.getexceldata("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.settasktab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewbtn().click();
		t.getNewcustopt().click();
		t.getEntercustnametbx().sendKeys(expcustname);
		t.getCustdesctbx().sendKeys(custdecp);
		t.getSltcust().click();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true);",t.getOurCompanyTx());
		t.getOurCompanyTx().click();
		t.getCreatecust().click();
		Thread.sleep(6000);
		t.getSetting().click();
		Thread.sleep(2000);
		t.getActions().click();
		t.getDeletebtn().click();
		t.getDeleteconfirmbtn().click();
		Thread.sleep(4000);
		String Actualdeltext = t.getActdltdtext().getText();
		String Expdeltext = "All Customers";
		Assert.assertEquals(Actualdeltext, Expdeltext);		
	}
}