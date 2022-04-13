package com.crm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Initializing PageObject
	public LoginPage() {//47.51 Sec  Construtor
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory -OR

	@FindBy(xpath="//a[text()='Login']")
	WebElement LoginBtn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement clickLoginBtn;
	
	@FindBy(xpath="//div[@alt='Flipkart']")
	WebElement FlipKartLogo;
	
	//Actions
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateFreeCRMImage() {
		return FlipKartLogo.isDisplayed();
		
	}
	
	public HomePage login(String usnm,String passwd) throws InterruptedException {
		Thread.sleep(5000);
		Username.sendKeys(usnm);
		password.sendKeys(passwd);
		clickLoginBtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
}
