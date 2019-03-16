package com.qa.FAM.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.FAM.util.Testutil;

//import com.jbk.qa.util.Testutil;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase()  {
		prop=new Properties();
		try {
			FileInputStream fs= new FileInputStream("C:\\Users\\new201809\\Front_Accounting_Management\\src\\main\\java\\com\\qa\\FAM\\config\\config.properties");
			prop.load(fs);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void Setbrowser() {
		String bwsername=prop.getProperty("browser");
		if(bwsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Software\\Firefox Setup 46.0.1.exe");
			driver=new FirefoxDriver();
			
			
		}else if(bwsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\madhavi\\Download\\chromedriver.exe");
			driver=new ChromeDriver();
			
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
