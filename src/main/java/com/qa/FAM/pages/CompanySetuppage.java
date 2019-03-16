package com.qa.FAM.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.FAM.base.Testbase;

public class CompanySetuppage extends Testbase {
	@FindBy(xpath="//a[@href='./admin/company_preferences.php?']")
		WebElement company_seup_link;
	
	//General Settings
			@FindBy(name="coy_name")
			WebElement name_text;
			
			@FindBy(name="postal_address")
			WebElement address_text;
			
			@FindBy(name="domicile")
			WebElement domicile_text;
			
			@FindBy(name="phone")
			WebElement phone_number_text;
			
			@FindBy(name="email")
			WebElement email_text;
			
			@FindBy(name="gst_no")
			WebElement gst_no_txt;
			
			@FindBy(name="curr_default")
			WebElement currency_select;
			
			@FindBy(name="pic")
			WebElement attach_company_logo_link;
			
			@FindBy(name="del_coy_logo")
			WebElement logo_delete_chekbox;
			
			@FindBy(name="auto_curr_reval")
			WebElement automatic_revoluation_ckeckbox;
			
			@FindBy(name="time_zone")
			WebElement time_zone_checkbox;
			
			//General Ledger Settings
			
			@FindBy(name="f_year")
			WebElement fiscal_year_select;
			
			@FindBy(name="tax_prd")
			WebElement tax_period_text;
			
			@FindBy(name="tax_last")
			WebElement last_tax_period_text;
			
			@FindBy(name="alternative_tax_include_on_docs")
			WebElement alternative_tax_include_on_docs_checkbpox;
			
			@FindBy(name="suppress_tax_rates")
			WebElement suppress_tax_rates_checkbox;
			
			@FindBy(name="no_item_list")
			WebElement no_item_list_checkbox;
			
			@FindBy(name="no_customer_list")
			WebElement no_customer_list_checkbox;
			
			@FindBy(name="no_supplier_list")
			WebElement no_supplier_list_checkbox;
			
			//Sales Pricing
			
			@FindBy(name="base_sales")
			WebElement base_sale_select;
			
			@FindBy(xpath="//input[@name='round_to']")
			WebElement round_calculated_prices;
			
			//Optional Modules
			@FindBy(name="use_dimension")
			WebElement user_dimension_select;
			
			@FindBy(name="use_manufacturing")
			WebElement use_manufacturing_checkbox;
			
			@FindBy(name="use_fixed_assets")
			WebElement use_fixed_assets_checkbox;
			
			//User Interface Options
			@FindBy(name="login_tout")
			WebElement login_tout_text;
			
			@FindBy(xpath="//button[@id='update']")
			WebElement update;
			
			public CompanySetuppage() {
				PageFactory.initElements(driver, this);
			}
			
			
			public void Check_company_seup_link() {
				company_seup_link.click();
					
			}
			
			public void general_setting(String name,String address,String domicile,String ph_no,String email,String gst_no) {
				name_text.clear();
				name_text.sendKeys(name);
				address_text.clear();
				address_text.sendKeys(address);
				domicile_text.clear();
				domicile_text.sendKeys(domicile);
				phone_number_text.clear();
				phone_number_text.sendKeys(ph_no);
				email_text.clear();
				email_text.sendKeys(email);
				gst_no_txt.clear();
				gst_no_txt.sendKeys(gst_no);
			}
			
			public void General_ledger_setting(String tp,String ltp,String logto) {
				tax_period_text.sendKeys(tp);
				last_tax_period_text.sendKeys(ltp);
				login_tout_text.sendKeys(logto);
			}
			
			public boolean Select_drop_down() {
				
				for(int i=0;i<=4;i++) {
				Select sl1=new Select(currency_select);
				sl1.selectByIndex(i);
				}
				for(int i=0;i<=5;i++) {
				
				Select sl3=new Select(base_sale_select);
				sl3.selectByIndex(i);
				}
				for(int j=0;j<=2;j++) {
				Select sl2=new Select(fiscal_year_select);
				sl2.selectByIndex(j);
				
				Select sl4=new Select(user_dimension_select);
				sl4.selectByIndex(j);
				}
				return true;
			}
			
			public void Sales_Pricing(String rcp) {
				round_calculated_prices.clear();
				round_calculated_prices.sendKeys(rcp);
			}
			
			public void User_Interface_Options(String log_tout) {
				
				login_tout_text.clear();
				login_tout_text.sendKeys(log_tout);
			}
			
			public boolean verify_Checkbox() {
				
				logo_delete_chekbox.click();
				automatic_revoluation_ckeckbox.click();
				time_zone_checkbox.click();
				alternative_tax_include_on_docs_checkbpox.click();
				suppress_tax_rates_checkbox.click();
				use_manufacturing_checkbox.click();
				use_fixed_assets_checkbox.click();
				suppress_tax_rates_checkbox.click();
				no_item_list_checkbox.click();
				no_customer_list_checkbox.click();
				no_supplier_list_checkbox.click();
				
				return true;
				
			}
			
			public void clickOn_update() {
				update.click();
			}

}
