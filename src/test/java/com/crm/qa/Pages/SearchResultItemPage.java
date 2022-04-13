package com.crm.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchResultItemPage extends TestBase {
	
	public SearchResultItemPage(){
		PageFactory.initElements(driver, this);
		
	}
	
public String MatchwiththisItem(String itemToMatch) {
	WebElement itemToMatchone=driver.findElement(By.xpath("//a[text()='"+itemToMatch+"']"));
	itemToMatchone.click();
	return itemToMatchone.getText();}



public int Price() {
	List<WebElement> el=driver.findElements(By.xpath("//div[contains(@class,'jeq')]"));
	int maxprice=0;
	for(int i=1;i<el.size();i++) {
	String Price=el.get(i).getAttribute("innerHTML");
	String newPrice=Price.substring(1).replaceAll(",", "");
	
		int Price1=Integer.parseInt(newPrice);
		if(Price1>maxprice) {
			maxprice=Price1;
		}
		System.out.println(newPrice);
		System.out.println(maxprice);
	}
	return maxprice;
	
}

public IndividualItemWindow ClickOnMaxPrice(String maxprice) {
	
	
	return new IndividualItemWindow();
	
}
}
