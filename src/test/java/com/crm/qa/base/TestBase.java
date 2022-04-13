package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		  try {
			prop=new Properties();
			System.out.println(System.getProperty("user.dir"));
			//FileInputStream fis=new FileInputStream(prop.getProperty("user.dir")+"\\src\\test\\java\\com\\crm\\qa\\config\\config.properties");
			FileInputStream fis=new FileInputStream("E:\\LastThirdMonth\\POMdlNaveenFlipkart\\src\\test\\java\\com\\crm\\qa\\config\\config.properties");
			  
				prop.load(fis);
			} 
		    catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	
	}
	
	public static void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
				
		}
		if(browsername.equals("firefox")) {
			
				
		}
		
		if(browsername.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			
				
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIME,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	

}