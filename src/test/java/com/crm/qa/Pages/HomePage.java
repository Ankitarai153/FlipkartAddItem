package com.crm.qa.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	WebElement SearchBox;
	
	public SearchResultItemPage SearchItemOnSearchBox(String EnterItemToSearch) throws InterruptedException {
		Thread.sleep(5000);
		SearchBox.sendKeys(EnterItemToSearch);
		SearchBox.sendKeys(Keys.ENTER);
		return new SearchResultItemPage();
	}
	
	public void ClickOnCart() {
		
		
	}
	
	public void BecomeASeller() {
		
		
	}

}
