package com.crm.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.IndividualItemWindow;
import com.crm.qa.Pages.LandingPage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.Pages.SearchResultItemPage;
import com.crm.qa.base.TestBase;

public class LandingPageTest extends TestBase {
	LandingPage landingPage;
	LoginPage loginpage;
	HomePage homepage;
	SearchResultItemPage searchResultItemPage;
	IndividualItemWindow individualItemWindow;
	
	public LandingPageTest(){
		super();//It will call Parent class Constructor
		
	}
	
	@BeforeMethod
	public void setup() {
		super.initialization();
		landingPage=new LandingPage();
		
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("teardown");
		//driver.quit();
		
	}
//	
//	@Test (priority=1)
//	public void landingPageTitleTest() {
//		String title=landingPage.validateLoginTitle();
//		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
//		
//	}
//	
//	
//	
//	
//	@Test (priority=2)
//	public void crmLogoImageTest() {
//		boolean logotest=landingPage.validateFreeCRMImage();
//		Assert.assertTrue(logotest);  //If true then it will pass
//	}
//	
	@Test(priority=1)
	public void clickloginTest() throws Exception {
		loginpage=landingPage.login();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		searchResultItemPage=homepage.SearchItemOnSearchBox("Fiona Curtain");
		String a=searchResultItemPage.MatchwiththisItem("Fiona Creation 274 cm (9 ft) Polyester Long Door Curtai...");
		Assert.assertEquals(a, "Fiona Creation 330","Item not matching");
		
			
	}
	
	
	@Test(priority=2)
	public void CheckPriceTest() throws Exception {
		loginpage = landingPage.login();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		searchResultItemPage = homepage.SearchItemOnSearchBox("Fiona Curtain");
		int maxprice = searchResultItemPage.Price();
		System.out.println("Maximum Price in UI" + maxprice);
		Assert.assertEquals(2399, maxprice, "Price not matching");
		individualItemWindow=searchResultItemPage.ClickOnMaxPrice();
		
	
		
			
	}
//	@Test(priority=2)
//	public void SearchItem() throws Exception {
//		loginpage=landingPage.login();
//		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
//		
//		
//			
//	}
//	
//	@Test(priority=4)
//	public void loginPageCredentialTest() {
//		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
//		
//	
//			
//	}
	
	

}
