package com.qa.FAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FAM.base.Testbase;

public class Setupage extends Testbase {
	
	
	@FindBy(xpath="//a[@href='./index.php?application=system' and @accesskey='E']")
	WebElement setuplink;
	
	@FindBy(xpath="//td[@class='headingtext3']")
	WebElement headings;
	
	@FindBy(xpath="//img[@src='./themes/default/images/menu_settings.png']")
	WebElement tablogo;
	
	@FindBy(xpath="//a[@href='./admin/company_preferences.php?' and @accesskey='C']")
	WebElement company_seup_link;
		
	@FindBy(xpath="//a[@href='./admin/users.php?']")
	WebElement user_account_setup_link;
	
	@FindBy(xpath="//a[@href='./admin/security_roles.php?' and @accesskey='A']")
	WebElement accsss_setup_link;
	
	@FindBy(xpath="//a[@href='./admin/display_prefs.php?' and @accesskey='D']")
	WebElement display_setup_link;
	
	@FindBy(xpath="//a[@href='./admin/fiscalyears.php?' and @accesskey='F']")
	WebElement fiscal_year_link;
	
	@FindBy(xpath="//a[@href='./admin/shipping_companies.php?' and @accesskey='P']")
	WebElement shiping_company_links;
	
	@FindBy(xpath="//a[@href='./access/logout.php?']")
	WebElement logout;
	
	public Setupage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public Setupage ClickonSetuplink()  {
		
		setuplink.click();
		return null;
		}
	public String check_headings() {
		return headings.getText();
		
	}
	
	public void lougout() {
		logout.click();
	}
	
	public boolean Check_tablogo() {
		return tablogo.isDisplayed();
	}
	
	public void Check_company_seup_link() {
		company_seup_link.click();
			
	}
	
	public void Check_user_account_setup_link() {
		user_account_setup_link.click();
	}
	
	public void Check_accsss_setup_link() {
		accsss_setup_link.click();
	}
	
	public void Check_display_setup_link() {
		display_setup_link.click();
	}
	
	public void Check_fiscal_year_link() {
		fiscal_year_link.click();
		
	}
	
	public void Check_shiping_company_links() {
		shiping_company_links.click();
		
	}
	
	
	
	
}
