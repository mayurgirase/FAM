package com.qa.FAM.test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.FAM.base.Testbase;
import com.qa.FAM.pages.Loginpage;
import com.qa.FAM.pages.Setupage;
import com.qa.FAM.util.Testutil;

public class Logintestcase  extends Testbase{
	Loginpage lopg;
	Setupage setpg;
	Testutil tsutil;
	String sheetName="loginpage";
	public Logintestcase() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		Setbrowser();
		lopg= new Loginpage();
	}
	
	@Test(priority=1)
	public void loginpageTitleTest() {
		String title=lopg.validatepagetitle();
		Assert.assertEquals(title, "FrontAccounting 2.4.2 - Login");
	}
	
	@DataProvider
	public Object[][] getFAMdata() {
		Object data[][] =tsutil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider="getFAMdata")
	public void Verify_valid_user(String username,String passdword) {
		lopg.valid_username(username, passdword);
		
		
	}
	
	@Test(priority=3)
	public void verify_company_name() {
		lopg.verify_selectionOf_copmpany();
		
	}
	

	@AfterMethod
	public void close_browser() {
		driver.close();
	}
}
