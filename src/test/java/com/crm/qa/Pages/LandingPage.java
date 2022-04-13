package com.crm.qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	public LandingPage()  {//47.51 Sec  Construtor
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory -OR

	@FindBy(xpath="//a[text()='Login']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//img[@alt='Flipkart']")
	WebElement FlipkartLogo;
	
	
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateFreeCRMImage() {
		return FlipkartLogo.isDisplayed();
		
	}
	
	public LoginPage login()  {
		//new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(LoginBtn)).click();
		//WebElement element = driver.findElement(LoginBtn);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(LoginBtn).click().build().perform();
		//LoginBtn.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Clicked on login");
		return new LoginPage(); 
	}
}
