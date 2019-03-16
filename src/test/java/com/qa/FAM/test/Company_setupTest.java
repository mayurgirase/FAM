package com.qa.FAM.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.FAM.base.Testbase;
import com.qa.FAM.pages.CompanySetuppage;
import com.qa.FAM.pages.Loginpage;
import com.qa.FAM.pages.Setupage;
import com.qa.FAM.util.Testutil;

public class Company_setupTest extends Testbase {
	Loginpage lopg;
	Setupage setpg;
	Testutil tsutil;
	String sheetName="company_setup";
	CompanySetuppage compnyset;
	 public Company_setupTest() {
			super();
		}
		
		@BeforeMethod
		public void Setup() throws Exception {
			Setbrowser();
			lopg=new Loginpage();
			setpg=new Setupage();
			compnyset=new CompanySetuppage();
			lopg.valid_username(prop.getProperty("username"), prop.getProperty("password"));
			lopg.verify_clickbutton();
			setpg.ClickonSetuplink();
			compnyset.Check_company_seup_link();		
			}
		
		@DataProvider
		public Object[][] getFAMdata() {
			Object data[][] =tsutil.getTestData(sheetName);
			return data;
		}
		
		@Test(priority=1,dataProvider="getFAMdata")
		public void Company_setupTest(String Name,String Address,String Domicile,String phone_no,String Email,String GST_no,String tp,String ltp,String logto,String rcp,String log_tout) {
			
			compnyset.general_setting(Name, Address, Domicile, phone_no, Email, GST_no);
			compnyset.General_ledger_setting(tp, ltp, logto);
			compnyset.Sales_Pricing(rcp);
			compnyset.User_Interface_Options(log_tout);
			compnyset.clickOn_update();
		}
		
		@Test(priority=2)
		public void verify_dropdown () {
			
			Assert.assertTrue(compnyset.Select_drop_down());
			
		}
		
		@Test(priority=3)
		public void verify_checkbox() {
		Assert.assertTrue(compnyset.verify_Checkbox());	
		
		}
		
		@AfterMethod
		public void close_browser() {
			driver.close();
		}
		

}
