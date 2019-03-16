package com.qa.FAM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.FAM.base.Testbase;

public class Loginpage extends Testbase {
	
	
	
	@FindBy(name="user_name_entry_field")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="SubmitUser")
	WebElement clickOn;
	
	@FindBy(name="company_login_name")
	WebElement comapny_name;
	
	
	@FindBy(xpath="//a[@class='selected']")
	WebElement setuplink;
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public void valid_username( String un,String psd) {
		username.sendKeys(un);
		password.sendKeys(psd);
		}
	public void valid_password() {
		password.sendKeys("pass");
		
		}
	public void verify_selectionOf_copmpany() {
		Select sl=new Select(comapny_name);
		sl.selectByIndex(1);
		
		
		}
	public Boolean verify_clickbutton() {
		clickOn.click();
		
		return null;
	}
		
		
	
}
