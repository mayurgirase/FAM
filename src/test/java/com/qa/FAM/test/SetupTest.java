package com.qa.FAM.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.FAM.base.Testbase;
import com.qa.FAM.pages.Loginpage;
import com.qa.FAM.pages.Setupage;

public class SetupTest extends Testbase {
	Loginpage lopg;
	Setupage setpg;
	 public SetupTest() {
			super();
		}
		
		@BeforeMethod
		public void Setup() throws Exception {
			Setbrowser();
			lopg=new Loginpage();
			setpg=new Setupage();
			lopg.valid_username(prop.getProperty("username"), prop.getProperty("password"));
			lopg.verify_clickbutton();
			setpg.ClickonSetuplink();
		}
		
		
		@Test(priority=1)
		public void setuppageTitleTest() {
			String title=setpg.validatepagetitle();
			Assert.assertEquals(title, "Main Menu");
		}
		@Test(priority=2)
		public void verify_heading()  {
			String headng=setpg.check_headings();
			String expected="FrontAccounting | projects.javabykiran.com | Administrator";
			Assert.assertEquals(headng, expected);
			
		}
		
		@Test(priority=3)
		public void Verify_ClickOn_company_Setup() {
			setpg.Check_company_seup_link();
		}
		
		@Test(priority=4)
		public void verify_user_account_setup_link() {
			setpg.Check_user_account_setup_link();
		}
		
		@Test(priority=5)
		public void verify_accsess_setup() {
			setpg.Check_accsss_setup_link();
		}
		
		@Test(priority=6)
		public void verify_display_setup() {
			setpg.Check_display_setup_link();
		}
		
		@Test(priority=7)
		public void verify_fiscal_year() {
			setpg.Check_fiscal_year_link();
		}
		
		@Test(priority=8)
		public void verify_shiping_company() {
			setpg.Check_shiping_company_links();
		}
		
		@Test(priority=9)
		public void verify_logout() {
			setpg.lougout();
		}
		
		
		
	
		/*@Test(priority=5)
		public void verify_all_linChks() {
			setpg.Check_fiscal_year_link();
			setpg.Check_shiping_company_links();
		}*/
	
		/*@Test(priority=5)
		public void verify_tablogo() {
			boolean tablogo=setpg.Check_tablogo();
			 String expexted ="true";
			 Assert.assertEquals(tablogo, expexted);
		}*/
		
		
		@AfterMethod
		public void close_browser() {
			driver.close();
		}
		

}
